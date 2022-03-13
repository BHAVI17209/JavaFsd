package com.spring.api2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.api2.entity.HobbyEntity;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>{

	@Query("select h.name from HobbyEntity h where h.personId= personId")
	public String findByPersonId(int personId);
}