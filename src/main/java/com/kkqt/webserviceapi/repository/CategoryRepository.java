package com.kkqt.webserviceapi.repository;

import com.kkqt.webserviceapi.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
