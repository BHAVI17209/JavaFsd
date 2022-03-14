package com.spring_sportyshoe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_sportyshoe.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}