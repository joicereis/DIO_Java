import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println("Digite a string");
        Scanner scanner= new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
    
        if (s.isEmpty()) return true; // se s não for vazio
        //converte os caracteres para int ara achar o vlr na tabela aschi
        int abrir = (int) s.charAt(0); //recupera o vlr da posiCao 0 da string
        int fechar= (int) s.charAt(s.length()-1); //recupera o vlr do tamanho da srtring-1 pois a posicao inicia em 0

        if(abrir==40 && fechar==41){  //valores da tabela ASCHI 40 equivale ao símbolo '(' e 41 equivale ao símbolo ')'
            return true;
        }else if (abrir==91 && fechar==93){
            return true;
        }else if (abrir==123 && fechar==125){
            return true;
        }else{
            return false;
        }
    }
}