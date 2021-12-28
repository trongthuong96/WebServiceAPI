package com.kkqt.webserviceapi.converter;

import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.dto.StoryDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;
import com.kkqt.webserviceapi.entity.StoryEntity;
import org.springframework.stereotype.Component;

@Component
public class StoryConverter {
    public StoryEntity toEntity(StoryDTO dto){
        StoryEntity entity = new StoryEntity();
        entity.setName(dto.getName());
        entity.setAuthor(dto.getAuthor());
        entity.setImage(dto.getImage());
        entity.setSummaryContent(dto.getSummaryContent());
        return entity;
    }

    public StoryDTO toDTO(StoryEntity entity){
        StoryDTO dto = new StoryDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDateCreate(entity.getDateCreate());
        dto.setFollow(entity.getFollow());
        dto.setHide(entity.isHide());
        dto.setHot(entity.isHot());
        dto.setImage(entity.getImage());
        dto.setSummaryContent(entity.getSummaryContent());
        dto.setViews(entity.getViews());
        dto.setCategoryId(entity.getCategory().getId());
        dto.setCategoryName(entity.getCategory().getName());
        dto.setStatusId(entity.getStatus().getId());
        dto.setStatusName(entity.getStatus().getName());
        dto.setUserId(entity.getUser().getId());
        dto.setUserName(entity.getUser().getName());
        dto.setAuthor(entity.getAuthor());
        dto.setFollow(entity.getFollow());
        dto.setViews(entity.getViews());
        return dto;
    }

    public StoryEntity toEntity(StoryDTO dto, StoryEntity entity){
        entity.setName(dto.getName());
        entity.setAuthor(dto.getAuthor());
        entity.setHide(dto.isHide());
        entity.setHot(dto.isHot());
        entity.setImage(dto.getImage());
        entity.setSummaryContent(dto.getSummaryContent());
        return entity;
    }
}
