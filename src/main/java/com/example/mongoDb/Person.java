package com.example.mongoDb;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Id;

import java.util.List;
import java.util.*;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString(exclude = {"id", "dateOfBirth"})
@Document(collection = "people")
public class Person {
	
	@Id 
	private String id;
	  private String firstName;
	  private String secondName;
	  private LocalDateTime dateOfBirth;
	  private List<Address> addressList=new ArrayList<Address>();
	  private String profession;
	  private int salary;
	private List<Hobby> hobbies;

	/**
	 * @param id
	 * @param firstName
	 * @param secondName
	 * @param dateOfBirth
	 * @param address
	 * @param profession
	 * @param salary
	 * @param hobbies
	 */
	public Person( String firstName, String secondName, LocalDateTime dateOfBirth, List<Address> addressList,
			String profession, int salary, List<Hobby> hobbies) {
		super();
		
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfBirth = dateOfBirth;
		this.addressList = addressList;
		this.profession = profession;
		this.salary = salary;
		this.hobbies = hobbies;
	}
	
	
	
}
