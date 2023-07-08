package com.Users.SpringUsers.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioRequest {

    private String nome;

    private String sobrenome;

    private String email;

    private String nascimento;

    private String telefone;

}
