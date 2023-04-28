package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.Person;

public interface PersonRepo  extends CrudRepository<Person,Integer>{

}
