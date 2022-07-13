/* Nota: Fa�a um programa que pe�a uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inv�lido
 * e continue pedindo at� que o usu�rio informe um valor v�lido.
 */
package loops;

import java.util.Scanner;

public class Exc2_Nota {
	public static void metodoPedirNota() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota de 0 � 10.\nEm caso de n�meros reais, use a v�rgula.");
		float nota = scan.nextFloat();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida. Digite uma nota de 0 � 10.");
			nota = scan.nextFloat();
		}
		System.out.println("O valor da nota digitado foi " + nota + ".");		
		scan.close();
	}
}
