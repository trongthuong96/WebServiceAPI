package com.kkqt.webserviceapi.service;

import com.kkqt.webserviceapi.dto.StoryDTO;

import java.util.List;

public interface IStoryService {
    StoryDTO save(StoryDTO storyDTO);
    List<StoryDTO> findAll();
    public void delete(long[] ids);
}
