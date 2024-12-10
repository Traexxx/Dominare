package com.dominare.api.model.pessoa;

public record AtualizarDadosPessoa(
    String nome,
    String cpf,
    String telefone,
    String bloco,
    String numeroApartamento,
    String relacao
) {
}
