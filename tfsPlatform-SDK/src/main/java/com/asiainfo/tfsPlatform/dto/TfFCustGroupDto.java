package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TfFCustGroupDto implements Serializable {
    private Long custId;

    private Short partitionId;

    private String groupId;

    private String custName;

    private String groupType;

    private String classId;

    private String classId2;

    private String lastClassId;

    private Date classChangeDate;

    private String custClassType;

    private String groupAttr;

    private String groupStatus;

    private String groupAddr;

    private String provinceCode;

    private String eparchyCode;

    private String cityCode;

    private String superGroupId;

    private String pnationalGroupId;

    private String pnationalGroupName;

    private String mpGroupCustCode;

    private String unifyPayCode;

    private String orgStructCode;

    private String custManagerId;

    private String custManagerAppr;

    private Date assignDate;

    private String assignStaffId;

    private String callingTypeCode;

    private String subCallingTypeCode;

    private String callingAreaCode;

    private String callType;

    private String acceptChannel;

    private String agreement;

    private String busiType;

    private String groupContactPhone;

    private String enterpriseTypeCode;

    private String enterpriseSizeCode;

    private String enterpriseScope;

    private String juristicTypeCode;

    private Long juristicCustId;

    private String juristicName;

    private String busiLicenceType;

    private String busiLicenceNo;

    private Date busiLicenceValidDate;

    private String groupMemo;

    private String bankAcct;

    private String bankName;

    private BigDecimal regMoney;

    private Date regDate;

    private String custAim;

    private String scope;

    private String mainBusi;

    private String mainTrade;

    private String empLsave;

    private Long latencyFeeSum;

    private BigDecimal yearGain;

    private BigDecimal turnover;

    private String consume;

    private BigDecimal commBudget;

    private BigDecimal gtelBudget;

    private BigDecimal ltelBudget;

    private String groupAdversary;

    private String vpmnGroupId;

    private Long vpmnNum;

    private Long userNum;

    private Long empNumLocal;

    private Long empNumChina;

    private Long empNumAll;

    private Long telecomNumGh;

    private Long telecomNumXlt;

    private Long mobileNumChinago;

    private Long mobileNumGlobal;

    private Long mobileNumMzone;

    private Long mobileNumLocal;

    private Long unicomNumG;

    private Long unicomNumC;

    private Long unicomNumGc;

    private Long productNumLocal;

    private Long productNumOther;

    private Long productNumUse;

    private Long employeeArpu;

    private Long netrentPayout;

    private Long mobilePayout;

    private Long unicomPayout;

    private Long telecomPayoutXlt;

    private String groupPayMode;

    private String payforWayCode;

    private Integer writefeeCount;

    private Long writefeeSum;

    private Long userNumFullfree;

    private Long userNumWriteoff;

    private Long bossFeeSum;

    private String doyenStaffId;

    private String newtradeComment;

    private String likeMobileTrade;

    private String likeDiscntMode;

    private BigDecimal financeEarning;

    private String earningOrder;

    private String callingPolicyForce;

    private String subclassId;

    private String website;

    private String faxNbr;

    private String email;

    private String postCode;

    private BigDecimal groupValidScore;

    private BigDecimal groupSumScore;

    private String groupMgrSn;

    private Long groupMgrUserId;

    private String groupMgrCustName;

    private String baseAccessNo;

    private String baseAccessNoKind;

    private String custServNbr;

    private String ifShortPin;

    private String auditState;

    private Date auditDate;

    private String auditStaffId;

    private String auditNote;

    private String areaOffice;

    private String belongTeamId;

    private Date turnInnetDate;

    private String belongTeamIdB;

    private String callingTypeCodeDetail;

    private Date serverAssignDate;

    private String serverAssignStaffId;

    private String turnInnetStaffId;

    private String takePictureTag;

    private String custManagerIdB;

    private Date classId2EndDate;

    private Date classId2StartDate;

    private String ifRelationCust;

    private Date class2ChangeDate;

    private String lastClassId2;

    private String manageCode;

    private Short financeInstance;

    private Short growPotential;

    private Integer creditDegree;

    private String international;

    private String fileCode;

    private String removeFlag;

    private String removeMethod;

    private String removeReasonCode;

    private String removeTag;

    private Date removeDate;

    private String removeStaffId;

    private String removeChange;

    private Date updateTime;

    private String updateStaffId;

    private String updateDepartId;

    private String remark;

    private Integer rsrvNum1;

    private Integer rsrvNum2;

    private Integer rsrvNum3;

    private String rsrvStr1;

    private String rsrvStr2;

    private String rsrvStr3;

    private String rsrvStr4;

    private String rsrvStr5;

    private String rsrvStr6;

    private String rsrvStr7;

    private String rsrvStr8;

    private Date rsrvDate1;

    private Date rsrvDate2;

    private Date rsrvDate3;

    private String rsrvTag1;

    private String rsrvTag2;

    private String rsrvTag3;

    private String licenceAuditPerson;

    private String licenceAuditFileId;

    private String juristicPsptId;

    private String juristicPsptType;

    private String telDecisionType;

    private String busiTaxId;

    private static final long serialVersionUID = 1L;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Short partitionId) {
        this.partitionId = partitionId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getClassId2() {
        return classId2;
    }

    public void setClassId2(String classId2) {
        this.classId2 = classId2 == null ? null : classId2.trim();
    }

    public String getLastClassId() {
        return lastClassId;
    }

    public void setLastClassId(String lastClassId) {
        this.lastClassId = lastClassId == null ? null : lastClassId.trim();
    }

    public Date getClassChangeDate() {
        return classChangeDate;
    }

    public void setClassChangeDate(Date classChangeDate) {
        this.classChangeDate = classChangeDate;
    }

    public String getCustClassType() {
        return custClassType;
    }

    public void setCustClassType(String custClassType) {
        this.custClassType = custClassType == null ? null : custClassType.trim();
    }

    public String getGroupAttr() {
        return groupAttr;
    }

    public void setGroupAttr(String groupAttr) {
        this.groupAttr = groupAttr == null ? null : groupAttr.trim();
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus == null ? null : groupStatus.trim();
    }

    public String getGroupAddr() {
        return groupAddr;
    }

    public void setGroupAddr(String groupAddr) {
        this.groupAddr = groupAddr == null ? null : groupAddr.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getEparchyCode() {
        return eparchyCode;
    }

    public void setEparchyCode(String eparchyCode) {
        this.eparchyCode = eparchyCode == null ? null : eparchyCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getSuperGroupId() {
        return superGroupId;
    }

    public void setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId == null ? null : superGroupId.trim();
    }

    public String getPnationalGroupId() {
        return pnationalGroupId;
    }

    public void setPnationalGroupId(String pnationalGroupId) {
        this.pnationalGroupId = pnationalGroupId == null ? null : pnationalGroupId.trim();
    }

    public String getPnationalGroupName() {
        return pnationalGroupName;
    }

    public void setPnationalGroupName(String pnationalGroupName) {
        this.pnationalGroupName = pnationalGroupName == null ? null : pnationalGroupName.trim();
    }

    public String getMpGroupCustCode() {
        return mpGroupCustCode;
    }

    public void setMpGroupCustCode(String mpGroupCustCode) {
        this.mpGroupCustCode = mpGroupCustCode == null ? null : mpGroupCustCode.trim();
    }

    public String getUnifyPayCode() {
        return unifyPayCode;
    }

    public void setUnifyPayCode(String unifyPayCode) {
        this.unifyPayCode = unifyPayCode == null ? null : unifyPayCode.trim();
    }

    public String getOrgStructCode() {
        return orgStructCode;
    }

    public void setOrgStructCode(String orgStructCode) {
        this.orgStructCode = orgStructCode == null ? null : orgStructCode.trim();
    }

    public String getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(String custManagerId) {
        this.custManagerId = custManagerId == null ? null : custManagerId.trim();
    }

    public String getCustManagerAppr() {
        return custManagerAppr;
    }

    public void setCustManagerAppr(String custManagerAppr) {
        this.custManagerAppr = custManagerAppr == null ? null : custManagerAppr.trim();
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public String getAssignStaffId() {
        return assignStaffId;
    }

    public void setAssignStaffId(String assignStaffId) {
        this.assignStaffId = assignStaffId == null ? null : assignStaffId.trim();
    }

    public String getCallingTypeCode() {
        return callingTypeCode;
    }

    public void setCallingTypeCode(String callingTypeCode) {
        this.callingTypeCode = callingTypeCode == null ? null : callingTypeCode.trim();
    }

    public String getSubCallingTypeCode() {
        return subCallingTypeCode;
    }

    public void setSubCallingTypeCode(String subCallingTypeCode) {
        this.subCallingTypeCode = subCallingTypeCode == null ? null : subCallingTypeCode.trim();
    }

    public String getCallingAreaCode() {
        return callingAreaCode;
    }

    public void setCallingAreaCode(String callingAreaCode) {
        this.callingAreaCode = callingAreaCode == null ? null : callingAreaCode.trim();
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public String getAcceptChannel() {
        return acceptChannel;
    }

    public void setAcceptChannel(String acceptChannel) {
        this.acceptChannel = acceptChannel == null ? null : acceptChannel.trim();
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement == null ? null : agreement.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getGroupContactPhone() {
        return groupContactPhone;
    }

    public void setGroupContactPhone(String groupContactPhone) {
        this.groupContactPhone = groupContactPhone == null ? null : groupContactPhone.trim();
    }

    public String getEnterpriseTypeCode() {
        return enterpriseTypeCode;
    }

    public void setEnterpriseTypeCode(String enterpriseTypeCode) {
        this.enterpriseTypeCode = enterpriseTypeCode == null ? null : enterpriseTypeCode.trim();
    }

    public String getEnterpriseSizeCode() {
        return enterpriseSizeCode;
    }

    public void setEnterpriseSizeCode(String enterpriseSizeCode) {
        this.enterpriseSizeCode = enterpriseSizeCode == null ? null : enterpriseSizeCode.trim();
    }

    public String getEnterpriseScope() {
        return enterpriseScope;
    }

    public void setEnterpriseScope(String enterpriseScope) {
        this.enterpriseScope = enterpriseScope == null ? null : enterpriseScope.trim();
    }

    public String getJuristicTypeCode() {
        return juristicTypeCode;
    }

    public void setJuristicTypeCode(String juristicTypeCode) {
        this.juristicTypeCode = juristicTypeCode == null ? null : juristicTypeCode.trim();
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
        this.juristicName = juristicName == null ? null : juristicName.trim();
    }

    public String getBusiLicenceType() {
        return busiLicenceType;
    }

    public void setBusiLicenceType(String busiLicenceType) {
        this.busiLicenceType = busiLicenceType == null ? null : busiLicenceType.trim();
    }

    public String getBusiLicenceNo() {
        return busiLicenceNo;
    }

    public void setBusiLicenceNo(String busiLicenceNo) {
        this.busiLicenceNo = busiLicenceNo == null ? null : busiLicenceNo.trim();
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
        this.groupMemo = groupMemo == null ? null : groupMemo.trim();
    }

    public String getBankAcct() {
        return bankAcct;
    }

    public void setBankAcct(String bankAcct) {
        this.bankAcct = bankAcct == null ? null : bankAcct.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public BigDecimal getRegMoney() {
        return regMoney;
    }

    public void setRegMoney(BigDecimal regMoney) {
        this.regMoney = regMoney;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getCustAim() {
        return custAim;
    }

    public void setCustAim(String custAim) {
        this.custAim = custAim == null ? null : custAim.trim();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getMainBusi() {
        return mainBusi;
    }

    public void setMainBusi(String mainBusi) {
        this.mainBusi = mainBusi == null ? null : mainBusi.trim();
    }

    public String getMainTrade() {
        return mainTrade;
    }

    public void setMainTrade(String mainTrade) {
        this.mainTrade = mainTrade == null ? null : mainTrade.trim();
    }

    public String getEmpLsave() {
        return empLsave;
    }

    public void setEmpLsave(String empLsave) {
        this.empLsave = empLsave == null ? null : empLsave.trim();
    }

    public Long getLatencyFeeSum() {
        return latencyFeeSum;
    }

    public void setLatencyFeeSum(Long latencyFeeSum) {
        this.latencyFeeSum = latencyFeeSum;
    }

    public BigDecimal getYearGain() {
        return yearGain;
    }

    public void setYearGain(BigDecimal yearGain) {
        this.yearGain = yearGain;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public String getConsume() {
        return consume;
    }

    public void setConsume(String consume) {
        this.consume = consume == null ? null : consume.trim();
    }

    public BigDecimal getCommBudget() {
        return commBudget;
    }

    public void setCommBudget(BigDecimal commBudget) {
        this.commBudget = commBudget;
    }

    public BigDecimal getGtelBudget() {
        return gtelBudget;
    }

    public void setGtelBudget(BigDecimal gtelBudget) {
        this.gtelBudget = gtelBudget;
    }

    public BigDecimal getLtelBudget() {
        return ltelBudget;
    }

    public void setLtelBudget(BigDecimal ltelBudget) {
        this.ltelBudget = ltelBudget;
    }

    public String getGroupAdversary() {
        return groupAdversary;
    }

    public void setGroupAdversary(String groupAdversary) {
        this.groupAdversary = groupAdversary == null ? null : groupAdversary.trim();
    }

    public String getVpmnGroupId() {
        return vpmnGroupId;
    }

    public void setVpmnGroupId(String vpmnGroupId) {
        this.vpmnGroupId = vpmnGroupId == null ? null : vpmnGroupId.trim();
    }

    public Long getVpmnNum() {
        return vpmnNum;
    }

    public void setVpmnNum(Long vpmnNum) {
        this.vpmnNum = vpmnNum;
    }

    public Long getUserNum() {
        return userNum;
    }

    public void setUserNum(Long userNum) {
        this.userNum = userNum;
    }

    public Long getEmpNumLocal() {
        return empNumLocal;
    }

    public void setEmpNumLocal(Long empNumLocal) {
        this.empNumLocal = empNumLocal;
    }

    public Long getEmpNumChina() {
        return empNumChina;
    }

    public void setEmpNumChina(Long empNumChina) {
        this.empNumChina = empNumChina;
    }

    public Long getEmpNumAll() {
        return empNumAll;
    }

    public void setEmpNumAll(Long empNumAll) {
        this.empNumAll = empNumAll;
    }

    public Long getTelecomNumGh() {
        return telecomNumGh;
    }

    public void setTelecomNumGh(Long telecomNumGh) {
        this.telecomNumGh = telecomNumGh;
    }

    public Long getTelecomNumXlt() {
        return telecomNumXlt;
    }

    public void setTelecomNumXlt(Long telecomNumXlt) {
        this.telecomNumXlt = telecomNumXlt;
    }

    public Long getMobileNumChinago() {
        return mobileNumChinago;
    }

    public void setMobileNumChinago(Long mobileNumChinago) {
        this.mobileNumChinago = mobileNumChinago;
    }

    public Long getMobileNumGlobal() {
        return mobileNumGlobal;
    }

    public void setMobileNumGlobal(Long mobileNumGlobal) {
        this.mobileNumGlobal = mobileNumGlobal;
    }

    public Long getMobileNumMzone() {
        return mobileNumMzone;
    }

    public void setMobileNumMzone(Long mobileNumMzone) {
        this.mobileNumMzone = mobileNumMzone;
    }

    public Long getMobileNumLocal() {
        return mobileNumLocal;
    }

    public void setMobileNumLocal(Long mobileNumLocal) {
        this.mobileNumLocal = mobileNumLocal;
    }

    public Long getUnicomNumG() {
        return unicomNumG;
    }

    public void setUnicomNumG(Long unicomNumG) {
        this.unicomNumG = unicomNumG;
    }

    public Long getUnicomNumC() {
        return unicomNumC;
    }

    public void setUnicomNumC(Long unicomNumC) {
        this.unicomNumC = unicomNumC;
    }

    public Long getUnicomNumGc() {
        return unicomNumGc;
    }

    public void setUnicomNumGc(Long unicomNumGc) {
        this.unicomNumGc = unicomNumGc;
    }

    public Long getProductNumLocal() {
        return productNumLocal;
    }

    public void setProductNumLocal(Long productNumLocal) {
        this.productNumLocal = productNumLocal;
    }

    public Long getProductNumOther() {
        return productNumOther;
    }

    public void setProductNumOther(Long productNumOther) {
        this.productNumOther = productNumOther;
    }

    public Long getProductNumUse() {
        return productNumUse;
    }

    public void setProductNumUse(Long productNumUse) {
        this.productNumUse = productNumUse;
    }

    public Long getEmployeeArpu() {
        return employeeArpu;
    }

    public void setEmployeeArpu(Long employeeArpu) {
        this.employeeArpu = employeeArpu;
    }

    public Long getNetrentPayout() {
        return netrentPayout;
    }

    public void setNetrentPayout(Long netrentPayout) {
        this.netrentPayout = netrentPayout;
    }

    public Long getMobilePayout() {
        return mobilePayout;
    }

    public void setMobilePayout(Long mobilePayout) {
        this.mobilePayout = mobilePayout;
    }

    public Long getUnicomPayout() {
        return unicomPayout;
    }

    public void setUnicomPayout(Long unicomPayout) {
        this.unicomPayout = unicomPayout;
    }

    public Long getTelecomPayoutXlt() {
        return telecomPayoutXlt;
    }

    public void setTelecomPayoutXlt(Long telecomPayoutXlt) {
        this.telecomPayoutXlt = telecomPayoutXlt;
    }

    public String getGroupPayMode() {
        return groupPayMode;
    }

    public void setGroupPayMode(String groupPayMode) {
        this.groupPayMode = groupPayMode == null ? null : groupPayMode.trim();
    }

    public String getPayforWayCode() {
        return payforWayCode;
    }

    public void setPayforWayCode(String payforWayCode) {
        this.payforWayCode = payforWayCode == null ? null : payforWayCode.trim();
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

    public Long getUserNumFullfree() {
        return userNumFullfree;
    }

    public void setUserNumFullfree(Long userNumFullfree) {
        this.userNumFullfree = userNumFullfree;
    }

    public Long getUserNumWriteoff() {
        return userNumWriteoff;
    }

    public void setUserNumWriteoff(Long userNumWriteoff) {
        this.userNumWriteoff = userNumWriteoff;
    }

    public Long getBossFeeSum() {
        return bossFeeSum;
    }

    public void setBossFeeSum(Long bossFeeSum) {
        this.bossFeeSum = bossFeeSum;
    }

    public String getDoyenStaffId() {
        return doyenStaffId;
    }

    public void setDoyenStaffId(String doyenStaffId) {
        this.doyenStaffId = doyenStaffId == null ? null : doyenStaffId.trim();
    }

    public String getNewtradeComment() {
        return newtradeComment;
    }

    public void setNewtradeComment(String newtradeComment) {
        this.newtradeComment = newtradeComment == null ? null : newtradeComment.trim();
    }

    public String getLikeMobileTrade() {
        return likeMobileTrade;
    }

    public void setLikeMobileTrade(String likeMobileTrade) {
        this.likeMobileTrade = likeMobileTrade == null ? null : likeMobileTrade.trim();
    }

    public String getLikeDiscntMode() {
        return likeDiscntMode;
    }

    public void setLikeDiscntMode(String likeDiscntMode) {
        this.likeDiscntMode = likeDiscntMode == null ? null : likeDiscntMode.trim();
    }

    public BigDecimal getFinanceEarning() {
        return financeEarning;
    }

    public void setFinanceEarning(BigDecimal financeEarning) {
        this.financeEarning = financeEarning;
    }

    public String getEarningOrder() {
        return earningOrder;
    }

    public void setEarningOrder(String earningOrder) {
        this.earningOrder = earningOrder == null ? null : earningOrder.trim();
    }

    public String getCallingPolicyForce() {
        return callingPolicyForce;
    }

    public void setCallingPolicyForce(String callingPolicyForce) {
        this.callingPolicyForce = callingPolicyForce == null ? null : callingPolicyForce.trim();
    }

    public String getSubclassId() {
        return subclassId;
    }

    public void setSubclassId(String subclassId) {
        this.subclassId = subclassId == null ? null : subclassId.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr == null ? null : faxNbr.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public BigDecimal getGroupValidScore() {
        return groupValidScore;
    }

    public void setGroupValidScore(BigDecimal groupValidScore) {
        this.groupValidScore = groupValidScore;
    }

    public BigDecimal getGroupSumScore() {
        return groupSumScore;
    }

    public void setGroupSumScore(BigDecimal groupSumScore) {
        this.groupSumScore = groupSumScore;
    }

    public String getGroupMgrSn() {
        return groupMgrSn;
    }

    public void setGroupMgrSn(String groupMgrSn) {
        this.groupMgrSn = groupMgrSn == null ? null : groupMgrSn.trim();
    }

    public Long getGroupMgrUserId() {
        return groupMgrUserId;
    }

    public void setGroupMgrUserId(Long groupMgrUserId) {
        this.groupMgrUserId = groupMgrUserId;
    }

    public String getGroupMgrCustName() {
        return groupMgrCustName;
    }

    public void setGroupMgrCustName(String groupMgrCustName) {
        this.groupMgrCustName = groupMgrCustName == null ? null : groupMgrCustName.trim();
    }

    public String getBaseAccessNo() {
        return baseAccessNo;
    }

    public void setBaseAccessNo(String baseAccessNo) {
        this.baseAccessNo = baseAccessNo == null ? null : baseAccessNo.trim();
    }

    public String getBaseAccessNoKind() {
        return baseAccessNoKind;
    }

    public void setBaseAccessNoKind(String baseAccessNoKind) {
        this.baseAccessNoKind = baseAccessNoKind == null ? null : baseAccessNoKind.trim();
    }

    public String getCustServNbr() {
        return custServNbr;
    }

    public void setCustServNbr(String custServNbr) {
        this.custServNbr = custServNbr == null ? null : custServNbr.trim();
    }

    public String getIfShortPin() {
        return ifShortPin;
    }

    public void setIfShortPin(String ifShortPin) {
        this.ifShortPin = ifShortPin == null ? null : ifShortPin.trim();
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditStaffId() {
        return auditStaffId;
    }

    public void setAuditStaffId(String auditStaffId) {
        this.auditStaffId = auditStaffId == null ? null : auditStaffId.trim();
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote == null ? null : auditNote.trim();
    }

    public String getAreaOffice() {
        return areaOffice;
    }

    public void setAreaOffice(String areaOffice) {
        this.areaOffice = areaOffice == null ? null : areaOffice.trim();
    }

    public String getBelongTeamId() {
        return belongTeamId;
    }

    public void setBelongTeamId(String belongTeamId) {
        this.belongTeamId = belongTeamId == null ? null : belongTeamId.trim();
    }

    public Date getTurnInnetDate() {
        return turnInnetDate;
    }

    public void setTurnInnetDate(Date turnInnetDate) {
        this.turnInnetDate = turnInnetDate;
    }

    public String getBelongTeamIdB() {
        return belongTeamIdB;
    }

    public void setBelongTeamIdB(String belongTeamIdB) {
        this.belongTeamIdB = belongTeamIdB == null ? null : belongTeamIdB.trim();
    }

    public String getCallingTypeCodeDetail() {
        return callingTypeCodeDetail;
    }

    public void setCallingTypeCodeDetail(String callingTypeCodeDetail) {
        this.callingTypeCodeDetail = callingTypeCodeDetail == null ? null : callingTypeCodeDetail.trim();
    }

    public Date getServerAssignDate() {
        return serverAssignDate;
    }

    public void setServerAssignDate(Date serverAssignDate) {
        this.serverAssignDate = serverAssignDate;
    }

    public String getServerAssignStaffId() {
        return serverAssignStaffId;
    }

    public void setServerAssignStaffId(String serverAssignStaffId) {
        this.serverAssignStaffId = serverAssignStaffId == null ? null : serverAssignStaffId.trim();
    }

    public String getTurnInnetStaffId() {
        return turnInnetStaffId;
    }

    public void setTurnInnetStaffId(String turnInnetStaffId) {
        this.turnInnetStaffId = turnInnetStaffId == null ? null : turnInnetStaffId.trim();
    }

    public String getTakePictureTag() {
        return takePictureTag;
    }

    public void setTakePictureTag(String takePictureTag) {
        this.takePictureTag = takePictureTag == null ? null : takePictureTag.trim();
    }

    public String getCustManagerIdB() {
        return custManagerIdB;
    }

    public void setCustManagerIdB(String custManagerIdB) {
        this.custManagerIdB = custManagerIdB == null ? null : custManagerIdB.trim();
    }

    public Date getClassId2EndDate() {
        return classId2EndDate;
    }

    public void setClassId2EndDate(Date classId2EndDate) {
        this.classId2EndDate = classId2EndDate;
    }

    public Date getClassId2StartDate() {
        return classId2StartDate;
    }

    public void setClassId2StartDate(Date classId2StartDate) {
        this.classId2StartDate = classId2StartDate;
    }

    public String getIfRelationCust() {
        return ifRelationCust;
    }

    public void setIfRelationCust(String ifRelationCust) {
        this.ifRelationCust = ifRelationCust == null ? null : ifRelationCust.trim();
    }

    public Date getClass2ChangeDate() {
        return class2ChangeDate;
    }

    public void setClass2ChangeDate(Date class2ChangeDate) {
        this.class2ChangeDate = class2ChangeDate;
    }

    public String getLastClassId2() {
        return lastClassId2;
    }

    public void setLastClassId2(String lastClassId2) {
        this.lastClassId2 = lastClassId2 == null ? null : lastClassId2.trim();
    }

    public String getManageCode() {
        return manageCode;
    }

    public void setManageCode(String manageCode) {
        this.manageCode = manageCode == null ? null : manageCode.trim();
    }

    public Short getFinanceInstance() {
        return financeInstance;
    }

    public void setFinanceInstance(Short financeInstance) {
        this.financeInstance = financeInstance;
    }

    public Short getGrowPotential() {
        return growPotential;
    }

    public void setGrowPotential(Short growPotential) {
        this.growPotential = growPotential;
    }

    public Integer getCreditDegree() {
        return creditDegree;
    }

    public void setCreditDegree(Integer creditDegree) {
        this.creditDegree = creditDegree;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international == null ? null : international.trim();
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode == null ? null : fileCode.trim();
    }

    public String getRemoveFlag() {
        return removeFlag;
    }

    public void setRemoveFlag(String removeFlag) {
        this.removeFlag = removeFlag == null ? null : removeFlag.trim();
    }

    public String getRemoveMethod() {
        return removeMethod;
    }

    public void setRemoveMethod(String removeMethod) {
        this.removeMethod = removeMethod == null ? null : removeMethod.trim();
    }

    public String getRemoveReasonCode() {
        return removeReasonCode;
    }

    public void setRemoveReasonCode(String removeReasonCode) {
        this.removeReasonCode = removeReasonCode == null ? null : removeReasonCode.trim();
    }

    public String getRemoveTag() {
        return removeTag;
    }

    public void setRemoveTag(String removeTag) {
        this.removeTag = removeTag == null ? null : removeTag.trim();
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }

    public String getRemoveStaffId() {
        return removeStaffId;
    }

    public void setRemoveStaffId(String removeStaffId) {
        this.removeStaffId = removeStaffId == null ? null : removeStaffId.trim();
    }

    public String getRemoveChange() {
        return removeChange;
    }

    public void setRemoveChange(String removeChange) {
        this.removeChange = removeChange == null ? null : removeChange.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateStaffId() {
        return updateStaffId;
    }

    public void setUpdateStaffId(String updateStaffId) {
        this.updateStaffId = updateStaffId == null ? null : updateStaffId.trim();
    }

    public String getUpdateDepartId() {
        return updateDepartId;
    }

    public void setUpdateDepartId(String updateDepartId) {
        this.updateDepartId = updateDepartId == null ? null : updateDepartId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRsrvNum1() {
        return rsrvNum1;
    }

    public void setRsrvNum1(Integer rsrvNum1) {
        this.rsrvNum1 = rsrvNum1;
    }

    public Integer getRsrvNum2() {
        return rsrvNum2;
    }

    public void setRsrvNum2(Integer rsrvNum2) {
        this.rsrvNum2 = rsrvNum2;
    }

    public Integer getRsrvNum3() {
        return rsrvNum3;
    }

    public void setRsrvNum3(Integer rsrvNum3) {
        this.rsrvNum3 = rsrvNum3;
    }

    public String getRsrvStr1() {
        return rsrvStr1;
    }

    public void setRsrvStr1(String rsrvStr1) {
        this.rsrvStr1 = rsrvStr1 == null ? null : rsrvStr1.trim();
    }

    public String getRsrvStr2() {
        return rsrvStr2;
    }

    public void setRsrvStr2(String rsrvStr2) {
        this.rsrvStr2 = rsrvStr2 == null ? null : rsrvStr2.trim();
    }

    public String getRsrvStr3() {
        return rsrvStr3;
    }

    public void setRsrvStr3(String rsrvStr3) {
        this.rsrvStr3 = rsrvStr3 == null ? null : rsrvStr3.trim();
    }

    public String getRsrvStr4() {
        return rsrvStr4;
    }

    public void setRsrvStr4(String rsrvStr4) {
        this.rsrvStr4 = rsrvStr4 == null ? null : rsrvStr4.trim();
    }

    public String getRsrvStr5() {
        return rsrvStr5;
    }

    public void setRsrvStr5(String rsrvStr5) {
        this.rsrvStr5 = rsrvStr5 == null ? null : rsrvStr5.trim();
    }

    public String getRsrvStr6() {
        return rsrvStr6;
    }

    public void setRsrvStr6(String rsrvStr6) {
        this.rsrvStr6 = rsrvStr6 == null ? null : rsrvStr6.trim();
    }

    public String getRsrvStr7() {
        return rsrvStr7;
    }

    public void setRsrvStr7(String rsrvStr7) {
        this.rsrvStr7 = rsrvStr7 == null ? null : rsrvStr7.trim();
    }

    public String getRsrvStr8() {
        return rsrvStr8;
    }

    public void setRsrvStr8(String rsrvStr8) {
        this.rsrvStr8 = rsrvStr8 == null ? null : rsrvStr8.trim();
    }

    public Date getRsrvDate1() {
        return rsrvDate1;
    }

    public void setRsrvDate1(Date rsrvDate1) {
        this.rsrvDate1 = rsrvDate1;
    }

    public Date getRsrvDate2() {
        return rsrvDate2;
    }

    public void setRsrvDate2(Date rsrvDate2) {
        this.rsrvDate2 = rsrvDate2;
    }

    public Date getRsrvDate3() {
        return rsrvDate3;
    }

    public void setRsrvDate3(Date rsrvDate3) {
        this.rsrvDate3 = rsrvDate3;
    }

    public String getRsrvTag1() {
        return rsrvTag1;
    }

    public void setRsrvTag1(String rsrvTag1) {
        this.rsrvTag1 = rsrvTag1 == null ? null : rsrvTag1.trim();
    }

    public String getRsrvTag2() {
        return rsrvTag2;
    }

    public void setRsrvTag2(String rsrvTag2) {
        this.rsrvTag2 = rsrvTag2 == null ? null : rsrvTag2.trim();
    }

    public String getRsrvTag3() {
        return rsrvTag3;
    }

    public void setRsrvTag3(String rsrvTag3) {
        this.rsrvTag3 = rsrvTag3 == null ? null : rsrvTag3.trim();
    }

    public String getLicenceAuditPerson() {
        return licenceAuditPerson;
    }

    public void setLicenceAuditPerson(String licenceAuditPerson) {
        this.licenceAuditPerson = licenceAuditPerson == null ? null : licenceAuditPerson.trim();
    }

    public String getLicenceAuditFileId() {
        return licenceAuditFileId;
    }

    public void setLicenceAuditFileId(String licenceAuditFileId) {
        this.licenceAuditFileId = licenceAuditFileId == null ? null : licenceAuditFileId.trim();
    }

    public String getJuristicPsptId() {
        return juristicPsptId;
    }

    public void setJuristicPsptId(String juristicPsptId) {
        this.juristicPsptId = juristicPsptId == null ? null : juristicPsptId.trim();
    }

    public String getJuristicPsptType() {
        return juristicPsptType;
    }

    public void setJuristicPsptType(String juristicPsptType) {
        this.juristicPsptType = juristicPsptType == null ? null : juristicPsptType.trim();
    }

    public String getTelDecisionType() {
        return telDecisionType;
    }

    public void setTelDecisionType(String telDecisionType) {
        this.telDecisionType = telDecisionType == null ? null : telDecisionType.trim();
    }

    public String getBusiTaxId() {
        return busiTaxId;
    }

    public void setBusiTaxId(String busiTaxId) {
        this.busiTaxId = busiTaxId == null ? null : busiTaxId.trim();
    }
}