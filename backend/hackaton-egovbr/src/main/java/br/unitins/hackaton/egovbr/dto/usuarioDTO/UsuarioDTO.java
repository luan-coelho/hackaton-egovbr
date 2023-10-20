package br.unitins.hackaton.egovbr.dto.usuarioDTO;

import java.util.Set;
import br.unitins.hackaton.egovbr.model.Perfil;
import br.unitins.hackaton.egovbr.model.Setor;
import br.unitins.hackaton.egovbr.model.Usuario;

public record UsuarioDTO(Long id, String nome, String cpf , String login, String email, String senha, String perfil) {

    public static Usuario dataTransferObjectToEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome);
        usuario.setCpf(dto.cpf);
        usuario.setLogin(dto.login);
        usuario.setEmail(dto.email);
        usuario.setSenha(dto.senha);
        usuario.setPerfil(Perfil.valueOf(dto.perfil));
        
        return usuario;
    }
    
}
