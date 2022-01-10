package com.kkqt.webserviceapi.repository;

import com.kkqt.webserviceapi.entity.ChapterEntity;
import com.kkqt.webserviceapi.entity.StoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StoryRepository extends JpaRepository<StoryEntity, Long> {
    List<StoryEntity> findByCategoryId(Integer category_id);
    List<StoryEntity> findByNameContainingOrAuthorContainingOrSummaryContentContaining(String name, String author, String summaryContent);
    boolean existsById(Long id);
}
