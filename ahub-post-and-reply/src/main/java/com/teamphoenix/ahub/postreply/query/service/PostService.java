package com.teamphoenix.ahub.postreply.query.service;

import com.teamphoenix.ahub.postreply.query.dto.LikePostAndPostDTO;
import com.teamphoenix.ahub.postreply.query.dto.PostDTO;
import com.teamphoenix.ahub.postreply.query.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("postService1")
public class PostService {

    private final PostMapper postMapper;

    @Autowired
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<PostDTO> selectPostsByMemberCode(String inputMemberCode) {
        int intMemberCode = Integer.valueOf(inputMemberCode);

        Map<String, Integer> memberCode = new HashMap<>();
        memberCode.put("memberCode", intMemberCode);

        List<PostDTO> memberList = postMapper.selectPostsByMemberCode(memberCode);

        return memberList;
    }

    public List<LikePostAndPostDTO> selectPostsByLikeId(String inputLikeId) {
        int intLikeId = Integer.valueOf(inputLikeId);

        Map<String, Integer> likeId = new HashMap<>();
        likeId.put("likeId", intLikeId);

        List<LikePostAndPostDTO> memberList2 = postMapper.selectPostsByLikeId(likeId);

        return memberList2;
    }

    public List<PostDTO> selectDayLikePost(String inputPostDate) { // 오늘자 여러 게시글을 받기 위해 List<PostDTO> 사용하기
        String postDate1 = String.valueOf(inputPostDate);

        Map<String, String> map1 = new HashMap<>();
        map1.put("postDate", postDate1);
        map1.put("likeAmount", "5");

//        System.out.println("DB 전: " + map1);
        List<PostDTO> postDateList = postMapper.selectDayLikePost(map1);
//        System.out.println("DB 후: ");
//        postDateList.forEach(System.out::println);

        return postDateList;
    }

    public List<PostDTO> selectMonthLikePost(String inputPostDate) { // 이달의 여러 게시글을 받기 위해 List<PostDTO> 사용하기
        String postDate2 = String.valueOf(inputPostDate);

        Map<String, String> map2 = new HashMap<>();
        map2.put("postDate", postDate2);
        map2.put("likeAmount", "10");

        List<PostDTO> postDateList = postMapper.selectMonthLikePost(map2);

        return postDateList;
    }


}
