package com.newer.medicine.domain;

public class ErpBank {
    private String bankId;

    private String bankNumber;

    private String bankTime;

    private Integer bankCount;

    private String bankStaffid;

    private Integer isva;

    private String createtime;

    private String creater;

    private String reaark;

    private Integer bankIsva;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber == null ? null : bankNumber.trim();
    }

    public String getBankTime() {
        return bankTime;
    }

    public void setBankTime(String bankTime) {
        this.bankTime = bankTime == null ? null : bankTime.trim();
    }

    public Integer getBankCount() {
        return bankCount;
    }

    public void setBankCount(Integer bankCount) {
        this.bankCount = bankCount;
    }

    public String getBankStaffid() {
        return bankStaffid;
    }

    public void setBankStaffid(String bankStaffid) {
        this.bankStaffid = bankStaffid == null ? null : bankStaffid.trim();
    }

    public Integer getIsva() {
        return isva;
    }

    public void setIsva(Integer isva) {
        this.isva = isva;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getReaark() {
        return reaark;
    }

    public void setReaark(String reaark) {
        this.reaark = reaark == null ? null : reaark.trim();
    }

    public Integer getBankIsva() {
        return bankIsva;
    }

    public void setBankIsva(Integer bankIsva) {
        this.bankIsva = bankIsva;
    }
}