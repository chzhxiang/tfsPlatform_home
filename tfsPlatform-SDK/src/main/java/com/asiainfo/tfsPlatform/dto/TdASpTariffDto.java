package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

public class TdASpTariffDto implements Serializable {
    private String dataTypeCode;

    private String spCode;

    private String spBizCode;

    private String recvObjectType;

    private Date startDate;

    private String bizTypeCode;

    private Integer itemCode;

    private String billingCycle;

    private Integer relativeCycle;

    private Long price;

    private String newuserRecvType;

    private Short judgeHalfTime;

    private Long halfPrice;

    private String displayType;

    private Integer validStartCycle;

    private Integer validEndCycle;

    private Date endDate;

    private String silenceDeal;

    private String averageDeal;

    private Date updateTime;

    private String updateDepartId;

    private String updateStaffId;

    private String remark;

    private String feetype;

    private static final long serialVersionUID = 1L;

    public String getDataTypeCode() {
        return dataTypeCode;
    }

    public void setDataTypeCode(String dataTypeCode) {
        this.dataTypeCode = dataTypeCode == null ? null : dataTypeCode.trim();
    }

    public String getSpCode() {
        return spCode;
    }

    public void setSpCode(String spCode) {
        this.spCode = spCode == null ? null : spCode.trim();
    }

    public String getSpBizCode() {
        return spBizCode;
    }

    public void setSpBizCode(String spBizCode) {
        this.spBizCode = spBizCode == null ? null : spBizCode.trim();
    }

    public String getRecvObjectType() {
        return recvObjectType;
    }

    public void setRecvObjectType(String recvObjectType) {
        this.recvObjectType = recvObjectType == null ? null : recvObjectType.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getBizTypeCode() {
        return bizTypeCode;
    }

    public void setBizTypeCode(String bizTypeCode) {
        this.bizTypeCode = bizTypeCode == null ? null : bizTypeCode.trim();
    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle == null ? null : billingCycle.trim();
    }

    public Integer getRelativeCycle() {
        return relativeCycle;
    }

    public void setRelativeCycle(Integer relativeCycle) {
        this.relativeCycle = relativeCycle;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getNewuserRecvType() {
        return newuserRecvType;
    }

    public void setNewuserRecvType(String newuserRecvType) {
        this.newuserRecvType = newuserRecvType == null ? null : newuserRecvType.trim();
    }

    public Short getJudgeHalfTime() {
        return judgeHalfTime;
    }

    public void setJudgeHalfTime(Short judgeHalfTime) {
        this.judgeHalfTime = judgeHalfTime;
    }

    public Long getHalfPrice() {
        return halfPrice;
    }

    public void setHalfPrice(Long halfPrice) {
        this.halfPrice = halfPrice;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType == null ? null : displayType.trim();
    }

    public Integer getValidStartCycle() {
        return validStartCycle;
    }

    public void setValidStartCycle(Integer validStartCycle) {
        this.validStartCycle = validStartCycle;
    }

    public Integer getValidEndCycle() {
        return validEndCycle;
    }

    public void setValidEndCycle(Integer validEndCycle) {
        this.validEndCycle = validEndCycle;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSilenceDeal() {
        return silenceDeal;
    }

    public void setSilenceDeal(String silenceDeal) {
        this.silenceDeal = silenceDeal == null ? null : silenceDeal.trim();
    }

    public String getAverageDeal() {
        return averageDeal;
    }

    public void setAverageDeal(String averageDeal) {
        this.averageDeal = averageDeal == null ? null : averageDeal.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateDepartId() {
        return updateDepartId;
    }

    public void setUpdateDepartId(String updateDepartId) {
        this.updateDepartId = updateDepartId == null ? null : updateDepartId.trim();
    }

    public String getUpdateStaffId() {
        return updateStaffId;
    }

    public void setUpdateStaffId(String updateStaffId) {
        this.updateStaffId = updateStaffId == null ? null : updateStaffId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype == null ? null : feetype.trim();
    }
}