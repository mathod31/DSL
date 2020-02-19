/**
 */
package sample.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sample.SamplePackage;
import sample.State;
import sample.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sample.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link sample.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link sample.impl.TransitionImpl#getStateTo <em>State To</em>}</li>
 *   <li>{@link sample.impl.TransitionImpl#getStateFrom <em>State From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateTo() <em>State To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateTo()
	 * @generated
	 * @ordered
	 */
	protected State stateTo;

	/**
	 * The cached value of the '{@link #getStateFrom() <em>State From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateFrom()
	 * @generated
	 * @ordered
	 */
	protected State stateFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.TRANSITION__TRIGGER, oldTrigger,
					trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateTo() {
		if (stateTo != null && stateTo.eIsProxy()) {
			InternalEObject oldStateTo = (InternalEObject) stateTo;
			stateTo = (State) eResolveProxy(oldStateTo);
			if (stateTo != oldStateTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamplePackage.TRANSITION__STATE_TO,
							oldStateTo, stateTo));
			}
		}
		return stateTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateTo() {
		return stateTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateTo(State newStateTo) {
		State oldStateTo = stateTo;
		stateTo = newStateTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.TRANSITION__STATE_TO, oldStateTo,
					stateTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateFrom() {
		if (stateFrom != null && stateFrom.eIsProxy()) {
			InternalEObject oldStateFrom = (InternalEObject) stateFrom;
			stateFrom = (State) eResolveProxy(oldStateFrom);
			if (stateFrom != oldStateFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamplePackage.TRANSITION__STATE_FROM,
							oldStateFrom, stateFrom));
			}
		}
		return stateFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStateFrom() {
		return stateFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateFrom(State newStateFrom) {
		State oldStateFrom = stateFrom;
		stateFrom = newStateFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.TRANSITION__STATE_FROM, oldStateFrom,
					stateFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SamplePackage.TRANSITION__NAME:
			return getName();
		case SamplePackage.TRANSITION__TRIGGER:
			return getTrigger();
		case SamplePackage.TRANSITION__STATE_TO:
			if (resolve)
				return getStateTo();
			return basicGetStateTo();
		case SamplePackage.TRANSITION__STATE_FROM:
			if (resolve)
				return getStateFrom();
			return basicGetStateFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SamplePackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case SamplePackage.TRANSITION__TRIGGER:
			setTrigger((String) newValue);
			return;
		case SamplePackage.TRANSITION__STATE_TO:
			setStateTo((State) newValue);
			return;
		case SamplePackage.TRANSITION__STATE_FROM:
			setStateFrom((State) newValue);
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
		case SamplePackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SamplePackage.TRANSITION__TRIGGER:
			setTrigger(TRIGGER_EDEFAULT);
			return;
		case SamplePackage.TRANSITION__STATE_TO:
			setStateTo((State) null);
			return;
		case SamplePackage.TRANSITION__STATE_FROM:
			setStateFrom((State) null);
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
		case SamplePackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SamplePackage.TRANSITION__TRIGGER:
			return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
		case SamplePackage.TRANSITION__STATE_TO:
			return stateTo != null;
		case SamplePackage.TRANSITION__STATE_FROM:
			return stateFrom != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
