/*Números Aleatórios:
 * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * armazene-os num vetor. Ao final, mostre os números e seus sucessores.
 */

package arrays;

import java.util.Random;

public class Exc3_NumerosAleatorios {
	public static void imprimeNrosAleatorios() {
		Random aleatorios = new Random(); //Random - classe que gera números aleatórios
		int[] vetorNrosAleatorios = new int[20];
		
		for(int indice = 0 ; indice < vetorNrosAleatorios.length; indice++) {
			vetorNrosAleatorios[indice] = aleatorios.nextInt(100);
		}
		System.out.println("Números aleatórios");
		for (int elementos : vetorNrosAleatorios) {
			System.out.print(elementos + " ");
		}
		
		System.out.println("\n\nSucessores dos números aleatórios");
		for (int elementos : vetorNrosAleatorios) {
			System.out.print((elementos + 1 ) + " ");
		}
	}
}
