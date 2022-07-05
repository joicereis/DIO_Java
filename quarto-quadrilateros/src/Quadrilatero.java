

// EXEMPLO DE SOBRECARGA(Polimorfismo): Criar mais de um m�todo com o mesmo nome por�m com varia��o de tipos de dados do par�metros. 

public class Quadrilatero {
	//SOBRECARGA 1:
	public static void area(double lado) {
		System.out.println("�rea do quadrado: " + lado * lado);
	}
	//SOBRECARGA 2:
	public static void area(double altura, double largura) {
		System.out.println("�rea do ret�ngulo: " + altura * largura);
	}
	//SOBRECARGA 3:
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("�rea do trap�zio: " + ((baseMaior + baseMenor) * altura) / 2);		
	}
	//SOBRECARGA 4
	//O que difere essa sobrecarga da 2 s�o os tipos de dados dos par�metros que devem ser sinalizados na msg de chamada.

	public static void area(float diagonal1, float diagonal2) {
		System.out.println("�rea do losango: " + (diagonal1 + diagonal2) / 2);		
	}
}
