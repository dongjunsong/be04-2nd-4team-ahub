package com.teamphoenix.ahub.postreply.query.controller;

import com.teamphoenix.ahub.postreply.query.dto.LikePostAndPostDTO;
import com.teamphoenix.ahub.postreply.query.dto.PostDTO;
import com.teamphoenix.ahub.postreply.query.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;


@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/findPostsByMemberCode")
    public PostDTO findPostsByMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 코드 입력: ");
        String inputMemberCode = sc.nextLine();

        return postService.selectPostsByMemberCode(inputMemberCode);
    }

    @GetMapping("/findPostsByLikeId")
    public LikePostAndPostDTO findPostsByLikeId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아요한 게시글 조회할 회원 아이디를 입력: ");
        String inputLikeId = sc.nextLine();

        return postService.selectPostsByLikeId(inputLikeId);
    }

}
