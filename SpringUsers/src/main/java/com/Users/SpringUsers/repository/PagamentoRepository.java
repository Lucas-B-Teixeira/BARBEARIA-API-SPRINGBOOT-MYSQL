package com.Users.SpringUsers.repository;

import com.Users.SpringUsers.model.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoModel, Integer> {

}
