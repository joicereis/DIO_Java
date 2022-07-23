//ORDENA��O DE LISTA
package colecoes.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Crie uma lista de gatos
public class ExemploOrdenacaoList {
	public static void listaGatos() {
		List<Gato> meusGatos = new ArrayList<>() {
			{
				/*
				 * add(new Gato("John",7, "preto")); add(new Gato("Simba", 4, "tigrado"));
				 * add(new Gato("Ursula", 2, "baunilha"));
				 */

				add(new Gato("John", 2, "preto"));
				add(new Gato("Simba", 4, "tigrado"));
				add(new Gato("John", 5, "baunilha"));
			}
		};

		System.out.println("\t---Ordem de inser��o.\t---");
		System.out.println("Ordem aleat�ria\n" + meusGatos);

		System.out.println("\t---Ordem aleat�ria.\t---");
		Collections.shuffle(meusGatos); // m�todo da classe collections que imprime a lista em ordem aleat�ria
		System.out.println(meusGatos);

		System.out.println("\t---Ordem natural (por Nome).\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

		System.out.println("\t---Ordena por idade.\t---");
		Collections.sort(meusGatos, new ComparatorIdade()); // esse m�todo tem o mesmo resultado do debaixo
		// meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);

		System.out.println("\t---Ordena por cor.\t---");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);

		// se os nomes forem iguais, compare por cor; se cor for igual; ordene por
		// idade.
		System.out.println("\t---Ordena por Nome/Cor/Idade.\t---");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}
