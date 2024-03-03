package com.teampheonix.postreply.query.mapper;

import com.teampheonix.postreply.query.dto.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface MonthLikePostMapper {
    List<Post> selectMonthLikePost(Map<String, Object> params);
}

