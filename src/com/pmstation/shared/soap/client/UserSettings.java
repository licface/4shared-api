
package com.pmstation.shared.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settings" type="{http://api.soap.shared.pmstation.com/}userSetting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settingsGroup" type="{http://api.soap.shared.pmstation.com/}settingsGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userSettings", propOrder = {
    "settings",
    "settingsGroup"
})
public class UserSettings {

    @XmlElement(nillable = true)
    protected List<UserSetting> settings;
    protected SettingsGroup settingsGroup;

    /**
     * Gets the value of the settings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserSetting }
     * 
     * 
     */
    public List<UserSetting> getSettings() {
        if (settings == null) {
            settings = new ArrayList<UserSetting>();
        }
        return this.settings;
    }

    /**
     * Gets the value of the settingsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SettingsGroup }
     *     
     */
    public SettingsGroup getSettingsGroup() {
        return settingsGroup;
    }

    /**
     * Sets the value of the settingsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettingsGroup }
     *     
     */
    public void setSettingsGroup(SettingsGroup value) {
        this.settingsGroup = value;
    }

}
