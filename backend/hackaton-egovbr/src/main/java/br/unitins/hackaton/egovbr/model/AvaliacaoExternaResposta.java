package br.unitins.hackaton.egovbr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AvaliacaoExternaResposta {
    DEFAULT(0, "Default"),
    ADMIN(2, "Admin");

    private int id;
    private String label;

    AvaliacaoExternaResposta(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static AvaliacaoExternaResposta valueOf(Integer id) throws IllegalArgumentException {
        if (id == null)
            return null;

        for (AvaliacaoExternaResposta avaliacaoExternaResposta : AvaliacaoExternaResposta.values()) {
            if (id.equals(avaliacaoExternaResposta.getId()))
                return avaliacaoExternaResposta;
        }
        throw new IllegalArgumentException("Id inválido:" + id);
    }

}
