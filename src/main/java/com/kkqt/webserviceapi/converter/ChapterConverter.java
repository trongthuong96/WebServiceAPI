package com.kkqt.webserviceapi.converter;

import com.kkqt.webserviceapi.dto.ChapterDTO;
import com.kkqt.webserviceapi.entity.ChapterEntity;
import org.springframework.stereotype.Component;

@Component
public class ChapterConverter {
    public ChapterEntity toEntity(ChapterDTO dto){
        ChapterEntity entity = new ChapterEntity();
        entity.setChapterNumber(dto.getChapterNumber());
        entity.setName(dto.getName());
        entity.setContent(dto.getContent());
        return entity;
    }

    public ChapterDTO toDTO(ChapterEntity entity){
        ChapterDTO dto = new ChapterDTO();
        dto.setStoryId(entity.getStory().getId());
        dto.setStoryName(entity.getStory().getName());
        dto.setChapterNumber(entity.getChapterNumber());
        dto.setName(entity.getName());
        dto.setContent(entity.getContent());
        dto.setDateCreate(entity.getDateCreate());
        dto.setDateUpdate(entity.getDateUpdate());
        dto.setViews(entity.getViews());
        return dto;
    }

    public ChapterEntity toEntity(ChapterDTO dto, ChapterEntity entity){
        entity.setChapterNumber(dto.getChapterNumber());
        entity.setName(dto.getName());
        entity.setContent(dto.getContent());
        return entity;
    }
}
