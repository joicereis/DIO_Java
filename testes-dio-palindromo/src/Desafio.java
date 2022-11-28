import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite uma palavra: ");
      String palavra = sc.nextLine();
      boolean palindromo;
      palindromo = verificaPalindromo(palavra);
      
      String teste = "";
      teste = String.valueOf(palindromo).toUpperCase();

      System.out.println(teste);
      sc.close();
        
}

  public static boolean verificaPalindromo(String palavra ){
    String palavraInvertida = "";
    
    for(int i = palavra.length()-1; i >= 0; --i)
    {
      palavraInvertida += palavra.charAt(i); //atribui a palavraInvertida o caracter da posição i
    }
    if(palavraInvertida.equalsIgnoreCase(palavra)){
      return true ;
    }
    else{
      return false;
    }
  }
}