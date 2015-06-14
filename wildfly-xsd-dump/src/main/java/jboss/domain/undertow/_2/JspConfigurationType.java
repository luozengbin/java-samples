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
 * <p>jsp-configurationType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="jsp-configurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="development" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="keep-generated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="trim-spaces" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="tag-pooling" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="mapped-file" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="check-interval" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="modification-test-interval" type="{http://www.w3.org/2001/XMLSchema}int" default="4" />
 *       &lt;attribute name="recompile-on-fail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="smap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="dump-smap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="generate-strings-as-char-arrays" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="error-on-use-bean-invalid-class-attribute" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="scratch-dir" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source-vm" type="{http://www.w3.org/2001/XMLSchema}string" default="1.6" />
 *       &lt;attribute name="target-vm" type="{http://www.w3.org/2001/XMLSchema}string" default="1.6" />
 *       &lt;attribute name="java-encoding" type="{http://www.w3.org/2001/XMLSchema}string" default="UTF8" />
 *       &lt;attribute name="x-powered-by" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="display-source-fragment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jsp-configurationType")
public class JspConfigurationType {

    @XmlAttribute(name = "disabled")
    protected Boolean disabled;
    @XmlAttribute(name = "development")
    protected Boolean development;
    @XmlAttribute(name = "keep-generated")
    protected Boolean keepGenerated;
    @XmlAttribute(name = "trim-spaces")
    protected Boolean trimSpaces;
    @XmlAttribute(name = "tag-pooling")
    protected Boolean tagPooling;
    @XmlAttribute(name = "mapped-file")
    protected Boolean mappedFile;
    @XmlAttribute(name = "check-interval")
    protected Integer checkInterval;
    @XmlAttribute(name = "modification-test-interval")
    protected Integer modificationTestInterval;
    @XmlAttribute(name = "recompile-on-fail")
    protected Boolean recompileOnFail;
    @XmlAttribute(name = "smap")
    protected Boolean smap;
    @XmlAttribute(name = "dump-smap")
    protected Boolean dumpSmap;
    @XmlAttribute(name = "generate-strings-as-char-arrays")
    protected Boolean generateStringsAsCharArrays;
    @XmlAttribute(name = "error-on-use-bean-invalid-class-attribute")
    protected Boolean errorOnUseBeanInvalidClassAttribute;
    @XmlAttribute(name = "scratch-dir")
    protected String scratchDir;
    @XmlAttribute(name = "source-vm")
    protected String sourceVm;
    @XmlAttribute(name = "target-vm")
    protected String targetVm;
    @XmlAttribute(name = "java-encoding")
    protected String javaEncoding;
    @XmlAttribute(name = "x-powered-by")
    protected Boolean xPoweredBy;
    @XmlAttribute(name = "display-source-fragment")
    protected Boolean displaySourceFragment;

    /**
     * disabledプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisabled() {
        if (disabled == null) {
            return false;
        } else {
            return disabled;
        }
    }

    /**
     * disabledプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * developmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDevelopment() {
        if (development == null) {
            return false;
        } else {
            return development;
        }
    }

    /**
     * developmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDevelopment(Boolean value) {
        this.development = value;
    }

    /**
     * keepGeneratedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepGenerated() {
        if (keepGenerated == null) {
            return true;
        } else {
            return keepGenerated;
        }
    }

    /**
     * keepGeneratedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepGenerated(Boolean value) {
        this.keepGenerated = value;
    }

    /**
     * trimSpacesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTrimSpaces() {
        if (trimSpaces == null) {
            return false;
        } else {
            return trimSpaces;
        }
    }

    /**
     * trimSpacesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrimSpaces(Boolean value) {
        this.trimSpaces = value;
    }

    /**
     * tagPoolingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTagPooling() {
        if (tagPooling == null) {
            return true;
        } else {
            return tagPooling;
        }
    }

    /**
     * tagPoolingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagPooling(Boolean value) {
        this.tagPooling = value;
    }

    /**
     * mappedFileプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMappedFile() {
        if (mappedFile == null) {
            return true;
        } else {
            return mappedFile;
        }
    }

    /**
     * mappedFileプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMappedFile(Boolean value) {
        this.mappedFile = value;
    }

    /**
     * checkIntervalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCheckInterval() {
        if (checkInterval == null) {
            return  0;
        } else {
            return checkInterval;
        }
    }

    /**
     * checkIntervalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckInterval(Integer value) {
        this.checkInterval = value;
    }

    /**
     * modificationTestIntervalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getModificationTestInterval() {
        if (modificationTestInterval == null) {
            return  4;
        } else {
            return modificationTestInterval;
        }
    }

    /**
     * modificationTestIntervalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModificationTestInterval(Integer value) {
        this.modificationTestInterval = value;
    }

    /**
     * recompileOnFailプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRecompileOnFail() {
        if (recompileOnFail == null) {
            return false;
        } else {
            return recompileOnFail;
        }
    }

    /**
     * recompileOnFailプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecompileOnFail(Boolean value) {
        this.recompileOnFail = value;
    }

    /**
     * smapプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmap() {
        if (smap == null) {
            return true;
        } else {
            return smap;
        }
    }

    /**
     * smapプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmap(Boolean value) {
        this.smap = value;
    }

    /**
     * dumpSmapプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDumpSmap() {
        if (dumpSmap == null) {
            return false;
        } else {
            return dumpSmap;
        }
    }

    /**
     * dumpSmapプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDumpSmap(Boolean value) {
        this.dumpSmap = value;
    }

    /**
     * generateStringsAsCharArraysプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGenerateStringsAsCharArrays() {
        if (generateStringsAsCharArrays == null) {
            return false;
        } else {
            return generateStringsAsCharArrays;
        }
    }

    /**
     * generateStringsAsCharArraysプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateStringsAsCharArrays(Boolean value) {
        this.generateStringsAsCharArrays = value;
    }

    /**
     * errorOnUseBeanInvalidClassAttributeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isErrorOnUseBeanInvalidClassAttribute() {
        if (errorOnUseBeanInvalidClassAttribute == null) {
            return false;
        } else {
            return errorOnUseBeanInvalidClassAttribute;
        }
    }

    /**
     * errorOnUseBeanInvalidClassAttributeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorOnUseBeanInvalidClassAttribute(Boolean value) {
        this.errorOnUseBeanInvalidClassAttribute = value;
    }

    /**
     * scratchDirプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScratchDir() {
        return scratchDir;
    }

    /**
     * scratchDirプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScratchDir(String value) {
        this.scratchDir = value;
    }

    /**
     * sourceVmプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceVm() {
        if (sourceVm == null) {
            return "1.6";
        } else {
            return sourceVm;
        }
    }

    /**
     * sourceVmプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceVm(String value) {
        this.sourceVm = value;
    }

    /**
     * targetVmプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetVm() {
        if (targetVm == null) {
            return "1.6";
        } else {
            return targetVm;
        }
    }

    /**
     * targetVmプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetVm(String value) {
        this.targetVm = value;
    }

    /**
     * javaEncodingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaEncoding() {
        if (javaEncoding == null) {
            return "UTF8";
        } else {
            return javaEncoding;
        }
    }

    /**
     * javaEncodingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaEncoding(String value) {
        this.javaEncoding = value;
    }

    /**
     * xPoweredByプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isXPoweredBy() {
        if (xPoweredBy == null) {
            return true;
        } else {
            return xPoweredBy;
        }
    }

    /**
     * xPoweredByプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXPoweredBy(Boolean value) {
        this.xPoweredBy = value;
    }

    /**
     * displaySourceFragmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDisplaySourceFragment() {
        if (displaySourceFragment == null) {
            return true;
        } else {
            return displaySourceFragment;
        }
    }

    /**
     * displaySourceFragmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplaySourceFragment(Boolean value) {
        this.displaySourceFragment = value;
    }

}
