package loops;

import java.util.Scanner;

/* Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
	Ex.: 5!=5.4.3.2.1=120
	package loops;
 */

public class Exc6_Fatorial {
	public static void metodoFatorial() {
		Scanner digitado = new Scanner(System.in);
		int multiplicacao = 1;
		System.out.println("Digite um valor inteiro para encontrar o fatorial.");
		int fatorial = digitado.nextInt();
		System.out.println("\nFATORIAL");
		for (int i = fatorial ; i >= 1 ; i--){
			multiplicacao = multiplicacao * i;
			if(i == fatorial) {
				System.out.print(fatorial);
			}else if (i > 1) {
				System.out.print(" X " + i);
			}else if (i == 1) {
				System.out.print(" X " + i + " = " + multiplicacao );
			}
		}
		System.out.println("\n" + fatorial + "! = " + multiplicacao );
	}
}
