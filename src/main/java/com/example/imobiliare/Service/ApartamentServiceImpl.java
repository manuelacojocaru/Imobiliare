package com.example.imobiliare.Service;

import com.example.imobiliare.Dto.ApartamentConfiguration;
import com.example.imobiliare.Entity.Apartament;
import com.example.imobiliare.Repository.ApartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ApartamentServiceImpl implements ApartamentService {
    @Autowired
    private ApartamentRepository apartamentRepository;


    @Override
    public List<Apartament> getApartaments() {
        return (List<Apartament>) apartamentRepository.findAll();
    }

    @Override
    public Apartament getApartamentById(Integer id) {
        return apartamentRepository.findById(id).orElse(null);
    }

    @Override
    public Apartament createApartament(Apartament apartament) {
        return apartamentRepository.save(apartament);
    }

    @Override
    public Apartament deleteApartamentById(Integer id) {
        Apartament apartament = apartamentRepository.findById(id).orElse(null);
        if(apartament != null) {
            apartamentRepository.delete(apartament);
        }

        return apartament;
    }

    @Override
    public Apartament updateApartament(Apartament apartament) {
        return apartamentRepository.save(apartament);
    }

    @Override
    public List<Apartament> filterApartament(ApartamentConfiguration apartamentConfiguration) {
        List<Apartament> apartaments = getApartaments();
        if(apartamentConfiguration.getStartCamere() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getCamere() >= apartamentConfiguration.getStartCamere()
            ).toList();
        }
        if(apartamentConfiguration.getEndCamere() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getCamere() <= apartamentConfiguration.getEndCamere()
            ).toList();
        }

        if(apartamentConfiguration.getStartPret() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getPret() >= apartamentConfiguration.getStartPret()
            ).toList();
        }
        if(apartamentConfiguration.getStartPret() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getPret() <= apartamentConfiguration.getEndPret()
            ).toList();
        }

        if(apartamentConfiguration.getStartEtaj() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getEtaj() >= apartamentConfiguration.getStartEtaj()
            ).toList();
        }
        if(apartamentConfiguration.getEndEtaj() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getEtaj() <= apartamentConfiguration.getEndEtaj()
            ).toList();
        }

        if(apartamentConfiguration.getStartMp() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getMp() >= apartamentConfiguration.getStartMp()
            ).toList();
        }
        if(apartamentConfiguration.getEndMp() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getMp() <= apartamentConfiguration.getEndMp()
            ).toList();
        }
        if(apartamentConfiguration.getAdresa() != null) {
            apartaments = apartaments.stream().filter(
                    a -> a.getAdresa().contains(apartamentConfiguration.getAdresa())
            ).toList();
        }
        return apartaments;
    }
}
