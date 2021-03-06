/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.Initial;
import biochemsimulation.reactionrules.reactionRules.NumericAssignment;
import biochemsimulation.reactionrules.reactionRules.PatternAssignment;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.InitialImpl#getCount <em>Count</em>}</li>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.InitialImpl#getInitialPattern <em>Initial Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialImpl extends ReactionPropertyImpl implements Initial
{
  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected NumericAssignment count;

  /**
   * The cached value of the '{@link #getInitialPattern() <em>Initial Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialPattern()
   * @generated
   * @ordered
   */
  protected PatternAssignment initialPattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialImpl()
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
    return ReactionRulesPackage.Literals.INITIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericAssignment getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCount(NumericAssignment newCount, NotificationChain msgs)
  {
    NumericAssignment oldCount = count;
    count = newCount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.INITIAL__COUNT, oldCount, newCount);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCount(NumericAssignment newCount)
  {
    if (newCount != count)
    {
      NotificationChain msgs = null;
      if (count != null)
        msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.INITIAL__COUNT, null, msgs);
      if (newCount != null)
        msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.INITIAL__COUNT, null, msgs);
      msgs = basicSetCount(newCount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.INITIAL__COUNT, newCount, newCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternAssignment getInitialPattern()
  {
    return initialPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialPattern(PatternAssignment newInitialPattern, NotificationChain msgs)
  {
    PatternAssignment oldInitialPattern = initialPattern;
    initialPattern = newInitialPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.INITIAL__INITIAL_PATTERN, oldInitialPattern, newInitialPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialPattern(PatternAssignment newInitialPattern)
  {
    if (newInitialPattern != initialPattern)
    {
      NotificationChain msgs = null;
      if (initialPattern != null)
        msgs = ((InternalEObject)initialPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.INITIAL__INITIAL_PATTERN, null, msgs);
      if (newInitialPattern != null)
        msgs = ((InternalEObject)newInitialPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionRulesPackage.INITIAL__INITIAL_PATTERN, null, msgs);
      msgs = basicSetInitialPattern(newInitialPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.INITIAL__INITIAL_PATTERN, newInitialPattern, newInitialPattern));
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
      case ReactionRulesPackage.INITIAL__COUNT:
        return basicSetCount(null, msgs);
      case ReactionRulesPackage.INITIAL__INITIAL_PATTERN:
        return basicSetInitialPattern(null, msgs);
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
      case ReactionRulesPackage.INITIAL__COUNT:
        return getCount();
      case ReactionRulesPackage.INITIAL__INITIAL_PATTERN:
        return getInitialPattern();
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
      case ReactionRulesPackage.INITIAL__COUNT:
        setCount((NumericAssignment)newValue);
        return;
      case ReactionRulesPackage.INITIAL__INITIAL_PATTERN:
        setInitialPattern((PatternAssignment)newValue);
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
      case ReactionRulesPackage.INITIAL__COUNT:
        setCount((NumericAssignment)null);
        return;
      case ReactionRulesPackage.INITIAL__INITIAL_PATTERN:
        setInitialPattern((PatternAssignment)null);
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
      case ReactionRulesPackage.INITIAL__COUNT:
        return count != null;
      case ReactionRulesPackage.INITIAL__INITIAL_PATTERN:
        return initialPattern != null;
    }
    return super.eIsSet(featureID);
  }

} //InitialImpl
