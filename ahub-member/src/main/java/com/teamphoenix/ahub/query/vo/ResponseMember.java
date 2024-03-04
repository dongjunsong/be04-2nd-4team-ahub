package com.teamphoenix.ahub.query.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseMember {
    private String memberId;
    private String memberName;
    private String memberEmail;
    private String memberAddr;
    private String memberPhone;
    private LocalDateTime restricStartDate;
}
