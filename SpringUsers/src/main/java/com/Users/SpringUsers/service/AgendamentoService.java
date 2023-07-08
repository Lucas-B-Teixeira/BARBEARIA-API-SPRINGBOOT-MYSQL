package com.Users.SpringUsers.service;

import com.Users.SpringUsers.dto.AgendamentoDTO;
import com.Users.SpringUsers.entity.AgendamentoEntity;
import com.Users.SpringUsers.exception.ExceptionNotFound;
import com.Users.SpringUsers.mapper.AgendamentoMapper;
import com.Users.SpringUsers.mapper.PagamentoMapper;
import com.Users.SpringUsers.mapper.UsuarioMapper;
import com.Users.SpringUsers.model.AgendamentoModel;
import com.Users.SpringUsers.model.PagamentoModel;
import com.Users.SpringUsers.model.ServicoModel;
import com.Users.SpringUsers.model.UsuarioModel;
import com.Users.SpringUsers.repository.AgendamentoRepository;
import com.Users.SpringUsers.request.AgendamentoRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    ServicoService sService;
    UsuarioService uService;
    PagamentoService pService;

    public List<AgendamentoDTO> getAllAgend(){
        List<AgendamentoModel> listAgendModel = agendamentoRepository.findAll();

        List<AgendamentoDTO> listAgendDTO = AgendamentoMapper.modelToDTOList(listAgendModel);

        return listAgendDTO;
    }

    public List<AgendamentoEntity> getAgend(AgendamentoRequest a){
        List<AgendamentoEntity> agend = null;

        if(a.getDataAgend() != null && a.getHoraInicio() != null){
            agend = AgendamentoMapper.modelToEntityList(agendamentoRepository.findByDataAgendAndHoraInicio(a.getDataAgend(), a.getHoraInicio()));
        }else{
            throw new ExceptionNotFound("Agendamento with dataAgendo: " + a.getDataAgend() + ", horaInicio: " + a.getHoraInicio() + ", Not Found");
        }

        return agend;
    }

    public AgendamentoEntity addAgend(AgendamentoRequest a){
        UsuarioModel u = UsuarioMapper.entityToModel(uService.getUserByEmail(a.getEmailUsuario()));

        List<ServicoModel> s = sService.listServicos(a.getServicos());

        PagamentoModel p = PagamentoMapper.entityToModel(pService.addPagamento(a.getPagamento()));

        AgendamentoModel agend = agendamentoRepository.save(AgendamentoMapper.requestToModel(a, u, s, p));

        p.setIdAgend(agend);
        pService.refreshPagamento(p);

        return AgendamentoMapper.modelToEntity(agend);
    }

    public AgendamentoEntity editAgend(AgendamentoRequest a, int id){
       AgendamentoModel agendamento = agendamentoRepository.findById(id)
               .orElseThrow(() -> new ExceptionNotFound("Agendamento with id: " + id + ", Not Found"));

       agendamento.setDataAgend(a.getDataAgend());
       agendamento.setHoraInicio(a.getHoraInicio());
       agendamento.setHoraTermino(a.getHoraTermino());

        return AgendamentoMapper.modelToEntity(agendamentoRepository.save(agendamento));
    }

    public boolean deleteAgend(int id){
        agendamentoRepository.deleteById(id);
        return true;
    }

    public List<AgendamentoDTO> listAgendUsuario(String email){

        List<AgendamentoDTO> listAgend = AgendamentoMapper.modelToDTOList(
                                            agendamentoRepository.findByUsuarioEmail(email)
                                        );
        return listAgend;
    }
}
