
package com.pmstation.shared.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dirHistoryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dirHistoryDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dirId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parentDirId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sourceDirId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sourceFileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dirHistoryDTO", propOrder = {
    "compId",
    "date",
    "dirId",
    "fileId",
    "id",
    "operation",
    "parentDirId",
    "sourceDirId",
    "sourceFileId"
})
public class DirHistoryDTO {

    protected String compId;
    protected XMLGregorianCalendar date;
    protected Long dirId;
    protected Long fileId;
    protected long id;
    protected int operation;
    protected long parentDirId;
    protected Long sourceDirId;
    protected Long sourceFileId;

    /**
     * Gets the value of the compId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompId() {
        return compId;
    }

    /**
     * Sets the value of the compId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompId(String value) {
        this.compId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dirId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirId() {
        return dirId;
    }

    /**
     * Sets the value of the dirId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirId(Long value) {
        this.dirId = value;
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileId(Long value) {
        this.fileId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     */
    public int getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     */
    public void setOperation(int value) {
        this.operation = value;
    }

    /**
     * Gets the value of the parentDirId property.
     * 
     */
    public long getParentDirId() {
        return parentDirId;
    }

    /**
     * Sets the value of the parentDirId property.
     * 
     */
    public void setParentDirId(long value) {
        this.parentDirId = value;
    }

    /**
     * Gets the value of the sourceDirId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceDirId() {
        return sourceDirId;
    }

    /**
     * Sets the value of the sourceDirId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceDirId(Long value) {
        this.sourceDirId = value;
    }

    /**
     * Gets the value of the sourceFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceFileId() {
        return sourceFileId;
    }

    /**
     * Sets the value of the sourceFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceFileId(Long value) {
        this.sourceFileId = value;
    }

}
