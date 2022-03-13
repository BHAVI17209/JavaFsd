package com.spring.api1.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.api1.entity.PersonEntity;
import com.spring.api1.entity.Response;
import com.spring.api1.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository  personRepository;
	private RestTemplate restTemplate=new RestTemplate();
	public PersonEntity addPerson(PersonEntity pe)
	{
		return personRepository.save(pe);
	}
	
	
	public Response getPerson(int personId)
	{
		final String url="http://localhost:8082/apitwo/hobby/{personId}";
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("personId", personId);
		String result= restTemplate.getForObject(url, String.class,map);
		
		PersonEntity pe= personRepository.getById(personId);
		Response myResponse= new Response();
		myResponse.setPersonId(pe.getPersonId());
		myResponse.setName(pe.getName());
		myResponse.setAge(pe.getAge());
		myResponse.setHobby(result);
		
		return myResponse;
		
	}
}