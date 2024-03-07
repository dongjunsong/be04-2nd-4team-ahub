package com.teamphoenix.ahub.postreply.command.dto;

import java.util.Date;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PostDTO {

    private int postId;
    private String postTitle;
    private String postContent;
    private Date postDate;
    private int categoryId;
    private int useAcceptance;
    private int likeAmount;
    private int reportedAcceptance;
    private int memberCode;
    private Date postModifyDate;

}