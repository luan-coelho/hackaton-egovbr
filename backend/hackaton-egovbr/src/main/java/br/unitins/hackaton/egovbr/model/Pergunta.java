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
public class Pergunta extends EntityClass {

    @Column(name = "titulo")
    private String tituto;

    @JoinColumn(name = "alternativas_pergunta")
    @OneToMany
    private List<Alternativa> alternativas;

}
