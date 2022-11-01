public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolumeGradual(){
        volume++;
    }
    public void diminuirVolumeGradual(){
        volume--;
    }
    public void aumentarCanalGradual(){
        canal++;
    }
    public void diminuirCanalGradual(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
