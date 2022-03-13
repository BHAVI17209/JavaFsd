package com.restful.webservices.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.webservices.entity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

	
}