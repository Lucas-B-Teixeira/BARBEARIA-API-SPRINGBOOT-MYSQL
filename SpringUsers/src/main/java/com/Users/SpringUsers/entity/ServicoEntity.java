package com.Users.SpringUsers.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServicoEntity {
    private int id;

    private String tipo;

    private String modelo;

    private String duracao;

    private double preco;
}
