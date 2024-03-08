package com.teamphoenix.postreply.reply.command.vo;

import com.teamphoenix.postreply.reply.command.dto.ReplyDTO;
import lombok.Data;

import java.util.List;

@Data
public class ResponseMember {

    private String memberName;

    List<ReplyDTO> replies;
}
