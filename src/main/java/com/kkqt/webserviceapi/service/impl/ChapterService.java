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

        // check truyen tồn tại
        boolean checkStory = storyRepository.existsById(dto.getStoryId());

        // check chuong co trong truyen không
        boolean checkChapter = chapterRepository.existsByStoryIdAndChapterNumber(dto.getStoryId(), dto.getChapterNumber());
        if (checkChapter || !checkStory) {
            return null;
        } else {
            ChapterEntity entity = new ChapterEntity();
            entity = chapterConverter.toEntity(dto);
            StoryEntity storyEntity = storyRepository.getById(dto.getStoryId());
            entity.setStory(storyEntity);
            entity.setViews(0);
           entity = chapterRepository.save(entity);
            return chapterConverter.toDTO(entity);
        }
    }

    @Override
    public ChapterDTO edit(ChapterDTO dto) {
        ChapterEntity entity = new ChapterEntity();
        ChapterEntity oldChapter = chapterRepository.getByStoryIdAndChapterNumber(dto.getStoryId(), dto.getChapterNumber());
        entity = chapterConverter.toEntity(dto, oldChapter);
        StoryEntity storyEntity = storyRepository.getById(dto.getStoryId());
        entity.setStory(storyEntity);
        entity = chapterRepository.save(entity);
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
