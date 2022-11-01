package colecoes.Set.ExerciciosPropostos;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exc2_OrdenacaoLinguagemFavorita {
	public static void ordenaConjuntoLinguagemFavorita() {
		Set<LinguagemFavorita> minhaLinguagem = new LinkedHashSet<>() {
			{
				add(new LinguagemFavorita("Java", 1991, "Eclipse")); 
				add(new LinguagemFavorita("C++", 1983, "Visual Studio"));
				add(new LinguagemFavorita("C", 1972, "Visual")); //1972
			}
		};
		
		// imprime por ordem de inserção. Implementação LinkedHashSet
		System.out.println("\n----Ordem de inserção----");
		for (LinguagemFavorita linguagemFavorita : minhaLinguagem) {
			System.out.println(linguagemFavorita.getNome() + "\t" + linguagemFavorita.getAnoCriacao() + "\t"
					+ linguagemFavorita.getIde());
		}

		System.out.println("\n----Ordem natural----");
		Set<LinguagemFavorita> minhaLinguagem2 = new TreeSet<>(minhaLinguagem);
		for (LinguagemFavorita linguagemFavorita2 : minhaLinguagem2) {
			System.out.println(linguagemFavorita2.getNome() + "\t" + linguagemFavorita2.getAnoCriacao() + "\t"
					+ linguagemFavorita2.getIde());
		}
		System.out.println("\n----Ordem por IDE----");
		Set<LinguagemFavorita> minhaLinguagem3 = new TreeSet<LinguagemFavorita>(new ComparatorIDE());
		minhaLinguagem3.addAll(minhaLinguagem);
		for (LinguagemFavorita linguagemFavorita3 : minhaLinguagem3) {
			System.out.println(linguagemFavorita3.getNome() + "\t" + linguagemFavorita3.getAnoCriacao() + "\t"
					+ linguagemFavorita3.getIde());
		}
		System.out.println("\n----Ordem por Ano de Criação e Nome----");
		Set<LinguagemFavorita> minhaLinguagem4  = new TreeSet<LinguagemFavorita>(new ComparatorAnoENomeLinguagens());
		minhaLinguagem4.addAll(minhaLinguagem2);
		for (LinguagemFavorita linguagemFavorita4 : minhaLinguagem4) {
			System.out.println(linguagemFavorita4.getNome() + "\t" + linguagemFavorita4.getAnoCriacao() + "\t"
					+ linguagemFavorita4.getIde());			
		}
		System.out.println("\n----Ordem por Nome/ Ano de Criação e IDE----");
		Set<LinguagemFavorita> minhaLinguagem5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoIde());
		minhaLinguagem5.addAll(minhaLinguagem);
		for (LinguagemFavorita linguagemFavorita5 : minhaLinguagem5) {
			System.out.println(linguagemFavorita5.getNome() + "\t" + linguagemFavorita5.getAnoCriacao() + "\t" + linguagemFavorita5.getIde());
		}
		System.out.println("\n----Exiba as linguagens no Console uma abaixo da outra----");
		for (LinguagemFavorita linguagemFavorita : minhaLinguagem5) {
			System.out.println(linguagemFavorita.getNome());
		}
	}
}
