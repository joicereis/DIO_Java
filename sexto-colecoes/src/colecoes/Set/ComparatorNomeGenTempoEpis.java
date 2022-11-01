package colecoes.Set;

import java.util.Comparator;

public class ComparatorNomeGenTempoEpis implements Comparator<SerieStreaming> {

	@Override
	public int compare(SerieStreaming s1, SerieStreaming s2) {

		int nomeSerie = s1.getNome().compareTo(s2.getNome());
		// se o nome das series forem diferentes, retorne por nome
		if (nomeSerie != 0) {
			return nomeSerie;
		}

		int gen = s1.getGenero().compareTo(s2.getGenero());
		if (gen != 0) {
			return gen;
		}

		int tempoEpis = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
		return tempoEpis;

	}
}
