package br.unitins.hackaton.egovbr.controller;

import br.unitins.hackaton.egovbr.dto.usuarioDTO.UsuarioDTO;
import br.unitins.hackaton.egovbr.dto.usuarioDTO.UsuarioResponseDTO;
import br.unitins.hackaton.egovbr.model.Usuario;
import br.unitins.hackaton.egovbr.service.UsuarioService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioController {

    @Inject
    UsuarioService usuarioService;


    @POST
    @Path("/cadastrar")
    public Response insert(UsuarioDTO dto){

        Usuario user = usuarioService.create(dto);
        return Response.ok(user).status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id){
        Usuario u = usuarioService.findById(id);
        return Response.ok(u).status(Response.Status.FOUND).build();

    }


}
