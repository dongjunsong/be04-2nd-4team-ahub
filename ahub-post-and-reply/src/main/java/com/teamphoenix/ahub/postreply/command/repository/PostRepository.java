package com.teamphoenix.ahub.postreply.command.repository;

import org.springframework.data.jpa.repository.Query;


public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query(value="SELECT m FROM Post m ORDER BY m.postId ASC")
    List<Post> findAllOrderedByPostId(); // 에러 방지
}
