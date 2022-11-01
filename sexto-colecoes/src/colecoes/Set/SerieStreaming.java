/*Ordenando elementos em um conjunto Set */

package colecoes.Set;

import java.util.Objects;

public class SerieStreaming implements Comparable<SerieStreaming> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	// construtor
	public SerieStreaming(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	// sobrescrever o to String
	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	// sobrescrever os HashCodes
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	// sobrescrever os equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SerieStreaming other = (SerieStreaming) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	// método criado pela implementeção Comparable na classe
	@Override
	public int compareTo(SerieStreaming serie) {
		
		int tempoEpisodio = this.getTempoEpisodio().compareTo(serie.getTempoEpisodio());
		if(tempoEpisodio != 0) { // se os tempos de episódio forem diferentes
			return tempoEpisodio;
		}
		
		//se o tempo de episodio for igual, vai comparar por genero
		int genero = this.getGenero().compareTo(serie.getGenero());
		return genero;

	}

}
