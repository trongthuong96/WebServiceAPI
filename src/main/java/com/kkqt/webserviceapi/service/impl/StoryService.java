package com.kkqt.webserviceapi.service.impl;

import com.kkqt.webserviceapi.dto.StoryDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;
import com.kkqt.webserviceapi.repository.CategoryRepository;
import com.kkqt.webserviceapi.repository.StoryRepository;
import com.kkqt.webserviceapi.service.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoryService implements IStoryService {
    @Autowired
    private StoryRepository storyRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public StoryDTO save(StoryDTO storyDTO) {
        return null;
    }
}
