package com.teampheonix.postreply.query.service;

import com.teampheonix.postreply.query.dto.Post;
import com.teampheonix.postreply.query.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    private final PostMapper postMapper;

    @Autowired
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void processPostsByMemberCode(List<Integer> memberCodes) {
        for (Integer memberCode : memberCodes) {
            // 회원 코드가 3번인 경우에만 게시물을 가져옴
//            if (memberCode == 3) {
                List<Post> posts = postMapper.selectPostsByMemberCode(memberCode);
                // 가져온 게시물 목록을 처리하는 로직 추가
                posts.forEach(System.out::println);
//            }
        }
    }
}
