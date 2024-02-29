package com.teamphoenix.ahubmember;

import com.teamphoenix.ahubmember.query.dto.MemberDTO;
import com.teamphoenix.ahubmember.query.service.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Map;
import java.util.stream.Stream;


@SpringBootTest
public class MemberServiceTests {

    @Autowired
    private MemberService memberService;

    static Stream<Arguments> getMemberCode() {
        return Stream.of(Arguments.of(Map.of("memberCode", "1")),
                        Arguments.of(Map.of("memberCode", "2")),
                        Arguments.of(Map.of("memberCode", "3"))
                );
    }

    static Stream<Arguments> getMemberId() {
        return Stream.of(Arguments.of(Map.of("memberId", "admin")),
                Arguments.of(Map.of("memberId", "user01")),
                Arguments.of(Map.of("memberId", "user02"))
        );
    }

    static Stream<Arguments> getMemberInfo() {
        return Stream.of(Arguments.of(new MemberDTO(1, "admin", "관리자", "admin01", "user01@gmail.com", "서울시 동작구", "010-1111-1111", 0,1)),
                Arguments.of(new MemberDTO(2, "user01", "손세림", "pass01", "user02@gmail.com", "서울시 구로구", "010-2222-2222", 0,2)),
                Arguments.of(new MemberDTO(3, "user02", "송동준", "pass02", "user03@gmail.com", "서울시 광진구", "010-3333-3333", 0,2))
        );
    }

    @DisplayName("전체 회원 조회")
    @ParameterizedTest
    @MethodSource("getMemberInfo")
    void testSelectAllMembers() {
        Assertions.assertDoesNotThrow(
                () -> memberService.selectAllMembers()
        );
    }

    @DisplayName("회원 코드로 회원 조회")
    @ParameterizedTest
    @MethodSource("getMemberCode")
    void testSelectByMemberCode(Map<String, String> memberCode){
        Assertions.assertDoesNotThrow(
                () -> memberService.selectByMemberCode(memberCode)
        );
    }

    @DisplayName("회원 아이디로 회원 조회")
    @ParameterizedTest
    @MethodSource("getMemberId")
    void testㄴelectByMemberId(Map<String, String> memberId){
        Assertions.assertDoesNotThrow(
                () -> memberService.selectByMemberId(memberId)
        );
    }

    @DisplayName("회원 아이디로 회원 조회")
    @ParameterizedTest
    @MethodSource("getMemberId")
    void testelectByMemberId(Map<String, String> memberId){
        Assertions.assertDoesNotThrow(
                () -> memberService.selectByMemberId(memberId)
        );
    }
}
