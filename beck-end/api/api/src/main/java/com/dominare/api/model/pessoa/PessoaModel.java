package com.dominare.api.model.pessoa;

import com.dominare.api.model.apartamento.ApartamentoModel;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "pessoas")
@Entity
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")

public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dataDeNascimento;
    private String cpf;
    private String telefone;

    @Embedded
    // 
    private ApartamentoModel apartamento;
    @Enumerated(EnumType.STRING)
    private Relacao relacao;


    public PessoaModel(DadosCadastrosPessoa dados){
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.relacao = dados.relacao();
        this.apartamento = new ApartamentoModel(dados.apartamento());
    }


}
