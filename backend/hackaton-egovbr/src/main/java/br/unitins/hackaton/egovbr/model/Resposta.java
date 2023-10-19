package br.unitins.hackaton.egovbr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Resposta extends EntityClass {

    @ManyToOne
    @JoinColumn(name = "pergunta_resposta")
    private Pergunta pergunta;

    @ManyToOne
    @JoinColumn(name = "altenativa_resposta")
    private Alternativa alternativa;

}
