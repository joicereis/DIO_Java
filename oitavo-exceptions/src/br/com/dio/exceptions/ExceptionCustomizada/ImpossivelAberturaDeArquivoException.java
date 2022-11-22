package br.com.dio.exceptions.ExceptionCustomizada;

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
   // private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo
                                                // , String diretorio
                                                ) {
        super("O arquivo '" + nomeDoArquivo + "' não foi encontrado no diretório.");
        this.nomeDoArquivo = nomeDoArquivo;
     //   this.diretorio = diretorio;
    }

    /*@Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }*/

}
