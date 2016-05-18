package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TfBAccessLogPo implements Serializable {
    private Long accessId;

    private Short partitionId;

    private Long chargeId;

    private Long acctId;

    private Long acctBalanceId;

    private Short depositCode;

    private Long oldBalance;

    private Long money;

    private Long newBalance;

    private Long invoiceFee;

    private String accessTag;

    private Date operateTime;

    private String eparchyCode;

    private String cancelTag;

    private static final long serialVersionUID = 1L;

    public Long getAccessId() {
        return accessId;
    }

    public void setAccessId(Long accessId) {
        this.accessId = accessId;
    }

    public Short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Short partitionId) {
        this.partitionId = partitionId;
    }

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getAcctBalanceId() {
        return acctBalanceId;
    }

    public void setAcctBalanceId(Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    public Short getDepositCode() {
        return depositCode;
    }

    public void setDepositCode(Short depositCode) {
        this.depositCode = depositCode;
    }

    public Long getOldBalance() {
        return oldBalance;
    }

    public void setOldBalance(Long oldBalance) {
        this.oldBalance = oldBalance;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Long newBalance) {
        this.newBalance = newBalance;
    }

    public Long getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(Long invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public String getAccessTag() {
        return accessTag;
    }

    public void setAccessTag(String accessTag) {
        this.accessTag = accessTag == null ? null : accessTag.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode == null ? null : eparchyCode.trim();
    }

    public String getCancelTag() {
        return cancelTag;
    }

    public void setCancelTag(String cancelTag) {
        this.cancelTag = cancelTag == null ? null : cancelTag.trim();
    }
}