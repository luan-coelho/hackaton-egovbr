package br.unitins.hackaton.egovbr.controller;

import java.util.List;

import br.unitins.hackaton.egovbr.model.Grupo;
import br.unitins.hackaton.egovbr.repository.GrupoRepository;
import br.unitins.hackaton.egovbr.service.GrupoService;
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

@Path("/grupo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GrupoController {

    @Inject
    GrupoService service;

    @Inject
    GrupoRepository repository;

    @POST
    public Response create(Grupo a) {
        service.create(a);
        return Response.ok().build();
    }

    @GET
    public List<Grupo> getAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Grupo getById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Grupo a) {
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
