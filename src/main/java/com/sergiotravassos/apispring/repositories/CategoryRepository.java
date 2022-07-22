package com.sergiotravassos.apispring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiotravassos.apispring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
