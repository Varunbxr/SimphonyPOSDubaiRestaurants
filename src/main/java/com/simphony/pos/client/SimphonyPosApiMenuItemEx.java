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
 * <p>Java class for SimphonyPosApi_MenuItemEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimphonyPosApi_MenuItemEx"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extensibility" type="{http://micros-hosting.com/EGateway/}ArrayOfSimphonyPosApi_Extensibility" minOccurs="0"/&gt;
 *         &lt;element name="Condiments" type="{http://micros-hosting.com/EGateway/}ArrayOfSimphonyPosApi_MenuItemDefinitionEx" minOccurs="0"/&gt;
 *         &lt;element name="MenuItem" type="{http://micros-hosting.com/EGateway/}SimphonyPosApi_MenuItemDefinitionEx" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimphonyPosApi_MenuItemEx", propOrder = {
    "extensibility",
    "condiments",
    "menuItem"
})
public class SimphonyPosApiMenuItemEx {

    @XmlElement(name = "Extensibility")
    protected ArrayOfSimphonyPosApiExtensibility extensibility;
    @XmlElement(name = "Condiments")
    protected ArrayOfSimphonyPosApiMenuItemDefinitionEx condiments;
    @XmlElement(name = "MenuItem")
    protected SimphonyPosApiMenuItemDefinitionEx menuItem;

    /**
     * Gets the value of the extensibility property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimphonyPosApiExtensibility }
     *     
     */
    public ArrayOfSimphonyPosApiExtensibility getExtensibility() {
        return extensibility;
    }

    /**
     * Sets the value of the extensibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimphonyPosApiExtensibility }
     *     
     */
    public void setExtensibility(ArrayOfSimphonyPosApiExtensibility value) {
        this.extensibility = value;
    }

    /**
     * Gets the value of the condiments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSimphonyPosApiMenuItemDefinitionEx }
     *     
     */
    public ArrayOfSimphonyPosApiMenuItemDefinitionEx getCondiments() {
        return condiments;
    }

    /**
     * Sets the value of the condiments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSimphonyPosApiMenuItemDefinitionEx }
     *     
     */
    public void setCondiments(ArrayOfSimphonyPosApiMenuItemDefinitionEx value) {
        this.condiments = value;
    }

    /**
     * Gets the value of the menuItem property.
     * 
     * @return
     *     possible object is
     *     {@link SimphonyPosApiMenuItemDefinitionEx }
     *     
     */
    public SimphonyPosApiMenuItemDefinitionEx getMenuItem() {
        return menuItem;
    }

    /**
     * Sets the value of the menuItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimphonyPosApiMenuItemDefinitionEx }
     *     
     */
    public void setMenuItem(SimphonyPosApiMenuItemDefinitionEx value) {
        this.menuItem = value;
    }

}
