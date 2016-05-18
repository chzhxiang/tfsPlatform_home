package com.asiainfo.tfsPlatform.dto;

import java.io.Serializable;

public class BillUser1Dto implements Serializable {
    private Long userId;

    private Integer billId;

    private Long value;

    private Long discntvalue;

    private Long adjustbefore;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getDiscntvalue() {
        return discntvalue;
    }

    public void setDiscntvalue(Long discntvalue) {
        this.discntvalue = discntvalue;
    }

    public Long getAdjustbefore() {
        return adjustbefore;
    }

    public void setAdjustbefore(Long adjustbefore) {
        this.adjustbefore = adjustbefore;
    }
}