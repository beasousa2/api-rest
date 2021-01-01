package com.beatriz.api.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beatriz.api.rest.exceptions.DuplicateDataException;
import com.beatriz.api.rest.model.Person;
import com.beatriz.api.rest.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	public Person save(Person person) {
		
		boolean exist = this.findExistedPerson(person.getEmail(), person.getCpf());
	
		if(!exist) {
			return repository.save(person);
		} else {
			throw new DuplicateDataException(person.getEmail(), person.getCpf());
		}
		
	}
	
	public List<Person> get() {
		return repository.findAll();
	}
	
	public Optional<Person> getById(Long id) {
		return repository.findById(id);
	}
	
	private Boolean findExistedPerson(String email, String cpf) {
		Person findByEmail = repository.findByEmail(email);
		Person findByCpf = repository.findByCpf(cpf);
		
		if(findByEmail != null || findByCpf != null) {
			return true;
		} else {
			return false;
		}
		
		
		
	}
	
	
}
