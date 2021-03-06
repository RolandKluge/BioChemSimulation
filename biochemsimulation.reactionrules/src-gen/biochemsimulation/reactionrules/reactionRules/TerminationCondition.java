/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Termination Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.TerminationCondition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getTerminationCondition()
 * @model
 * @generated
 */
public interface TerminationCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getTerminationCondition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.TerminationCondition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // TerminationCondition
