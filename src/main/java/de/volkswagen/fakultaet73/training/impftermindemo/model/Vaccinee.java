package de.volkswagen.fakultaet73.training.impftermindemo.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vaccinee {

	// http://localhost:8082/api/vaccinees/2e347850-ebb3-4f4c-a53f-920b4c69a87f
	
	@Id
	private UUID uuid = UUID.randomUUID();
	
	private String name;
	private LocalDate birthdate;
	private String modeOfContact;
	
	private int vaccinationsReceived;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getModeOfContact() {
		return modeOfContact;
	}

	public void setModeOfContact(String modeOfContact) {
		this.modeOfContact = modeOfContact;
	}

	public int getVaccinationsReceived() {
		return vaccinationsReceived;
	}

	public void setVaccinationsReceived(int vaccinationsReceived) {
		this.vaccinationsReceived = vaccinationsReceived;
	}
}
