public class Usuario {
    public static void main(String[] args) throws Exception {

        System.out.println("Estou testando a execução da classe pelo terminal do Windows.");

        
       SmartTv smartTv = new SmartTv();

       System.out.println("\n\n\nA Tv está ligada? " + smartTv.ligada);
       smartTv.ligar();
       System.out.println("\n\n\nA Tv está ligada? " + smartTv.ligada); 
       
       System.out.println("\nEm qual o canal está conectado a TV? " + smartTv.canal);
       System.out.println("\nQual o volume atual da TV? " + smartTv.volume);

       smartTv.diminuirVolumeGradual();
       smartTv.diminuirVolumeGradual();
       smartTv.aumentarVolumeGradual();
       System.out.println("\nVolume atual: " + smartTv.volume);

       smartTv.aumentarCanalGradual();
       smartTv.aumentarCanalGradual();
       smartTv.aumentarCanalGradual();
       smartTv.diminuirCanalGradual();
       System.out.println("\nO novo canal é " + smartTv.canal);

       smartTv.mudarCanal(54);
       System.out.println( "\nO novo canal é: " +smartTv.canal);
       smartTv.desligar();
       System.out.println("\nA TV está ligada? " + smartTv.ligada);
    }  
}
