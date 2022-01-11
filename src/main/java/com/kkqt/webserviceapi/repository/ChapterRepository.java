package com.kkqt.webserviceapi.repository;

import com.kkqt.webserviceapi.entity.ChapterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<ChapterEntity, Integer> {
    ChapterEntity getByStoryIdAndChapterNumber(Long story_id, Integer chapterNumber);
    List<ChapterEntity> findByStoryIdOrderByChapterNumberDesc(Long story_id);
    boolean existsByStoryIdAndChapterNumber(Long story_id, Integer chapterNumber);
}
