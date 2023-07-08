package com.Users.SpringUsers.mapper;

import com.Users.SpringUsers.dto.UsuarioDTO;
import com.Users.SpringUsers.entity.UsuarioEntity;
import com.Users.SpringUsers.model.UsuarioModel;
import com.Users.SpringUsers.request.UsuarioRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UsuarioMapper {

    public static UsuarioEntity modelToEntity(UsuarioModel model){
        return UsuarioEntity.builder()
                .id(model.getId())
                .nome(model.getNome())
                .sobrenome(model.getSobrenome())
                .email(model.getEmail())
                .nascimento(model.getNascimento())
                .telefone(model.getTelefone())
                .build();
    }

    public static UsuarioDTO modelToDTO(UsuarioModel model){
        return UsuarioDTO.builder()
                .nome(model.getNome())
                .email(model.getEmail())
                .telefone(model.getTelefone())
                .build();
    }

    public static UsuarioRequest modelToRequest(UsuarioModel model){
        return UsuarioRequest.builder()
                .nome(model.getNome())
                .sobrenome(model.getSobrenome())
                .email(model.getEmail())
                .nascimento(model.getNascimento())
                .telefone(model.getTelefone())
                .build();
    }

    public static UsuarioModel resquestToModel(UsuarioRequest usuarioRequest){
        return UsuarioModel.builder()
                .nome(usuarioRequest.getNome())
                .sobrenome(usuarioRequest.getSobrenome())
                .email(usuarioRequest.getEmail())
                .nascimento(usuarioRequest.getNascimento())
                .telefone(usuarioRequest.getTelefone())
                .build();
    }

    public static UsuarioEntity resquestToEntity(UsuarioRequest usuarioRequest){
        return UsuarioEntity.builder()
                .nome(usuarioRequest.getNome())
                .sobrenome(usuarioRequest.getSobrenome())
                .email(usuarioRequest.getEmail())
                .nascimento(usuarioRequest.getNascimento())
                .telefone(usuarioRequest.getTelefone())
                .build();
    }

    public static UsuarioModel entityToModel(UsuarioEntity usuarioEntity){
        return UsuarioModel.builder()
                .id(usuarioEntity.getId())
                .nome(usuarioEntity.getNome())
                .sobrenome(usuarioEntity.getSobrenome())
                .email(usuarioEntity.getEmail())
                .nascimento(usuarioEntity.getNascimento())
                .telefone(usuarioEntity.getTelefone())
                .build();
    }

    public static UsuarioModel entityToRequest(UsuarioEntity usuarioEntity){
        return UsuarioModel.builder()
                .nome(usuarioEntity.getNome())
                .sobrenome(usuarioEntity.getSobrenome())
                .email(usuarioEntity.getEmail())
                .nascimento(usuarioEntity.getNascimento())
                .telefone(usuarioEntity.getTelefone())
                .build();
    }

}
