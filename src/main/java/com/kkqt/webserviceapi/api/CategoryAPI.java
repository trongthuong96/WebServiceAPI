package com.kkqt.webserviceapi.api;

import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CategoryAPI {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping(value = "/category")
    public List<CategoryDTO> GetCategory(){
        return categoryService.findAll();
    }

    @PostMapping(value = "/category")
    public CategoryDTO CreateCategory(@RequestBody CategoryDTO model){
        return categoryService.save(model);
    }

    @PutMapping(value = "/category")
    public CategoryDTO UpdateCategory(@RequestBody CategoryDTO model){
        return categoryService.save(model);
    }

    @DeleteMapping(value = "/category")
    public void DeleteCategory(@RequestBody int[] ids){
        categoryService.delete(ids);
    }
}
