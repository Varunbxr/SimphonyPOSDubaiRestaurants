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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimphonyPosApi_ComboMealEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_ComboMealEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extensibility" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_Extensibility" minOccurs="0"/&gt;
 *         &lt;element name="ComboMealMainItem" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_MenuItemEx" minOccurs="0"/&gt;
 *         &lt;element name="ComboMealMenuItem" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_MenuItemEx" minOccurs="0"/&gt;
 *         &lt;element name="ComboMealObjectNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SideItems" type="{http://micros-hosting.com/EGateway/}ArrayOfSimphonyPosApi_MenuItemEx" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_ComboMealEx", propOrder = {
    "extensibility",
    "comboMealMainItem",
    "comboMealMenuItem",
    "comboMealObjectNum",
    "sideItems"
})
public class SimphonyPosApiComboMealEx {

    @XmlElement(name = "Extensibility")
    protected SimphonyPosApiExtensibility extensibility;
    @XmlElement(name = "ComboMealMainItem")
    protected SimphonyPosApiMenuItemEx comboMealMainItem;
    @XmlElement(name = "ComboMealMenuItem")
    protected SimphonyPosApiMenuItemEx comboMealMenuItem;
    @XmlElement(name = "ComboMealObjectNum")
    protected int comboMealObjectNum;
    @XmlElement(name = "SideItems")
    protected ArrayOfSimphonyPosApiMenuItemEx sideItems;

    /**
     * Gets the value of the extensibility property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiExtensibility }
     *     
     */
    public SimphonyPosApiExtensibility getExtensibility() {
        return extensibility;
    }

    /**
     * Sets the value of the extensibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiExtensibility }
     *     
     */
    public void setExtensibility(SimphonyPosApiExtensibility value) {
        this.extensibility = value;
    }

    /**
     * Gets the value of the comboMealMainItem property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiMenuItemEx }
     *     
     */
    public SimphonyPosApiMenuItemEx getComboMealMainItem() {
        return comboMealMainItem;
    }

    /**
     * Sets the value of the comboMealMainItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiMenuItemEx }
     *     
     */
    public void setComboMealMainItem(SimphonyPosApiMenuItemEx value) {
        this.comboMealMainItem = value;
    }

    /**
     * Gets the value of the comboMealMenuItem property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiMenuItemEx }
     *     
     */
    public SimphonyPosApiMenuItemEx getComboMealMenuItem() {
        return comboMealMenuItem;
    }

    /**
     * Sets the value of the comboMealMenuItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiMenuItemEx }
     *     
     */
    public void setComboMealMenuItem(SimphonyPosApiMenuItemEx value) {
        this.comboMealMenuItem = value;
    }

    /**
     * Gets the value of the comboMealObjectNum property.
     * 
     */
    public int getComboMealObjectNum() {
        return comboMealObjectNum;
    }

    /**
     * Sets the value of the comboMealObjectNum property.
     * 
     */
    public void setComboMealObjectNum(int value) {
        this.comboMealObjectNum = value;
    }

    /**
     * Gets the value of the sideItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimphonyPosApiMenuItemEx }
     *     
     */
    public ArrayOfSimphonyPosApiMenuItemEx getSideItems() {
        return sideItems;
    }

    /**
     * Sets the value of the sideItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimphonyPosApiMenuItemEx }
     *     
     */
    public void setSideItems(ArrayOfSimphonyPosApiMenuItemEx value) {
        this.sideItems = value;
    }

}