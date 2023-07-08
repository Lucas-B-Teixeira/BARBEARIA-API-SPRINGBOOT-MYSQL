package com.Users.SpringUsers.controller;

import com.Users.SpringUsers.dto.ServicoDTO;
import com.Users.SpringUsers.entity.ServicoEntity;
import com.Users.SpringUsers.request.ServicoRequest;
import com.Users.SpringUsers.response.BaseResponse;
import com.Users.SpringUsers.service.ServicoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servico")
@AllArgsConstructor
public class ServicoController {

    ServicoService servicoService;

    @GetMapping
    public BaseResponse<List<ServicoDTO>> getAllServico(){
        return BaseResponse.<List<ServicoDTO>>builder()
                .httpCode(200)
                .message("OK")
                .response(servicoService.getAllServicos())
                .build();

    }

    @GetMapping("/get")
    public BaseResponse<ServicoEntity> getServico(@RequestBody() ServicoRequest s){
        return BaseResponse.<ServicoEntity>builder()
                .httpCode(200)
                .message("OK")
                .response(servicoService.getServico(s))
                .build();
    }

    @PostMapping()
    public BaseResponse<ServicoEntity> addServico(@RequestBody() ServicoRequest s){
        return BaseResponse.<ServicoEntity>builder()
                .httpCode(201)
                .message("Created")
                .response(servicoService.addServico(s))
                .build();
    }

    @PutMapping("/{id}")
    public BaseResponse<ServicoEntity> editServico(@PathVariable() int id, @RequestBody ServicoRequest s){
        return BaseResponse.<ServicoEntity>builder()
                .httpCode(200)
                .message("Edited")
                .response(servicoService.editServico(s, id))
                .build();
    }

    @DeleteMapping("/{id}")
    public BaseResponse<Boolean> deleteServico(@PathVariable() int id){
        return BaseResponse.<Boolean>builder()
                .httpCode(204)
                .message("Deleted")
                .response(servicoService.deleteServico(id))
                .build();
    }

}
