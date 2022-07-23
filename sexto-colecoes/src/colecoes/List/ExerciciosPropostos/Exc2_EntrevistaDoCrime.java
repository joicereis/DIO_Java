/*Excercício2 - Investigando um crime.
 * 0 respostas 'Sim' = Inocente;
 * 2 respostas 'Sim' = Suspeita;
 * 3 à 4 respostas 'Sim' = Cúmplice; e
 * 5 respostas 'Sim' = Assassino(a).
 */
package colecoes.List.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Exc2_EntrevistaDoCrime {

	public static void InvestigaSuspeito() {
		List<String> entrevista = new ArrayList<String>();
		Scanner scann = new Scanner(System.in);

		System.out.println("1- Telefonou para a vítima?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("2- Esteve no local do crime?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("3- Mora perto da vítima?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("4- Devia para à vítima?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("5- Já trabalhou com a vítima?");
		entrevista.add(scann.next().toLowerCase());

		int qtdRespostaSim = 0;
		String resposta;

		Iterator<String> contador = entrevista.iterator();
		while (contador.hasNext()) {
			if (contador.next().contains("s")) {
				qtdRespostaSim++;
			}
		}

		switch (qtdRespostaSim) {
		case 2:
			System.out.println("Suspeito(a).");
			break;
		case 3:
		case 4:
			System.out.println("Cúmplice.");
			break;
		case 5:
			System.out.println("Assassino(a).");
			break;
		default:
			System.out.println("Inocente.");
		}
		;
	}
}
