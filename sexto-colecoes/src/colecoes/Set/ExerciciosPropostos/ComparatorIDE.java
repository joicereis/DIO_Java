package colecoes.Set.ExerciciosPropostos;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		int ide = linguagem1.getIde().compareToIgnoreCase(linguagem2.getIde());
		if(ide !=0 )
			return ide;
		
		//caso houver mais de um com a mesma IDE, o desempate é por nome
		int nome = linguagem1.getNome().compareToIgnoreCase(linguagem2.getNome());
		if(nome !=0 )
			return nome;
		
		int ano = Integer.compare(linguagem1.getAnoCriacao(), linguagem2.getAnoCriacao());
		return ano;
	}
}