package com.asiainfo.tfsPlatform.dto.ext;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
* 类说明：用来接收新增客账户时的表单信息的dto，有客户信息，集团信息，账户信息
* @author cuichao
* @date 2016年5月11日 上午9:56:38
*/
public class TfBTradeCustAcctDto implements Serializable{

	private static final long serialVersionUID = 1L;
	//台账主表
	private Long tradeId; //业务流水号
	private Long custId;   //客户
	private Long acctId;	//账户ID
	private String tradeStaffId;         //受理员工
	private Short priority;             //  优先级 
	private Short acceptMonth;          //受理月份
	// 客户信息
	private String custName; // 在客户表中是客户名称， 在集团表中是集团名称
	
	private String custType;
	
	private String custState;
	
	private String psptTypeCode;

	private String psptId;
	
    private String eparchyCode;

    private String cityCode;
    
    private String simpleSpell;
    
    private String remark;
    
    // 集团信息
    private String groupType;
    
    private String groupStatus;
    
    private String groupAddr;
    
    private String custManagerId;
    
    private String custManagerAppr;
    
    private String juristicTypeCode;

    private Long juristicCustId;
    
    private String juristicName;
    
    private String busiLicenceType;

    private String busiLicenceNo;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date busiLicenceValidDate;
    
    private String groupMemo;
    
    private String bankAcct;
    
    private String bankName;
    
    private String regMoney;
    
    private String regDate;
    
    // 账户信息
    private String payName;

    private String contractNo;

    private String payModeCode;

    private Long scoreValue;

    private Short creditClassId;

    private Long basicCreditValue;

    private Long creditValue;

    private Integer creditControlId;
    
    private String removeTag;

    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date openDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date removeDate;

    private String netTypeCode;
    


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getCustType() {
		return custType;
	}


	public void setCustType(String custType) {
		this.custType = custType;
	}


	public String getCustState() {
		return custState;
	}


	public void setCustState(String custState) {
		this.custState = custState;
	}


	public String getPsptTypeCode() {
		return psptTypeCode;
	}


	public void setPsptTypeCode(String psptTypeCode) {
		this.psptTypeCode = psptTypeCode;
	}


	public String getPsptId() {
		return psptId;
	}


	public void setPsptId(String psptId) {
		this.psptId = psptId;
	}


	public String getEparchyCode() {
		return eparchyCode;
	}


	public void setEparchyCode(String eparchyCode) {
		this.eparchyCode = eparchyCode;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}


	public String getSimpleSpell() {
		return simpleSpell;
	}


	public void setSimpleSpell(String simpleSpell) {
		this.simpleSpell = simpleSpell;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getGroupType() {
		return groupType;
	}


	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}


	public String getGroupStatus() {
		return groupStatus;
	}


	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}


	public String getGroupAddr() {
		return groupAddr;
	}


	public void setGroupAddr(String groupAddr) {
		this.groupAddr = groupAddr;
	}


	public String getCustManagerId() {
		return custManagerId;
	}


	public void setCustManagerId(String custManagerId) {
		this.custManagerId = custManagerId;
	}


	public String getCustManagerAppr() {
		return custManagerAppr;
	}


	public void setCustManagerAppr(String custManagerAppr) {
		this.custManagerAppr = custManagerAppr;
	}


	public String getJuristicTypeCode() {
		return juristicTypeCode;
	}


	public void setJuristicTypeCode(String juristicTypeCode) {
		this.juristicTypeCode = juristicTypeCode;
	}


	public Long getJuristicCustId() {
		return juristicCustId;
	}


	public void setJuristicCustId(Long juristicCustId) {
		this.juristicCustId = juristicCustId;
	}


	public String getJuristicName() {
		return juristicName;
	}


	public void setJuristicName(String juristicName) {
		this.juristicName = juristicName;
	}


	public String getBusiLicenceType() {
		return busiLicenceType;
	}


	public void setBusiLicenceType(String busiLicenceType) {
		this.busiLicenceType = busiLicenceType;
	}


	public String getBusiLicenceNo() {
		return busiLicenceNo;
	}


	public void setBusiLicenceNo(String busiLicenceNo) {
		this.busiLicenceNo = busiLicenceNo;
	}

	public Date getBusiLicenceValidDate() {
		return busiLicenceValidDate;
	}


	public void setBusiLicenceValidDate(Date busiLicenceValidDate) {
		this.busiLicenceValidDate = busiLicenceValidDate;
	}


	public String getGroupMemo() {
		return groupMemo;
	}


	public void setGroupMemo(String groupMemo) {
		this.groupMemo = groupMemo;
	}


	public String getBankAcct() {
		return bankAcct;
	}


	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getRegMoney() {
		return regMoney;
	}


	public void setRegMoney(String regMoney) {
		this.regMoney = regMoney;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getPayName() {
		return payName;
	}


	public void setPayName(String payName) {
		this.payName = payName;
	}


	public String getContractNo() {
		return contractNo;
	}


	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	


	public Long getTradeId() {
		return tradeId;
	}


	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}


	public Long getCustId() {
		return custId;
	}


	public void setCustId(Long custId) {
		this.custId = custId;
	}


	public Long getAcctId() {
		return acctId;
	}


	public void setAcctId(Long acctId) {
		this.acctId = acctId;
	}


	public String getPayModeCode() {
		return payModeCode;
	}


	public void setPayModeCode(String payModeCode) {
		this.payModeCode = payModeCode;
	}


	public Long getScoreValue() {
		return scoreValue;
	}


	public void setScoreValue(Long scoreValue) {
		this.scoreValue = scoreValue;
	}


	public Short getCreditClassId() {
		return creditClassId;
	}


	public void setCreditClassId(Short creditClassId) {
		this.creditClassId = creditClassId;
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


	public Integer getCreditControlId() {
		return creditControlId;
	}


	public void setCreditControlId(Integer creditControlId) {
		this.creditControlId = creditControlId;
	}


	public String getRemoveTag() {
		return removeTag;
	}


	public void setRemoveTag(String removeTag) {
		this.removeTag = removeTag;
	}


	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public Date getRemoveDate() {
		return removeDate;
	}


	public void setRemoveDate(Date removeDate) {
		this.removeDate = removeDate;
	}


	public String getNetTypeCode() {
		return netTypeCode;
	}


	public void setNetTypeCode(String netTypeCode) {
		this.netTypeCode = netTypeCode;
	}


	public String getTradeStaffId() {
		return tradeStaffId;
	}


	public void setTradeStaffId(String tradeStaffId) {
		this.tradeStaffId = tradeStaffId;
	}


	public Short getPriority() {
		return priority;
	}


	public void setPriority(Short priority) {
		this.priority = priority;
	}


	public Short getAcceptMonth() {
		return acceptMonth;
	}


	public void setAcceptMonth(Short acceptMonth) {
		this.acceptMonth = acceptMonth;
	}
    


	
}
