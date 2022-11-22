package interfaceMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/* A interface Map n�o faz parte de uma Collection e ela utiliza elementos �nicos (key) para cada valor */
import java.util.TreeMap;

public class ExemploMap {
	public static void manipulandoInterfaceMap() {
		System.out.println("\nDicion�rio com modelos de ve�culos e seus respectivos consumos.");

		/*
		 * Implementa��o do tipo Map com elementos que possuem chaves do tipo string e
		 * valores do tipo double. HashMap itera os elementos de forma aleat�ria;
		 * LinkedHashMap itera os elementos de acordo com a ordem de inser��o; TreeMap
		 * itera os elementos de acordo com a ordem natual (alfab�tica ou do menor para
		 * maior)
		 */

		Map<String, Double> carrosPopulares = new HashMap<>() {
			{
				put("Gol", 14.4); // A implementa��o Map utiliza o put para adicionar elementos
				put("Uno", 15.6);
				put("Mobi", 16.1);
				put("Hb20", 14.5);
				put("Kwid", 16.1); // 15.6
			}
		};
		System.out.println(carrosPopulares);

		System.out.println("\nSubstitua o consumo do gol para 15,2 km/l.");
		carrosPopulares.put("Gol", 15.2); // utilzando o m�todo put com uma chave j� existente, ocorre a substitui��o do
											// valor
		System.out.println(carrosPopulares);

		System.out.println("\nConfira se o modelo Tucson est� no dicion�rio: " + carrosPopulares.containsKey("Tucson"));
		System.out.println("Confira se o modelo Uno est� no dicion�rio: " + carrosPopulares.containsKey("Uno"));

		System.out.println("Exiba o consumo do Uno : " + carrosPopulares.get("Uno"));
		System.out.println("Exiba o terceiro modelo adicionado: N�o h� um m�todo que exiba o �ndice");

		// Exiba os modelos.
		Set<String> modelos = carrosPopulares.keySet(); // para isso, deve se usar o m�todo keySet que retorna um set e
														// por isso foi declarado uma vari�vel do tipo Set.
		System.out.println("Exiba os modelos: " + modelos);

		// para retornar os valores, utilizamos o m�todo values de uma collection
		System.out.println("Exiba o consumo dos carros: " + carrosPopulares.values());

		// Exiba o modelo mais econ�mico- que faz mais km/l:
		// para retornar o valore m�ximo utilizamos o m�todo max de collections que
		// recebe o m�todo values (que busca valores) tbm de collections.
		Double consumoEficiente = Collections.max(carrosPopulares.values()); // achando o maior valor

		// m�todo entrySet para buscar as chaves de forma separada do valor - o m�todo
		// entrySet retorna valor do tipo Set
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // atalho para cria vari�vel Ctrl+1
		String modeloEficiente = ""; // vari�vel de controle

		Set<String> modelosEfic = new LinkedHashSet<>();

		// criando um for each com o �ndice do tipo entries
		for (Entry<String, Double> indEntries : entries) {
			if (indEntries.getValue().equals(consumoEficiente)) { // se o valor daquele elemento for igual ao valor da
																	// // vari�vel consumoEficiente, ent�o...
				modeloEficiente = indEntries.getKey(); // atribui � vari�vel modeloEficiente o valor da chave daquele
				modelosEfic.add(modeloEficiente);
			}
		}
		System.out.println("\nExiba o(s) modelo(s) mais econ�mico(s)
		
		:");
		// se existir mais de um modelo com o mesmo consumo, tamb�m ser� impresso.
		for (String modelo : modelosEfic) {
			System.out.println(modelo.toString());
		}

		System.out.println(
				"O(s) modelo(s) mais econ�mico(s) listado(s) faz(em) " + consumoEficiente + " km(s) por litro.");

		/* *************** */
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values()); // achando o menor valor
		String modeloMenosEficiente = ""; // vari�vel de controle
		Set<String> modelosMenosEfic = new LinkedHashSet<>();

		// criando um for each com o �ndice do tipo entries
		for (Entry<String, Double> indMenosEntries : entries) {
			if (indMenosEntries.getValue().equals(consumoMenosEficiente)) { // se o valor daquele elemento for igual ao
																			// valor da
				// vari�vel consumoMenosEficiente, ent�o...
				modeloMenosEficiente = indMenosEntries.getKey(); // vari�vel modeloEficiente recebe valor da chave
																	// daquele elemento
				modelosMenosEfic.add(modeloMenosEficiente);
			}
		}
		System.out.println("\nExiba o(s) modelo(s) menos econ�mico(s):");
		// se existir mais de um modelo com o mesmo consumo, tamb�m ser� impresso.
		for (String modelo : modelosMenosEfic) {
			System.out.println(modelo.toString());
		}

		System.out.println(
				"O(s) modelo(s) menos econ�mico(s) listado(s) faz(em) " + consumoMenosEficiente + " km(s) por litro.");

		/* *** */
		// Exiba a soma dos consumos.
		Iterator<Double> iterador = carrosPopulares.values().iterator();
		Double soma = 0d;

		while (iterador.hasNext())
			soma += iterador.next();

		System.out.println("\nExiba a m�dia de consumo dos modelos.\n" + soma / (carrosPopulares.size()) + " km/l");

		Iterator<Double> iterador2 = carrosPopulares.values().iterator();
		while (iterador2.hasNext())
			if (iterador2.next().equals(15.6))
				iterador2.remove();
		System.out.println(carrosPopulares);

		System.out.println("\nExiba todos os carros na ordem em que foram informados.");
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {
			{
				put("Gol", 14.4); // A implementa��o Map utiliza o put para adicionar elementos
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
		System.out.println("\nApague o dicion�rio de carros:\n" + carrosPopulares);

		System.out.println("\nConfira se o dicion�rio est� vazio: " + carrosPopulares.isEmpty());

	}
}
