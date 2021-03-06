/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.Agent;
import biochemsimulation.reactionrules.reactionRules.BoundAnyOfTypeLinkAgent;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bound Any Of Type Link Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.BoundAnyOfTypeLinkAgentImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundAnyOfTypeLinkAgentImpl extends MinimalEObjectImpl.Container implements BoundAnyOfTypeLinkAgent
{
  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected Agent agent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BoundAnyOfTypeLinkAgentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReactionRulesPackage.Literals.BOUND_ANY_OF_TYPE_LINK_AGENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getAgent()
  {
    if (agent != null && agent.eIsProxy())
    {
      InternalEObject oldAgent = (InternalEObject)agent;
      agent = (Agent)eResolveProxy(oldAgent);
      if (agent != oldAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_AGENT__AGENT, oldAgent, agent));
      }
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetAgent()
  {
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAgent(Agent newAgent)
  {
    Agent oldAgent = agent;
    agent = newAgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_AGENT__AGENT, oldAgent, agent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_AGENT__AGENT:
        if (resolve) return getAgent();
        return basicGetAgent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_AGENT__AGENT:
        setAgent((Agent)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_AGENT__AGENT:
        setAgent((Agent)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReactionRulesPackage.BOUND_ANY_OF_TYPE_LINK_AGENT__AGENT:
        return agent != null;
    }
    return super.eIsSet(featureID);
  }

} //BoundAnyOfTypeLinkAgentImpl
