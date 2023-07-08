package com.Users.SpringUsers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class UsuarioDTO {

    private String nome;

    private String email;

    private String telefone;

}
