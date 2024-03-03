package com.teampheonix.postreply.query;//package com.teampheonix.postreply.section02.likepost;

import com.teampheonix.postreply.query.dto.Post;
import com.teampheonix.postreply.query.mapper.DayLikePostMapper;
import com.teampheonix.postreply.query.service.DayLikePostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
@Transactional
class DayLikePostServiceTest {

    @Autowired
    private DayLikePostService dayLikePostService;

    @Autowired
    private DayLikePostMapper dayLikePostMapper;

    @Test
    void testProcessDayLikePost() {
        List<Integer> postIds = Arrays.asList(1);
// 공부. mysql Insert -> 2024년 1월 20일에 작성된 좋아요 5개 이상의 글
        for (Integer postId : postIds) {
            Date postDate = new Date(2024, 1, 20); // 2024년 1월 20일
            List<Post> posts = dayLikePostMapper.selectDayLikePost(5, postDate);
            posts.forEach(System.out::println);
        }
    }
}

