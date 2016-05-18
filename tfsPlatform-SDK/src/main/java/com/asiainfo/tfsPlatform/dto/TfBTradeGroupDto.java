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

public class TfBTradeGroupDto implements Serializable {
	private Long tradeId;

    private Short acceptMonth;

    private String cancelTag;

    private Short tradeTypeCode;

    private String groupId;

    private String groupCustCardNo;

    private String mpGroupCustCode;

    private String unifyPayCode;

    private String classId;

    private String groupAttr;

    private String clientStatus;

    private Long userCount;

    private String companyAddress;

    private String postCode;

    private String website;

    private String faxNbr;

    private String email;

    private String groupContactPhone;

    private String enterpriseScope;

    private String province;

    private String city;

    private String callingTypeCode;

    private String callingSubTypeCode;

    private String tradeClass1;

    private String tradeClass2;

    private String callingAreaCode;

    private String enterpriseTypeCode;

    private String enterpriseSizeCode;

    private Long juristicCustId;

    private String juristic;

    private String juristicTypeCode;

    private Long allEmpCount;

    private Long chinaEmpCount;

    private Long localEmpCount;

    private String groupMemo;

    private String empLsave;

    private BigDecimal regMoney;

    private String custAim;

    private String scope;

    private BigDecimal financeEarning;

    private BigDecimal commBudget;

    private String mainTrade;

    private Long mobCount;

    private Integer unicom133;

    private Integer unicom130;

    private Integer mobileNumXlt;

    private String consume;

    private BigDecimal turnover;

    private BigDecimal yearGain;

    private String superGroupId;

    private String payforWayCode;

    private String managerStaffId;

    private String doyenStaffId;

    private String newtradeComment;

    private Long employeeArpu;

    private Integer writefeeCount;

    private Long writefeeSum;

    private Long bossFeeSum;

    private Long latencyFeeSum;

    private String vpmnId;

    private String areaCode;

    private String scpCode;

    private String vpmnType;

    private String subState;

    private String funcTlags;

    private Integer interFeeindex;

    private Integer outFeeindex;

    private Integer outgrpFeeindex;

    private Integer subgrpFeeindex;

    private String preIpNo;

    private Short preIpDisc;

    private Short othorIpDisc;

    private String transNo;

    private Integer maxCloseNum;

    private Integer maxNumClose;

    private Short personMaxclose;

    private Integer maxOutnum;

    private Integer maxUsers;

    private Date pkgStartDate;

    private Short pkgType;

    private Integer discount;

    private Long limitFee;

    private Short zoneMax;

    private Integer zonefreeNum;

    private Long zoneFee;

    private Integer mtMaxnum;

    private Short aipId;

    private Date acceptDate;

    private String tradeStaffId;

    private String tradeDepartId;

    private String tradeCityCode;

    private String tradeEparchyCode;

    private String clientInfo1;

    private String clientInfo2;

    private String clientInfo3;

    private String clientInfo4;

    private String clientInfo5;

    private String clientInfo6;

    private String clientInfo7;

    private String clientTag1;

    private String clientTag2;

    private String remark;
    
    private static final long serialVersionUID = 1L;
    
    public TfBTradeGroupDto(){
    	
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

	public Short getTradeTypeCode() {
		return tradeTypeCode;
	}

	public void setTradeTypeCode(Short tradeTypeCode) {
		this.tradeTypeCode = tradeTypeCode;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupCustCardNo() {
		return groupCustCardNo;
	}

	public void setGroupCustCardNo(String groupCustCardNo) {
		this.groupCustCardNo = groupCustCardNo;
	}

	public String getMpGroupCustCode() {
		return mpGroupCustCode;
	}

	public void setMpGroupCustCode(String mpGroupCustCode) {
		this.mpGroupCustCode = mpGroupCustCode;
	}

	public String getUnifyPayCode() {
		return unifyPayCode;
	}

	public void setUnifyPayCode(String unifyPayCode) {
		this.unifyPayCode = unifyPayCode;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getGroupAttr() {
		return groupAttr;
	}

	public void setGroupAttr(String groupAttr) {
		this.groupAttr = groupAttr;
	}

	public String getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}

	public Long getUserCount() {
		return userCount;
	}

	public void setUserCount(Long userCount) {
		this.userCount = userCount;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFaxNbr() {
		return faxNbr;
	}

	public void setFaxNbr(String faxNbr) {
		this.faxNbr = faxNbr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupContactPhone() {
		return groupContactPhone;
	}

	public void setGroupContactPhone(String groupContactPhone) {
		this.groupContactPhone = groupContactPhone;
	}

	public String getEnterpriseScope() {
		return enterpriseScope;
	}

	public void setEnterpriseScope(String enterpriseScope) {
		this.enterpriseScope = enterpriseScope;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCallingTypeCode() {
		return callingTypeCode;
	}

	public void setCallingTypeCode(String callingTypeCode) {
		this.callingTypeCode = callingTypeCode;
	}

	public String getCallingSubTypeCode() {
		return callingSubTypeCode;
	}

	public void setCallingSubTypeCode(String callingSubTypeCode) {
		this.callingSubTypeCode = callingSubTypeCode;
	}

	public String getTradeClass1() {
		return tradeClass1;
	}

	public void setTradeClass1(String tradeClass1) {
		this.tradeClass1 = tradeClass1;
	}

	public String getTradeClass2() {
		return tradeClass2;
	}

	public void setTradeClass2(String tradeClass2) {
		this.tradeClass2 = tradeClass2;
	}

	public String getCallingAreaCode() {
		return callingAreaCode;
	}

	public void setCallingAreaCode(String callingAreaCode) {
		this.callingAreaCode = callingAreaCode;
	}

	public String getEnterpriseTypeCode() {
		return enterpriseTypeCode;
	}

	public void setEnterpriseTypeCode(String enterpriseTypeCode) {
		this.enterpriseTypeCode = enterpriseTypeCode;
	}

	public String getEnterpriseSizeCode() {
		return enterpriseSizeCode;
	}

	public void setEnterpriseSizeCode(String enterpriseSizeCode) {
		this.enterpriseSizeCode = enterpriseSizeCode;
	}

	public Long getJuristicCustId() {
		return juristicCustId;
	}

	public void setJuristicCustId(Long juristicCustId) {
		this.juristicCustId = juristicCustId;
	}

	public String getJuristic() {
		return juristic;
	}

	public void setJuristic(String juristic) {
		this.juristic = juristic;
	}

	public String getJuristicTypeCode() {
		return juristicTypeCode;
	}

	public void setJuristicTypeCode(String juristicTypeCode) {
		this.juristicTypeCode = juristicTypeCode;
	}

	public Long getAllEmpCount() {
		return allEmpCount;
	}

	public void setAllEmpCount(Long allEmpCount) {
		this.allEmpCount = allEmpCount;
	}

	public Long getChinaEmpCount() {
		return chinaEmpCount;
	}

	public void setChinaEmpCount(Long chinaEmpCount) {
		this.chinaEmpCount = chinaEmpCount;
	}

	public Long getLocalEmpCount() {
		return localEmpCount;
	}

	public void setLocalEmpCount(Long localEmpCount) {
		this.localEmpCount = localEmpCount;
	}

	public String getGroupMemo() {
		return groupMemo;
	}

	public void setGroupMemo(String groupMemo) {
		this.groupMemo = groupMemo;
	}

	public String getEmpLsave() {
		return empLsave;
	}

	public void setEmpLsave(String empLsave) {
		this.empLsave = empLsave;
	}

	public BigDecimal getRegMoney() {
		return regMoney;
	}

	public void setRegMoney(BigDecimal regMoney) {
		this.regMoney = regMoney;
	}

	public String getCustAim() {
		return custAim;
	}

	public void setCustAim(String custAim) {
		this.custAim = custAim;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public BigDecimal getFinanceEarning() {
		return financeEarning;
	}

	public void setFinanceEarning(BigDecimal financeEarning) {
		this.financeEarning = financeEarning;
	}

	public BigDecimal getCommBudget() {
		return commBudget;
	}

	public void setCommBudget(BigDecimal commBudget) {
		this.commBudget = commBudget;
	}

	public String getMainTrade() {
		return mainTrade;
	}

	public void setMainTrade(String mainTrade) {
		this.mainTrade = mainTrade;
	}

	public Long getMobCount() {
		return mobCount;
	}

	public void setMobCount(Long mobCount) {
		this.mobCount = mobCount;
	}

	public Integer getUnicom133() {
		return unicom133;
	}

	public void setUnicom133(Integer unicom133) {
		this.unicom133 = unicom133;
	}

	public Integer getUnicom130() {
		return unicom130;
	}

	public void setUnicom130(Integer unicom130) {
		this.unicom130 = unicom130;
	}

	public Integer getMobileNumXlt() {
		return mobileNumXlt;
	}

	public void setMobileNumXlt(Integer mobileNumXlt) {
		this.mobileNumXlt = mobileNumXlt;
	}

	public String getConsume() {
		return consume;
	}

	public void setConsume(String consume) {
		this.consume = consume;
	}

	public BigDecimal getTurnover() {
		return turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}

	public BigDecimal getYearGain() {
		return yearGain;
	}

	public void setYearGain(BigDecimal yearGain) {
		this.yearGain = yearGain;
	}

	public String getSuperGroupId() {
		return superGroupId;
	}

	public void setSuperGroupId(String superGroupId) {
		this.superGroupId = superGroupId;
	}

	public String getPayforWayCode() {
		return payforWayCode;
	}

	public void setPayforWayCode(String payforWayCode) {
		this.payforWayCode = payforWayCode;
	}

	public String getManagerStaffId() {
		return managerStaffId;
	}

	public void setManagerStaffId(String managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public String getDoyenStaffId() {
		return doyenStaffId;
	}

	public void setDoyenStaffId(String doyenStaffId) {
		this.doyenStaffId = doyenStaffId;
	}

	public String getNewtradeComment() {
		return newtradeComment;
	}

	public void setNewtradeComment(String newtradeComment) {
		this.newtradeComment = newtradeComment;
	}

	public Long getEmployeeArpu() {
		return employeeArpu;
	}

	public void setEmployeeArpu(Long employeeArpu) {
		this.employeeArpu = employeeArpu;
	}

	public Integer getWritefeeCount() {
		return writefeeCount;
	}

	public void setWritefeeCount(Integer writefeeCount) {
		this.writefeeCount = writefeeCount;
	}

	public Long getWritefeeSum() {
		return writefeeSum;
	}

	public void setWritefeeSum(Long writefeeSum) {
		this.writefeeSum = writefeeSum;
	}

	public Long getBossFeeSum() {
		return bossFeeSum;
	}

	public void setBossFeeSum(Long bossFeeSum) {
		this.bossFeeSum = bossFeeSum;
	}

	public Long getLatencyFeeSum() {
		return latencyFeeSum;
	}

	public void setLatencyFeeSum(Long latencyFeeSum) {
		this.latencyFeeSum = latencyFeeSum;
	}

	public String getVpmnId() {
		return vpmnId;
	}

	public void setVpmnId(String vpmnId) {
		this.vpmnId = vpmnId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getScpCode() {
		return scpCode;
	}

	public void setScpCode(String scpCode) {
		this.scpCode = scpCode;
	}

	public String getVpmnType() {
		return vpmnType;
	}

	public void setVpmnType(String vpmnType) {
		this.vpmnType = vpmnType;
	}

	public String getSubState() {
		return subState;
	}

	public void setSubState(String subState) {
		this.subState = subState;
	}

	public String getFuncTlags() {
		return funcTlags;
	}

	public void setFuncTlags(String funcTlags) {
		this.funcTlags = funcTlags;
	}

	public Integer getInterFeeindex() {
		return interFeeindex;
	}

	public void setInterFeeindex(Integer interFeeindex) {
		this.interFeeindex = interFeeindex;
	}

	public Integer getOutFeeindex() {
		return outFeeindex;
	}

	public void setOutFeeindex(Integer outFeeindex) {
		this.outFeeindex = outFeeindex;
	}

	public Integer getOutgrpFeeindex() {
		return outgrpFeeindex;
	}

	public void setOutgrpFeeindex(Integer outgrpFeeindex) {
		this.outgrpFeeindex = outgrpFeeindex;
	}

	public Integer getSubgrpFeeindex() {
		return subgrpFeeindex;
	}

	public void setSubgrpFeeindex(Integer subgrpFeeindex) {
		this.subgrpFeeindex = subgrpFeeindex;
	}

	public String getPreIpNo() {
		return preIpNo;
	}

	public void setPreIpNo(String preIpNo) {
		this.preIpNo = preIpNo;
	}

	public Short getPreIpDisc() {
		return preIpDisc;
	}

	public void setPreIpDisc(Short preIpDisc) {
		this.preIpDisc = preIpDisc;
	}

	public Short getOthorIpDisc() {
		return othorIpDisc;
	}

	public void setOthorIpDisc(Short othorIpDisc) {
		this.othorIpDisc = othorIpDisc;
	}

	public String getTransNo() {
		return transNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public Integer getMaxCloseNum() {
		return maxCloseNum;
	}

	public void setMaxCloseNum(Integer maxCloseNum) {
		this.maxCloseNum = maxCloseNum;
	}

	public Integer getMaxNumClose() {
		return maxNumClose;
	}

	public void setMaxNumClose(Integer maxNumClose) {
		this.maxNumClose = maxNumClose;
	}

	public Short getPersonMaxclose() {
		return personMaxclose;
	}

	public void setPersonMaxclose(Short personMaxclose) {
		this.personMaxclose = personMaxclose;
	}

	public Integer getMaxOutnum() {
		return maxOutnum;
	}

	public void setMaxOutnum(Integer maxOutnum) {
		this.maxOutnum = maxOutnum;
	}

	public Integer getMaxUsers() {
		return maxUsers;
	}

	public void setMaxUsers(Integer maxUsers) {
		this.maxUsers = maxUsers;
	}

	public Date getPkgStartDate() {
		return pkgStartDate;
	}

	public void setPkgStartDate(Date pkgStartDate) {
		this.pkgStartDate = pkgStartDate;
	}

	public Short getPkgType() {
		return pkgType;
	}

	public void setPkgType(Short pkgType) {
		this.pkgType = pkgType;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Long getLimitFee() {
		return limitFee;
	}

	public void setLimitFee(Long limitFee) {
		this.limitFee = limitFee;
	}

	public Short getZoneMax() {
		return zoneMax;
	}

	public void setZoneMax(Short zoneMax) {
		this.zoneMax = zoneMax;
	}

	public Integer getZonefreeNum() {
		return zonefreeNum;
	}

	public void setZonefreeNum(Integer zonefreeNum) {
		this.zonefreeNum = zonefreeNum;
	}

	public Long getZoneFee() {
		return zoneFee;
	}

	public void setZoneFee(Long zoneFee) {
		this.zoneFee = zoneFee;
	}

	public Integer getMtMaxnum() {
		return mtMaxnum;
	}

	public void setMtMaxnum(Integer mtMaxnum) {
		this.mtMaxnum = mtMaxnum;
	}

	public Short getAipId() {
		return aipId;
	}

	public void setAipId(Short aipId) {
		this.aipId = aipId;
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

	public String getClientInfo1() {
		return clientInfo1;
	}

	public void setClientInfo1(String clientInfo1) {
		this.clientInfo1 = clientInfo1;
	}

	public String getClientInfo2() {
		return clientInfo2;
	}

	public void setClientInfo2(String clientInfo2) {
		this.clientInfo2 = clientInfo2;
	}

	public String getClientInfo3() {
		return clientInfo3;
	}

	public void setClientInfo3(String clientInfo3) {
		this.clientInfo3 = clientInfo3;
	}

	public String getClientInfo4() {
		return clientInfo4;
	}

	public void setClientInfo4(String clientInfo4) {
		this.clientInfo4 = clientInfo4;
	}

	public String getClientInfo5() {
		return clientInfo5;
	}

	public void setClientInfo5(String clientInfo5) {
		this.clientInfo5 = clientInfo5;
	}

	public String getClientInfo6() {
		return clientInfo6;
	}

	public void setClientInfo6(String clientInfo6) {
		this.clientInfo6 = clientInfo6;
	}

	public String getClientInfo7() {
		return clientInfo7;
	}

	public void setClientInfo7(String clientInfo7) {
		this.clientInfo7 = clientInfo7;
	}

	public String getClientTag1() {
		return clientTag1;
	}

	public void setClientTag1(String clientTag1) {
		this.clientTag1 = clientTag1;
	}

	public String getClientTag2() {
		return clientTag2;
	}

	public void setClientTag2(String clientTag2) {
		this.clientTag2 = clientTag2;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}