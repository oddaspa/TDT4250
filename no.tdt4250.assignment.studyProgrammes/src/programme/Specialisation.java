/**
 */
package programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link programme.Specialisation#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programme.ProgrammePackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programme.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference list.
	 * The list contents are of type {@link programme.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference list.
	 * @see programme.ProgrammePackage#getSpecialisation_Semesters()
	 * @model upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialisation
