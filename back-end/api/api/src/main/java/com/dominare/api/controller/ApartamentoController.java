package com.dominare.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominare.api.model.apartamento.ApartamentoModel;
import com.dominare.api.model.apartamento.ApartamentoRepository;

@RestController
@RequestMapping("/apartamento")

public class ApartamentoController {
    
    @Autowired
    private ApartamentoRepository repository;
    
    @GetMapping("/listar")

    public List <ApartamentoModel> listarApartamento(){
        return repository.findAll();
    }
}
