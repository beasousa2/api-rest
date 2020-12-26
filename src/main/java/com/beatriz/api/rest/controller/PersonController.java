package com.beatriz.api.rest.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beatriz.api.rest.model.Person;
import com.beatriz.api.rest.service.PersonService;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@GetMapping(path = "/all")
	public List<Person> get() {
		return service.get();
	}
	
	
}
