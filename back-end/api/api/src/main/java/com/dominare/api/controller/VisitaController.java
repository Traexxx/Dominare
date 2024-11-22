package com.dominare.api.controller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominare.api.model.pessoa.PessoaModel;
import com.dominare.api.model.visitas.DadosCadastroVisita;
import com.dominare.api.model.visitas.VisitasModel;
import com.dominare.api.model.visitas.VisitasRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/visitas")

public class VisitaController {
    @Autowired
    private VisitasRepository repository;


    @GetMapping
    public List<VisitasModel>listarVisitas(){
        return repository.findAll();
    }
    
    // Fazer contructor
    // @PostMapping
    // @Transactional
    // public void cadastrar (@RequestBody DadosCadastroVisita dados){
    //     repository.save(new VisitasModel(dados));
    // }
}
