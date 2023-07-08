package com.Users.SpringUsers.request;

import com.Users.SpringUsers.dto.PagamentoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgendamentoRequest {

    private LocalDate agendamento;

    private String dataAgend;

    private String horaInicio;

    private String horaTermino;

    private String emailUsuario;

    private List<Integer> servicos;

    private PagamentoDTO pagamento;
}
