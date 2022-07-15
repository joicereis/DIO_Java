package arrays;

public class Exc1_VetorOrdemInversa {
	public static void metodoImprimeVetor() {
		int vetor[] = {-5, -6, 15, 50, 8, 4};
		int count = 0;
		
		//imprimindo o tamanho do vetor
		System.out.println("Vetor " + vetor.length + " posições");
		
		//exibindo cada elemento do vetor
		System.out.println("\nVETOR");
		while(count < vetor.length) {
			System.out.print(vetor[count] + "\t" );
			count++;
		}
		System.out.println("\n\nVETOR INVERSO");
		for(int i = (vetor.length-1) ; i >= 0 ; i--) {
			System.out.print(vetor[i] + "\t");
		}
	}
}
