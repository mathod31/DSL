/**
 */
package sample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sample.Transition#getName <em>Name</em>}</li>
 *   <li>{@link sample.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link sample.Transition#getStateTo <em>State To</em>}</li>
 *   <li>{@link sample.Transition#getStateFrom <em>State From</em>}</li>
 * </ul>
 *
 * @see sample.SamplePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sample.SamplePackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sample.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see sample.SamplePackage#getTransition_Trigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link sample.Transition#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>State To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State To</em>' reference.
	 * @see #setStateTo(State)
	 * @see sample.SamplePackage#getTransition_StateTo()
	 * @model required="true"
	 * @generated
	 */
	State getStateTo();

	/**
	 * Sets the value of the '{@link sample.Transition#getStateTo <em>State To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State To</em>' reference.
	 * @see #getStateTo()
	 * @generated
	 */
	void setStateTo(State value);

	/**
	 * Returns the value of the '<em><b>State From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State From</em>' reference.
	 * @see #setStateFrom(State)
	 * @see sample.SamplePackage#getTransition_StateFrom()
	 * @model required="true"
	 * @generated
	 */
	State getStateFrom();

	/**
	 * Sets the value of the '{@link sample.Transition#getStateFrom <em>State From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State From</em>' reference.
	 * @see #getStateFrom()
	 * @generated
	 */
	void setStateFrom(State value);

} // Transition
