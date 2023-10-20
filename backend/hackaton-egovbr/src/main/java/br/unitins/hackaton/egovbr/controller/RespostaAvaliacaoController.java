package br.unitins.hackaton.egovbr.controller;

import java.util.List;

import br.unitins.hackaton.egovbr.model.RespostaAvaliacao;
import br.unitins.hackaton.egovbr.repository.RespostaAvaliacaoRepository;
import br.unitins.hackaton.egovbr.service.RespostaAvaliacaoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/respostaavaliacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RespostaAvaliacaoController {

    @Inject
    RespostaAvaliacaoService service;

    @Inject
    RespostaAvaliacaoRepository repository;

    @POST
    public Response create(RespostaAvaliacao a) {
        service.create(a);
        return Response.ok().build();
    }

    @GET
    public List<RespostaAvaliacao> getAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public RespostaAvaliacao getById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, RespostaAvaliacao a) {
        service.update(a);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {

        service.deleteById(id);
        return Response.ok().build();
    }
}
