package com.Users.SpringUsers.dto;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO {

    private String dataAgend;

    private String horaInicio;

    private String horaTermino;

    private UsuarioDTO cliente;

    private List<ServicoDTO> servicos;

    private PagamentoDTO pagamento;
}
