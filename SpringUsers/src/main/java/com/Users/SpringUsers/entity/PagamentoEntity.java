package com.Users.SpringUsers.entity;
import com.Users.SpringUsers.model.AgendamentoModel;
import com.Users.SpringUsers.model.PagamentoModel;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagamentoEntity {

    private int id;

    private boolean pix;

    private boolean credito;

    private boolean aprovado;

    private AgendamentoModel idAgend;
}
