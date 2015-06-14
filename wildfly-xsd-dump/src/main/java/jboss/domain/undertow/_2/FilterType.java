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
 * <p>filterType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="filterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basic-auth" type="{urn:jboss:domain:undertow:2.0}basic-authType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="connection-limit" type="{urn:jboss:domain:undertow:2.0}connection-limitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="response-header" type="{urn:jboss:domain:undertow:2.0}response-headerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gzip" type="{urn:jboss:domain:undertow:2.0}gzipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error-page" type="{urn:jboss:domain:undertow:2.0}errorPageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mod-cluster" type="{urn:jboss:domain:undertow:2.0}modClusterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filter" type="{urn:jboss:domain:undertow:2.0}customFilterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filterType", propOrder = {
    "basicAuth",
    "connectionLimit",
    "responseHeader",
    "gzip",
    "errorPage",
    "modCluster",
    "filter"
})
public class FilterType {

    @XmlElement(name = "basic-auth")
    protected List<BasicAuthType> basicAuth;
    @XmlElement(name = "connection-limit")
    protected List<ConnectionLimitType> connectionLimit;
    @XmlElement(name = "response-header")
    protected List<ResponseHeaderType> responseHeader;
    protected List<GzipType> gzip;
    @XmlElement(name = "error-page")
    protected List<ErrorPageType> errorPage;
    @XmlElement(name = "mod-cluster")
    protected List<ModClusterType> modCluster;
    protected List<CustomFilterType> filter;

    /**
     * Gets the value of the basicAuth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basicAuth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasicAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicAuthType }
     * 
     * 
     */
    public List<BasicAuthType> getBasicAuth() {
        if (basicAuth == null) {
            basicAuth = new ArrayList<BasicAuthType>();
        }
        return this.basicAuth;
    }

    /**
     * Gets the value of the connectionLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLimitType }
     * 
     * 
     */
    public List<ConnectionLimitType> getConnectionLimit() {
        if (connectionLimit == null) {
            connectionLimit = new ArrayList<ConnectionLimitType>();
        }
        return this.connectionLimit;
    }

    /**
     * Gets the value of the responseHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseHeaderType }
     * 
     * 
     */
    public List<ResponseHeaderType> getResponseHeader() {
        if (responseHeader == null) {
            responseHeader = new ArrayList<ResponseHeaderType>();
        }
        return this.responseHeader;
    }

    /**
     * Gets the value of the gzip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gzip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGzip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GzipType }
     * 
     * 
     */
    public List<GzipType> getGzip() {
        if (gzip == null) {
            gzip = new ArrayList<GzipType>();
        }
        return this.gzip;
    }

    /**
     * Gets the value of the errorPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorPageType }
     * 
     * 
     */
    public List<ErrorPageType> getErrorPage() {
        if (errorPage == null) {
            errorPage = new ArrayList<ErrorPageType>();
        }
        return this.errorPage;
    }

    /**
     * Gets the value of the modCluster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modCluster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModCluster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModClusterType }
     * 
     * 
     */
    public List<ModClusterType> getModCluster() {
        if (modCluster == null) {
            modCluster = new ArrayList<ModClusterType>();
        }
        return this.modCluster;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFilterType }
     * 
     * 
     */
    public List<CustomFilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<CustomFilterType>();
        }
        return this.filter;
    }

}
