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
 * <p>https-listener-type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="https-listener-type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:jboss:domain:undertow:2.0}listener-type">
 *       &lt;attribute name="security-realm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verify-client" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enabled-cipher-suites" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enabled-protocols" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enable-http2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enable-spdy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "https-listener-type")
public class HttpsListenerType
    extends ListenerType
{

    @XmlAttribute(name = "security-realm", required = true)
    protected String securityRealm;
    @XmlAttribute(name = "verify-client")
    protected String verifyClient;
    @XmlAttribute(name = "enabled-cipher-suites")
    protected String enabledCipherSuites;
    @XmlAttribute(name = "enabled-protocols")
    protected String enabledProtocols;
    @XmlAttribute(name = "enable-http2")
    protected String enableHttp2;
    @XmlAttribute(name = "enable-spdy")
    protected String enableSpdy;

    /**
     * securityRealmプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityRealm() {
        return securityRealm;
    }

    /**
     * securityRealmプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityRealm(String value) {
        this.securityRealm = value;
    }

    /**
     * verifyClientプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyClient() {
        return verifyClient;
    }

    /**
     * verifyClientプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyClient(String value) {
        this.verifyClient = value;
    }

    /**
     * enabledCipherSuitesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledCipherSuites() {
        return enabledCipherSuites;
    }

    /**
     * enabledCipherSuitesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledCipherSuites(String value) {
        this.enabledCipherSuites = value;
    }

    /**
     * enabledProtocolsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledProtocols() {
        return enabledProtocols;
    }

    /**
     * enabledProtocolsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledProtocols(String value) {
        this.enabledProtocols = value;
    }

    /**
     * enableHttp2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableHttp2() {
        return enableHttp2;
    }

    /**
     * enableHttp2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableHttp2(String value) {
        this.enableHttp2 = value;
    }

    /**
     * enableSpdyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableSpdy() {
        return enableSpdy;
    }

    /**
     * enableSpdyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableSpdy(String value) {
        this.enableSpdy = value;
    }

}
