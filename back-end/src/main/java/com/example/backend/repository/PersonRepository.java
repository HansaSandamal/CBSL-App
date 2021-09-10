package com.example.backend.repository;

import com.example.backend.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person,String> {
    List<Person>findByNicContaining(String nic);

}
