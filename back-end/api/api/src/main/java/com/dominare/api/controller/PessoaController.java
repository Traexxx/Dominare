package com.dominare.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.dominare.api.model.pessoa.DadosCadastrosPessoa;
import com.dominare.api.model.pessoa.PessoaModel;
import com.dominare.api.model.pessoa.PessoaRepository;

import jakarta.transaction.Transactional;

@Controller

public class PessoaController {

    @Autowired
    private PessoaRepository repository;
    
    // MÉTODOS HTTPS
    
    // Get
    @GetMapping("/")
    public String listarPessoas (Model model){
        model.addAttribute("pessoas", repository.findAll());
        return "listarPessoas";
    }

    @GetMapping("/cadastrar")
    public String mostrarFormulario (Model model){
        model.addAttribute("pessoa", new PessoaModel());
        return "cadastroMorador";
    }



    // Post
    @PostMapping
    @Transactional
    public String cadastrar (PessoaModel pessoa ){
        repository.save(pessoa);
        return "redirect:/";
    }


    // Put

    // Delete

}
