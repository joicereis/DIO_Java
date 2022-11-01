package colecoes.Set.ExerciciosPropostos;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	private String nome;
	private Integer anoCriacao;
	private String ide;

	// construtor
	public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.ide = ide;
	}

	// getters
	public String getNome() {
		return nome;
	}

	public Integer getAnoCriacao() {
		return anoCriacao;
	}

	public String getIde() {
		return ide;
	}

	// to String
	@Override
	public String toString() {
		return "[nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoCriacao, ide, nome);
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoCriacao, other.anoCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		return this.getNome().compareTo(linguagem.getNome());
	}
}
