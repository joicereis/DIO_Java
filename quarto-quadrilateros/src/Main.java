
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exerc�cio de quadril�teros.");
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(3d, 4d);
		System.out.println("�rea do quadrado: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(6, 3, 4);
		System.out.println("�rea do quadrado: " + areaTrapezio);
		
		double areaLosango = Quadrilatero.area(7f, 8f);
		System.out.println("�rea do quadrado: " + areaLosango);
	}
}