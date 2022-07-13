//EXERCÍCIOS com estruturas condicionais
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("EXERCICIO 1: Digite o número de um mês:");
		int mesDigitado = teclado.nextInt();
		estruturaIf(mesDigitado);
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("\nEXERCICIO 2: Digite o nome de um mês: ");
		String mesFerias = teclado2.nextLine().toUpperCase().trim();
		metodoFerias(mesFerias);
		
		System.out.println("\nEXERCICIO 3: Digite o nome de um dia da semana SEM usar acentos - APENAS o primeiro nome.\nExemplo: 'Terca' ou 'terca'.");
		String diaSemana = teclado2.nextLine().toUpperCase().trim();
		informaDiaSemana(diaSemana); 
			
		System.out.println("\nEXERCICIO 4: Digite um valor de 0 à 10:");
		int nroDigitado = teclado.nextInt();
		metodoMensagens(nroDigitado);
		
		//limpando a variável do tipo Scanner
		teclado.close();
		teclado2.close();
	}
	
	//EXERCICIO 1: Método que informa o mês correspondente ao número.
	public static void estruturaIf(int mes) {
		switch(mes) {
		case 1:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Janeiro.");
		break;
		case 2:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Fevereiro.");
		break;
		case 3:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Março.");
		break;
		case 4:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Abril.");
		break;
		case 5:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Maio.");
		break;
		case 6:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Junho.");
		break;
		case 7:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Julho.");
		break;
		case 8:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Agosto.");
		break;
		case 9:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Setembro.");
		break;
		case 10:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Outubro.");
		break;
		case 11:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Novembro.");
		break;
		case 12:
			System.out.println("Foi digitado o mês " + mes + " que corresponde à Dezembro.");
		break;
		default:
			System.out.println("Não foi difgitado um mês válido.");
		}
	}//fecha estruturaIf
	
	//EXERCICIO 2: Método que indica se o mês tem férias escolares.
	public static void metodoFerias(String mesFerias) {
		switch(mesFerias) {
		case "JANEIRO":
		case "JULHO":
		case "DEZEMBRO":
			System.out.println("No mês de " + mesFerias + " tem férias!");
		break;
		default:
			System.out.println("No mês de " + mesFerias + " não tem férias ou o mês não é válido.");
		}
	} // fecha metodoFerias
	
	//EXERCICIO 3: Informar qual o dia da semana corresponde ao número digitado.
	public static void informaDiaSemana(String diaSemana) {
		switch(diaSemana) {
		case "DOMINGO":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 1 da semana.");
		break;
		case "SEGUNDA":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 2 da semana.");
		break;
		case "TERCA":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 3 da semana.");
		break;
		case "QUARTA":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 4 da semana.");
		break;
		case "QUINTA":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 5 da semana.");
		break;
		case "SEXTA":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 6 da semana.");
		break;
		case "SABADO":
			System.out.println("O dia digitado " + diaSemana + " corresponde ao dia 7 da semana.");
		break;
		default:
			System.out.println("O dia digitado não é válido ou foi utilizado acento.");
		}
	}//fecha método informaDiaSemana()
	
	/* EXERCICIO 4:
	 * Se o número digitado for entre 1 e 3, imprimir 'Certo.';
	 * Se o número digitado for 4, imprimir 'Errado.';
	 * Se o número digitado for 5, imprimir 'Talvez.';
	 * Se o número digitado for qualquer outro, imprimir 'Valor indefinido.';
	 */
	public static void metodoMensagens(int numDigitado) {
		if(numDigitado >= 1 && numDigitado <= 3) {
			System.out.println("Certo.");
		}else if(numDigitado == 4) {
			System.out.println("Errado.");
		}else if(numDigitado == 5) {
			System.out.println("Talvez.");
		}else {
			System.out.println("Valor indefinido.");
		}
	}
}

