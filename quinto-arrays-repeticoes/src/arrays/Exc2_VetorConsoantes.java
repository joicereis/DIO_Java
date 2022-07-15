package arrays;

import java.util.Scanner;
/* Consoantes: Faça um Programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

public class Exc2_VetorConsoantes {
	public static void metodoListaConsoantes() {
		
		Scanner teclado = new Scanner(System.in);
		String[] vetorConsoantes = new String[6];
		int qtdConsoantes = 0, contador = 0;
		String consoantes = "";

		do {
			System.out.println("Digite uma letra.");
			vetorConsoantes[contador]= teclado.next().toUpperCase();
	//		System.out.println(vetorConsoantes[0].getClass().getSimpleName()); //descobrindo o tipo de dado recebido
			if ( 
				! vetorConsoantes[contador].equals("A") &&
				! vetorConsoantes[contador].equals("E") &&
				! vetorConsoantes[contador].equals("I") &&
				! vetorConsoantes[contador].equals("O") &&
				! vetorConsoantes[contador].equals("U") )
				{
					qtdConsoantes ++;
					consoantes = (consoantes + " " + vetorConsoantes[contador]);
				}
			contador++;
		}while( contador < (vetorConsoantes.length));
		
		System.out.println("\nHá " + qtdConsoantes + " consoante(s).\n");
		System.out.println("Consoantes digitadas:" + consoantes);
		System.out.println("VETOR:");
		
		//for each - Para cada posição dentro do array eu quero que imprima o dado dessa poição
		for(String quantidade : vetorConsoantes ) {
			System.out.print(quantidade + "\t");
		}
	}
}
