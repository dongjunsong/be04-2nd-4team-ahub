package com.teamphoenix.ahub.postreply.query.service;

import com.teamphoenix.ahub.postreply.query.dto.LikePostAndPostDTO;
import com.teamphoenix.ahub.postreply.query.dto.PostDTO;
import com.teamphoenix.ahub.postreply.query.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("postService1")
public class PostService {

    private final PostMapper postMapper;

    @Autowired
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public PostDTO selectPostsByMemberCode(String inputMemberCode) {
        int intMemberCode = Integer.valueOf(inputMemberCode);

        Map<String, Integer> memberCode = new HashMap<>();
        memberCode.put("memberCode", intMemberCode);

        PostDTO member = postMapper.selectPostsByMemberCode(memberCode);

        return member;
    }

    public LikePostAndPostDTO selectPostsByLikeId(String inputLikeId) {
        int intLikeId = Integer.valueOf(inputLikeId);

        Map<String, Integer> likeId = new HashMap<>();
        likeId.put("likeId", intLikeId);

        LikePostAndPostDTO member = postMapper.selectPostsByLikeId(likeId);

        return member;
    }

//    public PostDTO selectDayLikePost(LocalDate today, String inputLikeAmount) {
//        String stringToday = String.valueOf(today);
//        int intLikeAmount = Integer.valueOf(inputLikeAmount);
//
//        Map<String, Integer> likeAmount = new HashMap<>();
//
//    }

//    public PostDTO selectDayLikePost(String inputPostDate, Integer likeAmount) {
//        String stringPostDate = String.valueOf(inputPostDate);
//
//        Map<String, Object> postDate = new HashMap<>();
//        postDate.put("postDate", stringPostDate);
//
//        PostDTO day = postMapper.selectDaylikePost(postDate);
//
//        return day;
//    }
//
//    public PostDTO selectMonthLikePost(String inputPostDate, Integer likeAmount) {
//        String stringPostDate = String.valueOf(inputPostDate);
//
//        Map<String, Object> postDate = new HashMap<>();
//        postDate.put("postDate", stringPostDate);
//
//        PostDTO month = postMapper.selectMonthLikePost(postDate);
//
//        return month;
//    }

}
