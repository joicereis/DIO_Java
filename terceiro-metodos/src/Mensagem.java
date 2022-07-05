
public class Mensagem {
	public static void obterMensagem(int hora) {
	//	System.out.println("Digite um valor de hora inteiro, exemplo: 12 \n");
		try {
			if (hora >= 0 && hora < 12) {
				System.out.println("Manhã " +hora);
			}else if (hora >= 12 && hora < 18) {
				System.out.println("Tarde " +hora);
			}else if (hora >= 18 && hora < 24) {
				System.out.println("Noite " +hora);
			}else {
				System.out.println("Hora inválida! " +hora);
			}
		}
		catch (Exception excecao) {
			System.out.println("Digite valores de horas válidas.");
		}
	}
}
 /* Mensagens -Chamadas métodos
		Mensagem.obterMensagem(0);
		Mensagem.obterMensagem(1);
		Mensagem.obterMensagem(11);
		Mensagem.obterMensagem(12);
		Mensagem.obterMensagem(13);
		Mensagem.obterMensagem(17);
		Mensagem.obterMensagem(18);
		Mensagem.obterMensagem(19);
		Mensagem.obterMensagem(23);
		Mensagem.obterMensagem(24);
		Mensagem.obterMensagem(25);
		Mensagem.obterMensagem(-1);
		Mensagem.obterMensagem('a');	*/