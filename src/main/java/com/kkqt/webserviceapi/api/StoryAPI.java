package com.kkqt.webserviceapi.api;

import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.dto.DeleteDTO;
import com.kkqt.webserviceapi.dto.StoryDTO;
import com.kkqt.webserviceapi.service.ICategoryService;
import com.kkqt.webserviceapi.service.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class StoryAPI {
    @Autowired
    private IStoryService storyService;

    @GetMapping(value = "/story")
    public List<StoryDTO> GetStory(){
        return storyService.findAll();
    }

    @PostMapping(value = "/story")
    public StoryDTO CreateStory(@RequestBody StoryDTO model){
        return storyService.save(model);
    }

    @PutMapping(value = "/story")
    public StoryDTO UpdateStory(@RequestBody StoryDTO model){
        return storyService.save(model);
    }

    @DeleteMapping(value = "/story")
    public void DeleteStory(@RequestBody DeleteDTO model){
        storyService.delete(model.getIds());
    }
}
