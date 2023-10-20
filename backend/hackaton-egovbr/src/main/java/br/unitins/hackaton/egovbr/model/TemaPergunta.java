package br.unitins.hackaton.egovbr.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class TemaPergunta extends EntityClass {

    @Column(name = "nome")
    private String nome;

    @JoinColumn(name = "lista_pergunta_temaperguna")
    @OneToMany
    private List<Pergunta> perguntas;

}
