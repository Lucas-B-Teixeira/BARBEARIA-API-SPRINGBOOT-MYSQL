package com.Users.SpringUsers.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicoRequest {
    private String tipo;

    private String modelo;

    private String duracao;

    private double preco;

}
