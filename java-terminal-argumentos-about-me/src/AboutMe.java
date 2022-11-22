import java.util.Scanner;

public class AboutMe {

    /**Esse classe foi criada para que ao ser aberta pelo terminal usando o comando 'java AbouMe' possa ser informados 
     * os dados que serão utilizados como argumentos na classe main.
     * 
     * Para excutar a classe com os parametros navegue até a pasta bin do projeto através do terminal do DOS ou através do terminal do IDE,
     * utilize o comando java AbouMee os dados a serem passados para cada parâmetro separados por espaço.
     * 
     * A execução com argumentos tbm pode ser feita através do arquivo lauch.json do diretório vscode, inserindo no  json os valores como exemplo abaixo:
     *  "args": [
                "TESTE",
                "1",
                "5",
                "1.58"
            ]
     * 
     * @param args
     */
    public static void main(String[] args) {

    String nome = args[0];
       String sobrenome = args[1];
       int idade = Integer.valueOf(args[2]);
       double altura = Double.valueOf(args[3]);

       System.out.println("Olá, meu nome é " + nome +" " + sobrenome +
                            ", tenho " + idade + " anos e minha altura é "+ altura+ "m.");
                            

       // RECEBIMENTO DE DADOS ATRAVÉS DA FUNCÃO SCANNER

       // Criando objeto do tipo Scanner
       Scanner scan = new Scanner(System.in);

       System.out.println("\n\n ---- TESTE COM SCANNER ----");
       System.out.println("\nDigite seu primeiro nome:");
       String nome2 = scan.next();
       System.out.println("Digite seu sobrenome:");
       String sobrenome2 = scan.next();
       System.out.println("Digite sua idade:");
       int idade2 = scan.nextInt();
       System.out.println("Digite sua altura:");
       double altura2 = scan.nextDouble(); // recebe o número fluruante de acordo com o idioma da IDE, no caso é pelo símbolo de vírgula. 

       System.out.println("Nome " + nome2 +" " + sobrenome2 +
                            " com " + idade2 + " anos de idade e altura "+ altura2+ "m.");

        scan.close();

}