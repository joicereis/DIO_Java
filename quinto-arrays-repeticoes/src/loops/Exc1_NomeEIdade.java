/*Nome e Idade: Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno
 * e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */

package loops;

import java.util.Scanner;

public class Exc1_NomeEIdade {	
	public static void metodoNomeEIdade() {		
		Scanner scan = new Scanner(System.in); //leitura de entrada de dados pelo teclado
		String nome;
		int idade;
		
		while(true) {
			System.out.println("\nPara sair digite o numero 0.");
			System.out.println("Nome: ");
			nome = scan.next();
			if (nome.equals("0"))
				break;
			
			System.out.println("Idade ");
			idade = scan.nextInt();
		}
		System.out.println("Terminou o laço de repetição.\n");
		scan.close();
	}	
}
