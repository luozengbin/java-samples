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
 * <p>reverse-proxy-hostType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="reverse-proxy-hostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outbound-socket-binding" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scheme" type="{http://www.w3.org/2001/XMLSchema}string" default="http" />
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *       &lt;attribute name="instance-id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reverse-proxy-hostType")
public class ReverseProxyHostType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "outbound-socket-binding", required = true)
    protected String outboundSocketBinding;
    @XmlAttribute(name = "scheme")
    protected String scheme;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "instance-id")
    protected String instanceId;

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
     * outboundSocketBindingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutboundSocketBinding() {
        return outboundSocketBinding;
    }

    /**
     * outboundSocketBindingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutboundSocketBinding(String value) {
        this.outboundSocketBinding = value;
    }

    /**
     * schemeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        if (scheme == null) {
            return "http";
        } else {
            return scheme;
        }
    }

    /**
     * schemeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

    /**
     * pathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        if (path == null) {
            return "";
        } else {
            return path;
        }
    }

    /**
     * pathプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
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

}
