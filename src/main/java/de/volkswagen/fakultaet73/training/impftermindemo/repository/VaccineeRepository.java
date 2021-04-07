package de.volkswagen.fakultaet73.training.impftermindemo.repository;

import de.volkswagen.fakultaet73.training.impftermindemo.model.Vaccinee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface VaccineeRepository extends JpaRepository<Vaccinee, UUID> {

    List<Vaccinee> findAllByBirthdateBeforeAndVaccinationsReceivedLessThan(LocalDate referenceDate, int maxVaccinationsReceived);

}
