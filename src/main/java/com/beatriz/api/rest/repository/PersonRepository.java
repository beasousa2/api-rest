package com.beatriz.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatriz.api.rest.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
