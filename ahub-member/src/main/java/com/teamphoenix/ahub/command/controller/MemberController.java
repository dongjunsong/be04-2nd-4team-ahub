package com.teamphoenix.ahub.command.controller;

import com.teamphoenix.ahub.command.dto.MemberDTO;
import com.teamphoenix.ahub.command.service.MemberService;
import com.teamphoenix.ahub.command.vo.RequestMember;
import com.teamphoenix.ahub.command.vo.ResponseMember;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@Slf4j
public class MemberController {
    private final MemberService memberService;
    private final ModelMapper modelMapper;

    @Autowired
    public MemberController(MemberService memberService, ModelMapper modelMapper) {
        this.memberService = memberService;
        this.modelMapper = modelMapper;
    }

    /* 회원 가입 */
    @PostMapping("/regist")
    public ResponseEntity<ResponseMember> registMember(@RequestBody RequestMember newMember) {
        MemberDTO newMemberInfo = modelMapper.map(newMember, MemberDTO.class);

        memberService.registMember(newMemberInfo);
        String newMemberId = newMemberInfo.getMemberId();

        ResponseMember responseMember = new ResponseMember();
        responseMember.setMemberId(newMemberId);
        responseMember.setMessage(newMemberId + "님 회원 가입이 완료되었습니다.");

        return ResponseEntity.status(HttpStatus.CREATED).body(responseMember);
    }

    /* 회원 정보 수정 */
    @PutMapping("/modify/{memberId}")
    public ResponseEntity<ResponseMember> modifyMember(@PathVariable("memberId") String memberId, @RequestBody RequestMember modifyMemberInfo) {
        MemberDTO modifyValues = modelMapper.map(modifyMemberInfo, MemberDTO.class);

        String CurrentMemberId = modifyValues.getMemberId();
        memberService.modifyMember(CurrentMemberId, modifyValues);

        ResponseMember responseMember = new ResponseMember();
        responseMember.setMemberId(CurrentMemberId);
        responseMember.setMemberId(CurrentMemberId + "님 회원 정보 수정 완료");

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

    /* 회원 탈퇴 */
    @DeleteMapping("/remove/{memberId}")
    public ResponseEntity<ResponseMember> removeMember(@PathVariable("memberId") String memberId) {
        memberService.removeMember(memberId);

        ResponseMember responseMember = new ResponseMember();
        responseMember.setMessage("회원 탈퇴 완료");

        return ResponseEntity.status(HttpStatus.OK).body(responseMember);
    }

}
