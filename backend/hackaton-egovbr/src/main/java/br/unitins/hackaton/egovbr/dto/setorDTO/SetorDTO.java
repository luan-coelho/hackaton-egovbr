package br.unitins.hackaton.egovbr.dto.setorDTO;

import br.unitins.hackaton.egovbr.model.Setor;

public record SetorDTO(Long id, String nome) {

    public static Setor dataTransferObjectToEntity(SetorDTO dto) {

        Setor setor = new Setor();
        setor.setNome(dto.nome);
        return setor;
    }

}
