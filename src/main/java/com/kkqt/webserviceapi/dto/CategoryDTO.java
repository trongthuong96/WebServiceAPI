package com.kkqt.webserviceapi.dto;

public class CategoryDTO{
    private Integer Id;
    private String Name;
    private String Describes;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescribes() {
        return Describes;
    }

    public void setDescribes(String describes) {
        this.Describes = describes;
    }
}
