package br.unitins.hackaton.egovbr.model;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends EntityClass {

    @Size(min = 3, max = 30)
    private String nome;

    @Size(min = 5, max = 20)
    private String login;

    private String email;

    private String senha;

    @Size(min = 11, max = 11)
    private String cpf;

    @ElementCollection
    @CollectionTable(name = "perfil_usuario", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id"))
    @Column(name = "perfil", length = 30)
    private Set<Perfil> perfis;

}
