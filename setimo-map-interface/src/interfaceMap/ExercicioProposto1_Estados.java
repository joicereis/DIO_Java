package interfaceMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
Dada a popula��o estimada de alguns estados do nordeste brasileiro, fa�a:
 Estado = PE - popula��o = 9.616.621
 Estado = AL - popula��o = 3.351.543
 Estado = CE - popula��o  = 9.187.103
 Estado = RN - popula��o = 3.534.265
 */

public class ExercicioProposto1_Estados {
	public static void ordenacoaEstados() {

		// cria��o de dicion�rio de estados
		Map<String, Integer> estadosNordeste = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};

		System.out.println("\n---Crie um dicion�rio e receba os estados e suas popula��es.");
		System.out.println("\n---Imprima dicion�rio em rdem aleat�ria.");
		/*
		 * for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet())
		 * { System.out.println(estadosIterador.getKey() + " - " +
		 * estadosIterador.getValue()); }
		 */
		System.out.println(estadosNordeste);
		/*******************************/
		// impress�o com formata��o
		System.out.println("\n---Substitua a popula��o do estado do RN por 3.534.165 .");
		estadosNordeste.put("RN", 3534165);
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		System.out.println(
				"Confira se o estado da Para�ba (PB) est� no dicion�rio, caso n�o, \nadicione-o com popula��o de 4.039.277: ");
		estadosNordeste.put("PB", 4039277);
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		// o m�todo get busca valor conforme a chave informada.
		System.out.println("\n---Exiba a popula�� de Pernambuco:\n" + estadosNordeste.get("PE"));
		/*******************************/
		System.out.println("\n---Exiba todos os estados e suas popula��es na ordem em que foram informados."); // LinkedHashMap
		Map<String, Integer> estadosNordeste2 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
				put("PB", 4039277);
			}
		};
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste2.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		System.out.println("\n---Exiba todos os estados e suas popula��es em ordem alfab�tica."); // TreeMap
		Map<String, Integer> estadosNordeste4 = new TreeMap<>(estadosNordeste);

		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste4.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		System.out.println("\n---Exiba o estado com menor popula��o e sua quantidade:");

		Integer menorPopulacao = Collections.min(estadosNordeste.values()); // menor valor encontrado

		String estadoMenosPopuloso = ""; //vari�vel global
		// encontrando a chave no dicion�rio relacionado ao menor valor
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			if (estadosIterador.getValue() == menorPopulacao) {
				estadoMenosPopuloso = estadosIterador.getKey();
			}
		}
		System.out.println("O estado menos populoso � " + estadoMenosPopuloso + " com " + menorPopulacao + " habitantes.");
		
		/*******************************/
		System.out.println("\n---Exiba o estado com maior popula��o e sua quantidade:");
		Integer maiorPopulacao = Collections.max(estadosNordeste.values());
		String estadoMaisPopuloso = "";
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			if(estadosIterador.getValue() == maiorPopulacao) {
				estadoMaisPopuloso = estadosIterador.getKey();
			}
		}
		System.out.println("O estado mais populoso � " + estadoMaisPopuloso + " com " + maiorPopulacao + " habitantes.");
		
		/*******************************/
		System.out.println("\n---Exiba a soma das popula��es dos estados.");
		int somaEstados = 0;
		for (Map.Entry<String, Integer> iteradorSoma : estadosNordeste.entrySet()) {
			somaEstados += iteradorSoma.getValue();
		}
		System.out.println("\n---A soma das popula��es dos estados �: " + somaEstados);

		/*******************************/
		System.out.println("\n---Exiba a m�dia da popula��o deste dicion�rio de estados:\n" + (somaEstados / estadosNordeste.size()));
		
		/*******************************/
		System.out.println("\n---Remova os estados com a popula��o menor que 4.000.000: ");
		Iterator<Integer> iterador = estadosNordeste.values().iterator();
		while (iterador.hasNext()){
			if(iterador.next() < 4000000 )
				iterador.remove();
		}
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}

		/*******************************/
		estadosNordeste.clear();
		System.out.println("\nApague o dicion�rio de estados e confira se \n" + estadosNordeste);
		
		
	}
}
