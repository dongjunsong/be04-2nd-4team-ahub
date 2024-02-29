package com.teamphoenix.ahubmember.query.mapper;

import com.teamphoenix.ahubmember.query.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {
    List<MemberDTO> selectAllMembers();

    MemberDTO selectByMemberCode(Map<String, String> memberCode);

    MemberDTO selectByMemberId(Map<String, String> memberId);

    MemberDTO selectMyprofile(Map<String, String> membdrCode);

    MemberDTO memberLogin(Map<String, String> memberId, Map<String, String> memberPwd);
}
