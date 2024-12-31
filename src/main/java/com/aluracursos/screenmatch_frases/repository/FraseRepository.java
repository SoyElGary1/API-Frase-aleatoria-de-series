package com.aluracursos.screenmatch_frases.repository;

import com.aluracursos.screenmatch_frases.DTO.FraseDTO;
import com.aluracursos.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository  extends JpaRepository<Frase, Long> {

    @Query(value = "SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Frase obtenerFraseAleatoria();
}
