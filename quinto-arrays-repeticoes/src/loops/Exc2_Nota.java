/* Nota: Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido.
 */
package loops;

import java.util.Scanner;

public class Exc2_Nota {
	public static void metodoPedirNota() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma nota de 0 à 10.\nEm caso de números reais, use a vírgula.");
		float nota = scan.nextFloat();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida. Digite uma nota de 0 à 10.");
			nota = scan.nextFloat();
		}
		System.out.println("O valor da nota digitado foi " + nota + ".");		
		scan.close();
	}
}
