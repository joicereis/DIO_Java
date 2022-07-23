package colecoes.List;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		
		//retorna 0 quando os nomes são iguais, se retorna diferente de 0, deve retornar pelo nome
		if(nome != 0) {
			return nome;
		}
		
		//retorna 0 quando as cores são iguais, se retorna diferente de 0, deve retornar pelo cor
		int cor = g1.getNome().compareToIgnoreCase(g2.getCor());
		if (cor != 0) {
			return cor;
		}
		
		//se os nomes e cores forem iguais, devem retornar pela cor
		else {
			return Integer.compare(g1.getIdade(), g2.getIdade());
		}
	}
}
