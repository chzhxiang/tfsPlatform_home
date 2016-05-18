package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 功能描述：联系人DTO
 * @author zhangbt3
 * @date 2016年5月16日
 */
public class TfFCustContactDto implements Serializable {
    private Long contactId;

    private Long custId;

//    private Short partitionId;

    private String myselfFlag;

    private Integer orgId;

    private Long staffId;

    private String contactName;

    private String contactPhone;

    private String contactFax;

    private String contactEmail;

    private String contactPostCode;

    private String contactPostAddr;

    private String contactHomeAddr;

    private String contactPsptTypeCode;

    private String contactPsptId;

    private String contactWorkName;

    private String contactWorkAddr;

    private String contactDepart;

    private String contactDuty;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")  
    private Date bestContactTime;

    private String firstContactMode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")  
    private Date updateTime;

    private String updateStaffId;

    private String updateDepartId;

    private String remark;


    private static final long serialVersionUID = 1L;

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

   /* public Short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Short partitionId) {
        this.partitionId = partitionId;
    }*/

    public String getMyselfFlag() {
        return myselfFlag;
    }

    public void setMyselfFlag(String myselfFlag) {
        this.myselfFlag = myselfFlag == null ? null : myselfFlag.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax == null ? null : contactFax.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getContactPostCode() {
        return contactPostCode;
    }

    public void setContactPostCode(String contactPostCode) {
        this.contactPostCode = contactPostCode == null ? null : contactPostCode.trim();
    }

    public String getContactPostAddr() {
        return contactPostAddr;
    }

    public void setContactPostAddr(String contactPostAddr) {
        this.contactPostAddr = contactPostAddr == null ? null : contactPostAddr.trim();
    }

    public String getContactHomeAddr() {
        return contactHomeAddr;
    }

    public void setContactHomeAddr(String contactHomeAddr) {
        this.contactHomeAddr = contactHomeAddr == null ? null : contactHomeAddr.trim();
    }

    public String getContactPsptTypeCode() {
        return contactPsptTypeCode;
    }

    public void setContactPsptTypeCode(String contactPsptTypeCode) {
        this.contactPsptTypeCode = contactPsptTypeCode == null ? null : contactPsptTypeCode.trim();
    }

    public String getContactPsptId() {
        return contactPsptId;
    }

    public void setContactPsptId(String contactPsptId) {
        this.contactPsptId = contactPsptId == null ? null : contactPsptId.trim();
    }

    public String getContactWorkName() {
        return contactWorkName;
    }

    public void setContactWorkName(String contactWorkName) {
        this.contactWorkName = contactWorkName == null ? null : contactWorkName.trim();
    }

    public String getContactWorkAddr() {
        return contactWorkAddr;
    }

    public void setContactWorkAddr(String contactWorkAddr) {
        this.contactWorkAddr = contactWorkAddr == null ? null : contactWorkAddr.trim();
    }

    public String getContactDepart() {
        return contactDepart;
    }

    public void setContactDepart(String contactDepart) {
        this.contactDepart = contactDepart == null ? null : contactDepart.trim();
    }

    public String getContactDuty() {
        return contactDuty;
    }

    public void setContactDuty(String contactDuty) {
        this.contactDuty = contactDuty == null ? null : contactDuty.trim();
    }

    public Date getBestContactTime() {
        return bestContactTime;
    }

    public void setBestContactTime(Date bestContactTime) {
        this.bestContactTime = bestContactTime;
    }

    public String getFirstContactMode() {
        return firstContactMode;
    }

    public void setFirstContactMode(String firstContactMode) {
        this.firstContactMode = firstContactMode == null ? null : firstContactMode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateStaffId() {
        return updateStaffId;
    }

    public void setUpdateStaffId(String updateStaffId) {
        this.updateStaffId = updateStaffId == null ? null : updateStaffId.trim();
    }

    public String getUpdateDepartId() {
        return updateDepartId;
    }

    public void setUpdateDepartId(String updateDepartId) {
        this.updateDepartId = updateDepartId == null ? null : updateDepartId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}