/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric From Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.NumericFromLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getNumericFromLiteral()
 * @model
 * @generated
 */
public interface NumericFromLiteral extends NumericAssignment
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ArithmeticValue)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getNumericFromLiteral_Value()
   * @model containment="true"
   * @generated
   */
  ArithmeticValue getValue();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.NumericFromLiteral#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ArithmeticValue value);

} // NumericFromLiteral
