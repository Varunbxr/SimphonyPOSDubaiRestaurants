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
 * <p>Java class for SimphonyPosApi_GuestCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_GuestCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationalResult" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_OperationalResult" minOccurs="0"/&gt;
 *         &lt;element name="CheckDateToFire" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CheckEmployeeObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckGuestCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckOrderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckRevenueCenterID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CheckSeq" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckStatusBits" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckTableObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PCheckInfoLines" type="{http://micros-hosting.com/EGateway/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="PPrintJobIds" type="{http://micros-hosting.com/EGateway/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="EventObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_GuestCheck", propOrder = {
    "operationalResult",
    "checkDateToFire",
    "checkEmployeeObjectNum",
    "checkGuestCount",
    "checkID",
    "checkNum",
    "checkOrderType",
    "checkRevenueCenterID",
    "checkSeq",
    "checkStatusBits",
    "checkTableObjectNum",
    "pCheckInfoLines",
    "pPrintJobIds",
    "eventObjectNum"
})
public class SimphonyPosApiGuestCheck {

    @XmlElement(name = "OperationalResult")
    protected SimphonyPosApiOperationalResult operationalResult;
    @XmlElement(name = "CheckDateToFire", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkDateToFire;
    @XmlElement(name = "CheckEmployeeObjectNum")
    protected int checkEmployeeObjectNum;
    @XmlElement(name = "CheckGuestCount")
    protected int checkGuestCount;
    @XmlElement(name = "CheckID")
    protected String checkID;
    @XmlElement(name = "CheckNum")
    protected int checkNum;
    @XmlElement(name = "CheckOrderType")
    protected int checkOrderType;
    @XmlElement(name = "CheckRevenueCenterID")
    protected long checkRevenueCenterID;
    @XmlElement(name = "CheckSeq")
    protected int checkSeq;
    @XmlElement(name = "CheckStatusBits")
    protected int checkStatusBits;
    @XmlElement(name = "CheckTableObjectNum")
    protected int checkTableObjectNum;
    @XmlElement(name = "PCheckInfoLines")
    protected ArrayOfString pCheckInfoLines;
    @XmlElement(name = "PPrintJobIds")
    protected ArrayOfInt pPrintJobIds;
    @XmlElement(name = "EventObjectNum")
    protected int eventObjectNum;

    /**
     * Gets the value of the operationalResult property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiOperationalResult }
     *     
     */
    public SimphonyPosApiOperationalResult getOperationalResult() {
        return operationalResult;
    }

    /**
     * Sets the value of the operationalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiOperationalResult }
     *     
     */
    public void setOperationalResult(SimphonyPosApiOperationalResult value) {
        this.operationalResult = value;
    }

    /**
     * Gets the value of the checkDateToFire property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckDateToFire() {
        return checkDateToFire;
    }

    /**
     * Sets the value of the checkDateToFire property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckDateToFire(XMLGregorianCalendar value) {
        this.checkDateToFire = value;
    }

    /**
     * Gets the value of the checkEmployeeObjectNum property.
     * 
     */
    public int getCheckEmployeeObjectNum() {
        return checkEmployeeObjectNum;
    }

    /**
     * Sets the value of the checkEmployeeObjectNum property.
     * 
     */
    public void setCheckEmployeeObjectNum(int value) {
        this.checkEmployeeObjectNum = value;
    }

    /**
     * Gets the value of the checkGuestCount property.
     * 
     */
    public int getCheckGuestCount() {
        return checkGuestCount;
    }

    /**
     * Sets the value of the checkGuestCount property.
     * 
     */
    public void setCheckGuestCount(int value) {
        this.checkGuestCount = value;
    }

    /**
     * Gets the value of the checkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckID() {
        return checkID;
    }

    /**
     * Sets the value of the checkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckID(String value) {
        this.checkID = value;
    }

    /**
     * Gets the value of the checkNum property.
     * 
     */
    public int getCheckNum() {
        return checkNum;
    }

    /**
     * Sets the value of the checkNum property.
     * 
     */
    public void setCheckNum(int value) {
        this.checkNum = value;
    }

    /**
     * Gets the value of the checkOrderType property.
     * 
     */
    public int getCheckOrderType() {
        return checkOrderType;
    }

    /**
     * Sets the value of the checkOrderType property.
     * 
     */
    public void setCheckOrderType(int value) {
        this.checkOrderType = value;
    }

    /**
     * Gets the value of the checkRevenueCenterID property.
     * 
     */
    public long getCheckRevenueCenterID() {
        return checkRevenueCenterID;
    }

    /**
     * Sets the value of the checkRevenueCenterID property.
     * 
     */
    public void setCheckRevenueCenterID(long value) {
        this.checkRevenueCenterID = value;
    }

    /**
     * Gets the value of the checkSeq property.
     * 
     */
    public int getCheckSeq() {
        return checkSeq;
    }

    /**
     * Sets the value of the checkSeq property.
     * 
     */
    public void setCheckSeq(int value) {
        this.checkSeq = value;
    }

    /**
     * Gets the value of the checkStatusBits property.
     * 
     */
    public int getCheckStatusBits() {
        return checkStatusBits;
    }

    /**
     * Sets the value of the checkStatusBits property.
     * 
     */
    public void setCheckStatusBits(int value) {
        this.checkStatusBits = value;
    }

    /**
     * Gets the value of the checkTableObjectNum property.
     * 
     */
    public int getCheckTableObjectNum() {
        return checkTableObjectNum;
    }

    /**
     * Sets the value of the checkTableObjectNum property.
     * 
     */
    public void setCheckTableObjectNum(int value) {
        this.checkTableObjectNum = value;
    }

    /**
     * Gets the value of the pCheckInfoLines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPCheckInfoLines() {
        return pCheckInfoLines;
    }

    /**
     * Sets the value of the pCheckInfoLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPCheckInfoLines(ArrayOfString value) {
        this.pCheckInfoLines = value;
    }

    /**
     * Gets the value of the pPrintJobIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPPrintJobIds() {
        return pPrintJobIds;
    }

    /**
     * Sets the value of the pPrintJobIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPPrintJobIds(ArrayOfInt value) {
        this.pPrintJobIds = value;
    }

    /**
     * Gets the value of the eventObjectNum property.
     * 
     */
    public int getEventObjectNum() {
        return eventObjectNum;
    }

    /**
     * Sets the value of the eventObjectNum property.
     * 
     */
    public void setEventObjectNum(int value) {
        this.eventObjectNum = value;
    }

}
