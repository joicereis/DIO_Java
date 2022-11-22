package br.com.dio.exceptions.ExceptionCustomizada;

import javax.swing.JOptionPane;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int [] numerador = {4, 5, 8, 10};
        int [] denominador =  {2, 4, 0, 2, 8};
        for(int i = 0; i < denominador.length; i++){
            try{
            if(numerador[i] %2 != 0 & denominador[i] != 0) throw new DivisaoNaoExataException("Divisão não exata." , numerador[i], denominador[i]);
            int resultado =  numerador[i] / denominador[i];
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
           // System.out.println(resultado);
            }catch (DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch(ArithmeticException e ){
                JOptionPane.showMessageDialog(null, "Impossível dividir por zero." );
            }catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Os vetores possuem quantidade de elementos diferentes.");
            }
        }
        System.out.println("O programa continua...");
    }
}



//  | DivisaoPorZeroException | ArrayIndexOutOfBoundsException