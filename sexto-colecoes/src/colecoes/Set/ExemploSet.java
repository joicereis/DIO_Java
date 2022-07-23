package colecoes.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void criaEImprimeNotas() {
		System.out.println("Crie um conjunto e adicine notas.");
		// a interface set recebe os dados de forma natural e n�o por ordem de inser��o
		// A implementa��o hashSet recebe de forma aleat�ria e n�o recebe valores repetidos
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		
		/* a interface Set n�o possui m�todo get ou index e por isso n�o permite buscar e/ou fazer modifica��es por posi��o
		ou buscar por um valor */
		
		//Confira se a nota 5 est� no conjunto.
		System.out.println("Confira se a nota 5 est� no conjunto.\n" + notas.contains(5d));
		
		//Exiba a menor nota
		System.out.println("Exiba a menor nota.\n" + Collections.min(notas));
		
		//Exiba a maior nota
		System.out.println("Exiba a maior nota.\n" + Collections.max(notas));
		
		//Exiba a soma dos valores
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();;
		}
		System.out.println("Exiba a soma dos valores.\n" + soma);
		//lembrando que n�o se repete elementos
		
		//Exiba media das notas.
		System.out.println("Exiba media das notas.\n" + (soma / notas.size()));
		
		//Remova a nota 0, lembrando que deve ser informado o vlr como float, caso contr�rio ocorre a busca ppor �ndice.
		notas.remove(0d);
		System.out.println("Remova a nota 0.\n" + notas);
		
		//Remova as notas menores que 7 e exiba o conjunto.
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next() < 7) {
				iterator1.remove();
			}
		}
		System.out.println("Remova as notas menores que 7 e exiba o conjunto.\n" + notas);
		
		//Imprima os elementos na ordem em que foram informados.
		//Para essa situa��o n�o se pode usar o HashSet mas deve se usar o LinkedHashSet que imprime na ordem de inser��o
		System.out.println("Imprima os elementos na ordem em que foram informados.");
		Set<Double> notas2 = new LinkedHashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		//pode adicionar elemento por elemento usando o notas.add(7d)
		System.out.println(notas2); // n�o inser��o de valores repetidos
		
		//Exiba todas as notas na ordem crescente.
		//Permite ser feito utilizando a implementa��o TreeSet, pois ela organiza de acordo com a ordem NATURAL dos elementos
		System.out.println("Exiba todas as notas na ordem crescente.");
		Set<Double> notas3 = new TreeSet<Double>(notas2);
		System.out.println(notas3);
		
		//Apague todo o conjunto.
		System.out.println("Apague todo o conjunto.");
		notas.clear();
		
		 //Confira se o conjunto est� vazio.
		System.out.println("Confira se o conjunto 1 est� vazio.\nConjunto: " + notas);
		System.out.println("Confira se o conjunto 1 est� vazio: \n" + notas.isEmpty());
		System.out.println("Confira se o conjunto 2 est� vazio: \n" + notas2.isEmpty());
	}
}
