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
 * <p>serverType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="serverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ajp-listener" type="{urn:jboss:domain:undertow:2.0}ajp-listener-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="http-listener" type="{urn:jboss:domain:undertow:2.0}http-listener-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="https-listener" type="{urn:jboss:domain:undertow:2.0}https-listener-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="host" type="{urn:jboss:domain:undertow:2.0}hostType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default-host" type="{http://www.w3.org/2001/XMLSchema}string" default="default-host" />
 *       &lt;attribute name="servlet-container" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverType", propOrder = {
    "ajpListener",
    "httpListener",
    "httpsListener",
    "host"
})
public class ServerType {

    @XmlElement(name = "ajp-listener")
    protected List<AjpListenerType> ajpListener;
    @XmlElement(name = "http-listener")
    protected List<HttpListenerType> httpListener;
    @XmlElement(name = "https-listener")
    protected List<HttpsListenerType> httpsListener;
    @XmlElement(required = true)
    protected List<HostType> host;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "default-host")
    protected String defaultHost;
    @XmlAttribute(name = "servlet-container")
    protected String servletContainer;

    /**
     * Gets the value of the ajpListener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ajpListener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAjpListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AjpListenerType }
     * 
     * 
     */
    public List<AjpListenerType> getAjpListener() {
        if (ajpListener == null) {
            ajpListener = new ArrayList<AjpListenerType>();
        }
        return this.ajpListener;
    }

    /**
     * Gets the value of the httpListener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpListener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpListenerType }
     * 
     * 
     */
    public List<HttpListenerType> getHttpListener() {
        if (httpListener == null) {
            httpListener = new ArrayList<HttpListenerType>();
        }
        return this.httpListener;
    }

    /**
     * Gets the value of the httpsListener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the httpsListener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHttpsListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HttpsListenerType }
     * 
     * 
     */
    public List<HttpsListenerType> getHttpsListener() {
        if (httpsListener == null) {
            httpsListener = new ArrayList<HttpsListenerType>();
        }
        return this.httpsListener;
    }

    /**
     * Gets the value of the host property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the host property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostType }
     * 
     * 
     */
    public List<HostType> getHost() {
        if (host == null) {
            host = new ArrayList<HostType>();
        }
        return this.host;
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
     * defaultHostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultHost() {
        if (defaultHost == null) {
            return "default-host";
        } else {
            return defaultHost;
        }
    }

    /**
     * defaultHostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultHost(String value) {
        this.defaultHost = value;
    }

    /**
     * servletContainerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServletContainer() {
        if (servletContainer == null) {
            return "default";
        } else {
            return servletContainer;
        }
    }

    /**
     * servletContainerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServletContainer(String value) {
        this.servletContainer = value;
    }

}
