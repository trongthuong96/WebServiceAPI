package com.kkqt.webserviceapi.service;

import com.kkqt.webserviceapi.dto.StoryDTO;

import java.util.List;

public interface IStoryService {
    StoryDTO save(StoryDTO storyDTO);
    List<StoryDTO> findAll();
    List<StoryDTO> findByCategoryId(Integer id);
    List<StoryDTO> findByNameOrAuthorOrSummaryContent(String name, String author, String summaryContent);
    public void delete(long[] ids);
}
