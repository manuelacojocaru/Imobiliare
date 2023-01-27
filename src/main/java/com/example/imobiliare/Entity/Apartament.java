package com.example.imobiliare.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Apartament {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer pret;
    private Integer camere;
    private Integer etaj;
    private Integer mp;
    private String adresa;
}
