//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.07 at 01:41:53 PM EDT 
//


package org.hl7.fhir;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A resource that includes narrative, extensions, and
 * 				contained resources.
 * 			
 * 
 * <p>Java class for DomainResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://hl7.org/fhir}Narrative" minOccurs="0"/>
 *         &lt;element name="contained" type="{http://hl7.org/fhir}ResourceContainer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modifierExtension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainResource", propOrder = {
    "text",
    "contained",
    "extension",
    "modifierExtension"
})
public class DomainResource
    extends Resource
{

    protected Narrative text;
    protected List<ResourceContainer> contained;
    protected List<Extension> extension;
    protected List<Extension> modifierExtension;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Narrative }
     *     
     */
    public Narrative getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Narrative }
     *     
     */
    public void setText(Narrative value) {
        this.text = value;
    }

    /**
     * Gets the value of the contained property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contained property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContained().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceContainer }
     * 
     * 
     */
    public List<ResourceContainer> getContained() {
        if (contained == null) {
            contained = new ArrayList<ResourceContainer>();
        }
        return this.contained;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the modifierExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getModifierExtension() {
        if (modifierExtension == null) {
            modifierExtension = new ArrayList<Extension>();
        }
        return this.modifierExtension;
    }

}
