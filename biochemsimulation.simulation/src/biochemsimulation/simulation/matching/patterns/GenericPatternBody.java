package biochemsimulation.simulation.matching.patterns;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLink;
import biochemsimulation.reactionrules.reactionRules.BoundLink;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.SitePattern;
import biochemsimulation.reactionrules.reactionRules.ValidAgentPattern;

public class GenericPatternBody {
	
	private GenericPatternSignature signature;
	private List<ValidAgentPattern> agentPatterns;
	
	private Map<ValidAgentPattern, AgentNodeContext> agentNodeContexts;
	private Map<AgentNodeContext, List<SiteNodeContext>> siteNodeContexts;
	private Map<SiteNodeContext, SiteStateContext> siteStateContexts;
	private Map<SiteNodeContext, LinkStateContext> linkStateContexts;
	
	private Map<Integer, LinkStateConstraint> linkStateConstraints;
	private Collection<AgentNodeConstraint> injectivityConstraints;
	
	private Map<ValidAgentPattern, List<AgentNodeContext>> localAgentNodes;
	private Map<AgentNodeContext, SiteNodeContext> localSiteNodes;
	private Map<SiteNodeContext, LinkStateContext> localLinkStates;
	
	public GenericPatternBody(GenericPatternSignature signature, List<ValidAgentPattern> agentPatterns) {
		this.signature = signature;
		this.agentPatterns = agentPatterns;
		injectivityConstraints = new LinkedList<AgentNodeConstraint>();
		
		buildAgentNodeContexts();
		buildSiteNodeContexts();
		buildConstraintsAndLocalNodes();
		buildInjectivityConstraints();
	}
	
	
	
	public GenericPatternSignature getSignature() {
		return signature;
	}



	public List<ValidAgentPattern> getAgentPatterns() {
		return agentPatterns;
	}



	public Map<ValidAgentPattern, AgentNodeContext> getAgentNodeContexts() {
		return agentNodeContexts;
	}



	public Map<AgentNodeContext, List<SiteNodeContext>> getSiteNodeContexts() {
		return siteNodeContexts;
	}



	public Map<SiteNodeContext, SiteStateContext> getSiteStateContexts() {
		return siteStateContexts;
	}



	public Map<SiteNodeContext, LinkStateContext> getLinkStateContexts() {
		return linkStateContexts;
	}



	public Map<Integer, LinkStateConstraint> getLinkStateConstraints() {
		return linkStateConstraints;
	}



	public Collection<AgentNodeConstraint> getInjectivityConstraints() {
		return injectivityConstraints;
	}



	public Map<ValidAgentPattern, List<AgentNodeContext>> getLocalAgentNodes() {
		return localAgentNodes;
	}



	public Map<AgentNodeContext, SiteNodeContext> getLocalSiteNodes() {
		return localSiteNodes;
	}



	public Map<SiteNodeContext, LinkStateContext> getLocalLinkStates() {
		return localLinkStates;
	}



	private void buildAgentNodeContexts() {
		agentNodeContexts = new HashMap<ValidAgentPattern, AgentNodeContext>();
		for(ValidAgentPattern pattern : agentPatterns) {
			agentNodeContexts.put(pattern, new AgentNodeContext(signature.getSignatureNode(pattern), pattern.getAgent().getName()));
		}
	}
	
	private void buildSiteNodeContexts() {
		siteNodeContexts = new HashMap<AgentNodeContext, List<SiteNodeContext>>();
		siteStateContexts = new HashMap<SiteNodeContext, SiteStateContext>();
		linkStateContexts = new HashMap<SiteNodeContext, LinkStateContext>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = new LinkedList<SiteNodeContext>();
			for(SitePattern sitePattern : pattern.getSitePatterns().getSitePatterns()) {
				SiteNodeContext currentSiteNodeContext = new SiteNodeContext(currentAgentNodeContext, sitePattern.getSite().getName());
				if(sitePattern.getState() != null) {
					siteStateContexts.put(currentSiteNodeContext, new SiteStateContext(currentSiteNodeContext, sitePattern.getState().getState().getName()));
				}
				if(sitePattern.getLinkState().getLinkState() != null) {
					linkStateContexts.put(currentSiteNodeContext, new LinkStateContext(currentSiteNodeContext, LinkStateType.enumFromLinkState(sitePattern.getLinkState().getLinkState())));
				}
				currentSiteNodeContexts.add(currentSiteNodeContext);
			}
			if(currentSiteNodeContexts.size() > 0) {
				siteNodeContexts.put(currentAgentNodeContext, currentSiteNodeContexts);
			}
		}
	}
	
	private void buildConstraintsAndLocalNodes() {
		localAgentNodes = new HashMap<ValidAgentPattern, List<AgentNodeContext>>();
		localSiteNodes = new HashMap<AgentNodeContext, SiteNodeContext>();
		localLinkStates = new HashMap<SiteNodeContext, LinkStateContext>();
		linkStateConstraints = new HashMap<Integer, LinkStateConstraint>();
		
		for(ValidAgentPattern pattern : agentPatterns) {
			AgentNodeContext currentAgentNodeContext = agentNodeContexts.get(pattern);
			List<SiteNodeContext> currentSiteNodeContexts = siteNodeContexts.get(currentAgentNodeContext);
			
			List<AgentNodeContext> localAgentNodeList = new LinkedList<AgentNodeContext>();
			int idx = -1;
			for(SiteNodeContext currentSiteNodeContext : currentSiteNodeContexts) {
				idx++;
				
				if(!linkStateContexts.containsKey(currentSiteNodeContext)) {
					continue;
				}
				
				LinkStateContext currentLinkStateContext = linkStateContexts.get(currentSiteNodeContext);
				LinkState link = pattern.getSitePatterns().getSitePatterns().get(idx).getLinkState().getLinkState();
				
				if(currentLinkStateContext.getStateType() == LinkStateType.BoundAnyOfType) {
					BoundAnyOfTypeLink boundLink = (BoundAnyOfTypeLink)link;
					String otherAgentType = boundLink.getLinkAgent().getAgent().getName();
					String otherSiteType = boundLink.getLinkSite().getSite().getName();
					String localAgentVariableName = currentAgentNodeContext.getAgentVariableName() + "_" + otherAgentType + idx;
					
					AgentNodeContext localAgentNodeContext = new AgentNodeContext(localAgentVariableName, otherAgentType);
					SiteNodeContext localSiteNodeContext = new SiteNodeContext(localAgentNodeContext, otherSiteType);
					LinkStateContext localLinkStateContext = new LinkStateContext(localSiteNodeContext, LinkStateType.BoundAnyOfType);
					
					localAgentNodeList.add(localAgentNodeContext);
					localSiteNodes.put(localAgentNodeContext, localSiteNodeContext);
					localLinkStates.put(localSiteNodeContext, localLinkStateContext);
					
					LinkStateConstraint constraint = new LinkStateConstraint(currentLinkStateContext, localLinkStateContext, ConstraintType.equal);
					linkStateConstraints.put(currentLinkStateContext.getLocalSimLinkStateVariableName().hashCode(), constraint);
					// remove self occurences
					injectivityConstraints.add(new AgentNodeConstraint(currentAgentNodeContext, localAgentNodeContext, ConstraintType.unequal));
					
				}else if(currentLinkStateContext.getStateType() == LinkStateType.Bound) {
					BoundLink boundLink = (BoundLink)link;
					int linkIdx = Integer.valueOf(boundLink.getState());
					LinkStateContext otherSite = findLinkedSite(pattern, linkIdx);
					LinkStateConstraint constraint = new LinkStateConstraint(currentLinkStateContext, otherSite, ConstraintType.equal);
					int key2 = otherSite.getLocalSimLinkStateVariableName().hashCode();
					int key1 = currentLinkStateContext.getLocalSimLinkStateVariableName().hashCode();
					int key = (key1>key2)?key1:key2;
					linkStateConstraints.putIfAbsent(key, constraint);
				}
				
			}
			
			if(localAgentNodeList.size() > 0) {
				localAgentNodes.put(pattern, localAgentNodeList);
			}
		}
	}
	
	private void buildInjectivityConstraints() {
		//injectivityConstraints = new LinkedList<AgentNodeConstraint>();
		Map<String, List<String>> injectivityConflicts = signature.getInjectivityConflicts();
		Map<Integer, AgentNodeConstraint> constraints = new HashMap<Integer, AgentNodeConstraint>();
		
		for(List<String> nodes : injectivityConflicts.values()) {
			for(String node : nodes) {
				for(String node2 : nodes) {
					if(node.equals(node2)) {
						continue;
					}
					int key1 = (node+node2).hashCode();
					int key2 = (node2+node).hashCode();
					int key = (key1 > key2)?key1:key2;
					AgentNodeContext agentNode = agentNodeContexts.get(signature.getSignaturePattern(node));
					AgentNodeContext agentNode2 = agentNodeContexts.get(signature.getSignaturePattern(node2));
					constraints.putIfAbsent(key, new AgentNodeConstraint(agentNode, agentNode2, ConstraintType.unequal));
				}
			}
		}
		injectivityConstraints.addAll(constraints.values());
	}
	
	private LinkStateContext findLinkedSite(ValidAgentPattern pattern, int linkIdx) {
		LinkStateContext other = null;
		for(ValidAgentPattern otherPattern : agentPatterns) {
			if(pattern == otherPattern) {
				continue;
			}
			int idx = -1;
			for(SitePattern sitePattern : otherPattern.getSitePatterns().getSitePatterns()) {
				idx++;
				LinkState link = sitePattern.getLinkState().getLinkState();
				if(link == null) {
					continue;
				}
				if(!(link instanceof BoundLink)) {
					continue;
				}
				BoundLink boundLink = (BoundLink) link;
				int otherLinkIdx = Integer.valueOf(boundLink.getState());
				if(linkIdx == otherLinkIdx) {
					AgentNodeContext otherAgentNode = agentNodeContexts.get(otherPattern);
					SiteNodeContext otherSiteNode = siteNodeContexts.get(otherAgentNode).get(idx);
					other = linkStateContexts.get(otherSiteNode);
					return other;
				}
			}
		}
			
		return other;
	}
	
	
}
