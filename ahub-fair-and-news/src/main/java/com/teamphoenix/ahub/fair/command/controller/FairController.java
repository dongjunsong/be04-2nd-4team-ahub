package com.teamphoenix.ahub.fair.command.controller;

import com.teamphoenix.ahub.fair.command.dto.FairDTO;
import com.teamphoenix.ahub.fair.command.service.FairService;
import com.teamphoenix.ahub.fair.command.vo.RegistFairInfo;
import com.teamphoenix.ahub.fair.command.vo.ResponseUrlMessage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


@RestController(value = "fairCommandController")
@RequestMapping("/board/fairs")
public class FairController {

    private final FairService fairService;
    private final ModelMapper modelMapper;

    @Autowired
    public FairController(FairService fairService, ModelMapper modelMapper) {
        this.fairService = fairService;
        this.modelMapper = modelMapper;
    }

    /* 새 게시글 등록 핸들러 메소드 */
    @PostMapping("/new")
    public ResponseEntity<ResponseUrlMessage> addNewPost(@RequestBody RegistFairInfo postInfo) {


        FairDTO newFairPost = modelMapper.map(postInfo, FairDTO.class);
        fairService.registFairPost(newFairPost);

        ResponseUrlMessage respMessage = new ResponseUrlMessage();
        respMessage.setMessage("post-list");
        respMessage.setUrl("/board/fairs/lists");

        return ResponseEntity
                .status(HttpStatus.CREATED).body(respMessage);
    }

    /* 기존 게시글 수정 핸들러 메소드 */
    @PutMapping("/{postNum}")
    public ResponseEntity<ResponseUrlMessage> modifyFairPost(
            @PathVariable(value = "postNum") int postNum,
            @RequestBody FairDTO modifyInfo) {

        modifyInfo.setFairWritedate(LocalDateTime.now());

        fairService.modifyFairPost(postNum, modifyInfo);

        ResponseUrlMessage respMessage = new ResponseUrlMessage();
        respMessage.setMessage("post-list");
        respMessage.setUrl("/board/fairs/lists");

        return ResponseEntity
                .status(HttpStatus.CREATED).body(respMessage);

    }

    /* 게시글 삭제 */
    @DeleteMapping("/{postNum}")
    public ResponseEntity<ResponseUrlMessage> removeFairPost(@PathVariable("postNum") int postNum) {

        fairService.removeFairPost(postNum);

        ResponseUrlMessage respMessage = new ResponseUrlMessage();
        respMessage.setMessage("post-list");
        respMessage.setUrl("/board/fairs/lists");
        return ResponseEntity
                .status(HttpStatus.OK).body(respMessage);
    }
}
