package com.Users.SpringUsers.entity;

import com.Users.SpringUsers.dto.PagamentoDTO;
import com.Users.SpringUsers.dto.ServicoDTO;
import com.Users.SpringUsers.dto.UsuarioDTO;
import com.Users.SpringUsers.model.UsuarioModel;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgendamentoEntity {
    private int id;

    private LocalDate agendamento;

    private String dataAgend;

    private String horaInicio;

    private String horaTermino;

    private UsuarioDTO usuario;

    private List<ServicoDTO> servicos;

    private PagamentoDTO pagamento;
}
