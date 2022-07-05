

// EXEMPLO DE SOBRECARGA(Polimorfismo): Criar mais de um método com o mesmo nome porém com variação de tipos de dados do parâmetros. 

public class Quadrilatero {
	//SOBRECARGA 1:
	public static void area(double lado) {
		System.out.println("Área do quadrado: " + lado * lado);
	}
	//SOBRECARGA 2:
	public static void area(double altura, double largura) {
		System.out.println("Área do retângulo: " + altura * largura);
	}
	//SOBRECARGA 3:
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);		
	}
	//SOBRECARGA 4
	//O que difere essa sobrecarga da 2 são os tipos de dados dos parâmetros que devem ser sinalizados na msg de chamada.

	public static void area(float diagonal1, float diagonal2) {
		System.out.println("Área do losango: " + (diagonal1 + diagonal2) / 2);		
	}
}
