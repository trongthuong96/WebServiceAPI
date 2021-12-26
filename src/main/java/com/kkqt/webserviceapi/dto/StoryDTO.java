package com.kkqt.webserviceapi.dto;

import com.kkqt.webserviceapi.entity.CategoryEntity;
import com.kkqt.webserviceapi.entity.StatusEntity;
import com.kkqt.webserviceapi.entity.UsersEntity;

import java.sql.Timestamp;

public class StoryDTO {
    private Long Id;
    private String Name;
    private String SummaryContent;
    private String Author;
    private String Image;
    private Integer Views;
    private Integer Follow;
    private boolean Hot;
    private boolean Hide;
    private Timestamp DateCreate;
    private CategoryEntity Category;
    private StatusEntity Status;
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
