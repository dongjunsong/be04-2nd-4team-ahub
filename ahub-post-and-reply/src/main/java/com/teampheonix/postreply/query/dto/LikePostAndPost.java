package com.teampheonix.postreply.query.dto;

import java.util.Date;
import java.util.List;

public class LikePostAndPost {
    private int likeId;
    private Date likeDate;
    private Date likeCancelDate;
    private int likeState;
    private int memberCode;
    private int postId;
    private List<Post> posts;

    public LikePostAndPost() {
    }

    public LikePostAndPost(int likeId, Date likeDate, Date likeCancelDate, int likeState, int memberCode, int postId, List<Post> posts) {
        this.likeId = likeId;
        this.likeDate = likeDate;
        this.likeCancelDate = likeCancelDate;
        this.likeState = likeState;
        this.memberCode = memberCode;
        this.postId = postId;
        this.posts = posts;
    }

    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public Date getLikeDate() {
        return likeDate;
    }

    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }

    public Date getLikeCancelDate() {
        return likeCancelDate;
    }

    public void setLikeCancelDate(Date likeCancelDate) {
        this.likeCancelDate = likeCancelDate;
    }

    public int getLikeState() {
        return likeState;
    }

    public void setLikeState(int likeState) {
        this.likeState = likeState;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "LikePostAndPost{" +
                "likeId=" + likeId +
                ", likeDate=" + likeDate +
                ", likeCancelDate=" + likeCancelDate +
                ", likeState=" + likeState +
                ", memberCode=" + memberCode +
                ", postId=" + postId +
                ", posts=" + posts +
                '}';
    }
}
