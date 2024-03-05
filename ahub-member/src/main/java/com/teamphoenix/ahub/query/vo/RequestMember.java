package com.teamphoenix.ahub.query.vo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RequestMember {
    private String memberId;
    private String memberPwd;
}