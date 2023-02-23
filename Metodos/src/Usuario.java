public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual: " + smartTv.ligada);

        smartTv.mudarCanalMais();
        smartTv.mudarCanalMais();
        System.out.println("O canal atual é " + smartTv.canal);
        smartTv.mudarCanalMenos();
        System.out.println("O canal atual é " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume atual é " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("O volume atual é: " + smartTv.volume);
        smartTv.desligar();
    }
}