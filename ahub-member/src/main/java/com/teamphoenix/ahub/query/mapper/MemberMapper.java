package com.teamphoenix.ahub.query.mapper;

import com.teamphoenix.ahub.query.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {
    List<MemberDTO> selectAllMembers();

    MemberDTO selectByMemberCode(Map<String, Integer> memberCode);

    MemberDTO selectByMemberId(Map<String, String> memberId);

    MemberDTO selectMyprofile(Map<String, Integer> memberCode);

    MemberDTO memberLogin(Map<String, String> memberId, Map<String, String> memberPwd);
}
