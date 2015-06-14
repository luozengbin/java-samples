//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.06.12 時間 08:20:36 PM JST 
//


package jboss.domain.undertow._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>servletContainerType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="servletContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jsp-config" type="{urn:jboss:domain:undertow:2.0}jsp-configurationType" minOccurs="0"/>
 *         &lt;element name="session-cookie" type="{urn:jboss:domain:undertow:2.0}session-cookieType" minOccurs="0"/>
 *         &lt;element name="persistent-sessions" type="{urn:jboss:domain:undertow:2.0}persistent-sessionsType" minOccurs="0"/>
 *         &lt;element name="websockets" type="{urn:jboss:domain:undertow:2.0}websocketsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allow-non-standard-wrappers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="default-buffer-cache" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stack-trace-on-error" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="local-only" />
 *       &lt;attribute name="default-encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="use-listener-encoding" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ignore-flush" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="eager-filter-initialization" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="default-session-timeout" type="{http://www.w3.org/2001/XMLSchema}integer" default="30" />
 *       &lt;attribute name="disable-caching-for-secured-pages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servletContainerType", propOrder = {
    "jspConfig",
    "sessionCookie",
    "persistentSessions",
    "websockets"
})
public class ServletContainerType {

    @XmlElement(name = "jsp-config")
    protected JspConfigurationType jspConfig;
    @XmlElement(name = "session-cookie")
    protected SessionCookieType sessionCookie;
    @XmlElement(name = "persistent-sessions")
    protected PersistentSessionsType persistentSessions;
    protected WebsocketsType websockets;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "allow-non-standard-wrappers")
    protected Boolean allowNonStandardWrappers;
    @XmlAttribute(name = "default-buffer-cache")
    protected String defaultBufferCache;
    @XmlAttribute(name = "stack-trace-on-error")
    @XmlSchemaType(name = "anySimpleType")
    protected String stackTraceOnError;
    @XmlAttribute(name = "default-encoding")
    protected String defaultEncoding;
    @XmlAttribute(name = "use-listener-encoding")
    protected Boolean useListenerEncoding;
    @XmlAttribute(name = "ignore-flush")
    protected Boolean ignoreFlush;
    @XmlAttribute(name = "eager-filter-initialization")
    protected Boolean eagerFilterInitialization;
    @XmlAttribute(name = "default-session-timeout")
    protected BigInteger defaultSessionTimeout;
    @XmlAttribute(name = "disable-caching-for-secured-pages")
    protected Boolean disableCachingForSecuredPages;

    /**
     * jspConfigプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JspConfigurationType }
     *     
     */
    public JspConfigurationType getJspConfig() {
        return jspConfig;
    }

    /**
     * jspConfigプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JspConfigurationType }
     *     
     */
    public void setJspConfig(JspConfigurationType value) {
        this.jspConfig = value;
    }

    /**
     * sessionCookieプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SessionCookieType }
     *     
     */
    public SessionCookieType getSessionCookie() {
        return sessionCookie;
    }

    /**
     * sessionCookieプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SessionCookieType }
     *     
     */
    public void setSessionCookie(SessionCookieType value) {
        this.sessionCookie = value;
    }

    /**
     * persistentSessionsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PersistentSessionsType }
     *     
     */
    public PersistentSessionsType getPersistentSessions() {
        return persistentSessions;
    }

    /**
     * persistentSessionsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PersistentSessionsType }
     *     
     */
    public void setPersistentSessions(PersistentSessionsType value) {
        this.persistentSessions = value;
    }

    /**
     * websocketsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link WebsocketsType }
     *     
     */
    public WebsocketsType getWebsockets() {
        return websockets;
    }

    /**
     * websocketsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link WebsocketsType }
     *     
     */
    public void setWebsockets(WebsocketsType value) {
        this.websockets = value;
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
     * allowNonStandardWrappersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowNonStandardWrappers() {
        if (allowNonStandardWrappers == null) {
            return false;
        } else {
            return allowNonStandardWrappers;
        }
    }

    /**
     * allowNonStandardWrappersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowNonStandardWrappers(Boolean value) {
        this.allowNonStandardWrappers = value;
    }

    /**
     * defaultBufferCacheプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultBufferCache() {
        return defaultBufferCache;
    }

    /**
     * defaultBufferCacheプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultBufferCache(String value) {
        this.defaultBufferCache = value;
    }

    /**
     * stackTraceOnErrorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTraceOnError() {
        if (stackTraceOnError == null) {
            return "local-only";
        } else {
            return stackTraceOnError;
        }
    }

    /**
     * stackTraceOnErrorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTraceOnError(String value) {
        this.stackTraceOnError = value;
    }

    /**
     * defaultEncodingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultEncoding() {
        return defaultEncoding;
    }

    /**
     * defaultEncodingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultEncoding(String value) {
        this.defaultEncoding = value;
    }

    /**
     * useListenerEncodingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseListenerEncoding() {
        if (useListenerEncoding == null) {
            return false;
        } else {
            return useListenerEncoding;
        }
    }

    /**
     * useListenerEncodingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseListenerEncoding(Boolean value) {
        this.useListenerEncoding = value;
    }

    /**
     * ignoreFlushプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreFlush() {
        if (ignoreFlush == null) {
            return false;
        } else {
            return ignoreFlush;
        }
    }

    /**
     * ignoreFlushプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreFlush(Boolean value) {
        this.ignoreFlush = value;
    }

    /**
     * eagerFilterInitializationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEagerFilterInitialization() {
        if (eagerFilterInitialization == null) {
            return false;
        } else {
            return eagerFilterInitialization;
        }
    }

    /**
     * eagerFilterInitializationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEagerFilterInitialization(Boolean value) {
        this.eagerFilterInitialization = value;
    }

    /**
     * defaultSessionTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefaultSessionTimeout() {
        if (defaultSessionTimeout == null) {
            return new BigInteger("30");
        } else {
            return defaultSessionTimeout;
        }
    }

    /**
     * defaultSessionTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefaultSessionTimeout(BigInteger value) {
        this.defaultSessionTimeout = value;
    }

    /**
     * disableCachingForSecuredPagesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisableCachingForSecuredPages() {
        if (disableCachingForSecuredPages == null) {
            return true;
        } else {
            return disableCachingForSecuredPages;
        }
    }

    /**
     * disableCachingForSecuredPagesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableCachingForSecuredPages(Boolean value) {
        this.disableCachingForSecuredPages = value;
    }

}
