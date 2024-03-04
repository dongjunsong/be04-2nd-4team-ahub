package com.teamphoenix.ahub.query.service;

import com.teamphoenix.ahub.query.dto.MemberDTO;
import com.teamphoenix.ahub.query.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class MemberService {
    private MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberDTO> selectAllMembers(){
        List<MemberDTO> members = memberMapper.selectAllMembers();
        members.forEach(System.out::println);

        return members;
    }

    public MemberDTO selectByMemberCode(String inputMemberCode){
        int intMemberCode = Integer.valueOf(inputMemberCode);
        Map<String, Integer> memberCode = new HashMap<>();
        memberCode.put("memberCode", intMemberCode);

        MemberDTO member = memberMapper.selectByMemberCode(memberCode);

        return member;
    }

    public MemberDTO selectByMemberId(String inputMemberId){
        Map<String, String> memberId = new HashMap<>();
        memberId.put("memberId", inputMemberId);

        MemberDTO member = memberMapper.selectByMemberId(memberId);

        return member;
    }

    public MemberDTO selectMyprofile(String loggedInMemberCode){
        int intMemberCode = Integer.valueOf(loggedInMemberCode);
        Map<String, Integer> memberCode = new HashMap<>();
        memberCode.put("memberCode", intMemberCode);

        MemberDTO member = memberMapper.selectMyprofile(memberCode);

        return member;
    }
    public MemberDTO memberLogin(Map<String, String> memberId, Map<String, String> memberPwd){
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 입력 : ");
        String id = sc.nextLine().trim();

        System.out.print("비밀번호 입력: ");
        String pwd = sc.nextLine().trim();


        MemberDTO member = memberMapper.memberLogin(memberId, memberPwd);

        return member;
    }

}
