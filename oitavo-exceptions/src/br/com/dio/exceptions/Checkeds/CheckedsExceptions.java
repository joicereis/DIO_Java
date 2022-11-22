    //TRATAMENTOS DE EXCEÇÕES CHECKEDS- Exceções que o compilador gera que são obrigadas a serem tratadas
    package br.com.dio.exceptions.Checkeds;

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.io.IOException;
    import java.io.OutputStreamWriter;

    import javax.swing.JOptionPane;

    public class CheckedsExceptions {
        public static void main(String[] args) {
            //o arqquivo a ser lido precisa estar no diretório raíz do projeto.
            String nomeDoArquivo = "arquivoparaleitura.txt";
            try {
                imprimirArquivo(nomeDoArquivo);
            } catch (FileNotFoundException e) {
               // e.printStackTrace();
               //tratamento de exceção onde não são localizados arquivos no diretório definido.
                JOptionPane.showMessageDialog(null, "Não foi possivel localizar o arquivo '" + nomeDoArquivo +"' .\n Erro: " + e.getMessage());
            }catch (IOException e) {
                //e.printStackTrace();
                //tratamento para qualquer exceção dentro da classe IOException.
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte.\n" + e.getMessage());
            }
        }
        public static void imprimirArquivo(String nomeDoArquivo) throws IOException {
            File file = new File(nomeDoArquivo);

            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();
        }
    }
