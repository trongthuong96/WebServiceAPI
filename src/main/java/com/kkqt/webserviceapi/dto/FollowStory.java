package com.kkqt.webserviceapi.dto;

public class FollowStory {
    private Long storyId;
    private String storyName;
    private Long userId;
    private String uerName;

    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUerName() {
        return uerName;
    }

    public void setUerName(String uerName) {
        this.uerName = uerName;
    }
}
