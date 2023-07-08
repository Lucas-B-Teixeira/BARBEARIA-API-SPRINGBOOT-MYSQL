package com.Users.SpringUsers.service;

import com.Users.SpringUsers.dto.ServicoDTO;
import com.Users.SpringUsers.entity.ServicoEntity;
import com.Users.SpringUsers.exception.ExceptionNotFound;
import com.Users.SpringUsers.mapper.ServicoMapper;
import com.Users.SpringUsers.model.ServicoModel;
import com.Users.SpringUsers.repository.ServicoRepository;
import com.Users.SpringUsers.request.ServicoRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public List<ServicoDTO> getAllServicos(){
        List<ServicoModel> listAll = servicoRepository.findAll();

        List<ServicoDTO> listAllDTO = new ArrayList<>();

        for(ServicoModel s : listAll){
            listAllDTO.add(ServicoMapper.modelToDTO(s));
        }

        return listAllDTO;
    }

    public ServicoEntity getServico(ServicoRequest s){
        ServicoEntity servico;

        if(s.getModelo() != null && s.getTipo() != null){
            servico = ServicoMapper.modelToEntity(servicoRepository.findByModeloAndTipo(s.getModelo(), s.getTipo()));
        }else{
            throw new ExceptionNotFound("Servico with Modelo: " + s.getModelo() + ", Tipo: " + s.getTipo() + ", Not Found");
        }

        return servico;
    }

    public List<ServicoModel> listServicos(List<Integer> s){
        List<ServicoModel> listAll = servicoRepository.findAll();

        List<ServicoModel> servicos = new ArrayList<>();

        listAll.forEach(serv -> {
            if(s.contains(serv.getId())){
                servicos.add(serv);
            }
        });

        return servicos;
    }


    public boolean deleteServico(int id){
        servicoRepository.deleteById(id);
        return true;
    }

    public ServicoEntity addServico(ServicoRequest s){
        return ServicoMapper.modelToEntity(servicoRepository.save(ServicoMapper.requestToModel(s)));
    }

    public ServicoEntity editServico(ServicoRequest s, int id){
        ServicoEntity servicoEdit = ServicoMapper.modelToEntity(servicoRepository.findById(id)
                .orElseThrow(() -> new ExceptionNotFound("Servico with id: " + id + ", Not Found"))
        );

        servicoEdit.setTipo(s.getTipo());
        servicoEdit.setModelo(s.getModelo());
        servicoEdit.setDuracao(s.getDuracao());
        servicoEdit.setPreco(s.getPreco());

        return ServicoMapper.modelToEntity(servicoRepository.save(ServicoMapper.entityToModel(servicoEdit)));
    }

}
