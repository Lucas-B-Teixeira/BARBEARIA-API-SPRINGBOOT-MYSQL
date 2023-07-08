package com.Users.SpringUsers.service;

import com.Users.SpringUsers.dto.PagamentoDTO;
import com.Users.SpringUsers.entity.PagamentoEntity;
import com.Users.SpringUsers.mapper.PagamentoMapper;
import com.Users.SpringUsers.model.PagamentoModel;
import com.Users.SpringUsers.repository.PagamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PagamentoService {

    @Autowired
    PagamentoRepository pagamentoRepository;

    public PagamentoEntity addPagamento(PagamentoDTO p){
        return PagamentoMapper.modelToEntity(pagamentoRepository.save(PagamentoMapper.DTOtoModel(p)));
    }

    public PagamentoEntity refreshPagamento(PagamentoModel p){
        return PagamentoMapper.modelToEntity(pagamentoRepository.save(p));
    }
}
