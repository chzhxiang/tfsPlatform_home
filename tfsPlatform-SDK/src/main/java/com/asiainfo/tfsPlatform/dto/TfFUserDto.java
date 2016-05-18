package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 类说明：用户信息的Dto
 * @author zhouzy3
 * @date 2016年5月16日 上午11:36:23
 */
public class TfFUserDto implements Serializable{
    private Long userId;

    private Short partitionId;

    private Long custId;

    private Long usecustId;

    private Integer orgId;

    private String brandCode;

    private Integer productId;

    private String productTypeCode;

    private String eparchyCode;

    private String cityCode;

    private String inNetMode;

    private String userPasswd;

    private String userDiffCode;

    private String userTypeCode;

    private String carNumber;

    private String serialNumber;

    private String netTypeCode;

    private Long scoreValue;

    private Integer creditClass;

    private Long basicCreditValue;

    private Long creditValue;

    private String acctTag;

    private String prepayTag;

    private Date inDate;

    private Date openDate;

    private String openMode;

    private String openDepartId;

    private String openStaffId;

    private String inDepartId;

    private String inStaffId;

    private String removeTag;

    private Date destroyTime;

    private String removeEparchyCode;

    private String removeCityCode;

    private String removeDepartId;

    private String removeReasonCode;

    private Date preDestroyTime;

    private Date firstCallTime;

    private Date lastStopTime;

    private String userStateCodeset;

    private String mputeMonthFee;

    private Date mputeDate;

    private Date updateTime;

    private Long assureCustId;

    private String assureTypeCode;

    private Date assureDate;

    private String developStaffId;

    private Date developDate;

    private String developEparchyCode;

    private String developCityCode;

    private String developDepartId;

    private String developNo;

    private String remark;

    private Integer creditRuleId;

    private String contractId;

    private Date changeuserDate;

    private Integer mainDiscntCode;

    private String productSpec;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Short partitionId) {
        this.partitionId = partitionId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getUsecustId() {
        return usecustId;
    }

    public void setUsecustId(Long usecustId) {
        this.usecustId = usecustId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode == null ? null : productTypeCode.trim();
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode == null ? null : eparchyCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getInNetMode() {
        return inNetMode;
    }

    public void setInNetMode(String inNetMode) {
        this.inNetMode = inNetMode == null ? null : inNetMode.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }

    public String getUserDiffCode() {
        return userDiffCode;
    }

    public void setUserDiffCode(String userDiffCode) {
        this.userDiffCode = userDiffCode == null ? null : userDiffCode.trim();
    }

    public String getUserTypeCode() {
        return userTypeCode;
    }

    public void setUserTypeCode(String userTypeCode) {
        this.userTypeCode = userTypeCode == null ? null : userTypeCode.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getNetTypeCode() {
        return netTypeCode;
    }

    public void setNetTypeCode(String netTypeCode) {
        this.netTypeCode = netTypeCode == null ? null : netTypeCode.trim();
    }

    public Long getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(Long scoreValue) {
        this.scoreValue = scoreValue;
    }

    public Integer getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(Integer creditClass) {
        this.creditClass = creditClass;
    }

    public Long getBasicCreditValue() {
        return basicCreditValue;
    }

    public void setBasicCreditValue(Long basicCreditValue) {
        this.basicCreditValue = basicCreditValue;
    }

    public Long getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(Long creditValue) {
        this.creditValue = creditValue;
    }

    public String getAcctTag() {
        return acctTag;
    }

    public void setAcctTag(String acctTag) {
        this.acctTag = acctTag == null ? null : acctTag.trim();
    }

    public String getPrepayTag() {
        return prepayTag;
    }

    public void setPrepayTag(String prepayTag) {
        this.prepayTag = prepayTag == null ? null : prepayTag.trim();
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public String getOpenMode() {
        return openMode;
    }

    public void setOpenMode(String openMode) {
        this.openMode = openMode == null ? null : openMode.trim();
    }

    public String getOpenDepartId() {
        return openDepartId;
    }

    public void setOpenDepartId(String openDepartId) {
        this.openDepartId = openDepartId == null ? null : openDepartId.trim();
    }

    public String getOpenStaffId() {
        return openStaffId;
    }

    public void setOpenStaffId(String openStaffId) {
        this.openStaffId = openStaffId == null ? null : openStaffId.trim();
    }

    public String getInDepartId() {
        return inDepartId;
    }

    public void setInDepartId(String inDepartId) {
        this.inDepartId = inDepartId == null ? null : inDepartId.trim();
    }

    public String getInStaffId() {
        return inStaffId;
    }

    public void setInStaffId(String inStaffId) {
        this.inStaffId = inStaffId == null ? null : inStaffId.trim();
    }

    public String getRemoveTag() {
        return removeTag;
    }

    public void setRemoveTag(String removeTag) {
        this.removeTag = removeTag == null ? null : removeTag.trim();
    }

    public Date getDestroyTime() {
        return destroyTime;
    }

    public void setDestroyTime(Date destroyTime) {
        this.destroyTime = destroyTime;
    }

    public String getRemoveEparchyCode() {
        return removeEparchyCode;
    }

    public void setRemoveEparchyCode(String removeEparchyCode) {
        this.removeEparchyCode = removeEparchyCode == null ? null : removeEparchyCode.trim();
    }

    public String getRemoveCityCode() {
        return removeCityCode;
    }

    public void setRemoveCityCode(String removeCityCode) {
        this.removeCityCode = removeCityCode == null ? null : removeCityCode.trim();
    }

    public String getRemoveDepartId() {
        return removeDepartId;
    }

    public void setRemoveDepartId(String removeDepartId) {
        this.removeDepartId = removeDepartId == null ? null : removeDepartId.trim();
    }

    public String getRemoveReasonCode() {
        return removeReasonCode;
    }

    public void setRemoveReasonCode(String removeReasonCode) {
        this.removeReasonCode = removeReasonCode == null ? null : removeReasonCode.trim();
    }

    public Date getPreDestroyTime() {
        return preDestroyTime;
    }

    public void setPreDestroyTime(Date preDestroyTime) {
        this.preDestroyTime = preDestroyTime;
    }

    public Date getFirstCallTime() {
        return firstCallTime;
    }

    public void setFirstCallTime(Date firstCallTime) {
        this.firstCallTime = firstCallTime;
    }

    public Date getLastStopTime() {
        return lastStopTime;
    }

    public void setLastStopTime(Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    public String getUserStateCodeset() {
        return userStateCodeset;
    }

    public void setUserStateCodeset(String userStateCodeset) {
        this.userStateCodeset = userStateCodeset == null ? null : userStateCodeset.trim();
    }

    public String getMputeMonthFee() {
        return mputeMonthFee;
    }

    public void setMputeMonthFee(String mputeMonthFee) {
        this.mputeMonthFee = mputeMonthFee == null ? null : mputeMonthFee.trim();
    }

    public Date getMputeDate() {
        return mputeDate;
    }

    public void setMputeDate(Date mputeDate) {
        this.mputeDate = mputeDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getAssureCustId() {
        return assureCustId;
    }

    public void setAssureCustId(Long assureCustId) {
        this.assureCustId = assureCustId;
    }

    public String getAssureTypeCode() {
        return assureTypeCode;
    }

    public void setAssureTypeCode(String assureTypeCode) {
        this.assureTypeCode = assureTypeCode == null ? null : assureTypeCode.trim();
    }

    public Date getAssureDate() {
        return assureDate;
    }

    public void setAssureDate(Date assureDate) {
        this.assureDate = assureDate;
    }

    public String getDevelopStaffId() {
        return developStaffId;
    }

    public void setDevelopStaffId(String developStaffId) {
        this.developStaffId = developStaffId == null ? null : developStaffId.trim();
    }

    public Date getDevelopDate() {
        return developDate;
    }

    public void setDevelopDate(Date developDate) {
        this.developDate = developDate;
    }

    public String getDevelopEparchyCode() {
        return developEparchyCode;
    }

    public void setDevelopEparchyCode(String developEparchyCode) {
        this.developEparchyCode = developEparchyCode == null ? null : developEparchyCode.trim();
    }

    public String getDevelopCityCode() {
        return developCityCode;
    }

    public void setDevelopCityCode(String developCityCode) {
        this.developCityCode = developCityCode == null ? null : developCityCode.trim();
    }

    public String getDevelopDepartId() {
        return developDepartId;
    }

    public void setDevelopDepartId(String developDepartId) {
        this.developDepartId = developDepartId == null ? null : developDepartId.trim();
    }

    public String getDevelopNo() {
        return developNo;
    }

    public void setDevelopNo(String developNo) {
        this.developNo = developNo == null ? null : developNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreditRuleId() {
        return creditRuleId;
    }

    public void setCreditRuleId(Integer creditRuleId) {
        this.creditRuleId = creditRuleId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public Date getChangeuserDate() {
        return changeuserDate;
    }

    public void setChangeuserDate(Date changeuserDate) {
        this.changeuserDate = changeuserDate;
    }

    public Integer getMainDiscntCode() {
        return mainDiscntCode;
    }

    public void setMainDiscntCode(Integer mainDiscntCode) {
        this.mainDiscntCode = mainDiscntCode;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec == null ? null : productSpec.trim();
    }
}
