package com.teamphoenix.ahub.command.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberDTO {
    private int memberCode;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberEmail;
    private String memberAddr;
    private String memberPhone;
    private LocalDateTime restrictStartDate;
    private int memberCategoryId;

    public MemberDTO(String memberId, String memberPwd, String memberName, String memberEmail, String memberAddr, String memberPhone, LocalDateTime restrictStartDate, int memberCategoryId) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberAddr = memberAddr;
        this.memberPhone = memberPhone;
        this.restrictStartDate = restrictStartDate;
        this.memberCategoryId = memberCategoryId;
    }
}
