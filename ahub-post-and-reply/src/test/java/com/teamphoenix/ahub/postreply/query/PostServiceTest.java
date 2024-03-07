package com.teamphoenix.ahub.postreply.query;

import com.teamphoenix.ahub.postreply.query.service.PostService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;

    static Stream<Arguments> getMemberCode() {
        return Stream.of(
                Arguments.of("3")
        );
    }

    static Stream<Arguments> getLikeId() {
        return Stream.of(
                Arguments.of("2")
        );
    }

    @DisplayName("회원 코드로 조회")
    @ParameterizedTest
    @MethodSource("getMemberCode")
    void testSelectByMemberCode(String inputMemberCode){
        Assertions.assertDoesNotThrow(
                () -> postService.selectPostsByMemberCode(inputMemberCode)
        );
    }

    @DisplayName("좋아요한 회원 아이디로 조회")
    @ParameterizedTest
    @MethodSource("getLikeId")
    void testSelectByLikeId(String inputLikeId){
        Assertions.assertDoesNotThrow(
                () -> postService.selectPostsByLikeId(inputLikeId)
        );
    }

}
