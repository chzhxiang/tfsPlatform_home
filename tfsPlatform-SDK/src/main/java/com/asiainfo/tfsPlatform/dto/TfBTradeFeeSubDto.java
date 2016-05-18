package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

public class TfBTradeFeeSubDto implements Serializable {
    private Long tradeId;

    private Short acceptMonth;

    private String feeMode;

    private Integer feeTypeCode;

    private Long calculateId;

    private Long oldfee;

    private Long fee;

    private Long chargeId;

    private Long derateId;

    private String derateRemark;

    private Date startDate;

    private Integer months;

    private Short chargeSourceCode;

    private Date dpstRtnDate;

    private Long limitFee;

    private Integer depositPriorRuleId;

    private Integer ruleId;

    private String apprStaffId;

    private Date calculateDate;

    private String staffId;

    private String calculateTag;

    private String payTag;

    private Long payId;

    private Date payDate;

    private String feeStaffId;

    private String feeDepartId;

    private static final long serialVersionUID = 1L;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Short getAcceptMonth() {
        return acceptMonth;
    }

    public void setAcceptMonth(Short acceptMonth) {
        this.acceptMonth = acceptMonth;
    }

    public String getFeeMode() {
        return feeMode;
    }

    public void setFeeMode(String feeMode) {
        this.feeMode = feeMode == null ? null : feeMode.trim();
    }

    public Integer getFeeTypeCode() {
        return feeTypeCode;
    }

    public void setFeeTypeCode(Integer feeTypeCode) {
        this.feeTypeCode = feeTypeCode;
    }

    public Long getCalculateId() {
        return calculateId;
    }

    public void setCalculateId(Long calculateId) {
        this.calculateId = calculateId;
    }

    public Long getOldfee() {
        return oldfee;
    }

    public void setOldfee(Long oldfee) {
        this.oldfee = oldfee;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public Long getDerateId() {
        return derateId;
    }

    public void setDerateId(Long derateId) {
        this.derateId = derateId;
    }

    public String getDerateRemark() {
        return derateRemark;
    }

    public void setDerateRemark(String derateRemark) {
        this.derateRemark = derateRemark == null ? null : derateRemark.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Short getChargeSourceCode() {
        return chargeSourceCode;
    }

    public void setChargeSourceCode(Short chargeSourceCode) {
        this.chargeSourceCode = chargeSourceCode;
    }

    public Date getDpstRtnDate() {
        return dpstRtnDate;
    }

    public void setDpstRtnDate(Date dpstRtnDate) {
        this.dpstRtnDate = dpstRtnDate;
    }

    public Long getLimitFee() {
        return limitFee;
    }

    public void setLimitFee(Long limitFee) {
        this.limitFee = limitFee;
    }

    public Integer getDepositPriorRuleId() {
        return depositPriorRuleId;
    }

    public void setDepositPriorRuleId(Integer depositPriorRuleId) {
        this.depositPriorRuleId = depositPriorRuleId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getApprStaffId() {
        return apprStaffId;
    }

    public void setApprStaffId(String apprStaffId) {
        this.apprStaffId = apprStaffId == null ? null : apprStaffId.trim();
    }

    public Date getCalculateDate() {
        return calculateDate;
    }

    public void setCalculateDate(Date calculateDate) {
        this.calculateDate = calculateDate;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getCalculateTag() {
        return calculateTag;
    }

    public void setCalculateTag(String calculateTag) {
        this.calculateTag = calculateTag == null ? null : calculateTag.trim();
    }

    public String getPayTag() {
        return payTag;
    }

    public void setPayTag(String payTag) {
        this.payTag = payTag == null ? null : payTag.trim();
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getFeeStaffId() {
        return feeStaffId;
    }

    public void setFeeStaffId(String feeStaffId) {
        this.feeStaffId = feeStaffId == null ? null : feeStaffId.trim();
    }

    public String getFeeDepartId() {
        return feeDepartId;
    }

    public void setFeeDepartId(String feeDepartId) {
        this.feeDepartId = feeDepartId == null ? null : feeDepartId.trim();
    }
}