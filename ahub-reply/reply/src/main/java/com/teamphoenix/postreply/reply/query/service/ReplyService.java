package com.teamphoenix.postreply.reply.query.service;


import com.teamphoenix.postreply.reply.query.dto.ReplyDTO;

import java.util.List;


public interface ReplyService {

    List<ReplyDTO> selectAllReplyInBoard(int postId);


    List<ReplyDTO> selectReplyBySearch(String searchingValue);


    List<ReplyDTO> selectReplyByWriter(int memberId);

}
