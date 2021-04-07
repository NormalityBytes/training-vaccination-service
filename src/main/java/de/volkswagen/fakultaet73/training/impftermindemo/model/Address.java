package de.volkswagen.fakultaet73.training.impftermindemo.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private UUID uuid = UUID.randomUUID();
	
	private String street;
	private String zipCode;
	private String city;
	
}
