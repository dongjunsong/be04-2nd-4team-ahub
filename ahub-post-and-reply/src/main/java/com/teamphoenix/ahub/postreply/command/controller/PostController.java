package com.teamphoenix.ahub.postreply.command.controller;

import com.teamphoenix.ahub.postreply.command.dto.PostDTO;
import com.teamphoenix.ahub.postreply.command.service.PostService;
import com.teamphoenix.ahub.postreply.command.vo.RequestRegist;
import com.teamphoenix.ahub.postreply.command.vo.ResponseRegist;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController(value = "postCommandController")
@RequestMapping("/post")
public class PostController {

    private final PostService postService;
    private final ModelMapper modelMapper;

    @Autowired
    public PostController(PostService postService, ModelMapper modelMapper) {
        this.postService = postService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/new")
    public ResponseEntity<ResponseRegist> addNewPost(@RequestBody RequestRegist postInfo) {

        PostDTO newPost = modelMapper.map(postInfo, PostDTO.class);
        newPost.setPostDate(LocalDateTime.now());
        newPost.setPostModifyDate(LocalDateTime.now());
        newPost.setUseAcceptance(1);
        newPost.setMemberCode(1);

        postService.createPost(newPost);

        ResponseRegist responseRegist = new ResponseRegist();
        responseRegist.setMessage("Success to add new post.");
        responseRegist.setResult(newPost);

        return ResponseEntity
                .status(HttpStatus.CREATED).body(responseRegist);
    }

//    @PutMapping("/{postId}")
//    public ResponseEntity<ResponseStatus> modifyPost(
//            @PathVariable(value = "postId") int postId,
//            @RequestBody PostDTO modifyInfo) {
//
//        modifyInfo.setPostDate(LocalDateTime.now());
//
//        postService.modifyPost(postId, modifyInfo);
//
//        ResponseStatus respMessage = new ResponseStatus();
//        respMessage.setCode("200, OK");
//        respMessage.setMessage("Success to update [ " + postId + " ] post.");
//        respMessage.setUrl("http://localhost:8000/board/posts/lists");
//        respMessage.setResult(modifyInfo);
//
//        return ResponseEntity
//                .status(HttpStatus.OK).body(respMessage);
//    }
//
//    @DeleteMapping("/{postId}")
//    public ResponseEntity<ResponseStatus> removePost(@PathVariable("postId") int postId) {
//
//        postService.removePost(postId);
//
//        ResponseStatus respMessage = new ResponseStatus();
//        respMessage.setCode("200, OK");
//        respMessage.setMessage("Success to delete [ " + postId + " ] post.");
//        respMessage.setUrl("http://localhost:8000/board/posts/lists");
//
//        return ResponseEntity
//                .status(HttpStatus.OK).body(respMessage);
//    }
}
