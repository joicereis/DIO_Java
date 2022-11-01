package interfaceMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/* A interface Map não faz parte de uma Collection e ela utiliza elementos únicos (key) para cada valor */
import java.util.TreeMap;

public class ExemploMap {
	public static void manipulandoInterfaceMap() {
		System.out.println("\nDicionário com modelos de veículos e seus respectivos consumos.");

		/*
		 * Implementação do tipo Map com elementos que possuem chaves do tipo string e
		 * valores do tipo double. HashMap itera os elementos de forma aleatória;
		 * LinkedHashMap itera os elementos de acordo com a ordem de inserção; TreeMap
		 * itera os elementos de acordo com a ordem natual (alfabética ou do menor para
		 * maior)
		 */

		Map<String, Double> carrosPopulares = new HashMap<>() {
			{
				put("Gol", 14.4); // A implementação Map utiliza o put para adicionar elementos
				put("Uno", 15.6);
				put("Mobi", 16.1);
				put("Hb20", 14.5);
				put("Kwid", 16.1); // 15.6
			}
		};
		System.out.println(carrosPopulares);

		System.out.println("\nSubstitua o consumo do gol para 15,2 km/l.");
		carrosPopulares.put("Gol", 15.2); // utilzando o método put com uma chave já existente, ocorre a substituição do
											// valor
		System.out.println(carrosPopulares);

		System.out.println("\nConfira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));
		System.out.println("Confira se o modelo Uno está no dicionário: " + carrosPopulares.containsKey("Uno"));

		System.out.println("Exiba o consumo do Uno : " + carrosPopulares.get("Uno"));
		System.out.println("Exiba o terceiro modelo adicionado: Não há um método que exiba o índice");

		// Exiba os modelos.
		Set<String> modelos = carrosPopulares.keySet(); // para isso, deve se usar o método keySet que retorna um set e
														// por isso foi declarado uma variável do tipo Set.
		System.out.println("Exiba os modelos: " + modelos);

		// para retornar os valores, utilizamos o método values de uma collection
		System.out.println("Exiba o consumo dos carros: " + carrosPopulares.values());

		// Exiba o modelo mais econômico- que faz mais km/l:
		// para retornar o valore máximo utilizamos o método max de collections que
		// recebe o método values (que busca valores) tbm de collections.
		Double consumoEficiente = Collections.max(carrosPopulares.values()); // achando o maior valor

		// método entrySet para buscar as chaves de forma separada do valor - o método
		// entrySet retorna valor do tipo Set
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // atalho para cria variável Ctrl+1
		String modeloEficiente = ""; // variável de controle

		Set<String> modelosEfic = new LinkedHashSet<>();

		// criando um for each com o índice do tipo entries
		for (Entry<String, Double> indEntries : entries) {
			if (indEntries.getValue().equals(consumoEficiente)) { // se o valor daquele elemento for igual ao valor da
																	// // variável consumoEficiente, então...
				modeloEficiente = indEntries.getKey(); // atribui à variável modeloEficiente o valor da chave daquele
				modelosEfic.add(modeloEficiente);
			}
		}
		System.out.println("\nExiba o(s) modelo(s) mais econômico(s):");
		// se existir mais de um modelo com o mesmo consumo, também será impresso.
		for (String modelo : modelosEfic) {
			System.out.println(modelo.toString());
		}

		System.out.println(
				"O(s) modelo(s) mais econômico(s) listado(s) faz(em) " + consumoEficiente + " km(s) por litro.");

		/* *************** */
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values()); // achando o menor valor
		String modeloMenosEficiente = ""; // variável de controle
		Set<String> modelosMenosEfic = new LinkedHashSet<>();

		// criando um for each com o índice do tipo entries
		for (Entry<String, Double> indMenosEntries : entries) {
			if (indMenosEntries.getValue().equals(consumoMenosEficiente)) { // se o valor daquele elemento for igual ao
																			// valor da
				// variável consumoMenosEficiente, então...
				modeloMenosEficiente = indMenosEntries.getKey(); // variável modeloEficiente recebe valor da chave
																	// daquele elemento
				modelosMenosEfic.add(modeloMenosEficiente);
			}
		}
		System.out.println("\nExiba o(s) modelo(s) menos econômico(s):");
		// se existir mais de um modelo com o mesmo consumo, também será impresso.
		for (String modelo : modelosMenosEfic) {
			System.out.println(modelo.toString());
		}

		System.out.println(
				"O(s) modelo(s) menos econômico(s) listado(s) faz(em) " + consumoMenosEficiente + " km(s) por litro.");

		/* *** */
		// Exiba a soma dos consumos.
		Iterator<Double> iterador = carrosPopulares.values().iterator();
		Double soma = 0d;

		while (iterador.hasNext())
			soma += iterador.next();

		System.out.println("\nExiba a média de consumo dos modelos.\n" + soma / (carrosPopulares.size()) + " km/l");

		Iterator<Double> iterador2 = carrosPopulares.values().iterator();
		while (iterador2.hasNext())
			if (iterador2.next().equals(15.6))
				iterador2.remove();
		System.out.println(carrosPopulares);

		System.out.println("\nExiba todos os carros na ordem em que foram informados.");
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {
			{
				put("Gol", 14.4); // A implementação Map utiliza o put para adicionar elementos
				put("Uno", 15.6);
				put("Mobi", 16.1);
				put("Hb20", 14.5);
				put("Kwid", 16.1); // 15.6
			}
		};
		System.out.println(carrosPopulares2);

		System.out.println("\nExiba todos os carros pela ordem do modelo.");
		Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
		System.out.println(carrosPopulares3);

		carrosPopulares.clear();
		System.out.println("\nApague o dicionário de carros:\n" + carrosPopulares);

		System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());

	}
}
