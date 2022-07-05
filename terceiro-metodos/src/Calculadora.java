
public class Calculadora {
	
	//Soma
	public static void soma(double number1, double number2) {
		double resultado = number1 + number2;
		System.out.println("A soma de " +number1+ " com " +number2+ " é " +resultado);
	}
	
	//Subtração
	public static void subtracao(double number1, double number2) {
		double resultado = number1 - number2;
		System.out.println("A subtração do valor " +number2+ " de " +number1+ " é " +resultado);
	}
	//Multiplicação
	public static void multiplica(double number1, double number2) {
		double resultado= number1 * number2;
		System.out.println("A multiplicação de " +number1+ " por " +number2+ " é " +resultado);
	}
	
	//Divisão
	public static void divisao(double number1, double number2) {
		if (number2 == 0) {
			System.out.println("Impossível realizar divisão por 0.");			
		}else {
			double resultado = number1 / number2;
			System.out.println("A divisão de " +number1+ " por " +number2+ " é " +resultado);
		}
	}
}
