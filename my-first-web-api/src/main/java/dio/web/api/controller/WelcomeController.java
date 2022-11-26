package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //componente Rest
public class WelcomeController {
    @GetMapping // defino que o método será um recurso/serviço http de verbo Get
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
}
