package com.Users.SpringUsers.repository;

import com.Users.SpringUsers.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Users.SpringUsers.model.AgendamentoModel;

import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<AgendamentoModel, Integer> {

    List<AgendamentoModel> findByDataAgendAndHoraInicio(String dataAgend, String horaInicio);

    List<AgendamentoModel> findByUsuarioEmail(String email);

}
