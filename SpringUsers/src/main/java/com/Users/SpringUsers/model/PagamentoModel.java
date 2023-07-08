package com.Users.SpringUsers.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "pagamentos")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private boolean pix;

    @Column(nullable = false)
    private boolean credito;

    @Column(nullable = false)
    private boolean aprovado;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_agend", referencedColumnName = "id")
    private AgendamentoModel idAgend;
}
