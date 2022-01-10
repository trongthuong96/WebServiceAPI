package com.kkqt.webserviceapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Story")
@EntityListeners(AuditingEntityListener.class)
public class StoryEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "SummaryContent")
    private String summaryContent;

    @Column(name = "Author")
    private String author;

    @Column(name = "Image")
    private String image;

    @Column(name = "Views", columnDefinition = "int default 0", nullable = false)
    private Integer views;

    @Column(name = "Follow", columnDefinition = "int default 0", nullable = false)
    private Integer follow;

    @Column(name = "Hot", columnDefinition = "boolean default false")
    private boolean hot;

    @Column(name = "Hide", columnDefinition = "boolean default false")
    private boolean hide;

    @Column(name = "DateCreate")
    @CreatedDate
    private Timestamp dateCreate;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "StatusId")
    private StatusEntity status;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private UserEntity user;

    @OneToMany(mappedBy = "story")
    private List<ChapterEntity> chapters = new ArrayList<>();

    @OneToMany(mappedBy = "story")
    private List<CommentEntity> comments = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "FollowStory",
            joinColumns = @JoinColumn(name = "UserId"),
            inverseJoinColumns = @JoinColumn(name = "StoryId"))
    private List<StoryEntity> userFollow = new ArrayList<>();

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

    public String getSummaryContent() {
        return summaryContent;
    }

    public void setSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getFollow() {
        return follow;
    }

    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<ChapterEntity> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterEntity> chapters) {
        this.chapters = chapters;
    }

    public List<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public List<StoryEntity> getUserFollow() {
        return userFollow;
    }

    public void setUserFollow(List<StoryEntity> userFollow) {
        this.userFollow = userFollow;
    }
}
