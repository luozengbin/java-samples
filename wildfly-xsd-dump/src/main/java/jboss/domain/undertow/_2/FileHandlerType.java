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
 * <p>file-handlerType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="file-handlerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cache-buffer-size" type="{http://www.w3.org/2001/XMLSchema}int" default="1024" />
 *       &lt;attribute name="cache-buffers" type="{http://www.w3.org/2001/XMLSchema}int" default="1024" />
 *       &lt;attribute name="directory-listing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "file-handlerType")
public class FileHandlerType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "path", required = true)
    protected String path;
    @XmlAttribute(name = "cache-buffer-size")
    protected Integer cacheBufferSize;
    @XmlAttribute(name = "cache-buffers")
    protected Integer cacheBuffers;
    @XmlAttribute(name = "directory-listing")
    protected Boolean directoryListing;

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
     * pathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
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
     * cacheBufferSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCacheBufferSize() {
        if (cacheBufferSize == null) {
            return  1024;
        } else {
            return cacheBufferSize;
        }
    }

    /**
     * cacheBufferSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheBufferSize(Integer value) {
        this.cacheBufferSize = value;
    }

    /**
     * cacheBuffersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCacheBuffers() {
        if (cacheBuffers == null) {
            return  1024;
        } else {
            return cacheBuffers;
        }
    }

    /**
     * cacheBuffersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheBuffers(Integer value) {
        this.cacheBuffers = value;
    }

    /**
     * directoryListingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDirectoryListing() {
        if (directoryListing == null) {
            return true;
        } else {
            return directoryListing;
        }
    }

    /**
     * directoryListingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectoryListing(Boolean value) {
        this.directoryListing = value;
    }

}
