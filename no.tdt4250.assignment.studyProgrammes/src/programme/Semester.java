/**
 */
package programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Semester#getPosition <em>Position</em>}</li>
 *   <li>{@link programme.Semester#getProgramCourses <em>Program Courses</em>}</li>
 *   <li>{@link programme.Semester#getTotalCredits <em>Total Credits</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see programme.ProgrammePackage#getSemester_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link programme.Semester#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Program Courses</b></em>' reference list.
	 * The list contents are of type {@link programme.ProgrammeCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Courses</em>' reference list.
	 * @see programme.ProgrammePackage#getSemester_ProgramCourses()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<ProgrammeCourse> getProgramCourses();

	/**
	 * Returns the value of the '<em><b>Total Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Credits</em>' attribute.
	 * @see programme.ProgrammePackage#getSemester_TotalCredits()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getTotalCredits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void creditsNeededShouldBe30();

} // Semester