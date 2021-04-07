package de.volkswagen.fakultaet73.training.impftermindemo.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VaccinationCentre {

	@Id
	private UUID uuid = UUID.randomUUID();
	
	
	
}
