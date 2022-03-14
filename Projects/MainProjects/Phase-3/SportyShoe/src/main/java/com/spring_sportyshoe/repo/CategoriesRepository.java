package com.spring_sportyshoe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_sportyshoe.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}