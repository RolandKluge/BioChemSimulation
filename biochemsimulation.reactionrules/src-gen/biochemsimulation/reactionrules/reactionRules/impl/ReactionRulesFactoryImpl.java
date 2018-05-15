/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactionRulesFactoryImpl extends EFactoryImpl implements ReactionRulesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReactionRulesFactory init()
  {
    try
    {
      ReactionRulesFactory theReactionRulesFactory = (ReactionRulesFactory)EPackage.Registry.INSTANCE.getEFactory(ReactionRulesPackage.eNS_URI);
      if (theReactionRulesFactory != null)
      {
        return theReactionRulesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReactionRulesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionRulesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReactionRulesPackage.REACTION_RULE_MODEL: return createReactionRuleModel();
      case ReactionRulesPackage.MODEL_URI: return createModelUri();
      case ReactionRulesPackage.MODEL_PATH: return createModelPath();
      case ReactionRulesPackage.MODEL_LOCATION: return createModelLocation();
      case ReactionRulesPackage.MODEL: return createModel();
      case ReactionRulesPackage.REACTION_CONTAINER: return createReactionContainer();
      case ReactionRulesPackage.AGENT_INSTANCE_SITE_STATE: return createAgentInstanceSiteState();
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE: return createAgentInstanceLinkState();
      case ReactionRulesPackage.AGENT_INSTANCE: return createAgentInstance();
      case ReactionRulesPackage.REACTION_PROPERTY: return createReactionProperty();
      case ReactionRulesPackage.ARITHMETIC_VALUE: return createArithmeticValue();
      case ReactionRulesPackage.STATE: return createState();
      case ReactionRulesPackage.STATES: return createStates();
      case ReactionRulesPackage.SITE: return createSite();
      case ReactionRulesPackage.SITES: return createSites();
      case ReactionRulesPackage.AGENT: return createAgent();
      case ReactionRulesPackage.PATTERN_VARIABLE: return createPatternVariable();
      case ReactionRulesPackage.ARITHMETIC_VARIABLE: return createArithmeticVariable();
      case ReactionRulesPackage.VARIABLE: return createVariable();
      case ReactionRulesPackage.LINK_STATE: return createLinkState();
      case ReactionRulesPackage.EXACT_LINK_AGENT: return createExactLinkAgent();
      case ReactionRulesPackage.EXACT_LINK_SITE: return createExactLinkSite();
      case ReactionRulesPackage.SITE_STATE: return createSiteState();
      case ReactionRulesPackage.SITE_PATTERN: return createSitePattern();
      case ReactionRulesPackage.SITE_PATTERNS: return createSitePatterns();
      case ReactionRulesPackage.AGENT_PATTERN: return createAgentPattern();
      case ReactionRulesPackage.PATTERN: return createPattern();
      case ReactionRulesPackage.OBSERVATION: return createObservation();
      case ReactionRulesPackage.INITIAL: return createInitial();
      case ReactionRulesPackage.ASSIGN_FROM_PATTERN: return createAssignFromPattern();
      case ReactionRulesPackage.ASSIGN_FROM_VARIABLE: return createAssignFromVariable();
      case ReactionRulesPackage.PATTERN_ASSIGNMENT: return createPatternAssignment();
      case ReactionRulesPackage.RULE_VARIABLES: return createRuleVariables();
      case ReactionRulesPackage.RULE_BODY: return createRuleBody();
      case ReactionRulesPackage.RULE: return createRule();
      case ReactionRulesPackage.SEMI_LINK: return createSemiLink();
      case ReactionRulesPackage.FREE_LINK: return createFreeLink();
      case ReactionRulesPackage.WHAT_EVER: return createWhatEver();
      case ReactionRulesPackage.LIMIT_LINK: return createLimitLink();
      case ReactionRulesPackage.EXACT_LINK: return createExactLink();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionRuleModel createReactionRuleModel()
  {
    ReactionRuleModelImpl reactionRuleModel = new ReactionRuleModelImpl();
    return reactionRuleModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelUri createModelUri()
  {
    ModelUriImpl modelUri = new ModelUriImpl();
    return modelUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPath createModelPath()
  {
    ModelPathImpl modelPath = new ModelPathImpl();
    return modelPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelLocation createModelLocation()
  {
    ModelLocationImpl modelLocation = new ModelLocationImpl();
    return modelLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionContainer createReactionContainer()
  {
    ReactionContainerImpl reactionContainer = new ReactionContainerImpl();
    return reactionContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentInstanceSiteState createAgentInstanceSiteState()
  {
    AgentInstanceSiteStateImpl agentInstanceSiteState = new AgentInstanceSiteStateImpl();
    return agentInstanceSiteState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentInstanceLinkState createAgentInstanceLinkState()
  {
    AgentInstanceLinkStateImpl agentInstanceLinkState = new AgentInstanceLinkStateImpl();
    return agentInstanceLinkState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentInstance createAgentInstance()
  {
    AgentInstanceImpl agentInstance = new AgentInstanceImpl();
    return agentInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionProperty createReactionProperty()
  {
    ReactionPropertyImpl reactionProperty = new ReactionPropertyImpl();
    return reactionProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticValue createArithmeticValue()
  {
    ArithmeticValueImpl arithmeticValue = new ArithmeticValueImpl();
    return arithmeticValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site createSite()
  {
    SiteImpl site = new SiteImpl();
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sites createSites()
  {
    SitesImpl sites = new SitesImpl();
    return sites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternVariable createPatternVariable()
  {
    PatternVariableImpl patternVariable = new PatternVariableImpl();
    return patternVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticVariable createArithmeticVariable()
  {
    ArithmeticVariableImpl arithmeticVariable = new ArithmeticVariableImpl();
    return arithmeticVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkState createLinkState()
  {
    LinkStateImpl linkState = new LinkStateImpl();
    return linkState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactLinkAgent createExactLinkAgent()
  {
    ExactLinkAgentImpl exactLinkAgent = new ExactLinkAgentImpl();
    return exactLinkAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactLinkSite createExactLinkSite()
  {
    ExactLinkSiteImpl exactLinkSite = new ExactLinkSiteImpl();
    return exactLinkSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteState createSiteState()
  {
    SiteStateImpl siteState = new SiteStateImpl();
    return siteState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePattern createSitePattern()
  {
    SitePatternImpl sitePattern = new SitePatternImpl();
    return sitePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePatterns createSitePatterns()
  {
    SitePatternsImpl sitePatterns = new SitePatternsImpl();
    return sitePatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgentPattern createAgentPattern()
  {
    AgentPatternImpl agentPattern = new AgentPatternImpl();
    return agentPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation createObservation()
  {
    ObservationImpl observation = new ObservationImpl();
    return observation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initial createInitial()
  {
    InitialImpl initial = new InitialImpl();
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignFromPattern createAssignFromPattern()
  {
    AssignFromPatternImpl assignFromPattern = new AssignFromPatternImpl();
    return assignFromPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignFromVariable createAssignFromVariable()
  {
    AssignFromVariableImpl assignFromVariable = new AssignFromVariableImpl();
    return assignFromVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternAssignment createPatternAssignment()
  {
    PatternAssignmentImpl patternAssignment = new PatternAssignmentImpl();
    return patternAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleVariables createRuleVariables()
  {
    RuleVariablesImpl ruleVariables = new RuleVariablesImpl();
    return ruleVariables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleBody createRuleBody()
  {
    RuleBodyImpl ruleBody = new RuleBodyImpl();
    return ruleBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemiLink createSemiLink()
  {
    SemiLinkImpl semiLink = new SemiLinkImpl();
    return semiLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeLink createFreeLink()
  {
    FreeLinkImpl freeLink = new FreeLinkImpl();
    return freeLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhatEver createWhatEver()
  {
    WhatEverImpl whatEver = new WhatEverImpl();
    return whatEver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LimitLink createLimitLink()
  {
    LimitLinkImpl limitLink = new LimitLinkImpl();
    return limitLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExactLink createExactLink()
  {
    ExactLinkImpl exactLink = new ExactLinkImpl();
    return exactLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionRulesPackage getReactionRulesPackage()
  {
    return (ReactionRulesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReactionRulesPackage getPackage()
  {
    return ReactionRulesPackage.eINSTANCE;
  }

} //ReactionRulesFactoryImpl
