package com.Users.SpringUsers.mapper;

import com.Users.SpringUsers.dto.PagamentoDTO;
import com.Users.SpringUsers.entity.PagamentoEntity;
import com.Users.SpringUsers.model.AgendamentoModel;
import com.Users.SpringUsers.model.PagamentoModel;
import com.Users.SpringUsers.service.AgendamentoService;

public class PagamentoMapper {

    static AgendamentoService aService;

    public static PagamentoDTO modelToDTO(PagamentoModel p){
        return PagamentoDTO.builder()
                .pix(p.isPix())
                .credito(p.isCredito())
                .aprovado(p.isAprovado())
                .build();
    }

    public static PagamentoModel DTOtoModel(PagamentoDTO p){
        return PagamentoModel.builder()
                .pix(p.isPix())
                .credito(p.isCredito())
                .aprovado(p.isAprovado())
                .idAgend(null)
                .build();
    }

    public static PagamentoEntity modelToEntity(PagamentoModel p){
        return PagamentoEntity.builder()
                .id(p.getId())
                .pix(p.isPix())
                .credito(p.isCredito())
                .aprovado(p.isAprovado())
                .idAgend(p.getIdAgend())
                .build();
    }

    public static PagamentoModel entityToModel(PagamentoEntity p){
        return PagamentoModel.builder()
                .id(p.getId())
                .pix(p.isPix())
                .credito(p.isCredito())
                .aprovado(p.isAprovado())
                .idAgend(p.getIdAgend())
                .build();
    }
}
