package com.teampheonix.postreply.query.service;

import com.teampheonix.postreply.query.dto.LikePostAndPost;
import com.teampheonix.postreply.query.mapper.LikePostAndPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LikePostService {

    private final LikePostAndPostMapper likePostAndPostMapper;

    @Autowired
    public LikePostService(LikePostAndPostMapper likePostAndPostMapper) {
        this.likePostAndPostMapper = likePostAndPostMapper;
    }


    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void processPostsByLikeId(List<Integer> likeIds) {
        for (Integer likeId : likeIds) {
            List<LikePostAndPost> posts2 = likePostAndPostMapper.selectPostsByLikdId(likeId);
            posts2.forEach(System.out::println);
        }
    }
}
