package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TfBTradeSpPo implements Serializable {
    private Long tradeId;

    private Short acceptMonth;

    private Integer productId;

    private Integer packageId;

    private String modifyTag;

    private Integer spServiceId;

    private Long userId;

    private String serialNumber;

    private String partyId;

    private String spId;

    private String spProductId;

    private Date firstBuyTime;

    private String paySerialNumber;

    private Date startDate;

    private Date endDate;

    private Date updateTime;

    private String remark;

    private Long payUserId;

    private Long itemId;

    private Integer discntInstance;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getModifyTag() {
        return modifyTag;
    }

    public void setModifyTag(String modifyTag) {
        this.modifyTag = modifyTag == null ? null : modifyTag.trim();
    }

    public Integer getSpServiceId() {
        return spServiceId;
    }

    public void setSpServiceId(Integer spServiceId) {
        this.spServiceId = spServiceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId == null ? null : spId.trim();
    }

    public String getSpProductId() {
        return spProductId;
    }

    public void setSpProductId(String spProductId) {
        this.spProductId = spProductId == null ? null : spProductId.trim();
    }

    public Date getFirstBuyTime() {
        return firstBuyTime;
    }

    public void setFirstBuyTime(Date firstBuyTime) {
        this.firstBuyTime = firstBuyTime;
    }

    public String getPaySerialNumber() {
        return paySerialNumber;
    }

    public void setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber == null ? null : paySerialNumber.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(Long payUserId) {
        this.payUserId = payUserId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getDiscntInstance() {
        return discntInstance;
    }

    public void setDiscntInstance(Integer discntInstance) {
        this.discntInstance = discntInstance;
    }
}