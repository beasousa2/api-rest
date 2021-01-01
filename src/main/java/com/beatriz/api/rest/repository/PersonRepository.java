package com.beatriz.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beatriz.api.rest.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	Person findByEmail(String email);
	
	Person findByCpf(String cpf);
}
