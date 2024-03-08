package com.teamphoenix.ahub.query.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamphoenix.ahub.query.dto.MemberDTO;
import com.teamphoenix.ahub.query.service.MemberService;
import com.teamphoenix.ahub.query.vo.RequestMember;
import com.teamphoenix.ahub.query.vo.MyProfileResponseMember;
import com.teamphoenix.ahub.query.vo.LoginResponseMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;
    private final ModelMapper modelMapper;

    @Autowired
    public MemberController(MemberService memberService, ModelMapper modelMapper) {
        this.memberService = memberService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/findAllMembers")
    public List<MemberDTO> findAllMembers() {
        /* 프론트 작업 후 사용자 입력을 받아오는 코드 추가 */

        return memberService.selectAllMembers();
    }

    @GetMapping("/findByMemberCode")
    public MemberDTO findByMemberCode() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("회원 코드 입력: ");
        String inputMemberCode = sc.nextLine();

        return memberService.selectByMemberCode(inputMemberCode);
    }

    @GetMapping("/findByMemberId")
    public MemberDTO findByMemberId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 회원 아이디를 입력: ");
        String inputMemberId = sc.nextLine();

        return memberService.selectByMemberId(inputMemberId);
    }

    @PostMapping("/findMyprofile")
    public ResponseEntity<MyProfileResponseMember> selectMyprofile(@RequestBody String currentMemberId) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = objectMapper.readTree(currentMemberId);
            String memberId = jsonNode.get("currentMemberId").asText();

            MemberDTO myProfile = memberService.selectMyprofile(memberId);

            MyProfileResponseMember myProfileResponseMember = new MyProfileResponseMember();
            myProfileResponseMember.setMemberId(myProfile.getMemberId());
            myProfileResponseMember.setMemberName(myProfile.getMemberName());
            myProfileResponseMember.setMemberAddr(myProfile.getMemberAddr());
            myProfileResponseMember.setMemberEmail(myProfile.getMemberEmail());
            myProfileResponseMember.setMemberPhone(myProfile.getMemberPhone());
            myProfileResponseMember.setRestrictStartDate(myProfile.getRestrictStartDate());

            return ResponseEntity.status(HttpStatus.OK).body(myProfileResponseMember);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /* 설명. 회원 로그인에 security 적용하기 */
    @PostMapping("/findLogin")
    public ResponseEntity<LoginResponseMember> memberLogin(@RequestBody RequestMember login) {
        MemberDTO memberLoginInfo = modelMapper.map(login, MemberDTO.class);

        MemberDTO loginResult = memberService.memberLogin(memberLoginInfo);

        LoginResponseMember loginResponseMember = new LoginResponseMember();
        loginResponseMember.setMemberId(loginResult.getMemberId());
        loginResponseMember.setMemberName(loginResult.getMemberName());

        return ResponseEntity.status(HttpStatus.OK).body(loginResponseMember);
    }
}
