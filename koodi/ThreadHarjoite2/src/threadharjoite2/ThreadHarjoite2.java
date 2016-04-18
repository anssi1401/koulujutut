package threadharjoite2;

public class ThreadHarjoite2 {

    public static void main(String[] args) {
        Tili tili1 = new Tili();
        Ihminen marco = new Ihminen("Marco", tili1);
        Ihminen polo = new Ihminen("Polo", tili1);
        
        Thread saie1 = new Thread(marco);
        Thread saie2 = new Thread(polo);
        
        saie1.start();
        saie2.start();

    }
}
