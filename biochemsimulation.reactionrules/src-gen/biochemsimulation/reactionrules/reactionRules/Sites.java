/**
 * generated by Xtext 2.12.0
 */
package biochemsimulation.reactionrules.reactionRules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link biochemsimulation.reactionrules.reactionRules.Sites#getSites <em>Sites</em>}</li>
 * </ul>
 *
 * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getSites()
 * @model
 * @generated
 */
public interface Sites extends EObject
{
  /**
   * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
   * The list contents are of type {@link biochemsimulation.reactionrules.reactionRules.Site}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sites</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sites</em>' containment reference list.
   * @see biochemsimulation.reactionrules.reactionRules.ReactionRulesPackage#getSites_Sites()
   * @model containment="true"
   * @generated
   */
  EList<Site> getSites();

} // Sites
