

// EXEMPLO DE SOBRECARGA(Polimorfismo): Criar mais de um método com o mesmo nome porém com variação de tipos de dados do parâmetros. 

public class Quadrilatero {
	//SOBRECARGA 1:
	public static double area(double lado) {
		return (lado * lado);
	}
	//SOBRECARGA 2:
	public static double area(double altura, double largura) {
		return (altura * largura);
	}
	//SOBRECARGA 3:
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;	
	}
	//SOBRECARGA 4
	//O que difere essa sobrecarga da 2 são os tipos de dados dos parâmetros que devem ser sinalizados na msg de chamada.
	public static double area(float diagonal1, float diagonal2) {
		return (diagonal1 + diagonal2) / 2;	
	}
}
