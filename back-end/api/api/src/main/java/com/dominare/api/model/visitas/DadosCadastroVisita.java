package com.dominare.api.model.visitas;

public record DadosCadastroVisita(
    String DadosApartamento,
    String nome,
    String cpf,
    String data,
    String numeroParaContato,
    Boolean acessoLivre
) {
    
}
