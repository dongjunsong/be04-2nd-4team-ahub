package com.teamphoenix.ahubmember.query.service;

import com.teamphoenix.ahubmember.query.dto.MemberDTO;
import com.teamphoenix.ahubmember.query.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public MemberDTO selectByMemberCode(Map<String, String> memberCode){
        MemberDTO member = memberMapper.selectByMemberCode(memberCode);

        return member;
    }

    public MemberDTO selectByMemberId(Map<String, String> memberId){
        MemberDTO member = memberMapper.selectByMemberId(memberId);

        return member;
    }

    public MemberDTO selectMyprofile(Map<String, String> memberCode){
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
