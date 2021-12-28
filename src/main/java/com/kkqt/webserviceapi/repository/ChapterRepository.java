package com.kkqt.webserviceapi.repository;

import com.kkqt.webserviceapi.entity.ChapterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<ChapterEntity, Integer> {
    ChapterEntity getByStoryIdAndChapterNumber(Long story_id, Integer chapterNumber);
    List<ChapterEntity> findByStoryId(Long story_id);
    boolean existsByChapterNumber(Integer chapterNumber);
}
