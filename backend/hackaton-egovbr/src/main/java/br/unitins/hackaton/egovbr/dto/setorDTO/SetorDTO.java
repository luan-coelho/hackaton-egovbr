package br.unitins.hackaton.egovbr.dto.setorDTO;
import java.util.List;
import br.unitins.hackaton.egovbr.model.Setor;
import br.unitins.hackaton.egovbr.model.Usuario;

public record SetorDTO(Long id, String nome,List<Usuario> usuarios) {

    public static Setor dataTransferObjectToEntity(SetorDTO dto){

        Setor setor = new Setor();
        setor.setNome(dto.nome);
        setor.setUsuarios(dto.usuarios);
        return setor;
    }
    
    
}
