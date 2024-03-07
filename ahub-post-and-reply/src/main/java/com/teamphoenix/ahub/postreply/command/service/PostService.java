//package com.teamphoenix.ahub.postreply.command.service;
//
//import com.teampheonix.postreply.command.dto.PostCategoryDTO;
//import com.teampheonix.postreply.command.dto.PostDTO;
//import com.teampheonix.postreply.command.entity.Post;
//import com.teampheonix.postreply.command.entity.PostCategory;
//import com.teampheonix.postreply.command.repository.PostCategoryRepository;
//import com.teampheonix.postreply.command.repository.PostRepository;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///* 설명.
// *  Service 계층: 비즈니스 로직, 트랜잭션처리(@Transactional),
// *  DTO <-> Entity(modelmapper lib 활용)
// * */
//@Service
//public class PostService {
//
//    private final ModelMapper mapper;
//
//    private final PostRepository postRepository;
//
//    private final PostCategoryRepository postCategoryRepository;
//
//    @Autowired
//    public PostService(ModelMapper mapper, PostRepository postRepository, PostCategoryRepository postCategoryRepository) {
//        this.mapper = mapper;
//        this.postRepository = postRepository;
//        this.postCategoryRepository = postCategoryRepository;
//    }
//
//    @Transactional
//    public void registPost(PostDTO newPost) {
//
//        postRepository.save(mapper.map(newPost, Post.class));
//    }
//
//    public List<PostCategoryDTO> findAllCategory() {
//
//        List<PostCategory> categoryList = postCategoryRepository.findAllCategory();
//
//        return categoryList.stream().map(category -> mapper.map(category, PostCategoryDTO.class)).collect(Collectors.toList());
//    }
//
//    @Transactional
//    public void modifyPost(PostDTO modifyPost) {
//
//        Post foundPost = postRepository.findById(modifyPost.getPostId()).orElseThrow(IllegalArgumentException::new);
//        foundPost.setPostTitle(modifyPost.getPostTitle());
//        foundPost.setPostContent(modifyPost.getPostContent());
//    }
//
//    @Transactional
//    public void deletePost(int postId) {
//
//        postRepository.deleteById(postId);
//    }
//}
