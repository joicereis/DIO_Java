/*Par e �mpar: Fa�a um programa que pe�a N n�meros inteiros.
Calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares. */

package loops;

import java.util.Scanner;

public class Exc4_ParesEImpares {
	public static void metodoParesEImpares() {
		Scanner scan = new Scanner (System.in);
		int n = 0, numero, pares = 0, impares = 0;
		System.out.println("Digite um n�mero inteiro.");
		n = scan.nextInt();
		System.out.println("\n");
		int contador = 1;
		while(contador <= n){
			System.out.println("Digite um n�mero qualquer.");
			numero = scan.nextInt();
			if(numero % 2 == 0) // mod2
				pares ++;
			else
				impares ++ ;
			contador ++;
		}//fecha o while
		System.out.println("\nH� " + pares + " n�meros pares.");
		System.out.println("H� " + impares + " n�meros impares.");
	}
}
