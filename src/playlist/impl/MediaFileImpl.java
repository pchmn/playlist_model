/**
 */
package playlist.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import playlist.MediaFile;
import playlist.PlaylistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link playlist.impl.MediaFileImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link playlist.impl.MediaFileImpl#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link playlist.impl.MediaFileImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link playlist.impl.MediaFileImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaFileImpl extends MinimalEObjectImpl.Container implements MediaFile {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoid() <em>Videoid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoid()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEOID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVideoid() <em>Videoid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoid()
	 * @generated
	 * @ordered
	 */
	protected String videoid = VIDEOID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaylistPackage.Literals.MEDIA_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.MEDIA_FILE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoid() {
		return videoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoid(String newVideoid) {
		String oldVideoid = videoid;
		videoid = newVideoid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.MEDIA_FILE__VIDEOID, oldVideoid, videoid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.MEDIA_FILE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.MEDIA_FILE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaylistPackage.MEDIA_FILE__LOCATION:
				return getLocation();
			case PlaylistPackage.MEDIA_FILE__VIDEOID:
				return getVideoid();
			case PlaylistPackage.MEDIA_FILE__DURATION:
				return getDuration();
			case PlaylistPackage.MEDIA_FILE__TEXT:
				return getText();
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
			case PlaylistPackage.MEDIA_FILE__LOCATION:
				setLocation((String)newValue);
				return;
			case PlaylistPackage.MEDIA_FILE__VIDEOID:
				setVideoid((String)newValue);
				return;
			case PlaylistPackage.MEDIA_FILE__DURATION:
				setDuration((Double)newValue);
				return;
			case PlaylistPackage.MEDIA_FILE__TEXT:
				setText((String)newValue);
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
			case PlaylistPackage.MEDIA_FILE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case PlaylistPackage.MEDIA_FILE__VIDEOID:
				setVideoid(VIDEOID_EDEFAULT);
				return;
			case PlaylistPackage.MEDIA_FILE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case PlaylistPackage.MEDIA_FILE__TEXT:
				setText(TEXT_EDEFAULT);
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
			case PlaylistPackage.MEDIA_FILE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case PlaylistPackage.MEDIA_FILE__VIDEOID:
				return VIDEOID_EDEFAULT == null ? videoid != null : !VIDEOID_EDEFAULT.equals(videoid);
			case PlaylistPackage.MEDIA_FILE__DURATION:
				return duration != DURATION_EDEFAULT;
			case PlaylistPackage.MEDIA_FILE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(", videoid: ");
		result.append(videoid);
		result.append(", duration: ");
		result.append(duration);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //MediaFileImpl
