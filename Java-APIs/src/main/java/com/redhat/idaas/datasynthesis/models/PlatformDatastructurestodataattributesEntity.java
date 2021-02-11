package com.redhat.idaas.datasynthesis.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "platform_datastructurestodataattributes", schema = "datasynthesis", catalog = "")
public class PlatformDatastructurestodataattributesEntity {
    private Long id;
    private short platformDataStructuresToDataAttributesId;
    private Short platformDataStructuresId;
    private String compositeDataStructureName;
    private Short sensitivityFlagId;
    private Timestamp createdDate;
    private Short statusId;
    private String createdUser;
    private String platformDataStructuresToDataAttributesGuid;
    private String registeredApp;
    private Short platformDataAttributesId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "PlatformDataStructuresToDataAttributesID", nullable = false)
    public short getPlatformDataStructuresToDataAttributesId() {
        return platformDataStructuresToDataAttributesId;
    }

    public void setPlatformDataStructuresToDataAttributesId(short platformDataStructuresToDataAttributesId) {
        this.platformDataStructuresToDataAttributesId = platformDataStructuresToDataAttributesId;
    }

    @Basic
    @Column(name = "PlatformDataStructuresID", nullable = true)
    public Short getPlatformDataStructuresId() {
        return platformDataStructuresId;
    }

    public void setPlatformDataStructuresId(Short platformDataStructuresId) {
        this.platformDataStructuresId = platformDataStructuresId;
    }

    @Basic
    @Column(name = "CompositeDataStructureName", nullable = true, length = 50)
    public String getCompositeDataStructureName() {
        return compositeDataStructureName;
    }

    public void setCompositeDataStructureName(String compositeDataStructureName) {
        this.compositeDataStructureName = compositeDataStructureName;
    }

    @Basic
    @Column(name = "SensitivityFlagID", nullable = true)
    public Short getSensitivityFlagId() {
        return sensitivityFlagId;
    }

    public void setSensitivityFlagId(Short sensitivityFlagId) {
        this.sensitivityFlagId = sensitivityFlagId;
    }

    @Basic
    @Column(name = "CreatedDate", nullable = true)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "StatusID", nullable = true)
    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "CreatedUser", nullable = true, length = 20)
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Basic
    @Column(name = "PlatformDataStructuresToDataAttributesGUID", nullable = true, length = 38)
    public String getPlatformDataStructuresToDataAttributesGuid() {
        return platformDataStructuresToDataAttributesGuid;
    }

    public void setPlatformDataStructuresToDataAttributesGuid(String platformDataStructuresToDataAttributesGuid) {
        this.platformDataStructuresToDataAttributesGuid = platformDataStructuresToDataAttributesGuid;
    }

    @Basic
    @Column(name = "RegisteredApp", nullable = true, length = 38)
    public String getRegisteredApp() {
        return registeredApp;
    }

    public void setRegisteredApp(String registeredApp) {
        this.registeredApp = registeredApp;
    }

    @Basic
    @Column(name = "PlatformDataAttributesID", nullable = true)
    public Short getPlatformDataAttributesId() {
        return platformDataAttributesId;
    }

    public void setPlatformDataAttributesId(Short platformDataAttributesId) {
        this.platformDataAttributesId = platformDataAttributesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatformDatastructurestodataattributesEntity that = (PlatformDatastructurestodataattributesEntity) o;

        if (platformDataStructuresToDataAttributesId != that.platformDataStructuresToDataAttributesId) return false;
        if (platformDataStructuresId != null ? !platformDataStructuresId.equals(that.platformDataStructuresId) : that.platformDataStructuresId != null)
            return false;
        if (compositeDataStructureName != null ? !compositeDataStructureName.equals(that.compositeDataStructureName) : that.compositeDataStructureName != null)
            return false;
        if (sensitivityFlagId != null ? !sensitivityFlagId.equals(that.sensitivityFlagId) : that.sensitivityFlagId != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (createdUser != null ? !createdUser.equals(that.createdUser) : that.createdUser != null) return false;
        if (platformDataStructuresToDataAttributesGuid != null ? !platformDataStructuresToDataAttributesGuid.equals(that.platformDataStructuresToDataAttributesGuid) : that.platformDataStructuresToDataAttributesGuid != null)
            return false;
        if (registeredApp != null ? !registeredApp.equals(that.registeredApp) : that.registeredApp != null)
            return false;
        if (platformDataAttributesId != null ? !platformDataAttributesId.equals(that.platformDataAttributesId) : that.platformDataAttributesId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) platformDataStructuresToDataAttributesId;
        result = 31 * result + (platformDataStructuresId != null ? platformDataStructuresId.hashCode() : 0);
        result = 31 * result + (compositeDataStructureName != null ? compositeDataStructureName.hashCode() : 0);
        result = 31 * result + (sensitivityFlagId != null ? sensitivityFlagId.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (createdUser != null ? createdUser.hashCode() : 0);
        result = 31 * result + (platformDataStructuresToDataAttributesGuid != null ? platformDataStructuresToDataAttributesGuid.hashCode() : 0);
        result = 31 * result + (registeredApp != null ? registeredApp.hashCode() : 0);
        result = 31 * result + (platformDataAttributesId != null ? platformDataAttributesId.hashCode() : 0);
        return result;
    }
}
