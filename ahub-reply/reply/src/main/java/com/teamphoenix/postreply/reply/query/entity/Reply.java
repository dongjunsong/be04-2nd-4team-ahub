package com.teamphoenix.postreply.reply.query.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Reply {

    private int replyId;
    private int postId;
    private String replyContent;
    private String replyDate;
    private int reportAcceptance;
    private int useAcceptance;
    private int memberCode;

}
