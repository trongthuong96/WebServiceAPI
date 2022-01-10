package com.kkqt.webserviceapi.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "chapter")
@EntityListeners(AuditingEntityListener.class)
@IdClass(StoryKey.class)
public class ChapterEntity{

    @Id
    @Column(name = "ChapterNumber")
    private Integer chapterNumber;

    @Id
    @ManyToOne
    @JoinColumn(name = "StoryId")
    private StoryEntity story;

    @Column(name = "Name")
    private String name;

    @Column(name = "Content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "DateCreate")
    @CreatedDate
    private Timestamp dateCreate;

    @Column(name = "DateUpdate")
    @LastModifiedDate
    private Timestamp dateUpdate;

    @Column(name = "Views")
    private Integer views;


    public StoryEntity getStory() {
        return story;
    }

    public void setStory(StoryEntity story) {
        this.story = story;
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Timestamp getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Timestamp dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
}
