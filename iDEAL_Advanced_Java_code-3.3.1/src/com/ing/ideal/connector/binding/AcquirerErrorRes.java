//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.11 at 04:33:43 PM EEST 
//


package com.ing.ideal.connector.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Error">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errorCode" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.errorCode"/>
 *                   &lt;element name="errorMessage" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.errorMessage"/>
 *                   &lt;element name="errorDetail" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.errorDetail" minOccurs="0"/>
 *                   &lt;element name="suggestedAction" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.suggestedAction" minOccurs="0"/>
 *                   &lt;element name="consumerMessage" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.consumerMessage" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}MessageAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createDateTimestamp",
    "error",
    "signature"
})
@XmlRootElement(name = "AcquirerErrorRes")
public class AcquirerErrorRes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTimestamp;
    @XmlElement(name = "Error", required = true)
    protected AcquirerErrorRes.Error error;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the createDateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTimestamp() {
        return createDateTimestamp;
    }

    /**
     * Sets the value of the createDateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTimestamp(XMLGregorianCalendar value) {
        this.createDateTimestamp = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerErrorRes.Error }
     *     
     */
    public AcquirerErrorRes.Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerErrorRes.Error }
     *     
     */
    public void setError(AcquirerErrorRes.Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="errorCode" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.errorCode"/>
     *         &lt;element name="errorMessage" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.errorMessage"/>
     *         &lt;element name="errorDetail" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.errorDetail" minOccurs="0"/>
     *         &lt;element name="suggestedAction" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.suggestedAction" minOccurs="0"/>
     *         &lt;element name="consumerMessage" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Error.consumerMessage" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "errorCode",
        "errorMessage",
        "errorDetail",
        "suggestedAction",
        "consumerMessage"
    })
    public static class Error {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String errorCode;
        @XmlElement(required = true)
        protected String errorMessage;
        protected String errorDetail;
        protected String suggestedAction;
        protected String consumerMessage;

        /**
         * Gets the value of the errorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorCode() {
            return errorCode;
        }

        /**
         * Sets the value of the errorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorCode(String value) {
            this.errorCode = value;
        }

        /**
         * Gets the value of the errorMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * Sets the value of the errorMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorMessage(String value) {
            this.errorMessage = value;
        }

        /**
         * Gets the value of the errorDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorDetail() {
            return errorDetail;
        }

        /**
         * Sets the value of the errorDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorDetail(String value) {
            this.errorDetail = value;
        }

        /**
         * Gets the value of the suggestedAction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuggestedAction() {
            return suggestedAction;
        }

        /**
         * Sets the value of the suggestedAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuggestedAction(String value) {
            this.suggestedAction = value;
        }

        /**
         * Gets the value of the consumerMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsumerMessage() {
            return consumerMessage;
        }

        /**
         * Sets the value of the consumerMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsumerMessage(String value) {
            this.consumerMessage = value;
        }

    }

}
