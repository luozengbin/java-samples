//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.06.12 時間 08:20:36 PM JST 
//


package jboss.domain.undertow._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>modClusterType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="modClusterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="management-socket-binding" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advertise-socket-binding" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="security-key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advertise-protocol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advertise-path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advertise-frequency" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="health-check-interval" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="broken-node-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="worker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="max-request-time" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="management-access-predicate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connections-per-thread" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cached-connections-per-thread" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="connection-idle-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="request-queue-size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modClusterType")
public class ModClusterType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "management-socket-binding", required = true)
    protected String managementSocketBinding;
    @XmlAttribute(name = "advertise-socket-binding", required = true)
    protected String advertiseSocketBinding;
    @XmlAttribute(name = "security-key")
    protected String securityKey;
    @XmlAttribute(name = "advertise-protocol")
    protected String advertiseProtocol;
    @XmlAttribute(name = "advertise-path")
    protected String advertisePath;
    @XmlAttribute(name = "advertise-frequency")
    protected Integer advertiseFrequency;
    @XmlAttribute(name = "health-check-interval")
    protected Integer healthCheckInterval;
    @XmlAttribute(name = "broken-node-timeout")
    protected Integer brokenNodeTimeout;
    @XmlAttribute(name = "worker")
    protected String worker;
    @XmlAttribute(name = "max-request-time")
    protected Integer maxRequestTime;
    @XmlAttribute(name = "management-access-predicate")
    protected String managementAccessPredicate;
    @XmlAttribute(name = "connections-per-thread")
    protected Integer connectionsPerThread;
    @XmlAttribute(name = "cached-connections-per-thread")
    protected Integer cachedConnectionsPerThread;
    @XmlAttribute(name = "connection-idle-timeout")
    protected Integer connectionIdleTimeout;
    @XmlAttribute(name = "request-queue-size")
    protected Integer requestQueueSize;

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
     * managementSocketBindingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementSocketBinding() {
        return managementSocketBinding;
    }

    /**
     * managementSocketBindingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementSocketBinding(String value) {
        this.managementSocketBinding = value;
    }

    /**
     * advertiseSocketBindingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiseSocketBinding() {
        return advertiseSocketBinding;
    }

    /**
     * advertiseSocketBindingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiseSocketBinding(String value) {
        this.advertiseSocketBinding = value;
    }

    /**
     * securityKeyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityKey() {
        return securityKey;
    }

    /**
     * securityKeyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityKey(String value) {
        this.securityKey = value;
    }

    /**
     * advertiseProtocolプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertiseProtocol() {
        return advertiseProtocol;
    }

    /**
     * advertiseProtocolプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertiseProtocol(String value) {
        this.advertiseProtocol = value;
    }

    /**
     * advertisePathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertisePath() {
        return advertisePath;
    }

    /**
     * advertisePathプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertisePath(String value) {
        this.advertisePath = value;
    }

    /**
     * advertiseFrequencyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdvertiseFrequency() {
        return advertiseFrequency;
    }

    /**
     * advertiseFrequencyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdvertiseFrequency(Integer value) {
        this.advertiseFrequency = value;
    }

    /**
     * healthCheckIntervalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHealthCheckInterval() {
        return healthCheckInterval;
    }

    /**
     * healthCheckIntervalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHealthCheckInterval(Integer value) {
        this.healthCheckInterval = value;
    }

    /**
     * brokenNodeTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrokenNodeTimeout() {
        return brokenNodeTimeout;
    }

    /**
     * brokenNodeTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrokenNodeTimeout(Integer value) {
        this.brokenNodeTimeout = value;
    }

    /**
     * workerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorker() {
        return worker;
    }

    /**
     * workerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorker(String value) {
        this.worker = value;
    }

    /**
     * maxRequestTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRequestTime() {
        return maxRequestTime;
    }

    /**
     * maxRequestTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRequestTime(Integer value) {
        this.maxRequestTime = value;
    }

    /**
     * managementAccessPredicateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementAccessPredicate() {
        return managementAccessPredicate;
    }

    /**
     * managementAccessPredicateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementAccessPredicate(String value) {
        this.managementAccessPredicate = value;
    }

    /**
     * connectionsPerThreadプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionsPerThread() {
        return connectionsPerThread;
    }

    /**
     * connectionsPerThreadプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionsPerThread(Integer value) {
        this.connectionsPerThread = value;
    }

    /**
     * cachedConnectionsPerThreadプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCachedConnectionsPerThread() {
        return cachedConnectionsPerThread;
    }

    /**
     * cachedConnectionsPerThreadプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCachedConnectionsPerThread(Integer value) {
        this.cachedConnectionsPerThread = value;
    }

    /**
     * connectionIdleTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectionIdleTimeout() {
        return connectionIdleTimeout;
    }

    /**
     * connectionIdleTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectionIdleTimeout(Integer value) {
        this.connectionIdleTimeout = value;
    }

    /**
     * requestQueueSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestQueueSize() {
        return requestQueueSize;
    }

    /**
     * requestQueueSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestQueueSize(Integer value) {
        this.requestQueueSize = value;
    }

}
