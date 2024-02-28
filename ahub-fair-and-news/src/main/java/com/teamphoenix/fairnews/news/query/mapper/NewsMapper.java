package com.teamphoenix.fairnews.news.query.mapper;

import com.teamphoenix.fairnews.news.query.dto.NewsDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper {

    NewsDTO getNewsPost(int postNum);
}
