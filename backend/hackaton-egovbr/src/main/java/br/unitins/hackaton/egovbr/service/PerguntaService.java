package br.unitins.hackaton.egovbr.service;

import br.unitins.hackaton.egovbr.model.Pergunta;
import br.unitins.hackaton.egovbr.repository.PerguntaRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PerguntaService extends BaseService<Pergunta, Long, PerguntaRepository> {

}
