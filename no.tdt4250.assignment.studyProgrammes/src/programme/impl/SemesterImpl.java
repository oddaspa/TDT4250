/**
 */
package programme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import programme.ProgrammeCourse;
import programme.ProgrammePackage;
import programme.Semester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programme.impl.SemesterImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link programme.impl.SemesterImpl#getProgramCourses <em>Program Courses</em>}</li>
 *   <li>{@link programme.impl.SemesterImpl#getTotalCredits <em>Total Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgramCourses() <em>Program Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeCourse> programCourses;

	/**
	 * The default value of the '{@link #getTotalCredits() <em>Total Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_CREDITS_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.SEMESTER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeCourse> getProgramCourses() {
		if (programCourses == null) {
			programCourses = new EObjectContainmentEList<ProgrammeCourse>(ProgrammeCourse.class, this, ProgrammePackage.SEMESTER__PROGRAM_COURSES);
		}
		return programCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public float getTotalCredits() {
		float total = 0;
		for(int i=0; i< this.getProgramCourses().size(); i++) {
			total += this.getProgramCourses().get(i).getCourse().getCredit();
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCredits(float newTotalCredits) {
		// TODO: implement this method to set the 'Total Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__PROGRAM_COURSES:
				return ((InternalEList<?>)getProgramCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__POSITION:
				return getPosition();
			case ProgrammePackage.SEMESTER__PROGRAM_COURSES:
				return getProgramCourses();
			case ProgrammePackage.SEMESTER__TOTAL_CREDITS:
				return getTotalCredits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__POSITION:
				setPosition((Integer)newValue);
				return;
			case ProgrammePackage.SEMESTER__PROGRAM_COURSES:
				getProgramCourses().clear();
				getProgramCourses().addAll((Collection<? extends ProgrammeCourse>)newValue);
				return;
			case ProgrammePackage.SEMESTER__TOTAL_CREDITS:
				setTotalCredits((Float)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ProgrammePackage.SEMESTER__PROGRAM_COURSES:
				getProgramCourses().clear();
				return;
			case ProgrammePackage.SEMESTER__TOTAL_CREDITS:
				setTotalCredits(TOTAL_CREDITS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__POSITION:
				return position != POSITION_EDEFAULT;
			case ProgrammePackage.SEMESTER__PROGRAM_COURSES:
				return programCourses != null && !programCourses.isEmpty();
			case ProgrammePackage.SEMESTER__TOTAL_CREDITS:
				return getTotalCredits() != TOTAL_CREDITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
