
public class Calculadora {
	
	//Soma
	public static void soma(double number1, double number2) {
		double resultado = number1 + number2;
		System.out.println("A soma de " +number1+ " com " +number2+ " � " +resultado);
	}
	
	//Subtra��o
	public static void subtracao(double number1, double number2) {
		double resultado = number1 - number2;
		System.out.println("A subtra��o do valor " +number2+ " de " +number1+ " � " +resultado);
	}
	//Multiplica��o
	public static void multiplica(double number1, double number2) {
		double resultado= number1 * number2;
		System.out.println("A multiplica��o de " +number1+ " por " +number2+ " � " +resultado);
	}
	
	//Divis�o
	public static void divisao(double number1, double number2) {
		if (number2 == 0) {
			System.out.println("Imposs�vel realizar divis�o por 0.");			
		}else {
			double resultado = number1 / number2;
			System.out.println("A divis�o de " +number1+ " por " +number2+ " � " +resultado);
		}
	}
}
