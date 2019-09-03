/**
 */
package programme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Course#getName <em>Name</em>}</li>
 *   <li>{@link programme.Course#getCode <em>Code</em>}</li>
 *   <li>{@link programme.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link programme.Course#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='codeLength'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programme.ProgrammePackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programme.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see programme.ProgrammePackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link programme.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(float)
	 * @see programme.ProgrammePackage#getCourse_Credit()
	 * @model
	 * @generated
	 */
	float getCredit();

	/**
	 * Sets the value of the '{@link programme.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see programme.ProgrammePackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link programme.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

} // Course
