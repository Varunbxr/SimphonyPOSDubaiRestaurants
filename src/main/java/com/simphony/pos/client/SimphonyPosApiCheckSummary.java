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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SimphonyPosApi_CheckSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_CheckSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckAutoFireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CheckCurrentlyOpenOnWorkstation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckEmployeeObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckInsufficientBeverage" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CheckInTraining" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CheckIsDelayedOrder" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CheckIsFutureOrder" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CheckLastServiceTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CheckLastWorkstationOwner" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckOpenTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CheckOrderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckRevenueCenterObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckSeq" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckTableGroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckTableObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckTotalDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckTransferedToDriver" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_CheckSummary", propOrder = {
    "checkAutoFireTime",
    "checkCurrentlyOpenOnWorkstation",
    "checkEmployeeObjectNum",
    "checkID",
    "checkInsufficientBeverage",
    "checkInTraining",
    "checkIsDelayedOrder",
    "checkIsFutureOrder",
    "checkLastServiceTime",
    "checkLastWorkstationOwner",
    "checkNum",
    "checkOpenTime",
    "checkOrderType",
    "checkRevenueCenterObjectNum",
    "checkSeq",
    "checkTableGroup",
    "checkTableObjectNum",
    "checkTotalDue",
    "checkTransferedToDriver"
})
@XmlSeeAlso({
    SimphonyPosApiCheckSummaryEx.class
})
public class SimphonyPosApiCheckSummary {

    @XmlElement(name = "CheckAutoFireTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkAutoFireTime;
    @XmlElement(name = "CheckCurrentlyOpenOnWorkstation")
    protected int checkCurrentlyOpenOnWorkstation;
    @XmlElement(name = "CheckEmployeeObjectNum")
    protected int checkEmployeeObjectNum;
    @XmlElement(name = "CheckID")
    protected String checkID;
    @XmlElement(name = "CheckInsufficientBeverage")
    protected short checkInsufficientBeverage;
    @XmlElement(name = "CheckInTraining")
    protected short checkInTraining;
    @XmlElement(name = "CheckIsDelayedOrder")
    protected short checkIsDelayedOrder;
    @XmlElement(name = "CheckIsFutureOrder")
    protected short checkIsFutureOrder;
    @XmlElement(name = "CheckLastServiceTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkLastServiceTime;
    @XmlElement(name = "CheckLastWorkstationOwner")
    protected int checkLastWorkstationOwner;
    @XmlElement(name = "CheckNum")
    protected int checkNum;
    @XmlElement(name = "CheckOpenTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOpenTime;
    @XmlElement(name = "CheckOrderType")
    protected int checkOrderType;
    @XmlElement(name = "CheckRevenueCenterObjectNum")
    protected int checkRevenueCenterObjectNum;
    @XmlElement(name = "CheckSeq")
    protected int checkSeq;
    @XmlElement(name = "CheckTableGroup")
    protected int checkTableGroup;
    @XmlElement(name = "CheckTableObjectNum")
    protected int checkTableObjectNum;
    @XmlElement(name = "CheckTotalDue")
    protected String checkTotalDue;
    @XmlElement(name = "CheckTransferedToDriver")
    protected short checkTransferedToDriver;

    /**
     * Gets the value of the checkAutoFireTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckAutoFireTime() {
        return checkAutoFireTime;
    }

    /**
     * Sets the value of the checkAutoFireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckAutoFireTime(XMLGregorianCalendar value) {
        this.checkAutoFireTime = value;
    }

    /**
     * Gets the value of the checkCurrentlyOpenOnWorkstation property.
     * 
     */
    public int getCheckCurrentlyOpenOnWorkstation() {
        return checkCurrentlyOpenOnWorkstation;
    }

    /**
     * Sets the value of the checkCurrentlyOpenOnWorkstation property.
     * 
     */
    public void setCheckCurrentlyOpenOnWorkstation(int value) {
        this.checkCurrentlyOpenOnWorkstation = value;
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
     * Gets the value of the checkInsufficientBeverage property.
     * 
     */
    public short getCheckInsufficientBeverage() {
        return checkInsufficientBeverage;
    }

    /**
     * Sets the value of the checkInsufficientBeverage property.
     * 
     */
    public void setCheckInsufficientBeverage(short value) {
        this.checkInsufficientBeverage = value;
    }

    /**
     * Gets the value of the checkInTraining property.
     * 
     */
    public short getCheckInTraining() {
        return checkInTraining;
    }

    /**
     * Sets the value of the checkInTraining property.
     * 
     */
    public void setCheckInTraining(short value) {
        this.checkInTraining = value;
    }

    /**
     * Gets the value of the checkIsDelayedOrder property.
     * 
     */
    public short getCheckIsDelayedOrder() {
        return checkIsDelayedOrder;
    }

    /**
     * Sets the value of the checkIsDelayedOrder property.
     * 
     */
    public void setCheckIsDelayedOrder(short value) {
        this.checkIsDelayedOrder = value;
    }

    /**
     * Gets the value of the checkIsFutureOrder property.
     * 
     */
    public short getCheckIsFutureOrder() {
        return checkIsFutureOrder;
    }

    /**
     * Sets the value of the checkIsFutureOrder property.
     * 
     */
    public void setCheckIsFutureOrder(short value) {
        this.checkIsFutureOrder = value;
    }

    /**
     * Gets the value of the checkLastServiceTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckLastServiceTime() {
        return checkLastServiceTime;
    }

    /**
     * Sets the value of the checkLastServiceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckLastServiceTime(XMLGregorianCalendar value) {
        this.checkLastServiceTime = value;
    }

    /**
     * Gets the value of the checkLastWorkstationOwner property.
     * 
     */
    public int getCheckLastWorkstationOwner() {
        return checkLastWorkstationOwner;
    }

    /**
     * Sets the value of the checkLastWorkstationOwner property.
     * 
     */
    public void setCheckLastWorkstationOwner(int value) {
        this.checkLastWorkstationOwner = value;
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
     * Gets the value of the checkOpenTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOpenTime() {
        return checkOpenTime;
    }

    /**
     * Sets the value of the checkOpenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOpenTime(XMLGregorianCalendar value) {
        this.checkOpenTime = value;
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
     * Gets the value of the checkRevenueCenterObjectNum property.
     * 
     */
    public int getCheckRevenueCenterObjectNum() {
        return checkRevenueCenterObjectNum;
    }

    /**
     * Sets the value of the checkRevenueCenterObjectNum property.
     * 
     */
    public void setCheckRevenueCenterObjectNum(int value) {
        this.checkRevenueCenterObjectNum = value;
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
     * Gets the value of the checkTableGroup property.
     * 
     */
    public int getCheckTableGroup() {
        return checkTableGroup;
    }

    /**
     * Sets the value of the checkTableGroup property.
     * 
     */
    public void setCheckTableGroup(int value) {
        this.checkTableGroup = value;
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
     * Gets the value of the checkTotalDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTotalDue() {
        return checkTotalDue;
    }

    /**
     * Sets the value of the checkTotalDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTotalDue(String value) {
        this.checkTotalDue = value;
    }

    /**
     * Gets the value of the checkTransferedToDriver property.
     * 
     */
    public short getCheckTransferedToDriver() {
        return checkTransferedToDriver;
    }

    /**
     * Sets the value of the checkTransferedToDriver property.
     * 
     */
    public void setCheckTransferedToDriver(short value) {
        this.checkTransferedToDriver = value;
    }

}
