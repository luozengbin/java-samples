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
 * 
 *                 
 *                 The configuration of the undertow subsystem.
 *             
 *             
 * 
 * <p>undertow-subsystemType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="undertow-subsystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buffer-cache" type="{urn:jboss:domain:undertow:2.0}buffer-cacheType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="server" type="{urn:jboss:domain:undertow:2.0}serverType" maxOccurs="unbounded"/>
 *         &lt;element name="servlet-container" type="{urn:jboss:domain:undertow:2.0}servletContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="handlers" type="{urn:jboss:domain:undertow:2.0}handlerType" minOccurs="0"/>
 *         &lt;element name="filters" type="{urn:jboss:domain:undertow:2.0}filterType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="default-server" type="{http://www.w3.org/2001/XMLSchema}string" default="default-server" />
 *       &lt;attribute name="default-virtual-host" type="{http://www.w3.org/2001/XMLSchema}string" default="default-host" />
 *       &lt;attribute name="default-servlet-container" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *       &lt;attribute name="instance-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statistics-enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "undertow-subsystemType", propOrder = {
    "bufferCache",
    "server",
    "servletContainer",
    "handlers",
    "filters"
})
public class UndertowSubsystemType {

    @XmlElement(name = "buffer-cache")
    protected List<BufferCacheType> bufferCache;
    @XmlElement(required = true)
    protected List<ServerType> server;
    @XmlElement(name = "servlet-container")
    protected List<ServletContainerType> servletContainer;
    protected HandlerType handlers;
    protected FilterType filters;
    @XmlAttribute(name = "default-server")
    protected String defaultServer;
    @XmlAttribute(name = "default-virtual-host")
    protected String defaultVirtualHost;
    @XmlAttribute(name = "default-servlet-container")
    protected String defaultServletContainer;
    @XmlAttribute(name = "instance-id")
    protected String instanceId;
    @XmlAttribute(name = "statistics-enabled")
    protected Boolean statisticsEnabled;

    /**
     * Gets the value of the bufferCache property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bufferCache property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBufferCache().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BufferCacheType }
     * 
     * 
     */
    public List<BufferCacheType> getBufferCache() {
        if (bufferCache == null) {
            bufferCache = new ArrayList<BufferCacheType>();
        }
        return this.bufferCache;
    }

    /**
     * Gets the value of the server property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the server property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServerType }
     * 
     * 
     */
    public List<ServerType> getServer() {
        if (server == null) {
            server = new ArrayList<ServerType>();
        }
        return this.server;
    }

    /**
     * Gets the value of the servletContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servletContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServletContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServletContainerType }
     * 
     * 
     */
    public List<ServletContainerType> getServletContainer() {
        if (servletContainer == null) {
            servletContainer = new ArrayList<ServletContainerType>();
        }
        return this.servletContainer;
    }

    /**
     * handlersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link HandlerType }
     *     
     */
    public HandlerType getHandlers() {
        return handlers;
    }

    /**
     * handlersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link HandlerType }
     *     
     */
    public void setHandlers(HandlerType value) {
        this.handlers = value;
    }

    /**
     * filtersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getFilters() {
        return filters;
    }

    /**
     * filtersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setFilters(FilterType value) {
        this.filters = value;
    }

    /**
     * defaultServerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultServer() {
        if (defaultServer == null) {
            return "default-server";
        } else {
            return defaultServer;
        }
    }

    /**
     * defaultServerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultServer(String value) {
        this.defaultServer = value;
    }

    /**
     * defaultVirtualHostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultVirtualHost() {
        if (defaultVirtualHost == null) {
            return "default-host";
        } else {
            return defaultVirtualHost;
        }
    }

    /**
     * defaultVirtualHostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultVirtualHost(String value) {
        this.defaultVirtualHost = value;
    }

    /**
     * defaultServletContainerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultServletContainer() {
        if (defaultServletContainer == null) {
            return "default";
        } else {
            return defaultServletContainer;
        }
    }

    /**
     * defaultServletContainerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultServletContainer(String value) {
        this.defaultServletContainer = value;
    }

    /**
     * instanceIdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * instanceIdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * statisticsEnabledプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStatisticsEnabled() {
        if (statisticsEnabled == null) {
            return false;
        } else {
            return statisticsEnabled;
        }
    }

    /**
     * statisticsEnabledプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatisticsEnabled(Boolean value) {
        this.statisticsEnabled = value;
    }

}
