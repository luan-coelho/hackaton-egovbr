package br.unitins.hackaton.egovbr.dto.usuarioDTO;

import br.unitins.hackaton.egovbr.model.Usuario;

public record UsuarioResponseDTO(String nome , String cpf, String login , String email , String perfil) {
}
