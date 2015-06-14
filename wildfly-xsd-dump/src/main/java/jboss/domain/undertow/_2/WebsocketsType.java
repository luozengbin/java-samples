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
 * <p>websocketsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="websocketsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="buffer-pool" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *       &lt;attribute name="worker" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *       &lt;attribute name="dispatch-to-worker" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "websocketsType")
public class WebsocketsType {

    @XmlAttribute(name = "buffer-pool")
    protected String bufferPool;
    @XmlAttribute(name = "worker")
    protected String worker;
    @XmlAttribute(name = "dispatch-to-worker")
    protected Boolean dispatchToWorker;

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
     * dispatchToWorkerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDispatchToWorker() {
        if (dispatchToWorker == null) {
            return true;
        } else {
            return dispatchToWorker;
        }
    }

    /**
     * dispatchToWorkerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispatchToWorker(Boolean value) {
        this.dispatchToWorker = value;
    }

}
