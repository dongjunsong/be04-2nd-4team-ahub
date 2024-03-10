package com.teamphoenix.postreply.reply.command.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ReplyDTO {

    private int replyId;
    private int postId;
    private String replyContent;
    private String replyDate;
    private int reportAcceptance;
    private int useAcceptance;
    private int memberCode;
    private String memberName;

}
