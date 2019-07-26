package com.zavada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zavada.entity.CategoryEntity;

@Repository

public interface CategoryRepository  extends JpaRepository<CategoryEntity, Long> {

}
