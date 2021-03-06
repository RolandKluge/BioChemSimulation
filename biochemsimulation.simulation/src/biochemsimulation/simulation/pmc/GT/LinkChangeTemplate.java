package biochemsimulation.simulation.pmc.GT;

import java.util.Map;

import biochemsimulation.reactioncontainer.ReactionContainer;
import biochemsimulation.reactioncontainer.ReactionContainerFactory;
import biochemsimulation.reactioncontainer.SimAgent;
import biochemsimulation.reactioncontainer.SimBound;
import biochemsimulation.reactioncontainer.SimLinkState;
import biochemsimulation.reactioncontainer.SimSite;
import biochemsimulation.simulation.matching.IMatch;

public class LinkChangeTemplate {
	private int agentIdxFrom;
	private int agentIdxTo;
	
	private AgentCreationTemplate templateFrom;
	private boolean fromIsTemplate;
	
	private int siteIdxFrom;
	private int siteIdxTo;
	
	private AgentCreationTemplate templateTo;
	private boolean toIsTemplate;
	
	private Map<AgentCreationTemplate, SimAgent> createdSimAgents;
	
	public LinkChangeTemplate(int agentIdxFrom, int siteIdxFrom) {
		this.agentIdxFrom = agentIdxFrom;
		this.siteIdxFrom = siteIdxFrom;
		fromIsTemplate = false;
		toIsTemplate = false;
	}
	
	public LinkChangeTemplate(AgentCreationTemplate templateFrom, int siteIdxFrom, Map<AgentCreationTemplate, SimAgent> createdSimAgents) {
		this.templateFrom = templateFrom;
		this.siteIdxFrom = siteIdxFrom;
		fromIsTemplate = true;
		toIsTemplate = false;
		this.createdSimAgents = createdSimAgents;
	}
	
	public int calculateKey() {
		int key = 0;
		String keyVal1 = "";
		String keyVal2 = "";
		if(!fromIsTemplate && !toIsTemplate) {
			keyVal1 = String.valueOf(agentIdxFrom)+String.valueOf(siteIdxFrom)+String.valueOf(agentIdxTo)+String.valueOf(siteIdxTo);
			keyVal2 = String.valueOf(agentIdxTo)+String.valueOf(siteIdxTo)+String.valueOf(agentIdxFrom)+String.valueOf(siteIdxFrom);
			key = (keyVal1.hashCode()>keyVal2.hashCode())?keyVal1.hashCode():keyVal2.hashCode();
		}else if(fromIsTemplate && !toIsTemplate) {
			keyVal1 = templateFrom.toString()+String.valueOf(siteIdxFrom)+String.valueOf(agentIdxTo)+String.valueOf(siteIdxTo);
			keyVal2 = String.valueOf(agentIdxTo)+String.valueOf(siteIdxTo)+templateFrom.toString()+String.valueOf(siteIdxFrom);
			key = (keyVal1.hashCode()>keyVal2.hashCode())?keyVal1.hashCode():keyVal2.hashCode();
		}else if(!fromIsTemplate && toIsTemplate){
			keyVal1 = String.valueOf(agentIdxFrom)+String.valueOf(siteIdxFrom)+templateTo.toString()+String.valueOf(siteIdxTo);
			keyVal2 = templateTo.toString()+String.valueOf(siteIdxTo)+String.valueOf(agentIdxFrom)+String.valueOf(siteIdxFrom);
			key = (keyVal1.hashCode()>keyVal2.hashCode())?keyVal1.hashCode():keyVal2.hashCode();
		}else {
			keyVal1 = templateFrom.toString()+String.valueOf(siteIdxFrom)+templateTo.toString()+String.valueOf(siteIdxTo);
			keyVal2 = templateTo.toString()+String.valueOf(siteIdxTo)+templateFrom.toString()+String.valueOf(siteIdxFrom);
			key = (keyVal1.hashCode()>keyVal2.hashCode())?keyVal1.hashCode():keyVal2.hashCode();
		}
		return key;
	}
	
	public void connectTo(int agentIdxTo, int siteIdxTo) {
		this.agentIdxTo = agentIdxTo;
		this.siteIdxTo = siteIdxTo;
	}
	
	public void connectTo(AgentCreationTemplate templateTo, int siteIdxTo, Map<AgentCreationTemplate, SimAgent> createdSimAgents) {
		this.templateTo = templateTo;
		this.siteIdxTo = siteIdxTo;
		toIsTemplate = true;
		this.createdSimAgents = createdSimAgents;
	}
	
	public SimLinkState applyLinkChange(IMatch match, ReactionContainerFactory factory, ReactionContainer reactionContainer) {
		// This try catch is a very very very dirty fix to prevent crashes. This needs to be fixed properly!
		try {
			if(!fromIsTemplate && !toIsTemplate) {
				return applyLinkChangeNormal(match, factory, reactionContainer);
			}else if(fromIsTemplate && !toIsTemplate) {
				return applyLinkChangeFromTemplate(match, factory, reactionContainer);
			}else if(!fromIsTemplate && toIsTemplate){
				return applyLinkChangeToTemplate(match, factory, reactionContainer);
			}else {
				return applyLinkChangeBothTemplate(match, factory, reactionContainer);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
		
	}
	
	private SimLinkState applyLinkChangeNormal(IMatch match, ReactionContainerFactory factory, ReactionContainer reactionContainer) {
		SimAgent simAgentFrom = (SimAgent) match.get(match.parameterNames().get(agentIdxFrom));
		SimSite simSiteFrom = simAgentFrom.getSimSites().get(siteIdxFrom);
		if(simSiteFrom.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteFrom.getSimLinkState());
		}
		
		SimAgent simAgentTo = (SimAgent) match.get(match.parameterNames().get(agentIdxTo));
		SimSite simSiteTo = simAgentTo.getSimSites().get(siteIdxTo);
		if(simSiteTo.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteTo.getSimLinkState());
		}
		
		SimBound link = factory.createSimBound();
		reactionContainer.getSimLinkStates().add(link);
		link.setSimSite1(simSiteFrom);
		link.setSimSite2(simSiteTo);
		simSiteFrom.setSimLinkState(link);
		simSiteTo.setSimLinkState(link);
		
		return link;
	}
	
	private SimLinkState applyLinkChangeFromTemplate(IMatch match, ReactionContainerFactory factory, ReactionContainer reactionContainer) {
		SimAgent simAgentFrom = createdSimAgents.get(templateFrom);
		SimSite simSiteFrom = simAgentFrom.getSimSites().get(siteIdxFrom);
		if(simSiteFrom.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteFrom.getSimLinkState());
		}
		
		SimAgent simAgentTo = (SimAgent) match.get(match.parameterNames().get(agentIdxTo));
		SimSite simSiteTo = simAgentTo.getSimSites().get(siteIdxTo);
		if(simSiteTo.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteTo.getSimLinkState());
		}
		
		SimBound link = factory.createSimBound();
		reactionContainer.getSimLinkStates().add(link);
		link.setSimSite1(simSiteFrom);
		link.setSimSite2(simSiteTo);
		simSiteFrom.setSimLinkState(link);
		simSiteTo.setSimLinkState(link);
		
		return link;
	}
	
	private SimLinkState applyLinkChangeToTemplate(IMatch match, ReactionContainerFactory factory, ReactionContainer reactionContainer) {
		SimAgent simAgentFrom = (SimAgent) match.get(match.parameterNames().get(agentIdxFrom));
		SimSite simSiteFrom = simAgentFrom.getSimSites().get(siteIdxFrom);
		if(simSiteFrom.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteFrom.getSimLinkState());
		}
		SimAgent simAgentTo = createdSimAgents.get(templateTo);
		SimSite simSiteTo = simAgentTo.getSimSites().get(siteIdxTo);
		if(simSiteTo.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteTo.getSimLinkState());
		}
		
		SimBound link = factory.createSimBound();
		reactionContainer.getSimLinkStates().add(link);
		link.setSimSite1(simSiteFrom);
		link.setSimSite2(simSiteTo);
		simSiteFrom.setSimLinkState(link);
		simSiteTo.setSimLinkState(link);
		
		return link;
	}
	
	private SimLinkState applyLinkChangeBothTemplate(IMatch match, ReactionContainerFactory factory, ReactionContainer reactionContainer) {
		SimAgent simAgentFrom = createdSimAgents.get(templateFrom);
		SimSite simSiteFrom = simAgentFrom.getSimSites().get(siteIdxFrom);
		if(simSiteFrom.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteFrom.getSimLinkState());
		}
		SimAgent simAgentTo = createdSimAgents.get(templateTo);
		SimSite simSiteTo = simAgentTo.getSimSites().get(siteIdxTo);
		if(simSiteTo.getSimLinkState() != null) {
			org.eclipse.emf.ecore.util.EcoreUtil.delete(simSiteTo.getSimLinkState());
		}
		
		SimBound link = factory.createSimBound();
		reactionContainer.getSimLinkStates().add(link);
		link.setSimSite1(simSiteFrom);
		link.setSimSite2(simSiteTo);
		simSiteFrom.setSimLinkState(link);
		simSiteTo.setSimLinkState(link);
		
		return link;
	}
	
	
}
