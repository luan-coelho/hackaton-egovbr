package br.unitins.hackaton.egovbr.controller;

import br.unitins.hackaton.egovbr.dto.AvaliacaoDTO;
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

    @POST
    public Response create(AvaliacaoDTO dto){

        return null;
    }
}
