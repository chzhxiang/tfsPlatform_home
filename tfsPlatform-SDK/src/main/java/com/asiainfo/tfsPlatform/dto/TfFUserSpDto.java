package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

public class TfFUserSpDto implements Serializable {
    private Long userId;

    private String spId;

    private String spProductId;

    private Date startDate;

    private Short partitionId;

    private String serialNumber;

    private Integer productId;

    private Integer packageId;

    private String partyId;

    private Integer spServiceId;

    private Date firstBuyTime;

    private String paySerialNumber;

    private Long payUserId;

    private Long itemId;

    private Date endDate;

    private Date updateTime;

    private Integer discntInstance;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Short partitionId) {
        this.partitionId = partitionId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
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

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public Integer getSpServiceId() {
        return spServiceId;
    }

    public void setSpServiceId(Integer spServiceId) {
        this.spServiceId = spServiceId;
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

    public Integer getDiscntInstance() {
        return discntInstance;
    }

    public void setDiscntInstance(Integer discntInstance) {
        this.discntInstance = discntInstance;
    }
}