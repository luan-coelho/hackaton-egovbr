package br.unitins.hackaton.egovbr.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Grupo extends EntityClass {

    @Size(min = 3, max = 30)
    private String nome;


    private String caminhoIcone;

    @JoinColumn(name = "lista_setor_grupo")

    @OneToMany
    private List<Setor> setores;

}
