package com.spring.api2;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.api2.entity.HobbyEntity;
import com.spring.api2.repository.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	private HobbyRepository hobbyRepository;
	
	public HobbyEntity addHobby(HobbyEntity entity)
	{
		return hobbyRepository.save(entity);
	}
	
	public String findByPersonId(int personId)
	{
		return hobbyRepository.findByPersonId(personId);
	}
}