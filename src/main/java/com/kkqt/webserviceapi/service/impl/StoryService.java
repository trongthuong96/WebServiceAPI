package com.kkqt.webserviceapi.service.impl;

import com.kkqt.webserviceapi.converter.StoryConverter;
import com.kkqt.webserviceapi.dto.StoryDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;
import com.kkqt.webserviceapi.entity.StatusEntity;
import com.kkqt.webserviceapi.entity.StoryEntity;
import com.kkqt.webserviceapi.entity.UserEntity;
import com.kkqt.webserviceapi.repository.CategoryRepository;
import com.kkqt.webserviceapi.repository.StatusRepository;
import com.kkqt.webserviceapi.repository.StoryRepository;
import com.kkqt.webserviceapi.repository.UserRepository;
import com.kkqt.webserviceapi.service.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoryService implements IStoryService {
    @Autowired
    private StoryRepository storyRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private StoryConverter storyConverter;

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private UserRepository userRepository;

    //insert and update
    @Override
    public StoryDTO save(StoryDTO storyDTO) {
        StoryEntity storyEntity = new StoryEntity();
        if (storyDTO.getId() != null) {
            StoryEntity oldStory = storyRepository.getById(storyDTO.getId());
            storyEntity = storyConverter.toEntity(storyDTO, oldStory);
        } else {
            storyEntity = storyConverter.toEntity(storyDTO);
            storyEntity.setFollow(0);
            storyEntity.setViews(0);
        }

        CategoryEntity categoryEntity = categoryRepository.getById(storyDTO.getCategoryId());
        storyEntity.setCategory(categoryEntity);
        StatusEntity statusEntity = statusRepository.getById(storyDTO.getStatusId());
        storyEntity.setStatus(statusEntity);
        UserEntity userEntity = userRepository.getById(storyDTO.getUserId());
        storyEntity.setUser(userEntity);

        storyEntity = storyRepository.save(storyEntity);
        return storyConverter.toDTO(storyEntity);
    }

    //show all story
    @Override
    public List<StoryDTO> findAll() {
        List<StoryEntity> list = storyRepository.findAll();
        List<StoryDTO> listDto = new ArrayList<>();
        for (StoryEntity i: list) {
            StoryDTO storyDTO = new StoryDTO();
            storyDTO = storyConverter.toDTO(i);
            listDto.add(storyDTO);
        }
        return listDto;
    }

    @Override
    public void delete(long[] ids) {
        for(long item: ids){
            StoryEntity storyEntity = storyRepository.getById(item);
            storyRepository.delete(storyEntity);
        }
    }
}
