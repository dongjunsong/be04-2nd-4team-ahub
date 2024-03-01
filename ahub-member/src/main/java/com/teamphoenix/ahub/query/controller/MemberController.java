package com.teamphoenix.ahub.query.controller;

import com.teamphoenix.ahub.query.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public void findBymemberCode() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("조회할 회원 번호를 입력: ");
        String inputMemberCode = sc.nextLine();

        memberService.selectByMemberCode(inputMemberCode);
    }

    public void findByMemberId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 회원 아이디를 입력: ");
        String inputMemberId = sc.nextLine();

        memberService.selectByMemberId(inputMemberId);
    }
}
