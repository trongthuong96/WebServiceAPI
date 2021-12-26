package com.kkqt.webserviceapi.service;

import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;

import java.util.List;

public interface ICategoryService {
    CategoryDTO save(CategoryDTO categoryDTO);
    /*CategoryDTO udate(CategoryDTO categoryDTO);*/
    List<CategoryDTO> findAll();
    public void delete(int[] ids);
}
