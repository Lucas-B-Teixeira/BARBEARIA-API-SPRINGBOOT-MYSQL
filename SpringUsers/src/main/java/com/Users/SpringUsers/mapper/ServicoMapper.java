package com.Users.SpringUsers.mapper;

import com.Users.SpringUsers.dto.ServicoDTO;
import com.Users.SpringUsers.entity.ServicoEntity;
import com.Users.SpringUsers.model.ServicoModel;
import com.Users.SpringUsers.request.ServicoRequest;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ServicoMapper {

    public static ServicoDTO modelToDTO(ServicoModel s){
        return ServicoDTO.builder()
                .tipo(s.getTipo())
                .modelo(s.getModelo())
                .duracao(s.getDuracao())
                .preco(s.getPreco())
                .build();
    }

    public static List<ServicoDTO> listModelToDTO(List<ServicoModel> s){
        List<ServicoDTO> listServico = new ArrayList<>();

        for(ServicoModel a : s){
            listServico.add(modelToDTO(a));
        }

        return listServico;
    }

    public static ServicoEntity modelToEntity(ServicoModel s){
        return ServicoEntity.builder()
                .id(s.getId())
                .tipo(s.getTipo())
                .modelo(s.getModelo())
                .duracao(s.getDuracao())
                .preco(s.getPreco())
                .build();
    }

    public static ServicoModel requestToModel(ServicoRequest s){
        return ServicoModel.builder()
                .tipo(s.getTipo())
                .modelo(s.getModelo())
                .duracao(s.getDuracao())
                .preco(s.getPreco())
                .build();
    }



    public static ServicoModel entityToModel(ServicoEntity s){
        return ServicoModel.builder()
                .id(s.getId())
                .tipo(s.getTipo())
                .modelo(s.getModelo())
                .duracao(s.getDuracao())
                .preco(s.getPreco())
                .build();
    }

    public static List<ServicoModel> listEntityToModel(List<ServicoEntity> s){
        List<ServicoModel> listServico = new ArrayList<>();

        for(ServicoEntity a : s){
            listServico.add(entityToModel(a));
        }

        return listServico;
    }
}
