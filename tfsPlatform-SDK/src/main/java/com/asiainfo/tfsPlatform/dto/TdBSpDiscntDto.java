package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;

public class TdBSpDiscntDto implements Serializable {
    private String discntCode;

    private String discntName;

    private Integer spProductId;

    private String productCode;

    private String productName;

    private String serviceType;

    private String sercieTypeName;

    private String partyCorpCode;

    private String partyName;

    private String accessNo;

    private String state;

    private String areaCode;

    private String startDate;

    private String endDate;

    private String billingMode;

    private static final long serialVersionUID = 1L;

    public String getDiscntCode() {
        return discntCode;
    }

    public void setDiscntCode(String discntCode) {
        this.discntCode = discntCode == null ? null : discntCode.trim();
    }

    public String getDiscntName() {
        return discntName;
    }

    public void setDiscntName(String discntName) {
        this.discntName = discntName == null ? null : discntName.trim();
    }

    public Integer getSpProductId() {
        return spProductId;
    }

    public void setSpProductId(Integer spProductId) {
        this.spProductId = spProductId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getSercieTypeName() {
        return sercieTypeName;
    }

    public void setSercieTypeName(String sercieTypeName) {
        this.sercieTypeName = sercieTypeName == null ? null : sercieTypeName.trim();
    }

    public String getPartyCorpCode() {
        return partyCorpCode;
    }

    public void setPartyCorpCode(String partyCorpCode) {
        this.partyCorpCode = partyCorpCode == null ? null : partyCorpCode.trim();
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName == null ? null : partyName.trim();
    }

    public String getAccessNo() {
        return accessNo;
    }

    public void setAccessNo(String accessNo) {
        this.accessNo = accessNo == null ? null : accessNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode == null ? null : billingMode.trim();
    }
}