package com.asiainfo.tfsPlatform.po;

import java.io.Serializable;
import java.util.Date;

public class TfBTradeProductPo implements Serializable {
    private Long tradeId;

    private Short acceptMonth;

    private Integer productId;

    private Date startDate;

    private Long userIdA;

    private Long userId;

    private String productMode;

    private String brandCode;

    private Long itemId;

    private String modifyTag;

    private Date endDate;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getUserIdA() {
        return userIdA;
    }

    public void setUserIdA(Long userIdA) {
        this.userIdA = userIdA;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProductMode() {
        return productMode;
    }

    public void setProductMode(String productMode) {
        this.productMode = productMode == null ? null : productMode.trim();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getModifyTag() {
        return modifyTag;
    }

    public void setModifyTag(String modifyTag) {
        this.modifyTag = modifyTag == null ? null : modifyTag.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}