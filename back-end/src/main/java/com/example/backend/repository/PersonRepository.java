package com.example.backend.repository;

import com.example.backend.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends MongoRepository<Person,String> {
    Optional<Person> findByNicContaining(String nic);
    List<Person> findByFirstNameContaining(String firstName);

}
