/*
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.generator

import biochemsimulation.reactionrules.reactionRules.AgentPattern
import biochemsimulation.reactionrules.reactionRules.AssignFromPattern
import biochemsimulation.reactionrules.reactionRules.AssignFromVariable
import biochemsimulation.reactionrules.reactionRules.Initial
import biochemsimulation.reactionrules.reactionRules.ModelPath
import biochemsimulation.reactionrules.reactionRules.ModelUri
import biochemsimulation.reactionrules.reactionRules.Pattern
import biochemsimulation.reactionrules.reactionRules.impl.ReactionRuleModelImpl
import biochemsimulation.reactionrules.reactionRules.impl.ReactionRulesFactoryImpl
import java.io.IOException
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import biochemsimulation.reactionrules.reactionRules.LinkState
import biochemsimulation.reactionrules.reactionRules.SiteState
import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState
import biochemsimulation.reactionrules.reactionRules.Site
import org.eclipse.emf.ecore.util.EcoreUtil
import biochemsimulation.reactionrules.reactionRules.Agent
import biochemsimulation.reactionrules.reactionRules.AgentInstance
import java.util.HashMap
import java.util.List
import biochemsimulation.reactionrules.reactionRules.IndexedLink
import java.util.LinkedList
import biochemsimulation.reactionrules.reactionRules.ExactLink
import biochemsimulation.reactionrules.reactionRules.WhatEver
import biochemsimulation.reactionrules.reactionRules.SemiLink
import biochemsimulation.reactionrules.reactionRules.NumericAssignment
import biochemsimulation.reactionrules.reactionRules.NumericFromLiteral
import biochemsimulation.reactionrules.reactionRules.NumericFromVariable
import biochemsimulation.reactionrules.reactionRules.ReactionRulesFactory

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ReactionRulesGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		generateInitialConditions(resource)
		saveResource(resource)
	}
	
	def generateInitialConditions(Resource resource) {
		var model = resource.getContents().get(0) as ReactionRuleModelImpl
		var initials = model.reactionProperties.filter[x | x instanceof Initial]
		for(init : initials) {
			val i = init as Initial
			agentInstancesFromInitial(resource, i)
		}
		
	}
	
	def agentInstancesFromInitial(Resource resource, Initial initial) {
		val content = initial.initialPattern
		val n = valueOfNumericAssignment(initial.count)
		if(content instanceof AssignFromPattern) {
			val c = content as AssignFromPattern
			agentInstancesFromPattern(resource, c.pattern, n, initial.name)
		}else {
			val va = content as AssignFromVariable
			agentInstancesFromPattern(resource, va.patternVar.pattern, n, initial.name)
		}
	}
	
	def valueOfNumericAssignment(NumericAssignment na){
		var value = "0"
		if(na instanceof NumericFromLiteral) {
			val nl = na as NumericFromLiteral
			value = nl.value.value
		}else {
			val nv = na as NumericFromVariable
			val ae = nv.valueVar.value
			value = ae.value
		}
		return Integer.valueOf(value)
	}
	
	def agentInstancesFromPattern(Resource resource, Pattern pattern, int n, String prefix){
		var model = resource.getContents().get(0) as ReactionRuleModelImpl
		val factory = ReactionRulesFactoryImpl.init()
		for(i : 0 ..< n){
			val linksA = new HashMap<String, List<AgentInstance>>(pattern.agentPatterns.size);
			val linksS = new HashMap<String, List<Site>>(pattern.agentPatterns.size);
			for(agentPattern : pattern.agentPatterns) {
				var ap = agentPattern as AgentPattern
				var agent = ap.agent
				var agentI = factory.createAgentInstance 
				model.reactionContainer.agentInstances.add(agentI)
				createNewAgentInstance(agentI, factory, agent, agentPattern, prefix, i, linksA, linksS)
				
			}
			for(linkID : linksA.keySet) {
				val lInstance = linksA.get(linkID).get(0)
				val rInstance = linksA.get(linkID).get(1)
				val lSite = linksS.get(linkID).get(0)
				val rSite = linksS.get(linkID).get(1)
				val lLinkState = lInstance.linkStates.findFirst[x | x.site.equals(lSite)]
				val rLinkState = rInstance.linkStates.findFirst[x | x.site.equals(rSite)]
				lLinkState.attachedAgent = rInstance.agent
				lLinkState.attachedSite = rSite
				rLinkState.attachedAgent = lInstance.agent
				rLinkState.attachedSite = lSite
				lLinkState.attachedAgentInstance = rInstance
				rLinkState.attachedAgentInstance = lInstance
			}
			
		}
			
		
	}
	
	def createNewAgentInstance(AgentInstance agentI, ReactionRulesFactory factory, Agent agent, AgentPattern ap, String prefix, int iteration, HashMap<String, List<AgentInstance>> linksA, HashMap<String, List<Site>> linksS) {
		
		agentI.name = prefix+":"+agent.name+".Instance@#"+iteration
		agentI.agent = agent
		
		for(sitePattern : ap.sitePatterns.sitePatterns) {
			var site = sitePattern.site as Site
			var oldLinkState = sitePattern.linkState as LinkState
			var oldSiteState = sitePattern.state as SiteState
					
			var newLinkState = factory.createLinkState as LinkState
			var aiLinkState = factory.createAgentInstanceLinkState as AgentInstanceLinkState

			var aiSiteState = factory.createAgentInstanceSiteState
			
			agentI.linkStates.add(aiLinkState)
			agentI.siteStates.add(aiSiteState)
					
			if(oldLinkState !== null) {
				newLinkState.linkState = EcoreUtil.copy(oldLinkState.linkState)
				if(newLinkState.linkState instanceof IndexedLink) {
					val link = newLinkState.linkState as IndexedLink
					insertLinkInLinkMap(link.state, agentI, site, linksA, linksS)
				}
				if(newLinkState.linkState instanceof WhatEver || newLinkState.linkState instanceof ExactLink 
					|| newLinkState.linkState instanceof SemiLink) {
					newLinkState.linkState = factory.createFreeLink
				}
			} else {
				newLinkState.linkState = factory.createFreeLink
			}
					
			if(oldSiteState !== null) {
				aiSiteState.siteState = EcoreUtil.copy(oldSiteState)
			} else {
				aiSiteState.siteState = factory.createSiteState
				if(site.states.state !== null) {
					if(site.states.state.size() >= 1) {
						aiSiteState.siteState.state = site.states.state.get(0)
					}
				}
				
			}
					
			aiLinkState.site = site
			aiLinkState.linkState = newLinkState
					
			aiSiteState.site = site
						
		}
		
		if(ap.sitePatterns.sitePatterns.size <= 0) {
			for(site : agent.sites.sites) {
				var aiLinkState = factory.createAgentInstanceLinkState
				aiLinkState.site = site
				var newLinkState = factory.createLinkState
				newLinkState.linkState = factory.createFreeLink
				aiLinkState.linkState = newLinkState
				agentI.linkStates.add(aiLinkState)
				
				if(site.states.state !== null) {
					if(site.states.state.size() >= 1) {
						var aiSiteState = factory.createAgentInstanceSiteState
						agentI.siteStates.add(aiSiteState)
						aiSiteState.site = site
						aiSiteState.siteState = factory.createSiteState
						aiSiteState.siteState.state = site.states.state.get(0)
					} 
					
				}
			}	
		}
		
		return agentI
	}
	
	def insertLinkInLinkMap(String linkID, AgentInstance aI, Site s, HashMap<String, List<AgentInstance>> linksA, HashMap<String, List<Site>> linksS) {
		if(!linksA.containsKey(linkID)) {
			linksA.put(linkID, new LinkedList<AgentInstance>())
			linksS.put(linkID, new LinkedList<Site>())
		}
		linksA.get(linkID).add(aI)
		linksS.get(linkID).add(s)
	}
	
	def saveResource(Resource resource) {
		val model = resource.getContents().get(0) as ReactionRuleModelImpl
		val name = model.model.name
		val projectPath = this.getClass().getProtectionDomain().getCodeSource().getLocation().path
		var uriName = ""
		if(model.model.location === null) {
			uriName = "file:"+projectPath+"model/instances/"+name+".xmi"
		}else {
			if(model.model.location instanceof ModelPath) {
				val path = model.model.location as ModelPath
				uriName = "file://"path.path
			}else {
				val path = model.model.location as ModelUri
				uriName = path.uri
			}
		}
		val uri1 = URI.createURI(uriName);
		var uri2 = resource.URI
		uri2 = uri2.trimFileExtension
		uri2 = uri2.appendFileExtension("xmi")
		saveModelToURI(model, name, uri1)
		saveModelToURI(model, name, uri2)
	}
	
	def saveModelToURI(EObject model, String name, URI uri){
		val Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		var m = reg.getExtensionToFactoryMap();
		m.put(name, new XMIResourceFactoryImpl());
		var resourceSet = new ResourceSetImpl();
		var resource = resourceSet.createResource(uri) as XMIResource;
		resource.getContents().add(model);
		
		val saveOptions = resource.getDefaultSaveOptions()
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8")
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE)
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE)
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE)
		
		try {
			resource.save(saveOptions);
			println("Model saved to: "+uri.path)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
