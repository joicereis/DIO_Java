package colecoes.Set.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Exc1_ArcoIris {

	public static void manipularArcoIris() {
		System.out.println("Imprimindo as cores do arco iris um abaixo da outra.");
		Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil (ou índigo)", "Violeta"));
		for (String arco : arcoIris) {
			System.out.println(arco); 
		}
		
		System.out.println("\nImprimindo as cores do arco iris em ordem alfabética.");
		Set<String> arcoIris2 = new TreeSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil (ou índigo)", "Violeta"));
		for (String arco2 : arcoIris2) {
			System.out.println(arco2);
		}
		
		System.out.println("\nQuantidade de cores do arco íris: " + arcoIris.size());
		
		System.out.println("\nExibindo cores na ordem inversa do que foram informadas.");
		List<String> listArcoIris = Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil (ou índigo)", "Violeta");

        // use `ListIterator` para iterar a lista na ordem inversa
		ListIterator<String> iterador = listArcoIris.listIterator(listArcoIris.size());
 
        // `hasPrevious()` retorna true se a lista tiver um elemento anterior
        while (iterador.hasPrevious()) {
            System.out.println(iterador.previous());
        }
        
        System.out.println("\nExibindo cores que começam com a letra V.");
        for (String cor: arcoIris) {
            if(cor.startsWith("V")) System.out.println(cor);
        }
        
        Iterator<String> iterador2 = arcoIris.iterator();
        while(iterador2.hasNext()) {
        	if (!(iterador2.next().startsWith("V"))){
        		iterador2.remove();
        	 };
        
        }
        System.out.println("\nRemova todas as cores que não começam com 'V'.\n" + arcoIris);
        
        arcoIris.clear();
        System.out.println("\nRemova todo o conjunto.\n" + arcoIris );
        
        System.out.println("\nConfira se o conjunto 1 está vazio: \n" + arcoIris.isEmpty());
        /*-
        Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next() < 7) {
				iterator1.remove();
			}
		}
		
		
		System.out.println("Remova as notas menores que 7 e exiba o conjunto.\n" + notas); */
	}
}
