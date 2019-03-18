package com.example.mongoDb;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String>{

	List<Person> findByFirstName(String firstName);
	
	@Query("{'address.country': ?0}")
	List<Person> findByCountry(final String country);
	
}
