package br.unitins.hackaton.egovbr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Avaliacao {
    @ManyToOne
    private Setor setor;
    @OneToMany
    private List<Pergunta> perguntas;

    private String titulo;

    private String descricao;

    private Boolean concluida;

    private String sugestaoResultado;

}
