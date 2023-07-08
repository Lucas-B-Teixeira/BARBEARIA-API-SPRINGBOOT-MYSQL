package com.Users.SpringUsers.controller;

import com.Users.SpringUsers.dto.UsuarioDTO;
import com.Users.SpringUsers.entity.UsuarioEntity;
import com.Users.SpringUsers.request.UsuarioRequest;
import com.Users.SpringUsers.response.BaseResponse;
import com.Users.SpringUsers.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UsuarioController {

    private final UsuarioService userService;

    @GetMapping
    public BaseResponse<List<UsuarioDTO>> getAllUser(){
        return BaseResponse.<List<UsuarioDTO>>builder()
                .httpCode(200)
                .message("OK")
                .response(userService.getAllUser())
                .build();

    }

    @GetMapping("/{id}")
    public BaseResponse<UsuarioEntity> getUserById(@PathVariable() int id){
        return BaseResponse.<UsuarioEntity>builder()
                .httpCode(200)
                .message("OK")
                .response(userService.getUserById(id))
                .build();

    }

    @PostMapping
    public BaseResponse<UsuarioEntity> newUser(@RequestBody() UsuarioRequest user){
        return BaseResponse.<UsuarioEntity>builder()
                .httpCode(201)
                .message("Created")
                .response(userService.newUsuario(user))
                .build();
    }

    @PutMapping("/{id}")
    public BaseResponse<UsuarioEntity> newUser(@RequestBody() UsuarioRequest user, @PathVariable() int id){
        return BaseResponse.<UsuarioEntity>builder()
                .httpCode(201)
                .message("Edited")
                .response(userService.editUsuario(user, id))
                .build();
    }

    @DeleteMapping("/{id}")
    public BaseResponse<Boolean> deleteUser(@PathVariable() int id){
        return BaseResponse.<Boolean>builder()
                .httpCode(204)
                .message("OK")
                .response(Boolean.valueOf(userService.deleteUser(id)))
                .build();
    }
}
