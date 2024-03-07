package com.teamphoenix.ahub.common.entity;


import java.time.LocalDateTime;


public class MemberInfo {
    private int memberCode;
    private String memberId;
    private String memberName;
    private String memberPwd;
    private String memberEmail;
    private String memberAddr;
    private String memberPhone;
    private int blacklistStatus;
    private LocalDateTime restrictStartDate;
    private LocalDateTime restrictEndDate;
    private int loginFailCount;
    private int accessAcceptancce;
    private int withdrawalAcceptance;
    private int memberCategoryId;

    public MemberInfo() {
    }

    public MemberInfo(int memberCode, String memberId, String memberName, String memberPwd, String memberEmail, String memberAddr, String memberPhone, int blacklistStatus, LocalDateTime restrictStartDate, LocalDateTime restrictEndDate, int loginFailCount, int accessAcceptancce, int withdrawalAcceptance, int memberCategoryId) {
        this.memberCode = memberCode;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPwd = memberPwd;
        this.memberEmail = memberEmail;
        this.memberAddr = memberAddr;
        this.memberPhone = memberPhone;
        this.blacklistStatus = blacklistStatus;
        this.restrictStartDate = restrictStartDate;
        this.restrictEndDate = restrictEndDate;
        this.loginFailCount = loginFailCount;
        this.accessAcceptancce = accessAcceptancce;
        this.withdrawalAcceptance = withdrawalAcceptance;
        this.memberCategoryId = memberCategoryId;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberAddr() {
        return memberAddr;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public int getBlacklistStatus() {
        return blacklistStatus;
    }

    public LocalDateTime getRestrictStartDate() {
        return restrictStartDate;
    }

    public LocalDateTime getRestrictEndDate() {
        return restrictEndDate;
    }

    public int getLoginFailCount() {
        return loginFailCount;
    }

    public int getAccessAcceptancce() {
        return accessAcceptancce;
    }

    public int getWithdrawalAcceptance() {
        return withdrawalAcceptance;
    }

    public int getMemberCategoryId() {
        return memberCategoryId;
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "memberCode=" + memberCode +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberPwd='" + memberPwd + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberAddr='" + memberAddr + '\'' +
                ", memberPhone='" + memberPhone + '\'' +
                ", blacklistStatus=" + blacklistStatus +
                ", restrictStartDate=" + restrictStartDate +
                ", restrictEndDate=" + restrictEndDate +
                ", loginFailCount=" + loginFailCount +
                ", accessAcceptancce=" + accessAcceptancce +
                ", withdrawalAcceptance=" + withdrawalAcceptance +
                ", memberCategoryId=" + memberCategoryId +
                '}';
    }
}
