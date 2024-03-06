package com.teamphoenix.ahub.command.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberDTO {
    private int memberCode;
    private String memberId;
    private String memberName;
    private String memberPwd;
    private String memberEmail;
    private String memberAddr;
    private String memberPhone;
    private LocalDateTime restrictStartDate;
    private int memberCategoryId;
}
