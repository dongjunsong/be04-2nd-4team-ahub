package com.teampheonix.postreply.query;

import com.teampheonix.postreply.query.dto.LikePostAndPost;
import com.teampheonix.postreply.query.mapper.LikePostAndPostMapper;
import com.teampheonix.postreply.query.service.LikePostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
@Transactional
class LikePostServiceTest {

    @Autowired
    private LikePostService likePostService;

    @Autowired
    private LikePostAndPostMapper likePostAndPostMapper;        // 필기. 추가된 부분

    @Test
    void testProcessPostsByLikeId() {
        // 테스트에 사용할 회원 코드 리스트 생성
        List<Integer> likeIds = Arrays.asList(1, 2, 3);

        for (Integer likeId : likeIds) {
            if (likeId == 2) {      // 필기. 추가된 부분: 좋아요를 한 아이디가 2인 게시물 목록만 가져옴
            List<LikePostAndPost> posts2 = likePostAndPostMapper.selectPostsByLikdId(likeId);
            posts2.forEach(System.out::println);
            }
        }
    }
}
