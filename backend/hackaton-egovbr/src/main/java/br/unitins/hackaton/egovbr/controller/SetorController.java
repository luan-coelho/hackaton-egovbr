package br.unitins.hackaton.egovbr.controller;

import br.unitins.hackaton.egovbr.dto.setorDTO.SetorDTO;
import br.unitins.hackaton.egovbr.model.Setor;
import br.unitins.hackaton.egovbr.service.SetorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/setores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SetorController {

    @Inject
    SetorService setorService;

    @POST
    @Path("/cadastrar")
    public Response insert(SetorDTO dto) {

        Setor nSetor = setorService.create(dto);
        return Response.ok(nSetor).status(Response.Status.CREATED).build();

    }

}
