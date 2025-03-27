public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //metodo que muda o canal para um canal especifico.

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }

    //metodo que aumenta o valor do canal.

    public void aumentarCanal(){
        canal++;
    }

    //metodo que aumenta o valor do canal.

    public void diminuirCanal(){
        canal--;
    }

    //metodo que aumenta o volume do canal.

    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o Volume: " + volume);
    }

    //metodo que diminui o volume do canal.

    public void diminuirVolume() {
        //volume = volume - 1;
        volume--;
        System.out.println("diminuindo o Volume: " + volume);
    }

    //metodo que liga a tv.

    public void ligar() {
        ligada = true;
    }

    //metodo que desliga a tv.

    public void desligar() {
        ligada = false;
    }

}
