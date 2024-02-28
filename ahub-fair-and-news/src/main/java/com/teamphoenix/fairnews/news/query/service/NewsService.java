package com.teamphoenix.fairnews.news.query.service;

import com.teamphoenix.fairnews.news.query.dto.NewsDTO;
import com.teamphoenix.fairnews.news.query.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NewsService {

    private final NewsMapper newsMapper;

    @Autowired
    public NewsService(NewsMapper newsMapper) {
        this.newsMapper = newsMapper;
    }

    public NewsDTO getNewsPost(Map<String, String> newsId) {

        int postNum = Integer.valueOf(newsId.get("newsId"));
        NewsDTO result = newsMapper.getNewsPost(postNum);
        System.out.println("result = " + result);

        return result;
    }

}
