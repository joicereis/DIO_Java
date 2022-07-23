/* Collections - Lista - PARTE 1
*Exercício:
*Crie e imprima uma lista de 7 notas
*Imprima a posição da nota 5
*Adicione e lista da nota 8 na posição 4
*Substitua a nota 5 pela nota 6
*Confira se a nota 5 está na lista
*Exiba todas as notas na ordem em que foram informados
*Exiba a terceira nota adicionada
*Exiba a menor nota
*Exiba a maior nota
*Exiba a soma dos valores
*Exiba a média das notas
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
		notas.add(7.0); // Adicionando valor tipo float à lista de tamanho indefinido
		notas.add(10d);// Adicionando valor tipo float à lista de tamanho indefinido
		notas.add(9.3);
		notas.add(8.2);
		notas.add(5.0);
		notas.add(5.8d);
		notas.add(9.6);

		// Imprima uma lista de 7 notas
		System.out.println(notas); // impressao da lista
		System.out.println(notas.toString()); // ; outro forma de imprimir a lista

		// Imprima a posição da nota 5
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));
		// No metodo index.of nós informamos o objeto e ele retorna um int que se refere
		// à posição iniciado por 0.

		// Adicione e lista da nota 8 na posição 4
		System.out.println("\nAdicionado a nota 8 na posição 4 da lista.");
		notas.add(4, 8d); // primeiro parâmetro é a posição e o segundo é o elemento que estou incluindo.
		System.out.println(notas);

		// Substitua a nota 5 pela nota 6
		System.out.println("\nSubstituição a nota 5 pela nota 6.");
		notas.set(notas.indexOf(5d), 6d); // usa o método indexOf para buscar a posição da nota 5 e o método set para
											// alterar o valor
		System.out.println(notas);

		// Confira se a nota 5 está na lista
		System.out.println("\nConferindo se a nota 5 está na lista.\n" + notas.contains(5d)); // retorna um boolean

		// Exiba todas as notas na ordem em que foram informados - O Lists já salva e
		// imprime de acordo com a ordem em que foi adicinado
		System.out.println("\nImprimindo na ordem que foram inseridos - PADRÃO DA LISTA");
		for (Double nota : notas)
			System.out.print(nota + "\t");

		// Exiba a terceira nota adicionada
		System.out.println("\n\nTerceira nota adicionada: " + notas.get(2)); // índex iniciado por 0.

		// Exiba a menor nota
		System.out.println("Menor nota adicionada: " + Collections.min(notas));
		// Nao existe um método nativo no List, mas por ser uma collection, eu consigo
		// usar o método mim da classe Colection

		// Exiba a maior nota
		System.out.println("Maior nota adicionada: " + Collections.max(notas));
		// Nao existe um método nativo no List, mas por ser uma collection, eu consigo
		// usar o método max da classe Colection

		// Exiba a soma dos valores
		Iterator<Double> iterador = notas.iterator(); // criação de variável

		Double soma = 0d;
		while (iterador.hasNext()) { // pergunta ao iterator se tem um próximo valor na lista antes mesmo de passar
										// pela posição 0
			Double proximo = iterador.next(); // caso exista um próximo, ele acessa esse valor
			soma += proximo;
		}
		System.out.println("A soma dos valores é: " + soma);

		// Exiba a média das notas
		System.out.println("A média dos elementos é: " + (soma / notas.size()));

		// Remova a nota 5.8
		System.out.println("Removendo a nota 5.8:");
		notas.remove(5.8d);
		// Se informar um valor inteiro no método remove o elemento naquele índice.Ex:
		// remove(1): o método remove a posição 1.
		// Se informar 1d, o método remove o elemento de vlr 1
		System.out.print(notas);

		System.out.println("\n\nRemovendo a nota da posição 5:");
		notas.remove(5);
		// Se informar um valor inteiro no método remove o elemento naquele índice.Ex:
		// remove(1): o método remove a posição 1.
		// Se informar 1d, o método remove o elemento de vlr 1
		System.out.print(notas);

		// Remova as notas menores que 8 e exiba a lista
		Iterator<Double> iterador2 = notas.iterator();

		while (iterador2.hasNext()) {
			Double proximo2 = iterador2.next();
			if (proximo2 < 8.5d) {
				iterador2.remove();
			}
		}
		System.out.println("\n\nRemoção de notas menores que 8:\n" + notas);

		// Apague toda a lista
		System.out.println("Apagando a lista.");
		notas.clear();
		System.out.println(notas);

		// Confira se a lista está vazia
		System.out.println("Confirmando se a lista está vazia: " + notas.isEmpty()); // retorna em true ou false
	}
}
