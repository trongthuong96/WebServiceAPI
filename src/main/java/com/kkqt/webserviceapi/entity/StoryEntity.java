package com.kkqt.webserviceapi.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Story")
@EntityListeners(AuditingEntityListener.class)
public class StoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "SummaryContent")
    private String SummaryContent;

    @Column(name = "Author")
    private String Author;

    @Column(name = "Image")
    private String Image;

    @Column(name = "Views")
    private Integer Views;

    @Column(name = "Follow")
    private Integer Follow;

    @Column(name = "Hot")
    private boolean Hot;

    @Column(name = "Hide")
    private boolean Hide;

    @Column(name = "DateCreate")
    @CreatedDate
    private Timestamp DateCreate;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private CategoryEntity Category;

    @ManyToOne
    @JoinColumn(name = "StatusId")
    private StatusEntity Status;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private UsersEntity User;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSummaryContent() {
        return SummaryContent;
    }

    public void setSummaryContent(String summaryContent) {
        SummaryContent = summaryContent;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Integer getViews() {
        return Views;
    }

    public void setViews(Integer views) {
        Views = views;
    }

    public Integer getFollow() {
        return Follow;
    }

    public void setFollow(Integer follow) {
        Follow = follow;
    }

    public boolean isHot() {
        return Hot;
    }

    public void setHot(boolean hot) {
        Hot = hot;
    }

    public boolean isHide() {
        return Hide;
    }

    public void setHide(boolean hide) {
        Hide = hide;
    }

    public Timestamp getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        DateCreate = dateCreate;
    }

    public CategoryEntity getCategory() {
        return Category;
    }

    public void setCategory(CategoryEntity category) {
        Category = category;
    }

    public StatusEntity getStatus() {
        return Status;
    }

    public void setStatus(StatusEntity status) {
        Status = status;
    }

    public UsersEntity getUser() {
        return User;
    }

    public void setUser(UsersEntity user) {
        User = user;
    }
}
