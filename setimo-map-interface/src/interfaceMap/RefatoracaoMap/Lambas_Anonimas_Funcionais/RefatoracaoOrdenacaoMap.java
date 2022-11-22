package interfaceMap.RefatoracaoMap.Lambas_Anonimas_Funcionais;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

import interfaceMap.Contato;

/*Dadas as seguintes informa��es  de id e contato, crie um dicion�rio e
ordene este dicion�rio exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleat�ria\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Tony", 5555));
           put(4, new Contato("Daniel", 1111));
           put(3, new Contato("John", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inser��o\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Tony", 5555));
            put(4, new Contato("Daniel", 1111));
            put(3, new Contato("John", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem n�mero telefone\t--");
        //precisamos organizar os valores. Logo:
        
        //Ordena��o de nome contato com a utiliza��o de Lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
        		   cont -> cont.getValue().getNumero()));       
        
        
        //Ordenacao de n�mero de telefone pelo metodo est�tico do comparator, o m�todo compare  
        /*
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
        		new Function<Map.Entry<Integer, Contato>, Integer>(){
        			@Override
        			public Integer apply(Entry<Integer, Contato> cont) {
        				// TODO Auto-generated method stub
        				return cont.getValue().getNumero();
        			}
		}));  
		*/
		
        //Ordenacao de n�mero de telefone por fun��o an�nima
        /*
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
        	 @Override
        	    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        	        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
        	    }
        	 
        });    
        */

        //Ordena��o com a utiliza��o da classe ComparatorOrdemNumerica comentada ao fim desse c�digo:
        //Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
        
        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        
        //Ordena��o de nome contato com a utiliza��o da classe ComparatorOrdemNomeContato comentada ao fim desse c�digo:
        // Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato()); 
        
      //Ordenacao de nome contato por fun��o an�nima;
      /*  Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>(){
        	@Override
        	public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        		return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
        	}
        });
        */
        
       //Ordenacao de nome pelo contato metodo est�tico do comparator,o m�todo Compare:
       /* Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(Comparator.comparing(
        		new Function<Map.Entry<Integer,Contato>, String >() {
					@Override
					public String apply(Entry<Integer, Contato> cont) {
						// TODO Auto-generated method stub
						return cont.getValue().getNome();
					}
        			
				})); */
        
        //Ordena��o de nome contato com a utiliza��o de Lambda
        Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(Comparator.comparing(
        		cont -> cont.getValue().getNome()));
       
        
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}


/*    
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}
*/

/*
class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}
*/