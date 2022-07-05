
public class Emprestimo {
	public static double calcularVlrFinal(double valor, int qtdParcelas) {
		double vlrFinal = valor;
		if (qtdParcelas > 1 ) {
			double taxaFinal = calculaTaxa(qtdParcelas);
			vlrFinal = valor + (valor * taxaFinal);
		}	
		return vlrFinal;
	}
	public static double calculaTaxa(int Parcelas) {
		double taxa = 0.0d;
		switch (Parcelas) {
		case 2:
			taxa = 0.10;
			break;
		case 3:
			taxa = 0.15;
			break;
		case 4:
			taxa = 0.20;
			break;
		default:
			taxa = 0.25;
			break;
		}
		return taxa;
	}
}
 /* - CHAMADAS NA FUNÇÃO MAIN
System.out.println("O valor final a ser pago pelo empréstimo é " +Emprestimo.calcularVlrFinal(100, 1));
System.out.println("O valor final a ser pago pelo empréstimo é " +Emprestimo.calcularVlrFinal(100, 2));
System.out.println("O valor final a ser pago pelo empréstimo é " +Emprestimo.calcularVlrFinal(100, 3));
System.out.println("O valor final a ser pago pelo empréstimo é " +Emprestimo.calcularVlrFinal(100, 4));
System.out.println("O valor final a ser pago pelo empréstimo é " +Emprestimo.calcularVlrFinal(100, 15));
System.out.println("O valor final a ser pago pelo empréstimo é " +Emprestimo.calcularVlrFinal(100, 35));
*/