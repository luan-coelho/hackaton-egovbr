package br.unitins.hackaton.egovbr.service;

import br.unitins.hackaton.egovbr.repository.AvaliacaoExternaRespostaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import br.unitins.hackaton.egovbr.model.AvaliacaoExternaResposta;

@ApplicationScoped
public class AvaliacaoExternaRespostaService
        extends BaseService<AvaliacaoExternaResposta, Long, AvaliacaoExternaRespostaRepository> {

}
