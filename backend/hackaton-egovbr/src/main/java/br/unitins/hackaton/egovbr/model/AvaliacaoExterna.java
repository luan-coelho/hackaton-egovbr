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
public class AvaliacaoExterna extends EntityClass {
    @ManyToOne
    @JoinColumn(name = "usuario_avaliacaoexterna")
    private Usuario usuario;

    private AvaliacaoExternaResposta avaliacaoExternaResposta;

}
