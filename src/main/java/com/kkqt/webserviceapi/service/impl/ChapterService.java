package com.kkqt.webserviceapi.service.impl;

import com.kkqt.webserviceapi.converter.ChapterConverter;
import com.kkqt.webserviceapi.dto.ChapterDTO;
import com.kkqt.webserviceapi.entity.*;
import com.kkqt.webserviceapi.repository.ChapterRepository;
import com.kkqt.webserviceapi.repository.StoryRepository;
import com.kkqt.webserviceapi.service.IChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService implements IChapterService {

    @Autowired
    private ChapterConverter chapterConverter;

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private StoryRepository storyRepository;

    @Override
    public ChapterDTO save(ChapterDTO dto) {
        ChapterEntity entity = new ChapterEntity();
        boolean checkStory = storyRepository.existsById(dto.getStoryId());
        boolean checkChapter = chapterRepository.existsByChapterNumber(dto.getChapterNumber());
        if (checkChapter && checkStory) {
            ChapterEntity oldChapter = chapterRepository.getByStoryIdAndChapterNumber(dto.getStoryId(), dto.getChapterNumber());
            entity = chapterConverter.toEntity(dto, oldChapter);
            StoryEntity storyEntity = storyRepository.getById(dto.getStoryId());
            entity.setStory(storyEntity);
            entity = chapterRepository.save(entity);
        } else if(checkStory) {
            entity = chapterConverter.toEntity(dto);
            entity.setViews(0);
            StoryEntity storyEntity = storyRepository.getById(dto.getStoryId());
            entity.setStory(storyEntity);
            entity = chapterRepository.save(entity);
        }
        return chapterConverter.toDTO(entity);
    }

    @Override
    public List<ChapterDTO> findAll(Long storyId) {
        List<ChapterEntity> entity = chapterRepository.findByStoryId(storyId);
        List<ChapterDTO> dtoList = new ArrayList<>();
        for(ChapterEntity i: entity){
            ChapterDTO dto = new ChapterDTO();
            dto = chapterConverter.toDTO(i);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public void delete(int[] chapterNumber, Long storyId) {
        for (int i: chapterNumber){
            ChapterEntity entity = chapterRepository.getByStoryIdAndChapterNumber(storyId, i);
            chapterRepository.delete(entity);
        }
    }
}
