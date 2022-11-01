package interfaceMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoLivrosMap {
	public static void ordenandoLivros() {
		System.out.println("--Ordenação aleatória--"); // HashMap
		// declaração de dicionário que recebe o nome do autor como string e uma
		// instancia de objeto do tipo Livro com os atributos Nome e páginas
		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Hawking", new Livro("Uma breve história do Tempo", 256));
				put("Duhigg", new Livro("O poder do Hábito", 408));
				put("Harari", new Livro("21 Lições Para o Século 21", 432));
			}
		};

		// imprimir elementos separadamentes - usar o método entrySet
		for (Map.Entry<String, Livro> livroIterador : meusLivros.entrySet()) {
			System.out.println(livroIterador.getKey() + " - " + livroIterador.getValue().getNome());
		}

		/*******************************/
		System.out.println("\n--Ordem de inserção--"); // LinkedHashMap
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {
			{
				put("Hawking", new Livro("Uma breve história do Tempo", 256));
				put("Duhigg", new Livro("O poder do Hábito", 408));
				put("Harari", new Livro("21 Lições Para o Século 21", 432));
			}
		};
		for (Map.Entry<String, Livro> livroIterador2 : meusLivros2.entrySet()) {
			System.out.println(livroIterador2.getKey() + " - " + livroIterador2.getValue().getNome());
		}
		/*******************************/
		System.out.println("\n--Ordem de alfabética dos autores--"); // TreeMap
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);
		for (Map.Entry<String, Livro> livroIterador3 : meusLivros3.entrySet()) {
			System.out.println(livroIterador3.getKey() + " - " + livroIterador3.getValue().getNome());
		}
		/*******************************/
		System.out.println("\n--Ordem de alfabética do nomes dos livros--");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome()); // ordem alfabética dos livros
		// utilizar o coparator para comparar os valores do Set criado
		meusLivros4.addAll(meusLivros.entrySet()); // usa-se o entry set pq o 'meusLivros4' é um map.entry
		for (Map.Entry<String, Livro> livroIterador4 : meusLivros4) {
			System.out.println(livroIterador4.getKey() + " - " + livroIterador4.getValue().getNome() + " - "
					+ livroIterador4.getValue().getqtdPaginas());
		}

		/*******************************/
		System.out.println("\n--Ordenação por quantidade de páginas--");
		Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPagina());
		meusLivros5.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livroIterador5 : meusLivros5) {
			System.out.println(livroIterador5.getKey() + " - " + livroIterador5.getValue().getNome() + " - "
					+ livroIterador5.getValue().getqtdPaginas());
		}
	}
}
