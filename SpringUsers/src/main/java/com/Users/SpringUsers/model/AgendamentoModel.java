package com.Users.SpringUsers.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "agendamentos")
public class AgendamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDate agendamento;

    @Column(nullable = false, name = "data_agend")
    private String dataAgend;

    @Column(nullable = false, name = "hora_inicio")
    private String horaInicio;

    @Column(nullable = false, name = "hora_termino")
    private String horaTermino;

    @ManyToOne()
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario;

    @ManyToMany
    @JoinTable(
            name = "servicos_has_agendamentos",
            joinColumns = @JoinColumn(name = "agendamento_id"),
            inverseJoinColumns = @JoinColumn( name = "servico_id")
    )
    private List<ServicoModel> servicos;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "pagamento_id", referencedColumnName = "id")
    private PagamentoModel pagamento;

}
