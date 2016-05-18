/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.common.collect.Lists;

import java.util.Date;

public class TfBTradeDto implements Serializable {
	 private Long tradeId;

	    private Short acceptMonth;

	    private String cancelTag;

	    private Long subscribeId;

	    private BigDecimal bpmId;

	    private Short tradeTypeCode;

	    private String inModeCode;

	    private Short priority;

	    private String subscribeState;

	    private String nextDealTag;

	    private Integer productId;

	    private String brandCode;

	    private Long userId;

	    private Long custId;

	    private Long usecustId;

	    private Long acctId;

	    private String userDiffCode;

	    private String netTypeCode;

	    private String serialNumber;

	    private String custName;

	    private Date acceptDate;

	    private String tradeStaffId;

	    private String tradeDepartId;

	    private String tradeCityCode;

	    private String tradeEparchyCode;

	    private String termIp;

	    private String eparchyCode;

	    private String cityCode;

	    private String olcomTag;

	    private Date execTime;

	    private Date finishDate;

	    private Long operFee;

	    private Long foregift;

	    private Long advancePay;

	    private String invoiceNo;

	    private String feeState;

	    private Date feeTime;

	    private String feeStaffId;

	    private Date cancelDate;

	    private String cancelStaffId;

	    private String cancelDepartId;

	    private String cancelCityCode;

	    private String cancelEparchyCode;

	    private String checkTypeCode;

	    private String chkTag;

	    private String auditTag;

	    private String auditBatchNo;

	    private String actorName;

	    private String actorCerttypeid;

	    private String actorPhone;

	    private String actorCertnum;

	    private String contact;

	    private String contactPhone;

	    private String contactAddress;

	    private String remark;

	    private String ifMaintenance;

	    private Long provinceOrderId;

	    private Long subProvinceOrderId;

	    private static final long serialVersionUID = 1L;
	    public TfBTradeDto(){
	    	
	    }

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

		public String getCancelTag() {
			return cancelTag;
		}

		public void setCancelTag(String cancelTag) {
			this.cancelTag = cancelTag;
		}

		public Long getSubscribeId() {
			return subscribeId;
		}

		public void setSubscribeId(Long subscribeId) {
			this.subscribeId = subscribeId;
		}

		public BigDecimal getBpmId() {
			return bpmId;
		}

		public void setBpmId(BigDecimal bpmId) {
			this.bpmId = bpmId;
		}

		public Short getTradeTypeCode() {
			return tradeTypeCode;
		}

		public void setTradeTypeCode(Short tradeTypeCode) {
			this.tradeTypeCode = tradeTypeCode;
		}

		public String getInModeCode() {
			return inModeCode;
		}

		public void setInModeCode(String inModeCode) {
			this.inModeCode = inModeCode;
		}

		public Short getPriority() {
			return priority;
		}

		public void setPriority(Short priority) {
			this.priority = priority;
		}

		public String getSubscribeState() {
			return subscribeState;
		}

		public void setSubscribeState(String subscribeState) {
			this.subscribeState = subscribeState;
		}

		public String getNextDealTag() {
			return nextDealTag;
		}

		public void setNextDealTag(String nextDealTag) {
			this.nextDealTag = nextDealTag;
		}

		public Integer getProductId() {
			return productId;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public String getBrandCode() {
			return brandCode;
		}

		public void setBrandCode(String brandCode) {
			this.brandCode = brandCode;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
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

		public Long getAcctId() {
			return acctId;
		}

		public void setAcctId(Long acctId) {
			this.acctId = acctId;
		}

		public String getUserDiffCode() {
			return userDiffCode;
		}

		public void setUserDiffCode(String userDiffCode) {
			this.userDiffCode = userDiffCode;
		}

		public String getNetTypeCode() {
			return netTypeCode;
		}

		public void setNetTypeCode(String netTypeCode) {
			this.netTypeCode = netTypeCode;
		}

		public String getSerialNumber() {
			return serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public Date getAcceptDate() {
			return acceptDate;
		}

		public void setAcceptDate(Date acceptDate) {
			this.acceptDate = acceptDate;
		}

		public String getTradeStaffId() {
			return tradeStaffId;
		}

		public void setTradeStaffId(String tradeStaffId) {
			this.tradeStaffId = tradeStaffId;
		}

		public String getTradeDepartId() {
			return tradeDepartId;
		}

		public void setTradeDepartId(String tradeDepartId) {
			this.tradeDepartId = tradeDepartId;
		}

		public String getTradeCityCode() {
			return tradeCityCode;
		}

		public void setTradeCityCode(String tradeCityCode) {
			this.tradeCityCode = tradeCityCode;
		}

		public String getTradeEparchyCode() {
			return tradeEparchyCode;
		}

		public void setTradeEparchyCode(String tradeEparchyCode) {
			this.tradeEparchyCode = tradeEparchyCode;
		}

		public String getTermIp() {
			return termIp;
		}

		public void setTermIp(String termIp) {
			this.termIp = termIp;
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

		public String getOlcomTag() {
			return olcomTag;
		}

		public void setOlcomTag(String olcomTag) {
			this.olcomTag = olcomTag;
		}

		public Date getExecTime() {
			return execTime;
		}

		public void setExecTime(Date execTime) {
			this.execTime = execTime;
		}

		public Date getFinishDate() {
			return finishDate;
		}

		public void setFinishDate(Date finishDate) {
			this.finishDate = finishDate;
		}

		public Long getOperFee() {
			return operFee;
		}

		public void setOperFee(Long operFee) {
			this.operFee = operFee;
		}

		public Long getForegift() {
			return foregift;
		}

		public void setForegift(Long foregift) {
			this.foregift = foregift;
		}

		public Long getAdvancePay() {
			return advancePay;
		}

		public void setAdvancePay(Long advancePay) {
			this.advancePay = advancePay;
		}

		public String getInvoiceNo() {
			return invoiceNo;
		}

		public void setInvoiceNo(String invoiceNo) {
			this.invoiceNo = invoiceNo;
		}

		public String getFeeState() {
			return feeState;
		}

		public void setFeeState(String feeState) {
			this.feeState = feeState;
		}

		public Date getFeeTime() {
			return feeTime;
		}

		public void setFeeTime(Date feeTime) {
			this.feeTime = feeTime;
		}

		public String getFeeStaffId() {
			return feeStaffId;
		}

		public void setFeeStaffId(String feeStaffId) {
			this.feeStaffId = feeStaffId;
		}

		public Date getCancelDate() {
			return cancelDate;
		}

		public void setCancelDate(Date cancelDate) {
			this.cancelDate = cancelDate;
		}

		public String getCancelStaffId() {
			return cancelStaffId;
		}

		public void setCancelStaffId(String cancelStaffId) {
			this.cancelStaffId = cancelStaffId;
		}

		public String getCancelDepartId() {
			return cancelDepartId;
		}

		public void setCancelDepartId(String cancelDepartId) {
			this.cancelDepartId = cancelDepartId;
		}

		public String getCancelCityCode() {
			return cancelCityCode;
		}

		public void setCancelCityCode(String cancelCityCode) {
			this.cancelCityCode = cancelCityCode;
		}

		public String getCancelEparchyCode() {
			return cancelEparchyCode;
		}

		public void setCancelEparchyCode(String cancelEparchyCode) {
			this.cancelEparchyCode = cancelEparchyCode;
		}

		public String getCheckTypeCode() {
			return checkTypeCode;
		}

		public void setCheckTypeCode(String checkTypeCode) {
			this.checkTypeCode = checkTypeCode;
		}

		public String getChkTag() {
			return chkTag;
		}

		public void setChkTag(String chkTag) {
			this.chkTag = chkTag;
		}

		public String getAuditTag() {
			return auditTag;
		}

		public void setAuditTag(String auditTag) {
			this.auditTag = auditTag;
		}

		public String getAuditBatchNo() {
			return auditBatchNo;
		}

		public void setAuditBatchNo(String auditBatchNo) {
			this.auditBatchNo = auditBatchNo;
		}

		public String getActorName() {
			return actorName;
		}

		public void setActorName(String actorName) {
			this.actorName = actorName;
		}

		public String getActorCerttypeid() {
			return actorCerttypeid;
		}

		public void setActorCerttypeid(String actorCerttypeid) {
			this.actorCerttypeid = actorCerttypeid;
		}

		public String getActorPhone() {
			return actorPhone;
		}

		public void setActorPhone(String actorPhone) {
			this.actorPhone = actorPhone;
		}

		public String getActorCertnum() {
			return actorCertnum;
		}

		public void setActorCertnum(String actorCertnum) {
			this.actorCertnum = actorCertnum;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getContactPhone() {
			return contactPhone;
		}

		public void setContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
		}

		public String getContactAddress() {
			return contactAddress;
		}

		public void setContactAddress(String contactAddress) {
			this.contactAddress = contactAddress;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getIfMaintenance() {
			return ifMaintenance;
		}

		public void setIfMaintenance(String ifMaintenance) {
			this.ifMaintenance = ifMaintenance;
		}

		public Long getProvinceOrderId() {
			return provinceOrderId;
		}

		public void setProvinceOrderId(Long provinceOrderId) {
			this.provinceOrderId = provinceOrderId;
		}

		public Long getSubProvinceOrderId() {
			return subProvinceOrderId;
		}

		public void setSubProvinceOrderId(Long subProvinceOrderId) {
			this.subProvinceOrderId = subProvinceOrderId;
		}


}