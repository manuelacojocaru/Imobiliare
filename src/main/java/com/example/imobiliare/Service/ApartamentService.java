package com.example.imobiliare.Service;

import com.example.imobiliare.Dto.ApartamentConfiguration;
import com.example.imobiliare.Entity.Apartament;

import java.util.List;

public interface ApartamentService {
    List<Apartament> getApartaments();
    Apartament getApartamentById(Integer id);
    Apartament createApartament(Apartament apartament);
    Apartament deleteApartamentById(Integer id);
    Apartament updateApartament(Apartament apartament);
    List<Apartament> filterApartament(ApartamentConfiguration apartamentConfiguration);
}
