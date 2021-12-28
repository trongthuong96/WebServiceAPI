package com.kkqt.webserviceapi.service.impl;

import com.kkqt.webserviceapi.converter.CategoryConverter;
import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;
import com.kkqt.webserviceapi.repository.CategoryRepository;
import com.kkqt.webserviceapi.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryConverter categoryConverter;

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity();
        if(categoryDTO.getId() != null){
            CategoryEntity oldCategoryEntity = categoryRepository.getById(categoryDTO.getId());
            categoryEntity = categoryConverter.toEntity(categoryDTO, oldCategoryEntity);
        }else {
            categoryEntity = categoryConverter.toEntity(categoryDTO);
        }
        categoryEntity = categoryRepository.save(categoryEntity);
        return categoryConverter.toDTO(categoryEntity);
    }

   /* @Override
    public CategoryDTO udate(CategoryDTO categoryDTO) {
        CategoryEntity oldCategoryEntity = categoryRepository.getById(categoryDTO.getId());
        CategoryEntity categoryEntity = categoryConverter.toEntity(categoryDTO, oldCategoryEntity);
        categoryEntity = categoryRepository.save(categoryEntity);
        return categoryConverter.toDTO(categoryEntity);
    }*/

    @Override
    public List<CategoryDTO> findAll() {
        List<CategoryEntity> entityList = categoryRepository.findAll();

        List<CategoryDTO> dtoList = new ArrayList<>();
        for (CategoryEntity item: entityList) {
            CategoryDTO dto = new CategoryDTO();
            dto = categoryConverter.toDTO(item);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public void delete(int[] ids) {
        for(int item: ids){
            CategoryEntity categoryEntity = categoryRepository.getById(item);
            categoryRepository.delete(categoryEntity);
        }
    }
}
