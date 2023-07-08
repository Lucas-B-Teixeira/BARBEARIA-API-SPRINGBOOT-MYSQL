package com.Users.SpringUsers.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UsuarioEntity {

    private int id;

    private String nome;

    private String sobrenome;

    private String email;

    private String nascimento;

    private String telefone;

}
