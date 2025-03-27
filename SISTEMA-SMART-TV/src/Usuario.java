public class Usuario {
    public static void main(String[] args) {
        //Adicionar o Objeto
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.ligada);

    }
}
