package com.Users.SpringUsers.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagamentoDTO {
    private boolean pix;

    private boolean credito;

    private boolean aprovado;
}
