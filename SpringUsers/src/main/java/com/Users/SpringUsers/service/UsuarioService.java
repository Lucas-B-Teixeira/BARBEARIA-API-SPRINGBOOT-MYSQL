package com.Users.SpringUsers.service;

import com.Users.SpringUsers.dto.UsuarioDTO;
import com.Users.SpringUsers.exception.ExceptionNotFound;
import com.Users.SpringUsers.mapper.UsuarioMapper;
import com.Users.SpringUsers.model.UsuarioModel;
import com.Users.SpringUsers.repository.UsuarioRepository;
import com.Users.SpringUsers.request.UsuarioRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Users.SpringUsers.entity.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioEntity getUserById(int id){
        return UsuarioMapper.modelToEntity(usuarioRepository.findById(id)
                .orElseThrow(() -> new ExceptionNotFound("User with " + id + " Not Found"))
        );
    }

    public UsuarioEntity getUserByIdModel(int id){
        return UsuarioMapper.modelToEntity(usuarioRepository.findById(id)
                .orElseThrow(() -> new ExceptionNotFound("User with " + id + " Not Found")));
    }

    public UsuarioEntity getUserByEmail(String email){
        return UsuarioMapper.modelToEntity(usuarioRepository.findByemail(email));
    }

    public List<UsuarioDTO> getAllUser(){
        List<UsuarioModel> listUserModel = usuarioRepository.findAll();

        List<UsuarioDTO> listUserDTO = new ArrayList<>();

        for(UsuarioModel u : listUserModel){
            listUserDTO.add(UsuarioMapper.modelToDTO(u));
        }

        return listUserDTO;
    }

    public UsuarioEntity newUsuario(UsuarioRequest user){
        return UsuarioMapper.modelToEntity(usuarioRepository.save(UsuarioMapper.resquestToModel(user)));
    }

    public UsuarioEntity editUsuario (UsuarioRequest user, int id){
        UsuarioEntity userEdit = UsuarioMapper.modelToEntity(usuarioRepository.findById(id)
                .orElseThrow(() -> new ExceptionNotFound("User with " + id + " Not Found")));
        userEdit.setNome(user.getNome());
        userEdit.setSobrenome(user.getSobrenome());
        userEdit.setEmail(user.getEmail());
        userEdit.setNascimento(user.getNascimento());
        userEdit.setTelefone(user.getTelefone());
        return UsuarioMapper.modelToEntity(usuarioRepository.save(UsuarioMapper.entityToModel(userEdit)));
    }

    public boolean deleteUser(int id){
        usuarioRepository.deleteById(id);
        return true;
    }
}
