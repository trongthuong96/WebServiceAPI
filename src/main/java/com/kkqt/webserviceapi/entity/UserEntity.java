package com.kkqt.webserviceapi.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Pass")
    private String pass;

    @Column(name = "Email")
    private String email;

    @Column(name = "Image")
    private String image;

    @Column(name = "DateCreate")
    @CreatedDate
    private Timestamp dateCreate;

    @ManyToOne
    @JoinColumn(name = "RoleId")
    private RoleEntity role;

    @OneToMany(mappedBy = "user")
    private List<StoryEntity> stories = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<CommentEntity> comments = new ArrayList<>();

    @ManyToMany(mappedBy = "userFollow")
    private List<StoryEntity> storyFollow = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public List<StoryEntity> getStories() {
        return stories;
    }

    public void setStories(List<StoryEntity> stories) {
        this.stories = stories;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public List<StoryEntity> getStoryFollow() {
        return storyFollow;
    }

    public void setStoryFollow(List<StoryEntity> storyFollow) {
        this.storyFollow = storyFollow;
    }
}
