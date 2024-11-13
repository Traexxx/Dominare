package com.dominare.api.model.visitas;

import org.hibernate.annotations.ValueGenerationType;

import com.dominare.api.model.apartamento.ApartamentoRepository;
import com.dominare.api.model.apartamento.DadosApartamento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "visitas")
@Entity
@AllArgsConstructor

@Setter
@Getter
@EqualsAndHashCode(of = "id")


public class VisitasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 
    private ApartamentoRepository apartamento;
    private String nome;
    private String cpf;
    private String data;
    private String numeroParaContato;
    
    private Boolean acessoLivre;

    // Contructor
    // public VisitasModel(DadosCadastroVisita dados){
        
    // } 
    
}
