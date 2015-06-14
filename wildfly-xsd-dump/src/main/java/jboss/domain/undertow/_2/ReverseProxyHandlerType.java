//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.06.12 時間 08:20:36 PM JST 
//


package jboss.domain.undertow._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>reverse-proxy-handlerType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="reverse-proxy-handlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="host" type="{urn:jboss:domain:undertow:2.0}reverse-proxy-hostType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connections-per-thread" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="session-cookie-names" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="problem-server-retry" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="max-request-time" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="request-queue-size" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cached-connections-per-thread" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="connection-idle-timeout" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reverse-proxy-handlerType", propOrder = {
    "host"
})
public class ReverseProxyHandlerType {

    protected List<ReverseProxyHostType> host;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "connections-per-thread")
    protected BigInteger connectionsPerThread;
    @XmlAttribute(name = "session-cookie-names")
    protected String sessionCookieNames;
    @XmlAttribute(name = "problem-server-retry")
    protected BigInteger problemServerRetry;
    @XmlAttribute(name = "max-request-time")
    protected BigInteger maxRequestTime;
    @XmlAttribute(name = "request-queue-size")
    protected BigInteger requestQueueSize;
    @XmlAttribute(name = "cached-connections-per-thread")
    protected BigInteger cachedConnectionsPerThread;
    @XmlAttribute(name = "connection-idle-timeout")
    protected BigInteger connectionIdleTimeout;

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
     * {@link ReverseProxyHostType }
     * 
     * 
     */
    public List<ReverseProxyHostType> getHost() {
        if (host == null) {
            host = new ArrayList<ReverseProxyHostType>();
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
     * connectionsPerThreadプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectionsPerThread() {
        return connectionsPerThread;
    }

    /**
     * connectionsPerThreadプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectionsPerThread(BigInteger value) {
        this.connectionsPerThread = value;
    }

    /**
     * sessionCookieNamesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionCookieNames() {
        return sessionCookieNames;
    }

    /**
     * sessionCookieNamesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionCookieNames(String value) {
        this.sessionCookieNames = value;
    }

    /**
     * problemServerRetryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProblemServerRetry() {
        return problemServerRetry;
    }

    /**
     * problemServerRetryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProblemServerRetry(BigInteger value) {
        this.problemServerRetry = value;
    }

    /**
     * maxRequestTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRequestTime() {
        return maxRequestTime;
    }

    /**
     * maxRequestTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRequestTime(BigInteger value) {
        this.maxRequestTime = value;
    }

    /**
     * requestQueueSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestQueueSize() {
        return requestQueueSize;
    }

    /**
     * requestQueueSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestQueueSize(BigInteger value) {
        this.requestQueueSize = value;
    }

    /**
     * cachedConnectionsPerThreadプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCachedConnectionsPerThread() {
        return cachedConnectionsPerThread;
    }

    /**
     * cachedConnectionsPerThreadプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCachedConnectionsPerThread(BigInteger value) {
        this.cachedConnectionsPerThread = value;
    }

    /**
     * connectionIdleTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectionIdleTimeout() {
        return connectionIdleTimeout;
    }

    /**
     * connectionIdleTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectionIdleTimeout(BigInteger value) {
        this.connectionIdleTimeout = value;
    }

}
