//Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
// DO WHILE - FAÇA ENQUANTO

package loops;

import java.util.Scanner;

public class Exc3_Media {
	public static void metodoMedia() {
		Scanner scan = new Scanner(System.in);
		float  nota = 0, somaNotas = 0, notaMaior = 0;
		int contador = 0;
		do {
			System.out.println("Digite a nota " + (contador + 1) + ":" );
			nota = scan.nextFloat();
			if (nota > notaMaior){
				notaMaior =  nota;
			}
			contador += 1;
			somaNotas += nota ;
		}while(contador < 5);
		System.out.println("A maior nota é " + notaMaior);
		System.out.println("A media é igual à " + somaNotas / (contador));
	}
}
