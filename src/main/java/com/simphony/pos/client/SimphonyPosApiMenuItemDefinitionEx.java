//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.23 at 02:11:47 AM IST 
//


package com.simphony.pos.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimphonyPosApi_MenuItemDefinitionEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_MenuItemDefinitionEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemDiscount" type="{http://micros-hosting.com/EGateway/}ArrayOfSimphonyPosApi_DiscountEx" minOccurs="0"/&gt;
 *         &lt;element name="MiObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MiOverridePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MiReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiMenuLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MiSubLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MiPriceLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MiDefinitionSeqNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_MenuItemDefinitionEx", propOrder = {
    "itemDiscount",
    "miObjectNum",
    "miOverridePrice",
    "miQuantity",
    "miReference",
    "miWeight",
    "miMenuLevel",
    "miSubLevel",
    "miPriceLevel",
    "miDefinitionSeqNum"
})
public class SimphonyPosApiMenuItemDefinitionEx {

    @XmlElement(name = "ItemDiscount")
    protected ArrayOfSimphonyPosApiDiscountEx itemDiscount;
    @XmlElement(name = "MiObjectNum")
    protected int miObjectNum;
    @XmlElement(name = "MiOverridePrice")
    protected String miOverridePrice;
    @XmlElement(name = "MiQuantity", required = true)
    protected BigDecimal miQuantity;
    @XmlElement(name = "MiReference")
    protected String miReference;
    @XmlElement(name = "MiWeight")
    protected String miWeight;
    @XmlElement(name = "MiMenuLevel")
    protected int miMenuLevel;
    @XmlElement(name = "MiSubLevel")
    protected int miSubLevel;
    @XmlElement(name = "MiPriceLevel")
    protected int miPriceLevel;
    @XmlElement(name = "MiDefinitionSeqNum")
    protected int miDefinitionSeqNum;

    /**
     * Gets the value of the itemDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimphonyPosApiDiscountEx }
     *     
     */
    public ArrayOfSimphonyPosApiDiscountEx getItemDiscount() {
        return itemDiscount;
    }

    /**
     * Sets the value of the itemDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimphonyPosApiDiscountEx }
     *     
     */
    public void setItemDiscount(ArrayOfSimphonyPosApiDiscountEx value) {
        this.itemDiscount = value;
    }

    /**
     * Gets the value of the miObjectNum property.
     * 
     */
    public int getMiObjectNum() {
        return miObjectNum;
    }

    /**
     * Sets the value of the miObjectNum property.
     * 
     */
    public void setMiObjectNum(int value) {
        this.miObjectNum = value;
    }

    /**
     * Gets the value of the miOverridePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiOverridePrice() {
        return miOverridePrice;
    }

    /**
     * Sets the value of the miOverridePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiOverridePrice(String value) {
        this.miOverridePrice = value;
    }

    /**
     * Gets the value of the miQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiQuantity() {
        return miQuantity;
    }

    /**
     * Sets the value of the miQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiQuantity(BigDecimal value) {
        this.miQuantity = value;
    }

    /**
     * Gets the value of the miReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiReference() {
        return miReference;
    }

    /**
     * Sets the value of the miReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiReference(String value) {
        this.miReference = value;
    }

    /**
     * Gets the value of the miWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiWeight() {
        return miWeight;
    }

    /**
     * Sets the value of the miWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiWeight(String value) {
        this.miWeight = value;
    }

    /**
     * Gets the value of the miMenuLevel property.
     * 
     */
    public int getMiMenuLevel() {
        return miMenuLevel;
    }

    /**
     * Sets the value of the miMenuLevel property.
     * 
     */
    public void setMiMenuLevel(int value) {
        this.miMenuLevel = value;
    }

    /**
     * Gets the value of the miSubLevel property.
     * 
     */
    public int getMiSubLevel() {
        return miSubLevel;
    }

    /**
     * Sets the value of the miSubLevel property.
     * 
     */
    public void setMiSubLevel(int value) {
        this.miSubLevel = value;
    }

    /**
     * Gets the value of the miPriceLevel property.
     * 
     */
    public int getMiPriceLevel() {
        return miPriceLevel;
    }

    /**
     * Sets the value of the miPriceLevel property.
     * 
     */
    public void setMiPriceLevel(int value) {
        this.miPriceLevel = value;
    }

    /**
     * Gets the value of the miDefinitionSeqNum property.
     * 
     */
    public int getMiDefinitionSeqNum() {
        return miDefinitionSeqNum;
    }

    /**
     * Sets the value of the miDefinitionSeqNum property.
     * 
     */
    public void setMiDefinitionSeqNum(int value) {
        this.miDefinitionSeqNum = value;
    }

}