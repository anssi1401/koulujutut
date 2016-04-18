package threadharjoite2;

public class Ihminen implements Runnable {
     
    private String nimi;
    private Tili omatili;

    
    Ihminen(String n, Tili t){
        nimi = n;
        omatili = t;
    }    
    
    @Override
    public void run() {
       omatili.Pano(100);
       omatili.Otto(50);
    }
}
