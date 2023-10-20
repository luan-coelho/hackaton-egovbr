package br.unitins.hackaton.egovbr.service;
import br.unitins.hackaton.egovbr.model.Usuario;
import br.unitins.hackaton.egovbr.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioService extends BaseService<Usuario, Long, UsuarioRepository> {

}
