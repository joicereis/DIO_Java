package interfaceMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class ExercicioProsposto2_LancamentoDeDados {
	public static void lancamentoDeDado() {
		int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0, qtd6 = 0;

		Random nroAleatorio = new Random();
		int digitado = 0;

		Map<Integer, Integer> lancamentosDado = new HashMap<>() {
			{
				int qtdLancamentos = 0;
				while (qtdLancamentos < 100) {
					put(qtdLancamentos, nroAleatorio.nextInt(6) + 1);
					qtdLancamentos++;
				}
			}
		};
		/*******************************/
		for (Map.Entry<Integer, Integer> jogadasIterador : lancamentosDado.entrySet()) {
			digitado = jogadasIterador.getValue();

			switch (digitado) {
			case (1):
				qtd1++;
				break;
			case (2):
				qtd2++;
				break;
			case (3):
				qtd3++;
				break;
			case (4):
				qtd4++;
				break;
			case (5):
				qtd5++;
				break;
			case (6):
				qtd6++;
				break;
			}

			System.out.println("Jogada " + jogadasIterador.getKey() + ":\t" + jogadasIterador.getValue());
		}
		System.out.println("\n");
		System.out.println("A quantidade de vezes que saíram o valor 1 foi: " + qtd1);
		System.out.println("A quantidade de vezes que saíram o valor 1 foi: " + qtd2);
		System.out.println("A quantidade de vezes que saíram o valor 1 foi: " + qtd3);
		System.out.println("A quantidade de vezes que saíram o valor 1 foi: " + qtd4);
		System.out.println("A quantidade de vezes que saíram o valor 1 foi: " + qtd5);
		System.out.println("A quantidade de vezes que saíram o valor 1 foi: " + qtd1);

	}
}
