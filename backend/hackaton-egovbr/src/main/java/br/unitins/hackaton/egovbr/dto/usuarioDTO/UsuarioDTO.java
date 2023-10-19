package br.unitins.hackaton.egovbr.dto.usuarioDTO;

import java.util.Set;
import br.unitins.hackaton.egovbr.model.Perfil;
import br.unitins.hackaton.egovbr.model.Usuario;

public record UsuarioDTO(Long id,String nome, String cpf , Set<Perfil> perfis) {

    public static Object valueOf(Usuario t) {
        return null;
    }
    
}
