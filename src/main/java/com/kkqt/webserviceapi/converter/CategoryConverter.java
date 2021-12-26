package com.kkqt.webserviceapi.converter;

import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryConverter {
    public CategoryEntity toEntity(CategoryDTO dto){
        CategoryEntity entity = new CategoryEntity();
        entity.setName(dto.getName());
        entity.setDescribes(dto.getDescribes());
        return entity;
    }

    public CategoryDTO toDTO(CategoryEntity entity){
        CategoryDTO dto = new CategoryDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescribes(entity.getDescribes());
        return dto;
    }

    public CategoryEntity toEntity(CategoryDTO dto, CategoryEntity entity){
        entity.setName(dto.getName());
        entity.setDescribes(dto.getDescribes());
        return entity;
    }
}
