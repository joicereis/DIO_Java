package interfaceMap.exercicios_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


//O MÉTODO STREAM NÃO ALTERA A ESTRUTURA ORIGINAL 

public class ExerciciosStreamAPI {
	/**
	 * 
	 */
	public static void imprimirStreamAPI() {
		List<String> numerosAleatorios = 
				Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de Strings: ");
		//L�MBDA
		 numerosAleatorios.stream().forEach(s -> System.out.println());
		//	numerosAleatorios.forEach(s -> System.out.println()); //sem o stream que tr�s o mesmo retorno

		/* 	numerosAleatorios.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		*/
			
		//L�MBDA COM MÉTODO REFERENCIA
		//numerosAleatorios.forEach(s -> System.out::println());
			
		System.out.println("Pegue os 5 primeiros elementos e coloque dentro de um Set: ");
		//O set n�o recebe valores repetidos.
		numerosAleatorios.stream()
		.limit(5)
		.collect(Collectors.toSet())
		//com lambda seria: .forEach(s -> System.out.println());
		//ou com lambda e references metod: forEach(System.out::println())
		.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});	
		
		System.out.println("Coloque os cinco primeiros elementos dessa lista de Strings em uma vari�vel sem imprimir. ");
		Set<String> collectSet = numerosAleatorios.stream()
				.limit(5)
				.collect(Collectors.toSet());
		
		System.out.println("Transforme esta lista de String em uma lista de n�meros inteiros. ");
		numerosAleatorios.stream()
				.map(new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
				//com lambda: .map( s -> 	Integer.parseInt(s));
				//com lambda e metodo referencia:  .map(Integer::parseInt);
			}
		}).collect(Collectors.toList())
		.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer s) {
				System.out.println(s);
			}
		});
		// H� op��o de criar uma lista de inteiros para receber essa stream
		//usando lambda e m�todo referencia

		/* 
		List<Integer> collectList = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList));
		*/	
		

		System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");


		//UTILIZANDO O REFERENCE METODO:		
		List<Integer> listParesMaioresQueDois = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				if(i %2 == 0 && i > 2) return true;
				return false;
			}
		}).collect(Collectors.toList());
		System.out.println(listParesMaioresQueDois);
		
		// METODO NORMAL SEM REFERENCE METODO E SEM LAMBDA:
		/*
		List<Integer> listParesMaioresQueDois = numerosAleatorios.stream()
		.map(new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return Integer.parseInt(s);
				//com lambda: .map( s -> 	Integer.parseInt(s));
				//com lambda e metodo referencia:  .map(Integer::parseInt);
			}
		}).filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				if(i %2 == 0 && i > 2) return true;
				return false;
			}
		}).collect(Collectors.toList());
		System.out.println(listParesMaioresQueDois);
		*/

		System.out.println("Exiba a média dos números: ");
		//MÉTODO NORMAL
		/*
		numerosAleatorios.stream()
		.mapToInt(new ToIntFunction<String>() {
			@Override
			public int applyAsInt(String s) {
				return Integer.parseInt(s);
			};
		});
		 */

		//método com LAMBDA
		/*
		numerosAleatorios.stream()
		.mapToInt(s -> Integer.parseInt(s));
		*/
		//método com REFERENCE METOD
		numerosAleatorios.stream()
		.mapToInt(Integer::parseInt)
		.average()
		//ifPresent sem reference metod
		/*  
		.ifPresent(new DoubleConsumer(){
			@Override
			public void accept(double value) {
				System.out.println(value);
			};
		})
		*/
		//ifPresent com reference metod
		.ifPresent(System.out::println);
		;

		System.out.println("Remova os valores ímpares: ");

		List<Integer> collectListSemImpares = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.collect(Collectors.toList());

		//METODO SIMPLES
		/* 
		collectListSemImpares.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer inteiro){
				if (inteiro % 2 != 0)
				return true;
				return false;
			}
		});
		*/
		//MÉTODO COM LAMBDA
		collectListSemImpares.removeIf(inteiro -> inteiro % 2 != 0);


		//EXERCICIOS COM SUGESTÕES DE RESPOSTAS PARA SEREM ESTUDADAS:
		System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatorios.stream()
		.mapToInt(Integer::parseInt)
                .min()  //encontra o valor mínimo
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()  //encontra o valor máximo
                .ifPresent(System.out::println);;

		//NÃO FUNCIONOU e não estou conseguindo ajustar
		/* 	
		int somaDosNumerosPares = numerosAleatorios.stream()
		.filter(i -> (i % 2 == 0))
		.mapToInt(Integer::parseInt)
		.sum();
		System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);
		

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatorios.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatorios.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);

		*/
	}
}

