package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TfBWriteSnapLogPo implements Serializable {
    private Long chargeId;

    private Short partitionId;

    private Long acctId;

    private String writeoffMode;

    private Long spayFee;

    private Long allMoney;

    private Long allNewMoney;

    private Long allBalance;

    private Long allNewBalance;

    private Long allboweFee;

    private Long aimpFee;

    private Long allnewboweFee;

    private Long prerealFee;

    private Long currealFee;

    private Long protocolBalance;

    private Long oldRoundFee;

    private Long newRoundFee;

    private String recoverTag;

    private Date operateTime;

    private String eparchyCode;

    private Integer cycleId;

    private String cancelTag;

    private String remark;

    private Long rsrvFee1;

    private Long rsrvFee2;

    private String rsrvInfo1;

    private static final long serialVersionUID = 1L;

    public Long getChargeId() {
        return chargeId;
    }

    public void setChargeId(Long chargeId) {
        this.chargeId = chargeId;
    }

    public Short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Short partitionId) {
        this.partitionId = partitionId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public String getWriteoffMode() {
        return writeoffMode;
    }

    public void setWriteoffMode(String writeoffMode) {
        this.writeoffMode = writeoffMode == null ? null : writeoffMode.trim();
    }

    public Long getSpayFee() {
        return spayFee;
    }

    public void setSpayFee(Long spayFee) {
        this.spayFee = spayFee;
    }

    public Long getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Long allMoney) {
        this.allMoney = allMoney;
    }

    public Long getAllNewMoney() {
        return allNewMoney;
    }

    public void setAllNewMoney(Long allNewMoney) {
        this.allNewMoney = allNewMoney;
    }

    public Long getAllBalance() {
        return allBalance;
    }

    public void setAllBalance(Long allBalance) {
        this.allBalance = allBalance;
    }

    public Long getAllNewBalance() {
        return allNewBalance;
    }

    public void setAllNewBalance(Long allNewBalance) {
        this.allNewBalance = allNewBalance;
    }

    public Long getAllboweFee() {
        return allboweFee;
    }

    public void setAllboweFee(Long allboweFee) {
        this.allboweFee = allboweFee;
    }

    public Long getAimpFee() {
        return aimpFee;
    }

    public void setAimpFee(Long aimpFee) {
        this.aimpFee = aimpFee;
    }

    public Long getAllnewboweFee() {
        return allnewboweFee;
    }

    public void setAllnewboweFee(Long allnewboweFee) {
        this.allnewboweFee = allnewboweFee;
    }

    public Long getPrerealFee() {
        return prerealFee;
    }

    public void setPrerealFee(Long prerealFee) {
        this.prerealFee = prerealFee;
    }

    public Long getCurrealFee() {
        return currealFee;
    }

    public void setCurrealFee(Long currealFee) {
        this.currealFee = currealFee;
    }

    public Long getProtocolBalance() {
        return protocolBalance;
    }

    public void setProtocolBalance(Long protocolBalance) {
        this.protocolBalance = protocolBalance;
    }

    public Long getOldRoundFee() {
        return oldRoundFee;
    }

    public void setOldRoundFee(Long oldRoundFee) {
        this.oldRoundFee = oldRoundFee;
    }

    public Long getNewRoundFee() {
        return newRoundFee;
    }

    public void setNewRoundFee(Long newRoundFee) {
        this.newRoundFee = newRoundFee;
    }

    public String getRecoverTag() {
        return recoverTag;
    }

    public void setRecoverTag(String recoverTag) {
        this.recoverTag = recoverTag == null ? null : recoverTag.trim();
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

    public Integer getCycleId() {
        return cycleId;
    }

    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    public String getCancelTag() {
        return cancelTag;
    }

    public void setCancelTag(String cancelTag) {
        this.cancelTag = cancelTag == null ? null : cancelTag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getRsrvFee1() {
        return rsrvFee1;
    }

    public void setRsrvFee1(Long rsrvFee1) {
        this.rsrvFee1 = rsrvFee1;
    }

    public Long getRsrvFee2() {
        return rsrvFee2;
    }

    public void setRsrvFee2(Long rsrvFee2) {
        this.rsrvFee2 = rsrvFee2;
    }

    public String getRsrvInfo1() {
        return rsrvInfo1;
    }

    public void setRsrvInfo1(String rsrvInfo1) {
        this.rsrvInfo1 = rsrvInfo1 == null ? null : rsrvInfo1.trim();
    }
}