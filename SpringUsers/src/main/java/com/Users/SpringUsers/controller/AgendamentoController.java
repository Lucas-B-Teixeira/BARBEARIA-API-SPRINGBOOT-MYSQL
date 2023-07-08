package com.Users.SpringUsers.controller;


import com.Users.SpringUsers.dto.AgendamentoDTO;
import com.Users.SpringUsers.entity.AgendamentoEntity;
import com.Users.SpringUsers.mapper.AgendamentoMapper;
import com.Users.SpringUsers.request.AgendamentoRequest;
import com.Users.SpringUsers.response.BaseResponse;
import com.Users.SpringUsers.service.AgendamentoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agend")
@AllArgsConstructor
public class AgendamentoController {

    private AgendamentoService agendamentoService;

    @GetMapping
    public BaseResponse<List<AgendamentoDTO>> getAllAgend(){
        return BaseResponse.<List<AgendamentoDTO>>builder()
                .httpCode(200)
                .message("OK")
                .response(agendamentoService.getAllAgend())
                .build();
    }

    @GetMapping("user")
    public BaseResponse<List<AgendamentoEntity>> getAgend(@RequestBody() AgendamentoRequest agend){
        return BaseResponse.<List<AgendamentoEntity>>builder()
                .httpCode(200)
                .message("OK")
                .response(agendamentoService.getAgend(agend))
                .build();
    }

    @GetMapping("/agendall")
    public BaseResponse<List<AgendamentoDTO>> getAllAgendUser(@RequestBody() AgendamentoRequest a){
        return BaseResponse.<List<AgendamentoDTO>>builder()
                .httpCode(200)
                .message("OK")
                .response(agendamentoService.listAgendUsuario(a.getEmailUsuario()))
                .build();
    }

    @PostMapping()
    public BaseResponse<AgendamentoEntity> addAgend(@RequestBody AgendamentoRequest agend){
        return BaseResponse.<AgendamentoEntity>builder()
                .httpCode(201)
                .message("Created")
                .response(agendamentoService.addAgend(agend))
                .build();
    }

    @PutMapping("/{id}")
    public BaseResponse<AgendamentoEntity> editAgend(@PathVariable() int id, @RequestBody AgendamentoRequest agend){
        return BaseResponse.<AgendamentoEntity>builder()
                .httpCode(200)
                .message("Edited")
                .response(agendamentoService.editAgend(agend, id))
                .build();
    }

    @DeleteMapping("/{id}")
    public BaseResponse<Boolean> deleteAgend(@PathVariable() int id){
        return BaseResponse.<Boolean>builder()
                .httpCode(204)
                .message("Deleted")
                .response(agendamentoService.deleteAgend(id))
                .build();
    }

}
