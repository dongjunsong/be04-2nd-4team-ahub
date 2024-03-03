package com.teampheonix.postreply.query.mapper;

import com.teampheonix.postreply.query.dto.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface DayLikePostMapper {
    List<Post> selectDayLikePost(Integer likeAmount, Date postDate);
}


