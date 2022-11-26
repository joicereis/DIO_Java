package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping() //verbo para realizar interação com o repositório - definição de rota para o Spring saber qual mapeamento deverá realizar
    public List<Usuario> getListaUsuarios(){
        return repository.listAll();
    }
    @GetMapping("/{username}")
    //o PathVariable define que a variável da rota vai definir o vlr do parâmetro do método
    public Usuario getUsuario(@PathVariable("username") String username){ 
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")  //teste com Postman
    public void deleteUsuario(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    //realizar chamada de uri pelo postman
    @PostMapping()
    //O RequestBody converte a requisição para que seja passado o corpo da requisição como parâmetro
    public void postUsuario(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
