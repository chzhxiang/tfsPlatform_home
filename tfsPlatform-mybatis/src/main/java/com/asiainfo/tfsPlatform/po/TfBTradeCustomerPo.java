package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TfBTradeCustomerPo implements Serializable {
    private Long tradeId;

    private Short acceptMonth;

    private Long custId;

    private Short partitionId;

    private String custName;

    private String custType;

    private String custState;

    private String psptTypeCode;

    private String psptId;

    private Short openLimit;

    private String eparchyCode;

    private String cityCode;

    private String custPasswd;

    private Long scoreValue;

    private Integer creditClass;

    private Long basicCreditValue;

    private Long creditValue;

    private Long auditNum;

    private String simpleSpell;

    private String developDepartId;

    private String developStaffId;

    private String inDepartId;

    private String inStaffId;

    private Date inDate;

    private String removeTag;

    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date removeDate;

    private String removeStaffId;

    private String removeChange;

    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date updateTime;

    private String updateStaffId;

    private String updateDepartId;

    private String remark;

    private Integer rsrvNum1;

    private Integer rsrvNum2;

    private Integer rsrvNum3;

    private Long rsrvNum4;

    private Long rsrvNum5;

    private String rsrvStr1;

    private String rsrvStr2;

    private String rsrvStr3;

    private String rsrvStr4;

    private String rsrvStr5;

    private String rsrvStr6;

    private String rsrvStr7;

    private String rsrvStr8;

    private String rsrvStr9;

    private String rsrvStr10;

    private Date rsrvDate1;

    private Date rsrvDate2;

    private Date rsrvDate3;

    private Date rsrvDate4;

    private Date rsrvDate5;

    private String rsrvTag1;

    private String rsrvTag2;

    private String rsrvTag3;

    private String rsrvTag4;

    private String rsrvTag5;

    private String custClassType;

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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState == null ? null : custState.trim();
    }

    public String getPsptTypeCode() {
        return psptTypeCode;
    }

    public void setPsptTypeCode(String psptTypeCode) {
        this.psptTypeCode = psptTypeCode == null ? null : psptTypeCode.trim();
    }

    public String getPsptId() {
        return psptId;
    }

    public void setPsptId(String psptId) {
        this.psptId = psptId == null ? null : psptId.trim();
    }

    public Short getOpenLimit() {
        return openLimit;
    }

    public void setOpenLimit(Short openLimit) {
        this.openLimit = openLimit;
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

    public String getCustPasswd() {
        return custPasswd;
    }

    public void setCustPasswd(String custPasswd) {
        this.custPasswd = custPasswd == null ? null : custPasswd.trim();
    }

    public Long getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(Long scoreValue) {
        this.scoreValue = scoreValue;
    }

    public Integer getCreditClass() {
        return creditClass;
    }

    public void setCreditClass(Integer creditClass) {
        this.creditClass = creditClass;
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

    public Long getAuditNum() {
        return auditNum;
    }

    public void setAuditNum(Long auditNum) {
        this.auditNum = auditNum;
    }

    public String getSimpleSpell() {
        return simpleSpell;
    }

    public void setSimpleSpell(String simpleSpell) {
        this.simpleSpell = simpleSpell == null ? null : simpleSpell.trim();
    }

    public String getDevelopDepartId() {
        return developDepartId;
    }

    public void setDevelopDepartId(String developDepartId) {
        this.developDepartId = developDepartId == null ? null : developDepartId.trim();
    }

    public String getDevelopStaffId() {
        return developStaffId;
    }

    public void setDevelopStaffId(String developStaffId) {
        this.developStaffId = developStaffId == null ? null : developStaffId.trim();
    }

    public String getInDepartId() {
        return inDepartId;
    }

    public void setInDepartId(String inDepartId) {
        this.inDepartId = inDepartId == null ? null : inDepartId.trim();
    }

    public String getInStaffId() {
        return inStaffId;
    }

    public void setInStaffId(String inStaffId) {
        this.inStaffId = inStaffId == null ? null : inStaffId.trim();
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
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

    public Long getRsrvNum4() {
        return rsrvNum4;
    }

    public void setRsrvNum4(Long rsrvNum4) {
        this.rsrvNum4 = rsrvNum4;
    }

    public Long getRsrvNum5() {
        return rsrvNum5;
    }

    public void setRsrvNum5(Long rsrvNum5) {
        this.rsrvNum5 = rsrvNum5;
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

    public String getRsrvStr9() {
        return rsrvStr9;
    }

    public void setRsrvStr9(String rsrvStr9) {
        this.rsrvStr9 = rsrvStr9 == null ? null : rsrvStr9.trim();
    }

    public String getRsrvStr10() {
        return rsrvStr10;
    }

    public void setRsrvStr10(String rsrvStr10) {
        this.rsrvStr10 = rsrvStr10 == null ? null : rsrvStr10.trim();
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

    public Date getRsrvDate4() {
        return rsrvDate4;
    }

    public void setRsrvDate4(Date rsrvDate4) {
        this.rsrvDate4 = rsrvDate4;
    }

    public Date getRsrvDate5() {
        return rsrvDate5;
    }

    public void setRsrvDate5(Date rsrvDate5) {
        this.rsrvDate5 = rsrvDate5;
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

    public String getRsrvTag4() {
        return rsrvTag4;
    }

    public void setRsrvTag4(String rsrvTag4) {
        this.rsrvTag4 = rsrvTag4 == null ? null : rsrvTag4.trim();
    }

    public String getRsrvTag5() {
        return rsrvTag5;
    }

    public void setRsrvTag5(String rsrvTag5) {
        this.rsrvTag5 = rsrvTag5 == null ? null : rsrvTag5.trim();
    }

    public String getCustClassType() {
        return custClassType;
    }

    public void setCustClassType(String custClassType) {
        this.custClassType = custClassType == null ? null : custClassType.trim();
    }
}