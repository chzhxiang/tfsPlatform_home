package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;
import java.util.Date;

public class TfFUserDiscntDto implements Serializable {
    private Long userId;

    private Long userIdA;

    private Integer discntCode;

    private Date startDate;

    private Short partitionId;

    private Integer productId;

    private Integer packageId;

    private String specTag;

    private String relationTypeCode;

    private Date endDate;

    private Integer discntInstance;

    private Long itemId;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserIdA() {
        return userIdA;
    }

    public void setUserIdA(Long userIdA) {
        this.userIdA = userIdA;
    }

    public Integer getDiscntCode() {
        return discntCode;
    }

    public void setDiscntCode(Integer discntCode) {
        this.discntCode = discntCode;
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

    public String getSpecTag() {
        return specTag;
    }

    public void setSpecTag(String specTag) {
        this.specTag = specTag == null ? null : specTag.trim();
    }

    public String getRelationTypeCode() {
        return relationTypeCode;
    }

    public void setRelationTypeCode(String relationTypeCode) {
        this.relationTypeCode = relationTypeCode == null ? null : relationTypeCode.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDiscntInstance() {
        return discntInstance;
    }

    public void setDiscntInstance(Integer discntInstance) {
        this.discntInstance = discntInstance;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}