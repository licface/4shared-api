
package com.pmstation.shared.soap.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pmstation.shared.soap.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApiException_QNAME = new QName("http://api.soap.shared.pmstation.com/", "ApiException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pmstation.shared.soap.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link FileUploadInfo }
     * 
     */
    public FileUploadInfo createFileUploadInfo() {
        return new FileUploadInfo();
    }

    /**
     * Create an instance of {@link UserSettings }
     * 
     */
    public UserSettings createUserSettings() {
        return new UserSettings();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link ExifInfo }
     * 
     */
    public ExifInfo createExifInfo() {
        return new ExifInfo();
    }

    /**
     * Create an instance of {@link UserSetting }
     * 
     */
    public UserSetting createUserSetting() {
        return new UserSetting();
    }

    /**
     * Create an instance of {@link DirHistoryDTOArrayArray }
     * 
     */
    public DirHistoryDTOArrayArray createDirHistoryDTOArrayArray() {
        return new DirHistoryDTOArrayArray();
    }

    /**
     * Create an instance of {@link ExifInfoArray }
     * 
     */
    public ExifInfoArray createExifInfoArray() {
        return new ExifInfoArray();
    }

    /**
     * Create an instance of {@link AccountItemArray }
     * 
     */
    public AccountItemArray createAccountItemArray() {
        return new AccountItemArray();
    }

    /**
     * Create an instance of {@link AccountItem }
     * 
     */
    public AccountItem createAccountItem() {
        return new AccountItem();
    }

    /**
     * Create an instance of {@link DirHistoryDTOArray }
     * 
     */
    public DirHistoryDTOArray createDirHistoryDTOArray() {
        return new DirHistoryDTOArray();
    }

    /**
     * Create an instance of {@link Mp3Info }
     * 
     */
    public Mp3Info createMp3Info() {
        return new Mp3Info();
    }

    /**
     * Create an instance of {@link SharedFolderPropertiesArray }
     * 
     */
    public SharedFolderPropertiesArray createSharedFolderPropertiesArray() {
        return new SharedFolderPropertiesArray();
    }

    /**
     * Create an instance of {@link DirHistoryDTO }
     * 
     */
    public DirHistoryDTO createDirHistoryDTO() {
        return new DirHistoryDTO();
    }

    /**
     * Create an instance of {@link SettingsGroup }
     * 
     */
    public SettingsGroup createSettingsGroup() {
        return new SettingsGroup();
    }

    /**
     * Create an instance of {@link Mp3InfoArray }
     * 
     */
    public Mp3InfoArray createMp3InfoArray() {
        return new Mp3InfoArray();
    }

    /**
     * Create an instance of {@link SharedFolderProperties }
     * 
     */
    public SharedFolderProperties createSharedFolderProperties() {
        return new SharedFolderProperties();
    }

    /**
     * Create an instance of {@link LongArray }
     * 
     */
    public LongArray createLongArray() {
        return new LongArray();
    }

    /**
     * Create an instance of {@link SettingsGroupArray }
     * 
     */
    public SettingsGroupArray createSettingsGroupArray() {
        return new SettingsGroupArray();
    }

    /**
     * Create an instance of {@link UserSettingsArray }
     * 
     */
    public UserSettingsArray createUserSettingsArray() {
        return new UserSettingsArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.soap.shared.pmstation.com/", name = "ApiException")
    public JAXBElement<FaultBean> createApiException(FaultBean value) {
        return new JAXBElement<FaultBean>(_ApiException_QNAME, FaultBean.class, null, value);
    }

}
