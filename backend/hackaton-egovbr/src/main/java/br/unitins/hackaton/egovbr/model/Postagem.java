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
public class Postagem extends EntityClass {

    @ManyToOne
    @JoinColumn(name = "avaliacao_postagem")
    private Avaliacao avaliacao;

    private String descricaoPostagem;

    private String tituloPostagem;

}
