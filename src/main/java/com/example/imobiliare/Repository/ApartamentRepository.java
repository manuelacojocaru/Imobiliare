package com.example.imobiliare.Repository;

import com.example.imobiliare.Entity.Apartament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartamentRepository extends CrudRepository<Apartament, Integer> {
}
