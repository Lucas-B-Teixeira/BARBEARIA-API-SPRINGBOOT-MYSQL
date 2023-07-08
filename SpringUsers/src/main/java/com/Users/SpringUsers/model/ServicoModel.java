package com.Users.SpringUsers.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "servicos")
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String duracao;

    @Column(nullable = false)
    private double preco;

//    @ManyToMany(mappedBy = "servicos")
//    private Set<AgendamentoModel> agendamentos = new HashSet<>();

}
