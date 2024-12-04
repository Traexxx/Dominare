package com.dominare.api.model.pessoa;

import com.dominare.api.model.apartamento.DadosApartamento;

public record DadosCadastrosPessoa(
        
        String nome,
        String dataDeNascimento,
        String cpf,
        String telefone,
        DadosApartamento apartamento,
        Relacao relacao) {

}
