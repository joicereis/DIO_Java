/*Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

package colecoes.List.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Exc1_Temperaturas {
	public static void listaTemperaturas() {
		Random aleatorios = new Random(); // Random - classe que gera n�meros aleat�rios

		double soma = 0;
		int nroAleatorio;
		double media = 0;
		// cria��o da lista com n�meros alet�rios
		List<Integer> temperaturas = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			nroAleatorio = aleatorios.nextInt(40);
			temperaturas.add(nroAleatorio);
			soma += nroAleatorio;
		}
		System.out.println("---Temperaturas ---\t");
		temperaturas.forEach(temp -> System.out.print(temp + " "));

		// m�dia das temperaturas semestral
		media = soma / 6;
		System.out.println("\n\nM�dia das temperaturas: \n" + (soma / temperaturas.size()));

		System.out.println("\nMeses na qual as temperaturas ficaram acima da m�dia: ");
		Iterator<Integer> iterator = temperaturas.iterator();

		int verificador = 0;
		while (iterator.hasNext()) {
			Integer temp = iterator.next();
			if (temp > media) {
				switch (verificador) {
				case (0):
					System.out.println("1 - Janeiro: " + temp);
					break;
				case (1):
					System.out.println("2 - Fevereiro: " + temp);
					break;
				case (2):
					System.out.println("3 - Mar�o: " + temp);
					break;
				case (3):
					System.out.println("4 - Abril: " + temp);
					break;
				case (4):
					System.out.println("5 - Maio: " + temp);
					break;
				case (5):
					System.out.println("6 - Junho: " + temp);
					break;
				default:
					System.out.println("N�o houve temperatura acima da m�dia.");
				}
			}
			verificador++;
		}
	};
}
