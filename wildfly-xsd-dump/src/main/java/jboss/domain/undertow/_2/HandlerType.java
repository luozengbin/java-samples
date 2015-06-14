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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>handlerType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="handlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file" type="{urn:jboss:domain:undertow:2.0}file-handlerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reverse-proxy" type="{urn:jboss:domain:undertow:2.0}reverse-proxy-handlerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "handlerType", propOrder = {
    "file",
    "reverseProxy"
})
public class HandlerType {

    protected List<FileHandlerType> file;
    @XmlElement(name = "reverse-proxy")
    protected List<ReverseProxyHandlerType> reverseProxy;

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileHandlerType }
     * 
     * 
     */
    public List<FileHandlerType> getFile() {
        if (file == null) {
            file = new ArrayList<FileHandlerType>();
        }
        return this.file;
    }

    /**
     * Gets the value of the reverseProxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reverseProxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReverseProxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReverseProxyHandlerType }
     * 
     * 
     */
    public List<ReverseProxyHandlerType> getReverseProxy() {
        if (reverseProxy == null) {
            reverseProxy = new ArrayList<ReverseProxyHandlerType>();
        }
        return this.reverseProxy;
    }

}
