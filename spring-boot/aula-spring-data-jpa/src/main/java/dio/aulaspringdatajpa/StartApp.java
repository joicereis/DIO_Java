package dio.aulaspringdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aulaspringdatajpa.model.Usuario;
import dio.aulaspringdatajpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Usuario user = new Usuario();
        user.setNome("Joice");
        user.setUsuario("joicems");
        user.setSenha("senha123");
        
        repository.save(user);

        for(Usuario u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
