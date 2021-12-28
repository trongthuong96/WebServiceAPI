package com.kkqt.webserviceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Content")
    private String content;

    @Column(name = "DateCreate")
    private Timestamp dateCreate;

    @Column(name = "DateUpdate")
    private Timestamp dateUpdate;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "StoryId")
    private StoryEntity story;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public StoryEntity getStory() {
        return story;
    }

    public void setStory(StoryEntity story) {
        this.story = story;
    }
}
