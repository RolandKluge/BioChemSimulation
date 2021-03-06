/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.Terminate#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getTerminate()
 * @model
 * @generated
 */
public interface Terminate extends ReactionProperty
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(TerminationCondition)
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getTerminate_Condition()
   * @model containment="true"
   * @generated
   */
  TerminationCondition getCondition();

  /**
   * Sets the value of the '{@link biochemsimulation.reactionrules.reactionRules.Terminate#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(TerminationCondition value);

} // Terminate
