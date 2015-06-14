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
 * <p>http-listener-type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="http-listener-type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:jboss:domain:undertow:2.0}listener-type">
 *       &lt;attribute name="certificate-forwarding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redirect-socket" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proxy-address-forwarding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enable-http2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "http-listener-type")
public class HttpListenerType
    extends ListenerType
{

    @XmlAttribute(name = "certificate-forwarding")
    protected String certificateForwarding;
    @XmlAttribute(name = "redirect-socket")
    protected String redirectSocket;
    @XmlAttribute(name = "proxy-address-forwarding")
    protected String proxyAddressForwarding;
    @XmlAttribute(name = "enable-http2")
    protected String enableHttp2;

    /**
     * certificateForwardingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateForwarding() {
        return certificateForwarding;
    }

    /**
     * certificateForwardingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateForwarding(String value) {
        this.certificateForwarding = value;
    }

    /**
     * redirectSocketプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectSocket() {
        return redirectSocket;
    }

    /**
     * redirectSocketプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectSocket(String value) {
        this.redirectSocket = value;
    }

    /**
     * proxyAddressForwardingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxyAddressForwarding() {
        return proxyAddressForwarding;
    }

    /**
     * proxyAddressForwardingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxyAddressForwarding(String value) {
        this.proxyAddressForwarding = value;
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

}
