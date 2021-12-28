package com.kkqt.webserviceapi.repository;

import com.kkqt.webserviceapi.entity.StoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StoryRepository extends JpaRepository<StoryEntity, Long> {
}
