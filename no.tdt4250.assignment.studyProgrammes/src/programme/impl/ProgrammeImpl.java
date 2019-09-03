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

import programme.Programme;
import programme.ProgrammeCourse;
import programme.ProgrammePackage;
import programme.Semester;
import programme.Specialisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programme.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getProgramCourses <em>Program Courses</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getSpecialisations <em>Specialisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialisations() <em>Specialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specialisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammePackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, ProgrammePackage.PROGRAMME__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeCourse> getProgramCourses() {
		if (programCourses == null) {
			programCourses = new EObjectContainmentEList<ProgrammeCourse>(ProgrammeCourse.class, this, ProgrammePackage.PROGRAMME__PROGRAM_COURSES);
		}
		return programCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.PROGRAMME__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialisation> getSpecialisations() {
		if (specialisations == null) {
			specialisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, ProgrammePackage.PROGRAMME__SPECIALISATIONS);
		}
		return specialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammePackage.PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case ProgrammePackage.PROGRAMME__PROGRAM_COURSES:
				return ((InternalEList<?>)getProgramCourses()).basicRemove(otherEnd, msgs);
			case ProgrammePackage.PROGRAMME__SPECIALISATIONS:
				return ((InternalEList<?>)getSpecialisations()).basicRemove(otherEnd, msgs);
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
			case ProgrammePackage.PROGRAMME__NAME:
				return getName();
			case ProgrammePackage.PROGRAMME__CODE:
				return getCode();
			case ProgrammePackage.PROGRAMME__SEMESTERS:
				return getSemesters();
			case ProgrammePackage.PROGRAMME__PROGRAM_COURSES:
				return getProgramCourses();
			case ProgrammePackage.PROGRAMME__DURATION:
				return getDuration();
			case ProgrammePackage.PROGRAMME__SPECIALISATIONS:
				return getSpecialisations();
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
			case ProgrammePackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case ProgrammePackage.PROGRAMME__CODE:
				setCode((String)newValue);
				return;
			case ProgrammePackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case ProgrammePackage.PROGRAMME__PROGRAM_COURSES:
				getProgramCourses().clear();
				getProgramCourses().addAll((Collection<? extends ProgrammeCourse>)newValue);
				return;
			case ProgrammePackage.PROGRAMME__DURATION:
				setDuration((Integer)newValue);
				return;
			case ProgrammePackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
				getSpecialisations().addAll((Collection<? extends Specialisation>)newValue);
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
			case ProgrammePackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammePackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ProgrammePackage.PROGRAMME__SEMESTERS:
				getSemesters().clear();
				return;
			case ProgrammePackage.PROGRAMME__PROGRAM_COURSES:
				getProgramCourses().clear();
				return;
			case ProgrammePackage.PROGRAMME__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ProgrammePackage.PROGRAMME__SPECIALISATIONS:
				getSpecialisations().clear();
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
			case ProgrammePackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammePackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ProgrammePackage.PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case ProgrammePackage.PROGRAMME__PROGRAM_COURSES:
				return programCourses != null && !programCourses.isEmpty();
			case ProgrammePackage.PROGRAMME__DURATION:
				return duration != DURATION_EDEFAULT;
			case ProgrammePackage.PROGRAMME__SPECIALISATIONS:
				return specialisations != null && !specialisations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", Duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
