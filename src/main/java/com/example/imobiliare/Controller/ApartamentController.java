package com.example.imobiliare.Controller;

import com.example.imobiliare.Dto.ApartamentConfiguration;
import com.example.imobiliare.Entity.Apartament;
import com.example.imobiliare.Service.ApartamentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApartamentController {
    @Autowired
    private ApartamentServiceImpl apartamentService;

    @GetMapping("/apartament")
    public List<Apartament> getApartaments() {
        return apartamentService.getApartaments();
    }
    @GetMapping("/apartament/{id}")
    public Apartament getApartamentById(@PathVariable Integer id) {
        return apartamentService.getApartamentById(id);
    }
    @PostMapping("/apartament")
    public Apartament createApartament(@RequestBody Apartament apartament) {
        return apartamentService.createApartament(apartament);
    }
    @DeleteMapping("/apartament/{id}")
    public Apartament deleteApartamentById(@PathVariable Integer id) {
        return apartamentService.deleteApartamentById(id);
    }
    @PutMapping("/apartament")
    public Apartament updateApartament(@RequestBody Apartament apartament) {
        return apartamentService.updateApartament(apartament);
    }
    @GetMapping("/apartament/filter")
    public List<Apartament> filterApartament(@RequestBody ApartamentConfiguration apartamentConfiguration) {
        return apartamentService.filterApartament(apartamentConfiguration);
    }
}
