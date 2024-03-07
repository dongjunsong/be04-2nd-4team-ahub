//package com.teamphoenix.ahub.postreply.command.controller;
//
//import com.teamphoenix.ahub.postreply.command.service.PostService;
//import lombok.extern.slf4j.Slf4j;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController(value = "postCommandController")
//@RequestMapping("/post")
//@Slf4j
//public class PostController {
//
//    private final PostService postService;
//
//    private final ModelMapper modelMapper;
//
//    @Autowired
//    public PostController(PostService postService, ModelMapper modelMapper) {
//        this.postService = postService;
//        this.modelMapper = modelMapper;
//    }
//
//    @GetMapping("/regist")
//    public void registPage() {}
//
//    /* 설명. /menu/regist.html이 열리자마자 js코드를 통해 /menu/category 비동기 요청이 오게 된다. */
//    @GetMapping(value="/category", produces="application/json; charset=UTF-8")
//
//    @ResponseBody
//    public List<PostCategoryDTO> findCategoryList() {
//        return postService.findAllCategory();
//    }
//
//    /* 설명. Spring Data JPA로 DML 작업하기(Insert, Update, Delete) */
//    @PostMapping("/regist")
//    public String registPost(PostDTO newPost) {
//        postService.registPost(newPost);
//
//        return "redirect:/post/list";
//    }
//
//    @GetMapping("/modify")
//    public void modifyPage() {}
//
//    @PostMapping("/modify")
//    public String modifyPost(PostDTO modifyPost) {
//        postService.modifyPost(modifyPost);
//
//        return "redirect:/post/" + modifyPost.getPostId();
//    }
//
//    @GetMapping("/delete")
//    public void deletePage() {}
//
//    @PostMapping("/delete")
//    public String deletePost(@RequestParam int postId) {
//        postService.deletePost(postId);
//
//        return "redirect:/post/list";
//    }
//}
