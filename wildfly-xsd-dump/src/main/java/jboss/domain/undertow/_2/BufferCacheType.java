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
 * 
 *                 
 *                   A buffer cache. I cache consists of 1 or more regions, that are split up into smaller buffers.
 *                   The total cache size is the buffer size * the buffers per region * the number of regions.
 *                 
 *             
 * 
 * <p>buffer-cacheType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="buffer-cacheType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buffer-size" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="buffers-per-region" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="max-regions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buffer-cacheType")
public class BufferCacheType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "buffer-size")
    protected String bufferSize;
    @XmlAttribute(name = "buffers-per-region")
    protected String buffersPerRegion;
    @XmlAttribute(name = "max-regions")
    protected String maxRegions;

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
     * bufferSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBufferSize() {
        return bufferSize;
    }

    /**
     * bufferSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBufferSize(String value) {
        this.bufferSize = value;
    }

    /**
     * buffersPerRegionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuffersPerRegion() {
        return buffersPerRegion;
    }

    /**
     * buffersPerRegionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuffersPerRegion(String value) {
        this.buffersPerRegion = value;
    }

    /**
     * maxRegionsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxRegions() {
        return maxRegions;
    }

    /**
     * maxRegionsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxRegions(String value) {
        this.maxRegions = value;
    }

}
