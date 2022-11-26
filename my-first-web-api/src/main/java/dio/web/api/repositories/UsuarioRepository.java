package dio.web.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário.", id));
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o usuário na camada de repositório.", id));
        return new Usuario("joice","password123");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username para localizar um usuário.", username));
        return new Usuario("joice","password123");
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("joice","password123"));
        usuarios.add(new Usuario("ursula","ursa123"));
        return usuarios;
    }
}
