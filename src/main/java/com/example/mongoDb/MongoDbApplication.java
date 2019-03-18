package com.example.mongoDb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses=PersonRepository.class)
public class MongoDbApplication {

	@Autowired
	PersonRepository personrepo;
	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}
	
	public void run(String... args){
		Address address1=new Address
				("19 Imaginary Road", "Imaginary Place", "Imaginary City", "UK");
		Address address2=new Address
				("19 Imaginary Road", "Imaginary Place", "Imaginary City", "US");
		Hobby hobby1=new Hobby("Cricket");
		Hobby hobby2=new Hobby("Tennis");
		List<Hobby> hobbyList=new ArrayList<Hobby>();
		List<Address> addressList=new ArrayList<Address>();
		addressList.add(address1);
		addressList.add(address2);
		Person person=new Person("John","Doe", LocalDateTime.now(),addressList,"Software Engg",10000,hobbyList);
		
		personrepo.save(person);
		
		System.out.println("Find by first name");
		personrepo.findByFirstName("John").forEach(System.out::println);
		

	}

}
