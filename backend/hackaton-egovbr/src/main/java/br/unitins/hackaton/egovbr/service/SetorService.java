package br.unitins.hackaton.egovbr.service;

import br.unitins.hackaton.egovbr.dto.setorDTO.SetorDTO;
import br.unitins.hackaton.egovbr.dto.usuarioDTO.UsuarioDTO;
import br.unitins.hackaton.egovbr.model.Setor;
import br.unitins.hackaton.egovbr.repository.SetorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SetorService extends BaseService<Setor, Long, SetorRepository> {

    @Transactional
    public Setor create(SetorDTO dto) {

        Setor nSetor = SetorDTO.dataTransferObjectToEntity(dto);
        this.repository.persist(nSetor);
        return nSetor;
    }

    public Setor addUser(Long id , UsuarioDTO dto){

        Setor = *-*
    }
}