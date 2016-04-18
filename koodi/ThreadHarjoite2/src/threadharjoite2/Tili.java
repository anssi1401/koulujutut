package threadharjoite2;

public class Tili {

    public int saldo = 1000;

    public synchronized void Otto(int x) {

        saldo = saldo - x;
        System.out.println("Tilillä on nyt rahaa " + saldo + " euroa");
    }

    public synchronized void Pano(int x) {
        saldo = saldo + x;
        System.out.println("**Tilillä on nyt : " + saldo + " euroa");
    }
}
