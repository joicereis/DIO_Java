package interfaceMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Livro {
	String nome;
	Integer qtdPaginas;

	public Livro(String nome, Integer qtdPaginas) {
		super();
		this.nome = nome;
		this.qtdPaginas = qtdPaginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getqtdPaginas() {
		return qtdPaginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, qtdPaginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(qtdPaginas, other.qtdPaginas);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", qtdPaginas=" + qtdPaginas + "]";
	}
}

