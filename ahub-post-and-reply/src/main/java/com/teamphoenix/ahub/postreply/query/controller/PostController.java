package com.teamphoenix.ahub.postreply.query.controller;

import com.teamphoenix.ahub.postreply.query.dto.LikePostAndPostDTO;
import com.teamphoenix.ahub.postreply.query.dto.PostDTO;
import com.teamphoenix.ahub.postreply.query.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
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
    public List<PostDTO> findPostsByMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 코드 입력하여 게시글 조회: ");
        String inputMemberCode = sc.nextLine();

        return postService.selectPostsByMemberCode(inputMemberCode);
    }

    @GetMapping("/findPostsByLikeId")
    public List<LikePostAndPostDTO> findPostsByLikeId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 코드 입력하여 좋아요한 게시글 조회: ");
        String inputLikeId = sc.nextLine();

        return postService.selectPostsByLikeId(inputLikeId);
    }

    @GetMapping("/findDayLikePost")
    public List<PostDTO> findDayLikePost() {
        LocalDate localDate1 = LocalDate.now();
        String dateFormat1 = localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        return postService.selectDayLikePost(dateFormat1);
    }

    @GetMapping("/findMonthLikePost")
    public List<PostDTO> findMonthLikePost() {
        LocalDate localDate2 = LocalDate.now();
        String dateFormat2 = localDate2.format(DateTimeFormatter.ofPattern("yyyy-MM"));

        return postService.selectMonthLikePost(dateFormat2);
    }


}
