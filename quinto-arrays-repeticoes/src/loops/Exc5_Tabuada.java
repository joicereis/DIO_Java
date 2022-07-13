/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 *O usuário deve informar de qual numero ele deseja ver a tabuada.
 *A saída deve ser conforme o exemplo abaixo:
	Tabuada de 5:
	5 X 1 = 5
	5 X 2 = 10
	...
	5 X 10 = 50
	  */

package loops;

import java.util.Scanner;

public class Exc5_Tabuada {
	public static void geraTabuada() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o multiplicador da tabuada. ");
		int multiplicando = teclado.nextInt(); //multiplicador indica quantas vezes será repetida
		System.out.println("\nTabuada de " +  multiplicando);
		for (int multiplicado = 0; multiplicado <= 10; multiplicado++) {
			System.out.println(multiplicando + " X " + multiplicado + " = " + (multiplicando * multiplicado ));
		}
	}
}
