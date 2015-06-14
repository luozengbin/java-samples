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
 * <p>socket-options-type complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="socket-options-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="receive-buffer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="send-buffer" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tcp-backlog" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tcp-keep-alive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="read-timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="write-timeout" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "socket-options-type")
@XmlSeeAlso({
    ListenerType.class
})
public class SocketOptionsType {

    @XmlAttribute(name = "receive-buffer")
    protected Integer receiveBuffer;
    @XmlAttribute(name = "send-buffer")
    protected Integer sendBuffer;
    @XmlAttribute(name = "tcp-backlog")
    protected Integer tcpBacklog;
    @XmlAttribute(name = "tcp-keep-alive")
    protected Boolean tcpKeepAlive;
    @XmlAttribute(name = "read-timeout")
    protected Long readTimeout;
    @XmlAttribute(name = "write-timeout")
    protected Long writeTimeout;

    /**
     * receiveBufferプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiveBuffer() {
        return receiveBuffer;
    }

    /**
     * receiveBufferプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiveBuffer(Integer value) {
        this.receiveBuffer = value;
    }

    /**
     * sendBufferプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendBuffer() {
        return sendBuffer;
    }

    /**
     * sendBufferプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendBuffer(Integer value) {
        this.sendBuffer = value;
    }

    /**
     * tcpBacklogプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTcpBacklog() {
        return tcpBacklog;
    }

    /**
     * tcpBacklogプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTcpBacklog(Integer value) {
        this.tcpBacklog = value;
    }

    /**
     * tcpKeepAliveプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTcpKeepAlive() {
        return tcpKeepAlive;
    }

    /**
     * tcpKeepAliveプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTcpKeepAlive(Boolean value) {
        this.tcpKeepAlive = value;
    }

    /**
     * readTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReadTimeout() {
        return readTimeout;
    }

    /**
     * readTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReadTimeout(Long value) {
        this.readTimeout = value;
    }

    /**
     * writeTimeoutプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWriteTimeout() {
        return writeTimeout;
    }

    /**
     * writeTimeoutプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWriteTimeout(Long value) {
        this.writeTimeout = value;
    }

}
