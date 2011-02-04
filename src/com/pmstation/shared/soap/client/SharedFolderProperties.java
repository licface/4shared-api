
package com.pmstation.shared.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sharedFolderProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sharedFolderProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createSubFolders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableAnonimUpload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emailOnUpload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="embed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fileProperties" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="moderator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onlyPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicSearch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="search" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shared" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subdomainAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subdomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thumbNailOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="updateFiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viewModeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viewSubfolders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="webGrab" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sharedFolderProperties", propOrder = {
    "createSubFolders",
    "delete",
    "disableAnonimUpload",
    "emailOnUpload",
    "embed",
    "fileProperties",
    "moderator",
    "onlyPublic",
    "password",
    "publicSearch",
    "search",
    "shared",
    "subdomainAllowed",
    "subdomainName",
    "thumbNailOn",
    "updateFiles",
    "upload",
    "viewModeDetails",
    "viewSubfolders",
    "webGrab"
})
public class SharedFolderProperties {

    protected boolean createSubFolders;
    protected boolean delete;
    protected boolean disableAnonimUpload;
    protected boolean emailOnUpload;
    protected boolean embed;
    protected boolean fileProperties;
    protected boolean moderator;
    protected boolean onlyPublic;
    protected String password;
    protected boolean publicSearch;
    protected boolean search;
    protected boolean shared;
    protected boolean subdomainAllowed;
    protected String subdomainName;
    protected boolean thumbNailOn;
    protected boolean updateFiles;
    protected boolean upload;
    protected boolean viewModeDetails;
    protected boolean viewSubfolders;
    protected boolean webGrab;

    /**
     * Gets the value of the createSubFolders property.
     * 
     */
    public boolean isCreateSubFolders() {
        return createSubFolders;
    }

    /**
     * Sets the value of the createSubFolders property.
     * 
     */
    public void setCreateSubFolders(boolean value) {
        this.createSubFolders = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the disableAnonimUpload property.
     * 
     */
    public boolean isDisableAnonimUpload() {
        return disableAnonimUpload;
    }

    /**
     * Sets the value of the disableAnonimUpload property.
     * 
     */
    public void setDisableAnonimUpload(boolean value) {
        this.disableAnonimUpload = value;
    }

    /**
     * Gets the value of the emailOnUpload property.
     * 
     */
    public boolean isEmailOnUpload() {
        return emailOnUpload;
    }

    /**
     * Sets the value of the emailOnUpload property.
     * 
     */
    public void setEmailOnUpload(boolean value) {
        this.emailOnUpload = value;
    }

    /**
     * Gets the value of the embed property.
     * 
     */
    public boolean isEmbed() {
        return embed;
    }

    /**
     * Sets the value of the embed property.
     * 
     */
    public void setEmbed(boolean value) {
        this.embed = value;
    }

    /**
     * Gets the value of the fileProperties property.
     * 
     */
    public boolean isFileProperties() {
        return fileProperties;
    }

    /**
     * Sets the value of the fileProperties property.
     * 
     */
    public void setFileProperties(boolean value) {
        this.fileProperties = value;
    }

    /**
     * Gets the value of the moderator property.
     * 
     */
    public boolean isModerator() {
        return moderator;
    }

    /**
     * Sets the value of the moderator property.
     * 
     */
    public void setModerator(boolean value) {
        this.moderator = value;
    }

    /**
     * Gets the value of the onlyPublic property.
     * 
     */
    public boolean isOnlyPublic() {
        return onlyPublic;
    }

    /**
     * Sets the value of the onlyPublic property.
     * 
     */
    public void setOnlyPublic(boolean value) {
        this.onlyPublic = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the publicSearch property.
     * 
     */
    public boolean isPublicSearch() {
        return publicSearch;
    }

    /**
     * Sets the value of the publicSearch property.
     * 
     */
    public void setPublicSearch(boolean value) {
        this.publicSearch = value;
    }

    /**
     * Gets the value of the search property.
     * 
     */
    public boolean isSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     */
    public void setSearch(boolean value) {
        this.search = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     */
    public void setShared(boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the subdomainAllowed property.
     * 
     */
    public boolean isSubdomainAllowed() {
        return subdomainAllowed;
    }

    /**
     * Sets the value of the subdomainAllowed property.
     * 
     */
    public void setSubdomainAllowed(boolean value) {
        this.subdomainAllowed = value;
    }

    /**
     * Gets the value of the subdomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdomainName() {
        return subdomainName;
    }

    /**
     * Sets the value of the subdomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdomainName(String value) {
        this.subdomainName = value;
    }

    /**
     * Gets the value of the thumbNailOn property.
     * 
     */
    public boolean isThumbNailOn() {
        return thumbNailOn;
    }

    /**
     * Sets the value of the thumbNailOn property.
     * 
     */
    public void setThumbNailOn(boolean value) {
        this.thumbNailOn = value;
    }

    /**
     * Gets the value of the updateFiles property.
     * 
     */
    public boolean isUpdateFiles() {
        return updateFiles;
    }

    /**
     * Sets the value of the updateFiles property.
     * 
     */
    public void setUpdateFiles(boolean value) {
        this.updateFiles = value;
    }

    /**
     * Gets the value of the upload property.
     * 
     */
    public boolean isUpload() {
        return upload;
    }

    /**
     * Sets the value of the upload property.
     * 
     */
    public void setUpload(boolean value) {
        this.upload = value;
    }

    /**
     * Gets the value of the viewModeDetails property.
     * 
     */
    public boolean isViewModeDetails() {
        return viewModeDetails;
    }

    /**
     * Sets the value of the viewModeDetails property.
     * 
     */
    public void setViewModeDetails(boolean value) {
        this.viewModeDetails = value;
    }

    /**
     * Gets the value of the viewSubfolders property.
     * 
     */
    public boolean isViewSubfolders() {
        return viewSubfolders;
    }

    /**
     * Sets the value of the viewSubfolders property.
     * 
     */
    public void setViewSubfolders(boolean value) {
        this.viewSubfolders = value;
    }

    /**
     * Gets the value of the webGrab property.
     * 
     */
    public boolean isWebGrab() {
        return webGrab;
    }

    /**
     * Sets the value of the webGrab property.
     * 
     */
    public void setWebGrab(boolean value) {
        this.webGrab = value;
    }

}
