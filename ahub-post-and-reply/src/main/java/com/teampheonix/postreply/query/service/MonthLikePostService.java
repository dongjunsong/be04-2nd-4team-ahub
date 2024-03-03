package com.teampheonix.postreply.query.service;

import com.teampheonix.postreply.query.dto.Post;
import com.teampheonix.postreply.query.mapper.MonthLikePostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MonthLikePostService {

    private final MonthLikePostMapper monthLikePostMapper;

    @Autowired
    public MonthLikePostService(MonthLikePostMapper monthLikePostMapper) {
        this.monthLikePostMapper = monthLikePostMapper;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void processMonthLikePost(List<Integer> likeAmounts, Date postDate) {
        for (Integer likeAmount : likeAmounts) {
            Map<String, Object> params = new HashMap<>();
            params.put("likeAmount", likeAmount);
            params.put("postDate", postDate);
            List<Post> posts = monthLikePostMapper.selectMonthLikePost(params);
            posts.forEach(System.out::println);
        }
    }
}

