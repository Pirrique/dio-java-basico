public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada = true;
        System.out.println("A TV está ligada.");
    }
    public void desligar() {
        ligada = false;
        System.out.println("A TV está desligada.");
    }
    public void mudarCanalMais() {
        canal++;
    }
    public void mudarCanalMenos() {
        canal--;
    }
    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }
}
