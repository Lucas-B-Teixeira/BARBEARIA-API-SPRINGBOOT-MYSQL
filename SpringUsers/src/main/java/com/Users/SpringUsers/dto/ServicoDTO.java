package com.Users.SpringUsers.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ServicoDTO {
    private String tipo;

    private String modelo;

    private String duracao;

    private double preco;
}
