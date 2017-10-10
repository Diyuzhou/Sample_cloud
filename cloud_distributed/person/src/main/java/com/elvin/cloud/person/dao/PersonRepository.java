package com.elvin.cloud.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elvin.cloud.person.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
