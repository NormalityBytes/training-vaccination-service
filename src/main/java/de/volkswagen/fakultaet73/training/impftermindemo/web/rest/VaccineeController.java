package de.volkswagen.fakultaet73.training.impftermindemo.web.rest;

import de.volkswagen.fakultaet73.training.impftermindemo.model.Vaccinee;
import de.volkswagen.fakultaet73.training.impftermindemo.service.VaccineeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("vaccinees")
public class VaccineeController {

    private VaccineeService service;

    public VaccineeController(VaccineeService service) {
        this.service = service;
    }

    @GetMapping
    List<Vaccinee> getAllVaccinees() {
        return service.getAllVaccinees();
    }

    @GetMapping("{uuid}")
    Vaccinee getOneVaccinee(@PathVariable UUID uuid) {
        return service.getOneVaccinee(uuid);
    }

    @PostMapping
    void addVaccinee(@RequestBody Vaccinee vaccinee) {
        service.addVaccinee(vaccinee);
    }

    @PutMapping
    void updateVaccinee(@RequestBody Vaccinee vaccinee) {
        service.addVaccinee(vaccinee);
    }

    @DeleteMapping("{uuid}")
    void deleteVaccinee(@PathVariable UUID uuid) {
        service.deleteVaccinee(uuid);
    }

}
