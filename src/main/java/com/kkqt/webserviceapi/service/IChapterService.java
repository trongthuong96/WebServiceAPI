package com.kkqt.webserviceapi.service;

import com.kkqt.webserviceapi.dto.ChapterDTO;

import java.util.List;

public interface IChapterService {
    ChapterDTO save(ChapterDTO dto);
    List<ChapterDTO> findAll(Long storyId);
    public void delete(int[] chapterNumber, Long storyId);
}
