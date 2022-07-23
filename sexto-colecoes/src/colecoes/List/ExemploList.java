/* Collections - Lista - PARTE 1
*Exerc�cio:
*Crie e imprima uma lista de 7 notas
*Imprima a posi��o da nota 5
*Adicione e lista da nota 8 na posi��o 4
*Substitua a nota 5 pela nota 6
*Confira se a nota 5 est� na lista
*Exiba todas as notas na ordem em que foram informados
*Exiba a terceira nota adicionada
*Exiba a menor nota
*Exiba a maior nota
*Exiba a soma dos valores
*Exiba a m�dia das notas
*Remova a nota 5.8
*Remova as notas menores que 8 e exiba a lista
*Apague toda a lista
 */

package colecoes.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	public static void criaList() {
		// Crie uma lista de 7 notas
		System.out.println("Criando e imprimindo uma lista");
		List<Double> notas = new ArrayList<Double>(); // criando lista de dados do tipo Double
		notas.add(7.0); // Adicionando valor tipo float � lista de tamanho indefinido
		notas.add(10d);// Adicionando valor tipo float � lista de tamanho indefinido
		notas.add(9.3);
		notas.add(8.2);
		notas.add(5.0);
		notas.add(5.8d);
		notas.add(9.6);

		// Imprima uma lista de 7 notas
		System.out.println(notas); // impressao da lista
		System.out.println(notas.toString()); // ; outro forma de imprimir a lista

		// Imprima a posi��o da nota 5
		System.out.println("\nA posi��o da nota 5 �: " + notas.indexOf(5d));
		// No metodo index.of n�s informamos o objeto e ele retorna um int que se refere
		// � posi��o iniciado por 0.

		// Adicione e lista da nota 8 na posi��o 4
		System.out.println("\nAdicionado a nota 8 na posi��o 4 da lista.");
		notas.add(4, 8d); // primeiro par�metro � a posi��o e o segundo � o elemento que estou incluindo.
		System.out.println(notas);

		// Substitua a nota 5 pela nota 6
		System.out.println("\nSubstitui��o a nota 5 pela nota 6.");
		notas.set(notas.indexOf(5d), 6d); // usa o m�todo indexOf para buscar a posi��o da nota 5 e o m�todo set para
											// alterar o valor
		System.out.println(notas);

		// Confira se a nota 5 est� na lista
		System.out.println("\nConferindo se a nota 5 est� na lista.\n" + notas.contains(5d)); // retorna um boolean

		// Exiba todas as notas na ordem em que foram informados - O Lists j� salva e
		// imprime de acordo com a ordem em que foi adicinado
		System.out.println("\nImprimindo na ordem que foram inseridos - PADR�O DA LISTA");
		for (Double nota : notas)
			System.out.print(nota + "\t");

		// Exiba a terceira nota adicionada
		System.out.println("\n\nTerceira nota adicionada: " + notas.get(2)); // �ndex iniciado por 0.

		// Exiba a menor nota
		System.out.println("Menor nota adicionada: " + Collections.min(notas));
		// Nao existe um m�todo nativo no List, mas por ser uma collection, eu consigo
		// usar o m�todo mim da classe Colection

		// Exiba a maior nota
		System.out.println("Maior nota adicionada: " + Collections.max(notas));
		// Nao existe um m�todo nativo no List, mas por ser uma collection, eu consigo
		// usar o m�todo max da classe Colection

		// Exiba a soma dos valores
		Iterator<Double> iterador = notas.iterator(); // cria��o de vari�vel

		Double soma = 0d;
		while (iterador.hasNext()) { // pergunta ao iterator se tem um pr�ximo valor na lista antes mesmo de passar
										// pela posi��o 0
			Double proximo = iterador.next(); // caso exista um pr�ximo, ele acessa esse valor
			soma += proximo;
		}
		System.out.println("A soma dos valores �: " + soma);

		// Exiba a m�dia das notas
		System.out.println("A m�dia dos elementos �: " + (soma / notas.size()));

		// Remova a nota 5.8
		System.out.println("Removendo a nota 5.8:");
		notas.remove(5.8d);
		// Se informar um valor inteiro no m�todo remove o elemento naquele �ndice.Ex:
		// remove(1): o m�todo remove a posi��o 1.
		// Se informar 1d, o m�todo remove o elemento de vlr 1
		System.out.print(notas);

		System.out.println("\n\nRemovendo a nota da posi��o 5:");
		notas.remove(5);
		// Se informar um valor inteiro no m�todo remove o elemento naquele �ndice.Ex:
		// remove(1): o m�todo remove a posi��o 1.
		// Se informar 1d, o m�todo remove o elemento de vlr 1
		System.out.print(notas);

		// Remova as notas menores que 8 e exiba a lista
		Iterator<Double> iterador2 = notas.iterator();

		while (iterador2.hasNext()) {
			Double proximo2 = iterador2.next();
			if (proximo2 < 8.5d) {
				iterador2.remove();
			}
		}
		System.out.println("\n\nRemo��o de notas menores que 8:\n" + notas);

		// Apague toda a lista
		System.out.println("Apagando a lista.");
		notas.clear();
		System.out.println(notas);

		// Confira se a lista est� vazia
		System.out.println("Confirmando se a lista est� vazia: " + notas.isEmpty()); // retorna em true ou false
	}
}
