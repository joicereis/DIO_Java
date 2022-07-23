/*Excerc�cio2 - Investigando um crime.
 * 0 respostas 'Sim' = Inocente;
 * 2 respostas 'Sim' = Suspeita;
 * 3 � 4 respostas 'Sim' = C�mplice; e
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

		System.out.println("1- Telefonou para a v�tima?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("2- Esteve no local do crime?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("3- Mora perto da v�tima?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("4- Devia para � v�tima?");
		entrevista.add(scann.next().toLowerCase());
		System.out.println("5- J� trabalhou com a v�tima?");
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
			System.out.println("C�mplice.");
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
