package com.example.imobiliare.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    private String nume;
    private String prenume;
    private Integer bani;
}
