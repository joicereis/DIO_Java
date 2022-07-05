

//TESTES DE CASES - APENAS PARA ESTUDOS
public class Mensagem_V2 {
	public static void obterMensagem(int hora) {
		try {
			int caso = 0;
			if (hora >= 0 && hora < 12) {
				caso = 1;
			}else if (hora >= 12 && hora < 18) {
				caso = 2;
			}else if (hora >= 18 && hora < 24) {
				caso = 3;
			}		
			switch (caso) {
			case 1:
				System.out.println("Manhã " +hora);
				break;
			case 2:
				System.out.println("Tarde " +hora);
				break;
			case 3:
				System.out.println("Noite " +hora);
				break;
			default:
				System.out.println("Hora inválida! " +hora);
				break;
				}
			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Digite valores de horas válidas.");
		}
		/*	
		 -- CHAMADAS
		Mensagem_V2.obterMensagem(0);
		Mensagem_V2.obterMensagem(1);
		Mensagem_V2.obterMensagem(11);
		Mensagem_V2.obterMensagem(12);
		Mensagem_V2.obterMensagem(13);
		Mensagem_V2.obterMensagem(17);
		Mensagem_V2.obterMensagem(18);
		Mensagem_V2.obterMensagem(19);
		Mensagem_V2.obterMensagem(23);
		Mensagem_V2.obterMensagem(24);
		Mensagem_V2.obterMensagem(25);
		Mensagem_V2.obterMensagem(-1);
		Mensagem_V2.obterMensagem('a');	 */
	}
}
