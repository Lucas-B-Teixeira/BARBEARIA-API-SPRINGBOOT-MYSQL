package com.Users.SpringUsers.mapper;

import com.Users.SpringUsers.dto.AgendamentoDTO;
import com.Users.SpringUsers.entity.AgendamentoEntity;
import com.Users.SpringUsers.entity.UsuarioEntity;
import com.Users.SpringUsers.model.AgendamentoModel;
import com.Users.SpringUsers.model.PagamentoModel;
import com.Users.SpringUsers.model.ServicoModel;
import com.Users.SpringUsers.model.UsuarioModel;
import com.Users.SpringUsers.request.AgendamentoRequest;
import com.Users.SpringUsers.service.PagamentoService;
import com.Users.SpringUsers.service.ServicoService;
import com.Users.SpringUsers.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class AgendamentoMapper {

    private static UsuarioService usuarioService;
    static ServicoService servicoService;
    static PagamentoService pagamentoService;

    public static AgendamentoEntity modelToEntity(AgendamentoModel a){
        return AgendamentoEntity.builder()
                .id(a.getId())
                .agendamento(a.getAgendamento())
                .dataAgend(a.getDataAgend())
                .horaInicio(a.getHoraInicio())
                .horaTermino(a.getHoraTermino())
                .usuario(UsuarioMapper.modelToDTO(a.getUsuario()))
                .servicos(ServicoMapper.listModelToDTO(a.getServicos()))
                .pagamento(PagamentoMapper.modelToDTO(a.getPagamento()))
                .build();
    }

    public static List<AgendamentoEntity> modelToEntityList(List<AgendamentoModel> a){
        List<AgendamentoEntity> listAgend = new ArrayList<>();

        for(AgendamentoModel b : a){
            listAgend.add(0, modelToEntity(b));
        }

        return listAgend;
    }

    public static AgendamentoDTO modelToDTO(AgendamentoModel a){
        return AgendamentoDTO.builder()
                .dataAgend(a.getDataAgend())
                .horaInicio(a.getHoraInicio())
                .horaTermino(a.getHoraTermino())
                .cliente(UsuarioMapper.modelToDTO(a.getUsuario()))
                .servicos(ServicoMapper.listModelToDTO(a.getServicos()))
                .pagamento(PagamentoMapper.modelToDTO(a.getPagamento()))
                .build();
    }

    public static List<AgendamentoDTO> modelToDTOList(List<AgendamentoModel> a){
        List<AgendamentoDTO> listAgend = new ArrayList<>();

        for(AgendamentoModel b : a){
            listAgend.add(0, modelToDTO(b));
        }

        return listAgend;
    }

    public static AgendamentoModel requestToModel(AgendamentoRequest a, UsuarioModel u, List<ServicoModel> s, PagamentoModel p){
        return  AgendamentoModel.builder()
                .agendamento(a.getAgendamento())
                .dataAgend(a.getDataAgend())
                .horaInicio(a.getHoraInicio())
                .horaTermino(a.getHoraTermino())
                .usuario(u)
                .servicos(s)
                .pagamento(p)
                .build();
    }
}
