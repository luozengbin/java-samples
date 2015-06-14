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
 * <p>accessLogType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="accessLogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" default="common" />
 *       &lt;attribute name="worker" type="{http://www.w3.org/2001/XMLSchema}string" default="default" />
 *       &lt;attribute name="directory" type="{http://www.w3.org/2001/XMLSchema}string" default="${jboss.server.log.dir}" />
 *       &lt;attribute name="relative-to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" default="access_log" />
 *       &lt;attribute name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" default=".log" />
 *       &lt;attribute name="rotate" type="{http://www.w3.org/2001/XMLSchema}string" default="true" />
 *       &lt;attribute name="use-server-log" type="{http://www.w3.org/2001/XMLSchema}string" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessLogType")
public class AccessLogType {

    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "worker")
    protected String worker;
    @XmlAttribute(name = "directory")
    protected String directory;
    @XmlAttribute(name = "relative-to")
    protected String relativeTo;
    @XmlAttribute(name = "prefix")
    protected String prefix;
    @XmlAttribute(name = "suffix")
    protected String suffix;
    @XmlAttribute(name = "rotate")
    protected String rotate;
    @XmlAttribute(name = "use-server-log")
    protected String useServerLog;

    /**
     * patternプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        if (pattern == null) {
            return "common";
        } else {
            return pattern;
        }
    }

    /**
     * patternプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
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
     * directoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        if (directory == null) {
            return "${jboss.server.log.dir}";
        } else {
            return directory;
        }
    }

    /**
     * directoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * relativeToプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeTo() {
        return relativeTo;
    }

    /**
     * relativeToプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeTo(String value) {
        this.relativeTo = value;
    }

    /**
     * prefixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        if (prefix == null) {
            return "access_log";
        } else {
            return prefix;
        }
    }

    /**
     * prefixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * suffixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        if (suffix == null) {
            return ".log";
        } else {
            return suffix;
        }
    }

    /**
     * suffixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * rotateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotate() {
        if (rotate == null) {
            return "true";
        } else {
            return rotate;
        }
    }

    /**
     * rotateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotate(String value) {
        this.rotate = value;
    }

    /**
     * useServerLogプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseServerLog() {
        if (useServerLog == null) {
            return "false";
        } else {
            return useServerLog;
        }
    }

    /**
     * useServerLogプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseServerLog(String value) {
        this.useServerLog = value;
    }

}
