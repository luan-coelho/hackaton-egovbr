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
public class RespostaAvaliacao extends EntityClass {

    @ManyToOne
    @JoinColumn(name = "usuario_respostaavaliacao")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "avaliacao_respostaavaliacao")
    private Avaliacao avaliacao;

    @OneToMany
    @JoinColumn(name = "")
    private List<Resposta> respostas;

}
