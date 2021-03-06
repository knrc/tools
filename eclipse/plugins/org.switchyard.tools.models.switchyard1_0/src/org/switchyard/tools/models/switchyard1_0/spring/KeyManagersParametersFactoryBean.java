/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Managers Parameters Factory Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.KeyManagersParametersFactoryBean#getKeyStore <em>Key Store</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getKeyManagersParametersFactoryBean()
 * @model extendedMetaData="name='keyManagersParametersFactoryBean' kind='elementOnly'"
 * @generated
 */
public interface KeyManagersParametersFactoryBean extends AbstractKeyManagersParametersFactoryBean {
	/**
     * Returns the value of the '<em><b>Key Store</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Store</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Key Store</em>' containment reference.
     * @see #setKeyStore(KeyStoreParametersFactoryBean)
     * @see org.switchyard.tools.models.switchyard1_0.spring.SpringPackage#getKeyManagersParametersFactoryBean_KeyStore()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='keyStore' namespace='##targetNamespace'"
     * @generated
     */
	KeyStoreParametersFactoryBean getKeyStore();

	/**
     * Sets the value of the '{@link org.switchyard.tools.models.switchyard1_0.spring.KeyManagersParametersFactoryBean#getKeyStore <em>Key Store</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Store</em>' containment reference.
     * @see #getKeyStore()
     * @generated
     */
	void setKeyStore(KeyStoreParametersFactoryBean value);

} // KeyManagersParametersFactoryBean
