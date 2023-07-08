package com.Users.SpringUsers.repository;

import com.Users.SpringUsers.model.ServicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServicoRepository extends JpaRepository<ServicoModel, Integer> {

    ServicoModel findByModeloAndTipo(String modelo, String tipo);

    void removeByModeloAndTipo(String modelo, String tipo);
}
