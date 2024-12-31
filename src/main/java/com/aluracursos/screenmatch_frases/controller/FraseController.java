package com.aluracursos.screenmatch_frases.controller;

import com.aluracursos.screenmatch_frases.DTO.FraseDTO;
import com.aluracursos.screenmatch_frases.model.Frase;
import com.aluracursos.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO getFraseAleatoria() {
        return service.obtenerFraseAleatoria();
    }

}
