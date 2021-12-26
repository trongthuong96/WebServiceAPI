package com.kkqt.webserviceapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "FullName")
    private String FullName;

    @Column(name = "Pass")
    private String Pass;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Image")
    private String Image;

    @Column(name = "DateCreate")
    private Timestamp DateCreate;

    @ManyToOne
    @JoinColumn(name = "RoleId")
    private RolesEntity Role;

    @OneToMany(mappedBy = "User")
    private List<StoryEntity> stories = new ArrayList<>();

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

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public Timestamp getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        DateCreate = dateCreate;
    }

    public RolesEntity getRole() {
        return Role;
    }

    public void setRole(RolesEntity role) {
        Role = role;
    }

    public List<StoryEntity> getStories() {
        return stories;
    }

    public void setStories(List<StoryEntity> stories) {
        this.stories = stories;
    }
}
