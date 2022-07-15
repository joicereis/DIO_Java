/*Array Multidimensional:
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 * Após isso determine o menor número da matriz e a sua posição(linha, coluna). */

package arrays;

import java.util.Random;

public class Exc4_ArrayMultidimensional {
	public static void imprimeMatriz() {
		Random nrosAleatorios = new Random();
		
		int[][] matriz = new int[4][4]; //declaração de matriz de tipo inteiro
		
		for(int linha = 0; linha < matriz.length ; linha++ ) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = nrosAleatorios.nextInt(9);
			}
		}
		System.out.println("MATRIZ:");
		for (int[] elementoDaLinha : matriz) { //imprime cada linha da matriz
			for (int elementoDaColuna : elementoDaLinha) { //imprime cada coluna da linha
				System.out.print(elementoDaColuna + " ");
			}
			System.out.println();
		}
	}
}
