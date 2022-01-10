package com.kkqt.webserviceapi.entity;

import java.io.Serializable;

public class StoryKey implements Serializable {
    private Long story;
    private Integer chapterNumber;

    public StoryKey() {}

    public StoryKey(Long story, Integer chapterNumber) {
        this.story = story;
        this.chapterNumber = chapterNumber;
    }

    public Long getStory() {
        return story;
    }

    public void setStory(Long story) {
        this.story = story;
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }
}
