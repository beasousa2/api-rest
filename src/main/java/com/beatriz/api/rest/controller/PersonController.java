package com.beatriz.api.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beatriz.api.rest.model.Person;
import com.beatriz.api.rest.service.PersonService;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@GetMapping("/all")
	public List<Person> get() {
		return service.get();
	}
	
	@PostMapping("/new")
	public Person save(@RequestBody Person person) {
		return service.save(person);
	}
	
	@GetMapping("/{id}")
	public Optional<Person> getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	
}
