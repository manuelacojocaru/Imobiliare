package com.example.imobiliare.Dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

@Data
public class ApartamentConfiguration {
    private Integer startPret;
    private Integer endPret;

    private Integer startCamere;
    private Integer endCamere;

    private Integer startEtaj;
    private Integer endEtaj;

    private Integer startMp;
    private Integer endMp;

    private String adresa;
}
