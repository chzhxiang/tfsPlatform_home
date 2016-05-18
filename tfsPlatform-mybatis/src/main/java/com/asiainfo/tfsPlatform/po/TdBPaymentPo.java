package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TdBPaymentPo implements Serializable {
    private Integer paymentId;

    private String payment;

    private String paymentClass;

    private String paymentType;

    private String subPaymentType;

    private String canDisTag;

    private Integer prePaymentId;

    private String prePayment;

    private Integer cancelPaymentId;

    private String cancelPayment;

    private String remark;

    private Date updateTime;

    private String updateEparchyCode;

    private String updateCityCode;

    private String updateDepartId;

    private String updateStaffId;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getPaymentClass() {
        return paymentClass;
    }

    public void setPaymentClass(String paymentClass) {
        this.paymentClass = paymentClass == null ? null : paymentClass.trim();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getSubPaymentType() {
        return subPaymentType;
    }

    public void setSubPaymentType(String subPaymentType) {
        this.subPaymentType = subPaymentType == null ? null : subPaymentType.trim();
    }

    public String getCanDisTag() {
        return canDisTag;
    }

    public void setCanDisTag(String canDisTag) {
        this.canDisTag = canDisTag == null ? null : canDisTag.trim();
    }

    public Integer getPrePaymentId() {
        return prePaymentId;
    }

    public void setPrePaymentId(Integer prePaymentId) {
        this.prePaymentId = prePaymentId;
    }

    public String getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment == null ? null : prePayment.trim();
    }

    public Integer getCancelPaymentId() {
        return cancelPaymentId;
    }

    public void setCancelPaymentId(Integer cancelPaymentId) {
        this.cancelPaymentId = cancelPaymentId;
    }

    public String getCancelPayment() {
        return cancelPayment;
    }

    public void setCancelPayment(String cancelPayment) {
        this.cancelPayment = cancelPayment == null ? null : cancelPayment.trim();
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