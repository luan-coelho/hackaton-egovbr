package br.unitins.hackaton.egovbr.model;

import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    


}
