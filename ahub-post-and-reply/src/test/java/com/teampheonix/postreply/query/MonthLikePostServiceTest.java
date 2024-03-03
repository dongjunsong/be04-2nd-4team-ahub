package com.teampheonix.postreply.query;

import com.teampheonix.postreply.query.dto.Post;
import com.teampheonix.postreply.query.mapper.MonthLikePostMapper;
import com.teampheonix.postreply.query.service.MonthLikePostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Transactional
class MonthLikePostServiceTest {

    @Autowired
    private MonthLikePostService monthLikePostService;

    @Autowired
    private MonthLikePostMapper monthLikePostMapper;

    @Test
    void testProcessMonthLikePost() {
        List<Integer> postIds = Arrays.asList(1);
// 공부. mysql Insert -> 2024년 1월에 작성된 좋아요 10개 이상의 글
        for (Integer postId : postIds) {
            LocalDate postDate = LocalDate.of(2024, 1, 1); // 2024년 1월 1일
            Map<String, Object> params = new HashMap<>();
            params.put("likeAmount", 10);
            params.put("postDate", postDate);
            List<Post> posts = monthLikePostMapper.selectMonthLikePost(params);
            posts.forEach(System.out::println);
        }
    }
}

