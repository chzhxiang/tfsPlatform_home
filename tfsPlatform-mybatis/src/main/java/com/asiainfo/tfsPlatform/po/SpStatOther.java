package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SpStatOther implements Serializable {
    private String month;

    private String day;

    private String svcCode;

    private String userInfo;

    private String partyId;

    private Long spServiceId;

    private Long callNum;

    private BigDecimal monthFee;

    private BigDecimal infoFee;

    private BigDecimal rate1;

    private BigDecimal rate2;

    private Date dealDate;

    private static final long serialVersionUID = 1L;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getSvcCode() {
        return svcCode;
    }

    public void setSvcCode(String svcCode) {
        this.svcCode = svcCode == null ? null : svcCode.trim();
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public Long getSpServiceId() {
        return spServiceId;
    }

    public void setSpServiceId(Long spServiceId) {
        this.spServiceId = spServiceId;
    }

    public Long getCallNum() {
        return callNum;
    }

    public void setCallNum(Long callNum) {
        this.callNum = callNum;
    }

    public BigDecimal getMonthFee() {
        return monthFee;
    }

    public void setMonthFee(BigDecimal monthFee) {
        this.monthFee = monthFee;
    }

    public BigDecimal getInfoFee() {
        return infoFee;
    }

    public void setInfoFee(BigDecimal infoFee) {
        this.infoFee = infoFee;
    }

    public BigDecimal getRate1() {
        return rate1;
    }

    public void setRate1(BigDecimal rate1) {
        this.rate1 = rate1;
    }

    public BigDecimal getRate2() {
        return rate2;
    }

    public void setRate2(BigDecimal rate2) {
        this.rate2 = rate2;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }
}