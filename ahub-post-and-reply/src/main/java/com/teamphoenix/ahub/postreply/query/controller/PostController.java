package com.teamphoenix.ahub.postreply.query.controller;

import com.teamphoenix.ahub.postreply.query.dto.LikePostAndPostDTO;
import com.teamphoenix.ahub.postreply.query.dto.PostDTO;
import com.teamphoenix.ahub.postreply.query.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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

//    @GetMapping("/findDayLikePost")
//    public PostDTO findDayLikePost() {
//        LocalDate localDate1 = LocalDate.now();
//        String dateFormat1 = localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//
//        String inputLikeAmount = "5";
//
//        return postService.selectDayLikePost(dateFormat1, inputLikeAmount);
//    }
//
//
//
//    @GetMapping("/findMonthLikePost")
//    public PostDTO findMonthLikePost() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("월별인기게시글 날짜를 입력: ");
//        String inputPostDate2 = sc.nextLine();
//
//        return postService.selectMonthLikePost(inputPostDate2);
//    }

}
