package com.kkqt.webserviceapi.api;

import com.kkqt.webserviceapi.dto.DeleteDTO;
import com.kkqt.webserviceapi.dto.StoryDTO;
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

    //show all
    @GetMapping(value = "/story")
    public List<StoryDTO> GetStory(){
        // find all
        return storyService.findAll();
    }

    //search
    @GetMapping(value = "/timkiem")
    public List<StoryDTO> SearchStory(@RequestParam(value = "theloai", defaultValue = "-1") Integer categoryId, @RequestParam(value = "tentruyen", defaultValue = "-1") String storyName, @RequestParam(value = "tacgia", defaultValue = "-1") String author, @RequestParam(value = "tomtat", defaultValue = "-1") String summary){

        // find story with name, author, summary content
        if (!(storyName.equals("-1") && author.equals("-1") &&  summary.equals("-1"))){
            return storyService.findByNameOrAuthorOrSummaryContent(storyName, author, summary);

        } // find story with categoryId
        else if(categoryId != -1){
            return storyService.findByCategoryId(categoryId);

        } // find all
        return null;
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
