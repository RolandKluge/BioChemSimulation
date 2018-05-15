/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules.impl;

import biochemsimulation.reactionrules.reactionRules.AssignFromVariable;
import biochemsimulation.reactionrules.reactionRules.PatternVariable;
import biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign From Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.impl.AssignFromVariableImpl#getPatternVar <em>Pattern Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignFromVariableImpl extends PatternAssignmentImpl implements AssignFromVariable
{
  /**
   * The cached value of the '{@link #getPatternVar() <em>Pattern Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternVar()
   * @generated
   * @ordered
   */
  protected PatternVariable patternVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignFromVariableImpl()
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
    return ReactionRulesPackage.Literals.ASSIGN_FROM_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternVariable getPatternVar()
  {
    if (patternVar != null && patternVar.eIsProxy())
    {
      InternalEObject oldPatternVar = (InternalEObject)patternVar;
      patternVar = (PatternVariable)eResolveProxy(oldPatternVar);
      if (patternVar != oldPatternVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactionRulesPackage.ASSIGN_FROM_VARIABLE__PATTERN_VAR, oldPatternVar, patternVar));
      }
    }
    return patternVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternVariable basicGetPatternVar()
  {
    return patternVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatternVar(PatternVariable newPatternVar)
  {
    PatternVariable oldPatternVar = patternVar;
    patternVar = newPatternVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionRulesPackage.ASSIGN_FROM_VARIABLE__PATTERN_VAR, oldPatternVar, patternVar));
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
      case ReactionRulesPackage.ASSIGN_FROM_VARIABLE__PATTERN_VAR:
        if (resolve) return getPatternVar();
        return basicGetPatternVar();
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
      case ReactionRulesPackage.ASSIGN_FROM_VARIABLE__PATTERN_VAR:
        setPatternVar((PatternVariable)newValue);
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
      case ReactionRulesPackage.ASSIGN_FROM_VARIABLE__PATTERN_VAR:
        setPatternVar((PatternVariable)null);
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
      case ReactionRulesPackage.ASSIGN_FROM_VARIABLE__PATTERN_VAR:
        return patternVar != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignFromVariableImpl
