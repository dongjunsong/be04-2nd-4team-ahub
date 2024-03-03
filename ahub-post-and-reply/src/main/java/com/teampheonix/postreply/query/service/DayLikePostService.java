package com.teampheonix.postreply.query.service;

import com.teampheonix.postreply.query.dto.Post;
import com.teampheonix.postreply.query.mapper.DayLikePostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class DayLikePostService {

    private final DayLikePostMapper dayLikePostMapper;

    @Autowired
    public DayLikePostService(DayLikePostMapper dayLikePostMapper) {
        this.dayLikePostMapper = dayLikePostMapper;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void processDayLikePost(Integer likeAmount, Date postDate) {
        List<Post> posts = dayLikePostMapper.selectDayLikePost(likeAmount, postDate);
        posts.forEach(System.out::println);
    }
}

