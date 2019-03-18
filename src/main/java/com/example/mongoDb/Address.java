package com.example.mongoDb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
	
	private String addressLineOne;
	private String addressLineTwo;
	private String city;
	private String country	;
	/**
	 * @param addressLineOne
	 * @param addressLineTwo
	 * @param city
	 * @param country
	 */
	public Address(String addressLineOne, String addressLineTwo, String city, String country) {
		super();
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.country = country;
	}

	
	
}
