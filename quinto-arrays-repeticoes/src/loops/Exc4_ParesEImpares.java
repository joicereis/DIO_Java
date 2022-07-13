/*Par e Ímpar: Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a quantidade de números impares. */

package loops;

import java.util.Scanner;

public class Exc4_ParesEImpares {
	public static void metodoParesEImpares() {
		Scanner scan = new Scanner (System.in);
		int n = 0, numero, pares = 0, impares = 0;
		System.out.println("Digite um número inteiro.");
		n = scan.nextInt();
		System.out.println("\n");
		int contador = 1;
		while(contador <= n){
			System.out.println("Digite um número qualquer.");
			numero = scan.nextInt();
			if(numero % 2 == 0) // mod2
				pares ++;
			else
				impares ++ ;
			contador ++;
		}//fecha o while
		System.out.println("\nHá " + pares + " números pares.");
		System.out.println("Há " + impares + " números impares.");
	}
}
