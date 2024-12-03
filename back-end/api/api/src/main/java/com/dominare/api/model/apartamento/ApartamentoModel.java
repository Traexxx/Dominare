package com.dominare.api.model.apartamento;

import com.dominare.api.model.pessoa.Relacao;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Table(name = "apartamentos")
@Entity
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class ApartamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bloco;
    private int numero;
    @Enumerated(EnumType.STRING)
    private Relacao relacao;

    public ApartamentoModel(DadosApartamento dados) {
        this.bloco = dados.bloco();
        this.numero = dados.numero();
        this.relacao = dados.relacao();
    }

}
