package com.kkqt.webserviceapi.api;

import com.kkqt.webserviceapi.dto.ChapterDTO;
import com.kkqt.webserviceapi.dto.DeleteDTO;
import com.kkqt.webserviceapi.service.IChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChapterAPI {
    @Autowired
    private IChapterService chapterService;

    @GetMapping(value = "chapter/{storyId}")
    public List<ChapterDTO> ListChapter(@PathVariable("storyId") Long storyId){
        return chapterService.findAll(storyId);
    }

    @PostMapping(value = "/chapter")
    public ChapterDTO CreateChapter(@RequestBody ChapterDTO model){
        return chapterService.save(model);
    }

    @PutMapping(value = "/chapter")
    public ChapterDTO UpdateChapter(@RequestBody ChapterDTO model){
        return chapterService.edit(model);
    }

    @DeleteMapping(value = "/chapter")
    public void DeleteChapter(@RequestBody DeleteDTO model){
        chapterService.delete(model.getChapterNumber(), model.getStoryId());
    }
}
