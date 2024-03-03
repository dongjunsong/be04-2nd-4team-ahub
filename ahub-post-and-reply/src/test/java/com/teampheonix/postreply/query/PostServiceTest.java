package com.teampheonix.postreply.query;

import com.teampheonix.postreply.query.dto.Post;
import com.teampheonix.postreply.query.mapper.PostMapper;
import com.teampheonix.postreply.query.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@Transactional
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Autowired
    private PostMapper postMapper;      // 필기. 추가된 부분

    @Test
    void testProcessPostsByMemberCode() {
        // 테스트에 사용할 회원 코드 리스트 생성
        List<Integer> memberCodes = Arrays.asList(1, 2, 3);

        for (Integer memberCode : memberCodes) {
            if (memberCode == 3) {      // 필기. 추가된 부분: 회원 아이디가 3인 게시물 목록만 가져옴
                List<Post> posts = postMapper.selectPostsByMemberCode(memberCode);
                posts.forEach(System.out::println);
            }
        }

    }
}
