package de.volkswagen.fakultaet73.training.impftermindemo.service;

import de.volkswagen.fakultaet73.training.impftermindemo.model.Vaccinee;
import de.volkswagen.fakultaet73.training.impftermindemo.repository.VaccineeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class VaccineeService {

    private VaccineeRepository repository;

    public VaccineeService(VaccineeRepository repository) {
        this.repository = repository;
    }

    public List<Vaccinee> getAllVaccinees() {
        return repository.findAll();
    }

    public Vaccinee getOneVaccinee(UUID uuid) {
        return repository.getOne(uuid);
    }

    public void addVaccinee(Vaccinee vaccinee) {
        if (repository.existsById(vaccinee.getUuid())) throw new IllegalArgumentException("Already in Database");
        repository.save(vaccinee);
    }

    public void updateVaccinee(Vaccinee vaccinee) {
        if (!repository.existsById(vaccinee.getUuid())) throw new IllegalArgumentException("Not in Database");
        repository.save(vaccinee);
    }

    public void deleteVaccinee(UUID uuid) {
        repository.deleteById(uuid);
    }

    /**
     * a vaccinee is eligible for vaccination if he is 60 years old and has less than 2 vaccinations already.
     */
    List<Vaccinee> findAllEligibleVaccinees() {
        return repository.findAllByBirthdateBeforeAndVaccinationsReceivedLessThan(LocalDate.now().minusYears(60), 2);
    }

}
