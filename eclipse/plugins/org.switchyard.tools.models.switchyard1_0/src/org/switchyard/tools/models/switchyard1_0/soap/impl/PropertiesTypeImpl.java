/**
 */
package org.switchyard.tools.models.switchyard1_0.soap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.soa.sca.sca1_1.model.sca.impl.CommonExtensionBaseImpl;

import org.switchyard.tools.models.switchyard1_0.soap.PropertiesType;
import org.switchyard.tools.models.switchyard1_0.soap.PropertyType;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertiesTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.soap.impl.PropertiesTypeImpl#getLoad <em>Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesTypeImpl extends CommonExtensionBaseImpl implements PropertiesType {
    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected EList<PropertyType> property;
    /**
     * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoad()
     * @generated
     * @ordered
     */
    protected static final String LOAD_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoad()
     * @generated
     * @ordered
     */
    protected String load = LOAD_EDEFAULT;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertiesTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SOAPPackage.Literals.PROPERTIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PropertyType> getProperty() {
        if (property == null) {
            property = new EObjectContainmentEList<PropertyType>(PropertyType.class, this, SOAPPackage.PROPERTIES_TYPE__PROPERTY);
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLoad() {
        return load;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLoad(String newLoad) {
        String oldLoad = load;
        load = newLoad;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SOAPPackage.PROPERTIES_TYPE__LOAD, oldLoad, load));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SOAPPackage.PROPERTIES_TYPE__PROPERTY:
                return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
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
            case SOAPPackage.PROPERTIES_TYPE__PROPERTY:
                return getProperty();
            case SOAPPackage.PROPERTIES_TYPE__LOAD:
                return getLoad();
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
            case SOAPPackage.PROPERTIES_TYPE__PROPERTY:
                getProperty().clear();
                getProperty().addAll((Collection<? extends PropertyType>)newValue);
                return;
            case SOAPPackage.PROPERTIES_TYPE__LOAD:
                setLoad((String)newValue);
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
            case SOAPPackage.PROPERTIES_TYPE__PROPERTY:
                getProperty().clear();
                return;
            case SOAPPackage.PROPERTIES_TYPE__LOAD:
                setLoad(LOAD_EDEFAULT);
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
            case SOAPPackage.PROPERTIES_TYPE__PROPERTY:
                return property != null && !property.isEmpty();
            case SOAPPackage.PROPERTIES_TYPE__LOAD:
                return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
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
        result.append(" (load: ");
        result.append(load);
        result.append(')');
        return result.toString();
    }

} //PropertiesTypeImpl
