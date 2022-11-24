package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int nro1, int nro2) {
        return nro1 + nro2;
    }
}
