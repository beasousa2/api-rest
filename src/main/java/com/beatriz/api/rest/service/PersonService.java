package com.beatriz.api.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.beatriz.api.rest.model.Person;
import com.beatriz.api.rest.repository.PersonRepository;

public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	public Person save(Person person) {
		return repository.save(person);
	}
	
	public List<Person> get() {
		return repository.findAll();
	}
	
	public Optional<Person> getById(Long id) {
		return repository.findById(id);
	}
	
	
}
