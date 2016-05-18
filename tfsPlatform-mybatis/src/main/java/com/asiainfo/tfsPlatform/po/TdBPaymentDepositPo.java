package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;

public class TdBPaymentDepositPo implements Serializable {
    private Integer paymentId;

    private Short payFeeModeCode;

    private Integer ruleId;

    private Short depositCode;

    private String privateTag;

    private String invoiceTag;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Short getPayFeeModeCode() {
        return payFeeModeCode;
    }

    public void setPayFeeModeCode(Short payFeeModeCode) {
        this.payFeeModeCode = payFeeModeCode;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Short getDepositCode() {
        return depositCode;
    }

    public void setDepositCode(Short depositCode) {
        this.depositCode = depositCode;
    }

    public String getPrivateTag() {
        return privateTag;
    }

    public void setPrivateTag(String privateTag) {
        this.privateTag = privateTag == null ? null : privateTag.trim();
    }

    public String getInvoiceTag() {
        return invoiceTag;
    }

    public void setInvoiceTag(String invoiceTag) {
        this.invoiceTag = invoiceTag == null ? null : invoiceTag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}