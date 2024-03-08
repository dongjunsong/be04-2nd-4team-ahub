package com.teamphoenix.postreply.reply.command.service;

import com.teamphoenix.postreply.reply.command.dto.ReplyDTO;

import java.util.List;

public interface ReplyService {

    List<ReplyDTO> deleteReply(int replyId);
    ReplyDTO modifyReply(ReplyDTO modifyInfo, int replyId);
    List<ReplyDTO> registReply(ReplyDTO newReply);

    ReplyDTO getReplyWithMemberNameById(int memberId);
}
