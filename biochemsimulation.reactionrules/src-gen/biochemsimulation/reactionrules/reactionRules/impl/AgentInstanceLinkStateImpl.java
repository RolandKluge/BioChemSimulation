/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.AgentInstanceLinkState;
import biochemsimulation.reactionrules.reactionRules.LinkState;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;
import biochemsimulation.reactionrules.reactionRules.Site;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Instance Link State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.AgentInstanceLinkStateImpl#getSite <em>Site</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.AgentInstanceLinkStateImpl#getLinkState <em>Link State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentInstanceLinkStateImpl extends MinimalEObjectImpl.Container implements AgentInstanceLinkState
{
  /**
   * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected Site site;

  /**
   * The cached value of the '{@link #getLinkState() <em>Link State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkState()
   * @generated
   * @ordered
   */
  protected LinkState linkState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentInstanceLinkStateImpl()
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
    return ReactionRulesPackage.Literals.AGENT_INSTANCE_LINK_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site getSite()
  {
    if (site != null && site.eIsProxy())
    {
      InternalEObject oldSite = (InternalEObject)site;
      site = (Site)eResolveProxy(oldSite);
      if (site != oldSite)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__SITE, oldSite, site));
      }
    }
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site basicGetSite()
  {
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSite(Site newSite)
  {
    Site oldSite = site;
    site = newSite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__SITE, oldSite, site));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkState getLinkState()
  {
    return linkState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinkState(LinkState newLinkState, NotificationChain msgs)
  {
    LinkState oldLinkState = linkState;
    linkState = newLinkState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE, oldLinkState, newLinkState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkState(LinkState newLinkState)
  {
    if (newLinkState != linkState)
    {
      NotificationChain msgs = null;
      if (linkState != null)
        msgs = ((InternalEObject)linkState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE, null, msgs);
      if (newLinkState != null)
        msgs = ((InternalEObject)newLinkState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE, null, msgs);
      msgs = basicSetLinkState(newLinkState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE, newLinkState, newLinkState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE:
        return basicSetLinkState(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__SITE:
        if (resolve) return getSite();
        return basicGetSite();
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE:
        return getLinkState();
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
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__SITE:
        setSite((Site)newValue);
        return;
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE:
        setLinkState((LinkState)newValue);
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
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__SITE:
        setSite((Site)null);
        return;
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE:
        setLinkState((LinkState)null);
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
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__SITE:
        return site != null;
      case ReactionRulesPackage.AGENT_INSTANCE_LINK_STATE__LINK_STATE:
        return linkState != null;
    }
    return super.eIsSet(featureID);
  }

} //AgentInstanceLinkStateImpl
