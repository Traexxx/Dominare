package com.dominare.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominare.api.model.pessoa.DadosCadastrosPessoa;
import com.dominare.api.model.pessoa.PessoaModel;
import com.dominare.api.model.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/pessoa")

public class PessoaController {

    @Autowired
    private PessoaRepository repository;
    
    // MÉTODOS HTTPS
    
    // Get
    @GetMapping
    public List<PessoaModel>listarPessoas (){
        // alterar
        return repository.findAll();
    }



    // Post
    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody DadosCadastrosPessoa dados){
        repository.save(new PessoaModel(dados));
    }


    // Put

    // Delete

}
