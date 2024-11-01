package com.dominare.api.model.apartamento;

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
    private String responsavel;

    public ApartamentoModel(DadosApartamento dados) {
        this.bloco = dados.bloco();
        this.numero = dados.numero();
        this.responsavel = dados.responsavel();
    }

}
