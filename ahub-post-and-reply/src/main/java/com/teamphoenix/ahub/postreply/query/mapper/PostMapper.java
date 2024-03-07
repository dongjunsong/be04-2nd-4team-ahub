package com.teamphoenix.ahub.postreply.query.mapper;

import com.teamphoenix.ahub.postreply.query.dto.LikePostAndPostDTO;
import com.teamphoenix.ahub.postreply.query.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PostMapper {
    PostDTO selectPostsByMemberCode(Map<String, Integer> memberCode);

    LikePostAndPostDTO selectPostsByLikeId(Map<String, Integer> likeId);

}
