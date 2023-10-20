package br.unitins.hackaton.egovbr.controller;

import java.util.List;

import br.unitins.hackaton.egovbr.model.Usuario;
import br.unitins.hackaton.egovbr.repository.UsuarioRepository;
import br.unitins.hackaton.egovbr.service.UsuarioService;
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

@Path("/usuario")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @Inject
    UsuarioService service;

    @Inject
    UsuarioRepository repository;

    @POST
    public Response create(Usuario a) {
        service.create(a);
        return Response.ok().build();
    }

    @GET
    public List<Usuario> getAll() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public Usuario getById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Usuario a) {
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
