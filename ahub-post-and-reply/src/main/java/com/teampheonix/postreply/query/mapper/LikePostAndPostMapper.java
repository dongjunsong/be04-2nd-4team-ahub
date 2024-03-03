package com.teampheonix.postreply.query.mapper;

import com.teampheonix.postreply.query.dto.LikePostAndPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikePostAndPostMapper {

    List<LikePostAndPost> selectPostsByLikdId(Integer likeId);
}
