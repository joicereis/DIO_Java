//Maior e M�dia: Fa�a um programa que leia 5 n�meros e informe o maior n�mero e a m�dia desses n�meros.
// DO WHILE - FA�A ENQUANTO

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
		System.out.println("A maior nota � " + notaMaior);
		System.out.println("A media � igual � " + somaNotas / (contador));
	}
}
