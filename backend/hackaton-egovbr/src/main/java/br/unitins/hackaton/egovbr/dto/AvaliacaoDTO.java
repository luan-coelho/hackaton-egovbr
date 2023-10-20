package br.unitins.hackaton.egovbr.dto;

import java.util.List;

import br.unitins.hackaton.egovbr.model.Avaliacao;
import br.unitins.hackaton.egovbr.model.TemaPergunta;

public record AvaliacaoDTO(Long id, Long setor, List<TemaPergunta> temasPerguntas,
        String titulo, String descricao, boolean cocluida, boolean emProcesso, String sugestaoResultado,
        String planoAcaoSetor, String benfeitoriaRealizada) {

            public static Avaliacao dataTransferObjectEntity (AvaliacaoDTO dto){
                Avaliacao a = new Avaliacao();
                a.setTitulo(dto.titulo);
                a.setBenfeitoriaReaizada(dto.benfeitoriaRealizada);
                a.setPlanoAcaoSetor(dto.planoAcaoSetor);
                a.setDescricao(dto.descricao);
                a.setSugestaoResultado(dto.sugestaoResultado);
                a.setConcluida(dto.cocluida);
                a.setEmProcesso(dto.emProcesso);
                return a;
                
            }

}
