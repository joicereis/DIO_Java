/*N�meros Aleat�rios:
 * Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100)
 * armazene-os num vetor. Ao final, mostre os n�meros e seus sucessores.
 */

package arrays;

import java.util.Random;

public class Exc3_NumerosAleatorios {
	public static void imprimeNrosAleatorios() {
		Random aleatorios = new Random(); //Random - classe que gera n�meros aleat�rios
		int[] vetorNrosAleatorios = new int[20];
		
		for(int indice = 0 ; indice < vetorNrosAleatorios.length; indice++) {
			vetorNrosAleatorios[indice] = aleatorios.nextInt(100);
		}
		System.out.println("N�meros aleat�rios");
		for (int elementos : vetorNrosAleatorios) {
			System.out.print(elementos + " ");
		}
		
		System.out.println("\n\nSucessores dos n�meros aleat�rios");
		for (int elementos : vetorNrosAleatorios) {
			System.out.print((elementos + 1 ) + " ");
		}
	}
}
