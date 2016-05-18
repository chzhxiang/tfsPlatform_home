package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TdBPayFeeModePo implements Serializable {
    private Short payFeeModeCode;

    private String payFeeMode;

    private String remark;

    private Date updateTime;

    private String updateEparchyCode;

    private String updateCityCode;

    private String updateDepartId;

    private String updateStaffId;

    private static final long serialVersionUID = 1L;

    public Short getPayFeeModeCode() {
        return payFeeModeCode;
    }

    public void setPayFeeModeCode(Short payFeeModeCode) {
        this.payFeeModeCode = payFeeModeCode;
    }

    public String getPayFeeMode() {
        return payFeeMode;
    }

    public void setPayFeeMode(String payFeeMode) {
        this.payFeeMode = payFeeMode == null ? null : payFeeMode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateEparchyCode() {
        return updateEparchyCode;
    }

    public void setUpdateEparchyCode(String updateEparchyCode) {
        this.updateEparchyCode = updateEparchyCode == null ? null : updateEparchyCode.trim();
    }

    public String getUpdateCityCode() {
        return updateCityCode;
    }

    public void setUpdateCityCode(String updateCityCode) {
        this.updateCityCode = updateCityCode == null ? null : updateCityCode.trim();
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
}