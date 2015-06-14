//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.06.12 時間 08:20:36 PM JST 
//


package jboss.domain.undertow._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hostType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="hostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{urn:jboss:domain:undertow:2.0}locationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="access-log" type="{urn:jboss:domain:undertow:2.0}accessLogType" minOccurs="0"/>
 *         &lt;element name="filter-ref" type="{urn:jboss:domain:undertow:2.0}filter-refType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="single-sign-on" type="{urn:jboss:domain:undertow:2.0}singleSignOnType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default-web-module" type="{http://www.w3.org/2001/XMLSchema}string" default="ROOT.war" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostType", propOrder = {
    "location",
    "accessLog",
    "filterRef",
    "singleSignOn"
})
public class HostType {

    protected List<LocationType> location;
    @XmlElement(name = "access-log")
    protected AccessLogType accessLog;
    @XmlElement(name = "filter-ref")
    protected List<FilterRefType> filterRef;
    @XmlElement(name = "single-sign-on")
    protected SingleSignOnType singleSignOn;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "default-web-module")
    protected String defaultWebModule;

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * accessLogプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AccessLogType }
     *     
     */
    public AccessLogType getAccessLog() {
        return accessLog;
    }

    /**
     * accessLogプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessLogType }
     *     
     */
    public void setAccessLog(AccessLogType value) {
        this.accessLog = value;
    }

    /**
     * Gets the value of the filterRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterRefType }
     * 
     * 
     */
    public List<FilterRefType> getFilterRef() {
        if (filterRef == null) {
            filterRef = new ArrayList<FilterRefType>();
        }
        return this.filterRef;
    }

    /**
     * singleSignOnプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SingleSignOnType }
     *     
     */
    public SingleSignOnType getSingleSignOn() {
        return singleSignOn;
    }

    /**
     * singleSignOnプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SingleSignOnType }
     *     
     */
    public void setSingleSignOn(SingleSignOnType value) {
        this.singleSignOn = value;
    }

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * aliasプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * aliasプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * defaultWebModuleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultWebModule() {
        if (defaultWebModule == null) {
            return "ROOT.war";
        } else {
            return defaultWebModule;
        }
    }

    /**
     * defaultWebModuleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultWebModule(String value) {
        this.defaultWebModule = value;
    }

}
