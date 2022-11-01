package colecoes.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
	public static void ordenarConjunto() {

		Set<SerieStreaming> minhasSeries = new HashSet<>() {
			{
				add(new SerieStreaming("Got", "fantasia", 60));
				add(new SerieStreaming("Dark", "drama", 60));
				add(new SerieStreaming("That '70s Show", "comédia ", 25));
			}
		};

		// imprime por ordem aleatória. Implementação HashSet
		System.out.println("\t---Ordem aleatória.\t---");
		for (SerieStreaming serie : minhasSeries) {
			System.out.println(serie.getNome() + "- " + serie.getGenero() + "- " + serie.getTempoEpisodio() + "'");
		}

		// imprime por ordem de inserção. Implementação LinkedHashSet
		System.out.println("\n\t---Ordem de inserção.\t---");
		Set<SerieStreaming> minhasSeries2 = new LinkedHashSet<>() {
			{
				add(new SerieStreaming("Got", "fantasia", 60));
				add(new SerieStreaming("Dark", "drama", 60));
				add(new SerieStreaming("That '70s Show", "comédia ", 25));
			}
		};
		for (SerieStreaming serie : minhasSeries2) {
			System.out.println(serie.getNome() + "- " + serie.getGenero() + "- " + serie.getTempoEpisodio() + "'");
		}

		// imprime por ordem natural de acordo com o tempo de episódio. Implementação
		// TreeSet
		System.out.println("\n\t---Ordem de natural de acordo com o tempo de episódio.\t---");
		Set<SerieStreaming> minhasSeries3 = new TreeSet<>(minhasSeries2);

		// tem que existir o Comparable para saber qual ordem deve utilizar- criado na
		// classe SerieStreaming

		for (SerieStreaming serie : minhasSeries3) {
			System.out.println(serie.getNome() + "- " + serie.getGenero() + "- " + serie.getTempoEpisodio() + "'");
			/*
			 * se houver tempoEpisodio repetido, só imprime uma vez, pois o Set não recebe
			 * objetos iguais para corrigir isso vamos comparar por tempo e caso houver
			 * iguais, compara por genereo
			 */
		}

		// imprime por ordem Nome/Genero e Tempo - usando o Comparator
		System.out.println("\n\t---Ordem Nome/Genero e Tempo.\t---");
		Set<SerieStreaming> minhasSeries4 = new TreeSet(new ComparatorNomeGenTempoEpis());
		minhasSeries4.addAll(minhasSeries); // vai adicionar todos os dados que foram adicionados no conjuntos
											// minhasSeries, porém por Ordenação por Nome/ Gereno e Tempo
		for (SerieStreaming serie : minhasSeries4) {
			System.out.println(serie.getNome() + "- " + serie.getGenero() + "- " + serie.getTempoEpisodio() + "'");
			
		}
	}

}
