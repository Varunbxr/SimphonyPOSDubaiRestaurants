//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 02:11:47 AM IST 
//


package com.simphony.pos.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SimphonyPosApi_EPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_EPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountDataSource" type="{http://micros-hosting.com/EGateway/}EAccountDataSource"/&gt;
 *         &lt;element name="AccountType" type="{http://micros-hosting.com/EGateway/}EAccountType"/&gt;
 *         &lt;element name="AcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CashBackAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVVNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="InterfaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssueNumber" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="KeySerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCommand" type="{http://micros-hosting.com/EGateway/}EPaymentDirective"/&gt;
 *         &lt;element name="PinBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SvcAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SvcResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Track1Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Track2Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Track3Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_EPayment", propOrder = {
    "accountDataSource",
    "accountType",
    "acctNumber",
    "addressVerification",
    "authorizationCode",
    "baseAmount",
    "cashBackAmount",
    "cvvNumber",
    "deviceId",
    "expirationDate",
    "interfaceName",
    "issueNumber",
    "keySerialNum",
    "paymentCommand",
    "pinBlock",
    "startDate",
    "svcAccountType",
    "svcResponse",
    "tipAmount",
    "track1Data",
    "track2Data",
    "track3Data"
})
public class SimphonyPosApiEPayment {

    @XmlElement(name = "AccountDataSource", required = true)
    @XmlSchemaType(name = "string")
    protected EAccountDataSource accountDataSource;
    @XmlElement(name = "AccountType", required = true)
    @XmlSchemaType(name = "string")
    protected EAccountType accountType;
    @XmlElement(name = "AcctNumber")
    protected String acctNumber;
    @XmlElement(name = "AddressVerification")
    protected String addressVerification;
    @XmlElement(name = "AuthorizationCode")
    protected String authorizationCode;
    @XmlElement(name = "BaseAmount")
    protected String baseAmount;
    @XmlElement(name = "CashBackAmount")
    protected String cashBackAmount;
    @XmlElement(name = "CVVNumber")
    protected String cvvNumber;
    @XmlElement(name = "DeviceId")
    protected String deviceId;
    @XmlElement(name = "ExpirationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "InterfaceName")
    protected String interfaceName;
    @XmlElement(name = "IssueNumber")
    protected short issueNumber;
    @XmlElement(name = "KeySerialNum")
    protected String keySerialNum;
    @XmlElement(name = "PaymentCommand", required = true)
    @XmlSchemaType(name = "string")
    protected EPaymentDirective paymentCommand;
    @XmlElement(name = "PinBlock")
    protected String pinBlock;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "SvcAccountType")
    protected String svcAccountType;
    @XmlElement(name = "SvcResponse")
    protected String svcResponse;
    @XmlElement(name = "TipAmount")
    protected String tipAmount;
    @XmlElement(name = "Track1Data")
    protected String track1Data;
    @XmlElement(name = "Track2Data")
    protected String track2Data;
    @XmlElement(name = "Track3Data")
    protected String track3Data;

    /**
     * Gets the value of the accountDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link EAccountDataSource }
     *     
     */
    public EAccountDataSource getAccountDataSource() {
        return accountDataSource;
    }

    /**
     * Sets the value of the accountDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAccountDataSource }
     *     
     */
    public void setAccountDataSource(EAccountDataSource value) {
        this.accountDataSource = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link EAccountType }
     *     
     */
    public EAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAccountType }
     *     
     */
    public void setAccountType(EAccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the acctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * Sets the value of the acctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNumber(String value) {
        this.acctNumber = value;
    }

    /**
     * Gets the value of the addressVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressVerification() {
        return addressVerification;
    }

    /**
     * Sets the value of the addressVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressVerification(String value) {
        this.addressVerification = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmount(String value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the cashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the value of the cashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashBackAmount(String value) {
        this.cashBackAmount = value;
    }

    /**
     * Gets the value of the cvvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVVNumber() {
        return cvvNumber;
    }

    /**
     * Sets the value of the cvvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVVNumber(String value) {
        this.cvvNumber = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     */
    public short getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     */
    public void setIssueNumber(short value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the keySerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySerialNum() {
        return keySerialNum;
    }

    /**
     * Sets the value of the keySerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySerialNum(String value) {
        this.keySerialNum = value;
    }

    /**
     * Gets the value of the paymentCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EPaymentDirective }
     *     
     */
    public EPaymentDirective getPaymentCommand() {
        return paymentCommand;
    }

    /**
     * Sets the value of the paymentCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPaymentDirective }
     *     
     */
    public void setPaymentCommand(EPaymentDirective value) {
        this.paymentCommand = value;
    }

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinBlock(String value) {
        this.pinBlock = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the svcAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcAccountType() {
        return svcAccountType;
    }

    /**
     * Sets the value of the svcAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcAccountType(String value) {
        this.svcAccountType = value;
    }

    /**
     * Gets the value of the svcResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcResponse() {
        return svcResponse;
    }

    /**
     * Sets the value of the svcResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcResponse(String value) {
        this.svcResponse = value;
    }

    /**
     * Gets the value of the tipAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipAmount() {
        return tipAmount;
    }

    /**
     * Sets the value of the tipAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipAmount(String value) {
        this.tipAmount = value;
    }

    /**
     * Gets the value of the track1Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack1Data() {
        return track1Data;
    }

    /**
     * Sets the value of the track1Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack1Data(String value) {
        this.track1Data = value;
    }

    /**
     * Gets the value of the track2Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2Data() {
        return track2Data;
    }

    /**
     * Sets the value of the track2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2Data(String value) {
        this.track2Data = value;
    }

    /**
     * Gets the value of the track3Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack3Data() {
        return track3Data;
    }

    /**
     * Sets the value of the track3Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack3Data(String value) {
        this.track3Data = value;
    }

}
