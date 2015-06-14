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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>listener-type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="listener-type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:jboss:domain:undertow:2.0}socket-options-type">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="socket-binding" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="worker" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *       &lt;attribute name="buffer-pool" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="resolve-peer-address" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="max-post-size" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *       &lt;attribute name="buffer-pipelined-data" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="max-header-size" type="{http://www.w3.org/2001/XMLSchema}long" default="5120" />
 *       &lt;attribute name="max-parameters" type="{http://www.w3.org/2001/XMLSchema}long" default="1000" />
 *       &lt;attribute name="max-headers" type="{http://www.w3.org/2001/XMLSchema}long" default="200" />
 *       &lt;attribute name="max-cookies" type="{http://www.w3.org/2001/XMLSchema}long" default="200" />
 *       &lt;attribute name="allow-encoded-slash" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="decode-url" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="url-charset" type="{http://www.w3.org/2001/XMLSchema}string" default="UTF-8" />
 *       &lt;attribute name="always-set-keep-alive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="max-buffered-request-size" type="{http://www.w3.org/2001/XMLSchema}long" default="16384" />
 *       &lt;attribute name="record-request-start-time" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="allow-equals-in-cookie-value" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="no-request-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="request-parse-timeout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listener-type")
@XmlSeeAlso({
    HttpsListenerType.class,
    HttpListenerType.class,
    AjpListenerType.class
})
public class ListenerType
    extends SocketOptionsType
{

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "socket-binding", required = true)
    protected String socketBinding;
    @XmlAttribute(name = "worker")
    protected String worker;
    @XmlAttribute(name = "buffer-pool")
    protected String bufferPool;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "resolve-peer-address")
    protected Boolean resolvePeerAddress;
    @XmlAttribute(name = "max-post-size")
    protected Long maxPostSize;
    @XmlAttribute(name = "buffer-pipelined-data")
    protected Boolean bufferPipelinedData;
    @XmlAttribute(name = "max-header-size")
    protected Long maxHeaderSize;
    @XmlAttribute(name = "max-parameters")
    protected Long maxParameters;
    @XmlAttribute(name = "max-headers")
    protected Long maxHeaders;
    @XmlAttribute(name = "max-cookies")
    protected Long maxCookies;
    @XmlAttribute(name = "allow-encoded-slash")
    protected Boolean allowEncodedSlash;
    @XmlAttribute(name = "decode-url")
    protected Boolean decodeUrl;
    @XmlAttribute(name = "url-charset")
    protected String urlCharset;
    @XmlAttribute(name = "always-set-keep-alive")
    protected Boolean alwaysSetKeepAlive;
    @XmlAttribute(name = "max-buffered-request-size")
    protected Long maxBufferedRequestSize;
    @XmlAttribute(name = "record-request-start-time")
    protected Boolean recordRequestStartTime;
    @XmlAttribute(name = "allow-equals-in-cookie-value")
    protected Boolean allowEqualsInCookieValue;
    @XmlAttribute(name = "no-request-timeout")
    protected Integer noRequestTimeout;
    @XmlAttribute(name = "request-parse-timeout")
    protected Integer requestParseTimeout;

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
     * socketBindingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocketBinding() {
        return socketBinding;
    }

    /**
     * socketBindingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocketBinding(String value) {
        this.socketBinding = value;
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
        if (worker == null) {
            return "default";
        } else {
            return worker;
        }
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
     * bufferPoolプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferPool() {
        if (bufferPool == null) {
            return "default";
        } else {
            return bufferPool;
        }
    }

    /**
     * bufferPoolプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferPool(String value) {
        this.bufferPool = value;
    }

    /**
     * enabledプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * enabledプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * resolvePeerAddressプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isResolvePeerAddress() {
        if (resolvePeerAddress == null) {
            return false;
        } else {
            return resolvePeerAddress;
        }
    }

    /**
     * resolvePeerAddressプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolvePeerAddress(Boolean value) {
        this.resolvePeerAddress = value;
    }

    /**
     * maxPostSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxPostSize() {
        if (maxPostSize == null) {
            return  0L;
        } else {
            return maxPostSize;
        }
    }

    /**
     * maxPostSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPostSize(Long value) {
        this.maxPostSize = value;
    }

    /**
     * bufferPipelinedDataプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBufferPipelinedData() {
        if (bufferPipelinedData == null) {
            return true;
        } else {
            return bufferPipelinedData;
        }
    }

    /**
     * bufferPipelinedDataプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBufferPipelinedData(Boolean value) {
        this.bufferPipelinedData = value;
    }

    /**
     * maxHeaderSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxHeaderSize() {
        if (maxHeaderSize == null) {
            return  5120L;
        } else {
            return maxHeaderSize;
        }
    }

    /**
     * maxHeaderSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxHeaderSize(Long value) {
        this.maxHeaderSize = value;
    }

    /**
     * maxParametersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxParameters() {
        if (maxParameters == null) {
            return  1000L;
        } else {
            return maxParameters;
        }
    }

    /**
     * maxParametersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxParameters(Long value) {
        this.maxParameters = value;
    }

    /**
     * maxHeadersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxHeaders() {
        if (maxHeaders == null) {
            return  200L;
        } else {
            return maxHeaders;
        }
    }

    /**
     * maxHeadersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxHeaders(Long value) {
        this.maxHeaders = value;
    }

    /**
     * maxCookiesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxCookies() {
        if (maxCookies == null) {
            return  200L;
        } else {
            return maxCookies;
        }
    }

    /**
     * maxCookiesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxCookies(Long value) {
        this.maxCookies = value;
    }

    /**
     * allowEncodedSlashプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowEncodedSlash() {
        if (allowEncodedSlash == null) {
            return false;
        } else {
            return allowEncodedSlash;
        }
    }

    /**
     * allowEncodedSlashプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEncodedSlash(Boolean value) {
        this.allowEncodedSlash = value;
    }

    /**
     * decodeUrlプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDecodeUrl() {
        if (decodeUrl == null) {
            return true;
        } else {
            return decodeUrl;
        }
    }

    /**
     * decodeUrlプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecodeUrl(Boolean value) {
        this.decodeUrl = value;
    }

    /**
     * urlCharsetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlCharset() {
        if (urlCharset == null) {
            return "UTF-8";
        } else {
            return urlCharset;
        }
    }

    /**
     * urlCharsetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlCharset(String value) {
        this.urlCharset = value;
    }

    /**
     * alwaysSetKeepAliveプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAlwaysSetKeepAlive() {
        if (alwaysSetKeepAlive == null) {
            return true;
        } else {
            return alwaysSetKeepAlive;
        }
    }

    /**
     * alwaysSetKeepAliveプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysSetKeepAlive(Boolean value) {
        this.alwaysSetKeepAlive = value;
    }

    /**
     * maxBufferedRequestSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxBufferedRequestSize() {
        if (maxBufferedRequestSize == null) {
            return  16384L;
        } else {
            return maxBufferedRequestSize;
        }
    }

    /**
     * maxBufferedRequestSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBufferedRequestSize(Long value) {
        this.maxBufferedRequestSize = value;
    }

    /**
     * recordRequestStartTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecordRequestStartTime() {
        if (recordRequestStartTime == null) {
            return false;
        } else {
            return recordRequestStartTime;
        }
    }

    /**
     * recordRequestStartTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordRequestStartTime(Boolean value) {
        this.recordRequestStartTime = value;
    }

    /**
     * allowEqualsInCookieValueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowEqualsInCookieValue() {
        if (allowEqualsInCookieValue == null) {
            return false;
        } else {
            return allowEqualsInCookieValue;
        }
    }

    /**
     * allowEqualsInCookieValueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEqualsInCookieValue(Boolean value) {
        this.allowEqualsInCookieValue = value;
    }

    /**
     * noRequestTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoRequestTimeout() {
        return noRequestTimeout;
    }

    /**
     * noRequestTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoRequestTimeout(Integer value) {
        this.noRequestTimeout = value;
    }

    /**
     * requestParseTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestParseTimeout() {
        return requestParseTimeout;
    }

    /**
     * requestParseTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestParseTimeout(Integer value) {
        this.requestParseTimeout = value;
    }

}
