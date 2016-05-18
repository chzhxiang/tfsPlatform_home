package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

public class AmAccountDepositDto implements Serializable {
	
	private Integer ordringFlag;
	
    private Long acctBalanceId;

    private Integer partitionId;

    private Long acctId;

    private Long userId;

    private Integer depositCode;

    private Integer depositMoney;

    private Integer initMoney;

    private Integer oddMoney;

    private Integer evenMoney;

    private Integer limitMoney;

    private String limitMode;

    private Integer limitLeft;

    private Integer invoiceFee;

    private Integer printFee;

    private Integer startCycleId;

    private Integer endCycleId;

    private Date startDate;

    private Date endDate;

    private Integer oweFee;

    private String validTag;

    private Integer freezeFee;

    private String privateTag;

    private String eparchyCode;

    private String backupInfo;

    private String rollBackInfo;

    private Integer versionNo;

    private Integer actionCode;

    private Integer openCycleId;

    private Date updateTime;

    private String rsrvInfo1;

    private String rsrvInfo2;

    private Integer rsrvFee1;

    private Integer rsrvFee2;

    private Date activeTime;
    
    private Integer priority;
    
    public AmAccountDepositDto(){
    	
    }

    public Long getAcctBalanceId() {
        return acctBalanceId;
    }

    public void setAcctBalanceId(Long acctBalanceId) {
        this.acctBalanceId = acctBalanceId;
    }

    public Integer getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Integer partitionId) {
        this.partitionId = partitionId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getDepositCode() {
        return depositCode;
    }

    public void setDepositCode(Integer depositCode) {
        this.depositCode = depositCode;
    }

    public Integer getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Integer depositMoney) {
        this.depositMoney = depositMoney;
    }

    public Integer getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(Integer initMoney) {
        this.initMoney = initMoney;
    }

    public Integer getOddMoney() {
        return oddMoney;
    }

    public void setOddMoney(Integer oddMoney) {
        this.oddMoney = oddMoney;
    }

    public Integer getEvenMoney() {
        return evenMoney;
    }

    public void setEvenMoney(Integer evenMoney) {
        this.evenMoney = evenMoney;
    }

    public Integer getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(Integer limitMoney) {
        this.limitMoney = limitMoney;
    }

    public String getLimitMode() {
        return limitMode;
    }

    public void setLimitMode(String limitMode) {
        this.limitMode = limitMode == null ? null : limitMode.trim();
    }

    public Integer getLimitLeft() {
        return limitLeft;
    }

    public void setLimitLeft(Integer limitLeft) {
        this.limitLeft = limitLeft;
    }

    public Integer getInvoiceFee() {
        return invoiceFee;
    }

    public void setInvoiceFee(Integer invoiceFee) {
        this.invoiceFee = invoiceFee;
    }

    public Integer getPrintFee() {
        return printFee;
    }

    public void setPrintFee(Integer printFee) {
        this.printFee = printFee;
    }

    public Integer getStartCycleId() {
        return startCycleId;
    }

    public void setStartCycleId(Integer startCycleId) {
        this.startCycleId = startCycleId;
    }

    public Integer getEndCycleId() {
        return endCycleId;
    }

    public void setEndCycleId(Integer endCycleId) {
        this.endCycleId = endCycleId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getOweFee() {
        return oweFee;
    }

    public void setOweFee(Integer oweFee) {
        this.oweFee = oweFee;
    }

    public String getValidTag() {
        return validTag;
    }

    public void setValidTag(String validTag) {
        this.validTag = validTag == null ? null : validTag.trim();
    }

    public Integer getFreezeFee() {
        return freezeFee;
    }

    public void setFreezeFee(Integer freezeFee) {
        this.freezeFee = freezeFee;
    }

    public String getPrivateTag() {
        return privateTag;
    }

    public void setPrivateTag(String privateTag) {
        this.privateTag = privateTag == null ? null : privateTag.trim();
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode == null ? null : eparchyCode.trim();
    }

    public String getBackupInfo() {
        return backupInfo;
    }

    public void setBackupInfo(String backupInfo) {
        this.backupInfo = backupInfo == null ? null : backupInfo.trim();
    }

    public String getRollBackInfo() {
        return rollBackInfo;
    }

    public void setRollBackInfo(String rollBackInfo) {
        this.rollBackInfo = rollBackInfo == null ? null : rollBackInfo.trim();
    }

    public Integer getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    public Integer getActionCode() {
        return actionCode;
    }

    public void setActionCode(Integer actionCode) {
        this.actionCode = actionCode;
    }

    public Integer getOpenCycleId() {
        return openCycleId;
    }

    public void setOpenCycleId(Integer openCycleId) {
        this.openCycleId = openCycleId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRsrvInfo1() {
        return rsrvInfo1;
    }

    public void setRsrvInfo1(String rsrvInfo1) {
        this.rsrvInfo1 = rsrvInfo1 == null ? null : rsrvInfo1.trim();
    }

    public String getRsrvInfo2() {
        return rsrvInfo2;
    }

    public void setRsrvInfo2(String rsrvInfo2) {
        this.rsrvInfo2 = rsrvInfo2 == null ? null : rsrvInfo2.trim();
    }

    public Integer getRsrvFee1() {
        return rsrvFee1;
    }

    public void setRsrvFee1(Integer rsrvFee1) {
        this.rsrvFee1 = rsrvFee1;
    }

    public Integer getRsrvFee2() {
        return rsrvFee2;
    }

    public void setRsrvFee2(Integer rsrvFee2) {
        this.rsrvFee2 = rsrvFee2;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getOrdringFlag() {
		return ordringFlag;
	}

	public void setOrdringFlag(Integer ordringFlag) {
		this.ordringFlag = ordringFlag;
	}
}