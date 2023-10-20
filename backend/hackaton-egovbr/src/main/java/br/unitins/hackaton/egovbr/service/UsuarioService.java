package br.unitins.hackaton.egovbr.service;

import br.unitins.hackaton.egovbr.dto.usuarioDTO.UsuarioDTO;
import br.unitins.hackaton.egovbr.dto.usuarioDTO.UsuarioResponseDTO;
import br.unitins.hackaton.egovbr.model.Usuario;
import br.unitins.hackaton.egovbr.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UsuarioService extends BaseService<Usuario,Long, UsuarioRepository>{

    @Inject
    UsuarioRepository nRepository;
    @Transactional
    public Usuario create(UsuarioDTO dto){

        Usuario user = UsuarioDTO.dataTransferObjectToEntity(dto);
        this.repository.persist(user);
        return user;
    }


}
