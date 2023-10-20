package br.unitins.hackaton.egovbr.service;

import br.unitins.hackaton.egovbr.dto.AvaliacaoDTO;
import br.unitins.hackaton.egovbr.model.Avaliacao;
import br.unitins.hackaton.egovbr.model.Setor;
import br.unitins.hackaton.egovbr.repository.AvaliacaoRepository;
import br.unitins.hackaton.egovbr.repository.SetorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class AvaliacaoService extends BaseService<Avaliacao, Long, AvaliacaoRepository> {

    @Inject
    SetorRepository setorRepository;

    @Transactional
    public Avaliacao create(AvaliacaoDTO dto){

        Setor s = setorRepository.findById(1l);
        Avaliacao av = AvaliacaoDTO.dataTransferObjectEntity(dto,s);
        this.repository.persist(av);
        return av;

    }
}
