package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TdBParty implements Serializable {
    private String partyId;

    private String partyName;

    private String partyType;

    private String partyPasswd;

    private String partyCorpCode;

    private String partyLvl;

    private String partyStatus;

    private String partyAreaId;

    private String partyWebSite;

    private String partyCont;

    private String partyContAddr;

    private String partySrvPhone;

    private String partyContPhone;

    private String partyContMobphone;

    private String partyFaxnum;

    private String partyAddinfo;

    private String partyBank;

    private String partybankAccount;

    private String isTrust;

    private String isBwl;

    private String sharedKey;

    private Date startDate;

    private Date endDate;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName == null ? null : partyName.trim();
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType == null ? null : partyType.trim();
    }

    public String getPartyPasswd() {
        return partyPasswd;
    }

    public void setPartyPasswd(String partyPasswd) {
        this.partyPasswd = partyPasswd == null ? null : partyPasswd.trim();
    }

    public String getPartyCorpCode() {
        return partyCorpCode;
    }

    public void setPartyCorpCode(String partyCorpCode) {
        this.partyCorpCode = partyCorpCode == null ? null : partyCorpCode.trim();
    }

    public String getPartyLvl() {
        return partyLvl;
    }

    public void setPartyLvl(String partyLvl) {
        this.partyLvl = partyLvl == null ? null : partyLvl.trim();
    }

    public String getPartyStatus() {
        return partyStatus;
    }

    public void setPartyStatus(String partyStatus) {
        this.partyStatus = partyStatus == null ? null : partyStatus.trim();
    }

    public String getPartyAreaId() {
        return partyAreaId;
    }

    public void setPartyAreaId(String partyAreaId) {
        this.partyAreaId = partyAreaId == null ? null : partyAreaId.trim();
    }

    public String getPartyWebSite() {
        return partyWebSite;
    }

    public void setPartyWebSite(String partyWebSite) {
        this.partyWebSite = partyWebSite == null ? null : partyWebSite.trim();
    }

    public String getPartyCont() {
        return partyCont;
    }

    public void setPartyCont(String partyCont) {
        this.partyCont = partyCont == null ? null : partyCont.trim();
    }

    public String getPartyContAddr() {
        return partyContAddr;
    }

    public void setPartyContAddr(String partyContAddr) {
        this.partyContAddr = partyContAddr == null ? null : partyContAddr.trim();
    }

    public String getPartySrvPhone() {
        return partySrvPhone;
    }

    public void setPartySrvPhone(String partySrvPhone) {
        this.partySrvPhone = partySrvPhone == null ? null : partySrvPhone.trim();
    }

    public String getPartyContPhone() {
        return partyContPhone;
    }

    public void setPartyContPhone(String partyContPhone) {
        this.partyContPhone = partyContPhone == null ? null : partyContPhone.trim();
    }

    public String getPartyContMobphone() {
        return partyContMobphone;
    }

    public void setPartyContMobphone(String partyContMobphone) {
        this.partyContMobphone = partyContMobphone == null ? null : partyContMobphone.trim();
    }

    public String getPartyFaxnum() {
        return partyFaxnum;
    }

    public void setPartyFaxnum(String partyFaxnum) {
        this.partyFaxnum = partyFaxnum == null ? null : partyFaxnum.trim();
    }

    public String getPartyAddinfo() {
        return partyAddinfo;
    }

    public void setPartyAddinfo(String partyAddinfo) {
        this.partyAddinfo = partyAddinfo == null ? null : partyAddinfo.trim();
    }

    public String getPartyBank() {
        return partyBank;
    }

    public void setPartyBank(String partyBank) {
        this.partyBank = partyBank == null ? null : partyBank.trim();
    }

    public String getPartybankAccount() {
        return partybankAccount;
    }

    public void setPartybankAccount(String partybankAccount) {
        this.partybankAccount = partybankAccount == null ? null : partybankAccount.trim();
    }

    public String getIsTrust() {
        return isTrust;
    }

    public void setIsTrust(String isTrust) {
        this.isTrust = isTrust == null ? null : isTrust.trim();
    }

    public String getIsBwl() {
        return isBwl;
    }

    public void setIsBwl(String isBwl) {
        this.isBwl = isBwl == null ? null : isBwl.trim();
    }

    public String getSharedKey() {
        return sharedKey;
    }

    public void setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey == null ? null : sharedKey.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}