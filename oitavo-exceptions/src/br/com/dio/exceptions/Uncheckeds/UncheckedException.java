package br.com.dio.exceptions.Uncheckeds;
import javax.swing.JOptionPane;
import javax.swing.*;

//TRATAMENTOS DE EXCEÇÕES UNCHECKEDS- Exceções geradas de acordo com o comportamento do código que não são obrigadas a serem tratadas

public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("Tratamentos de Exceptions.");

        boolean varControladora = true;
        do{ 
            String a = JOptionPane.showInputDialog("Numerador: "); //exibe msg em caixa de diálogo com a opção de input de dados.
        String b = JOptionPane.showInputDialog("Denominador: ");

        //try - cláusla usada para quando esperar que o código dê certo
        try {
            double resultado = resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));

            /*Ao trabalhar com exceptions em java, a linguagem entende que uma variável double com valor 0,000 é um valor infinito
             *essa situação nao ocorre quando há retorno de valores inteiros.
             Para tratar esse retorno de valor infinito é necessário comparar se o vlr retornado é maior que o valor máximo para o tipo double,
             caso sim, esse valor pode ser convertido para int ou apresentado a msd que é impossível dividir por 0.
            */
            if(resultado  < Double.MAX_VALUE){
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                varControladora = false;
            }
            else{
                resultado = 0;
                JOptionPane.showMessageDialog(null, "Não é possível realizar divisão por 0.\nTeste com retorno de tipo double.\n");
                //System.out.println("Impossível divisão por zero! ");
            }
          //  JOptionPane.showMessageDialog(null, "Resultado: " +  resultado);
        }
        //tratamento para caso o der errado o que se espera no try
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada de valores inválida, informe um número real. \n Erro: " + e.getMessage());
            //e.Message exibe ao usuário o erro que ocorreu mas não é recomendado ser exibidopara usuário final.     
       }
        
       //Esse catch de ArithmeticException só é válido quando retornar 0, porém do tipo inteiro, quando o retorno for de tipo flutuante, o retorno é infinity.
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Não é possível realizar divisão por 0.\nTeste com retorno de tipo inteiro.\n" +  e.getMessage());
       }
       
        // finally, é não obrigatório
        finally{
            System.out.println("Chegou no finally.");
        } 
        }while (varControladora == true);

        System.out.println("Continuação do código.");

    }
    public static double dividir(double a, double b) {
        return  a/b;
    }
}
