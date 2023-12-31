package br.unitins.hackaton.egovbr.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Avaliacao extends EntityClass{

    @ManyToOne
    @JoinColumn(name = "setor_avaliacao")
    private Setor setor;

    @OneToMany
    @JoinColumn(name = "temapergunta_avaliacao")
    private List<TemaPergunta> temasPergunta;

    private String titulo;

    private String descricao;

    private Boolean concluida;

    private Boolean emProcesso;

    private String sugestaoResultado;

    private String planoAcaoSetor;

    private String benfeitoriaReaizada;

}
