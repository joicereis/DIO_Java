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
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class ExercicioProposto1_Estados {
	public static void ordenacoaEstados() {

		// criação de dicionário de estados
		Map<String, Integer> estadosNordeste = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};

		System.out.println("\n---Crie um dicionário e receba os estados e suas populações.");
		System.out.println("\n---Imprima dicionário em rdem aleatória.");
		/*
		 * for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet())
		 * { System.out.println(estadosIterador.getKey() + " - " +
		 * estadosIterador.getValue()); }
		 */
		System.out.println(estadosNordeste);
		/*******************************/
		// impressão com formatação
		System.out.println("\n---Substitua a população do estado do RN por 3.534.165 .");
		estadosNordeste.put("RN", 3534165);
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		System.out.println(
				"Confira se o estado da Paraíba (PB) está no dicionário, caso não, \nadicione-o com população de 4.039.277: ");
		estadosNordeste.put("PB", 4039277);
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		// o método get busca valor conforme a chave informada.
		System.out.println("\n---Exiba a populaçã de Pernambuco:\n" + estadosNordeste.get("PE"));
		/*******************************/
		System.out.println("\n---Exiba todos os estados e suas populações na ordem em que foram informados."); // LinkedHashMap
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
		System.out.println("\n---Exiba todos os estados e suas populações em ordem alfabética."); // TreeMap
		Map<String, Integer> estadosNordeste4 = new TreeMap<>(estadosNordeste);

		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste4.entrySet()) {
			System.out.println(estadosIterador.getKey() + " - " + estadosIterador.getValue());
		}
		/*******************************/
		System.out.println("\n---Exiba o estado com menor população e sua quantidade:");

		Integer menorPopulacao = Collections.min(estadosNordeste.values()); // menor valor encontrado

		String estadoMenosPopuloso = ""; //variável global
		// encontrando a chave no dicionário relacionado ao menor valor
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			if (estadosIterador.getValue() == menorPopulacao) {
				estadoMenosPopuloso = estadosIterador.getKey();
			}
		}
		System.out.println("O estado menos populoso é " + estadoMenosPopuloso + " com " + menorPopulacao + " habitantes.");
		
		/*******************************/
		System.out.println("\n---Exiba o estado com maior população e sua quantidade:");
		Integer maiorPopulacao = Collections.max(estadosNordeste.values());
		String estadoMaisPopuloso = "";
		for (Map.Entry<String, Integer> estadosIterador : estadosNordeste.entrySet()) {
			if(estadosIterador.getValue() == maiorPopulacao) {
				estadoMaisPopuloso = estadosIterador.getKey();
			}
		}
		System.out.println("O estado mais populoso é " + estadoMaisPopuloso + " com " + maiorPopulacao + " habitantes.");
		
		/*******************************/
		System.out.println("\n---Exiba a soma das populações dos estados.");
		int somaEstados = 0;
		for (Map.Entry<String, Integer> iteradorSoma : estadosNordeste.entrySet()) {
			somaEstados += iteradorSoma.getValue();
		}
		System.out.println("\n---A soma das populações dos estados é: " + somaEstados);

		/*******************************/
		System.out.println("\n---Exiba a média da população deste dicionário de estados:\n" + (somaEstados / estadosNordeste.size()));
		
		/*******************************/
		System.out.println("\n---Remova os estados com a população menor que 4.000.000: ");
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
		System.out.println("\nApague o dicionário de estados e confira se \n" + estadosNordeste);
		
		
	}
}
