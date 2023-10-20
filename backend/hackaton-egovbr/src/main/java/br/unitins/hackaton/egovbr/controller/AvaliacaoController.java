package br.unitins.hackaton.egovbr.controller;

import br.unitins.hackaton.egovbr.dto.AvaliacaoDTO;
import br.unitins.hackaton.egovbr.model.Avaliacao;
import br.unitins.hackaton.egovbr.service.AvaliacaoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/avaliacoes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AvaliacaoController {

    @Inject
    AvaliacaoService avService;

    @POST
    public Response create(AvaliacaoDTO dto){
        Avaliacao av = avService.create(dto);
        return Response.ok(av).status(Response.Status.CREATED).build();
    }
}
