package com.dominare.api.model.apartamento;
import com.dominare.api.model.pessoa.Relacao;
public record DadosApartamento(
    String bloco,
    int numero,
    Relacao relacao

) {
    
}
