//ORDENAÇÃO DE LISTA
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

		System.out.println("\t---Ordem de inserção.\t---");
		System.out.println("Ordem aleatória\n" + meusGatos);

		System.out.println("\t---Ordem aleatória.\t---");
		Collections.shuffle(meusGatos); // método da classe collections que imprime a lista em ordem aleatória
		System.out.println(meusGatos);

		System.out.println("\t---Ordem natural (por Nome).\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

		System.out.println("\t---Ordena por idade.\t---");
		Collections.sort(meusGatos, new ComparatorIdade()); // esse método tem o mesmo resultado do debaixo
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
