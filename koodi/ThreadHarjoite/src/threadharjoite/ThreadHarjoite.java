/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadharjoite;

/**
 *
 * @author anssi1401
 */
public class ThreadHarjoite {

    public static void main(String[] args) {

        Runnable saikeen_tyo1 = new OmaProsessi("Marco");
        OmaProsessi2 saikeen_tyo2 = new OmaProsessi2("Polo");
     
        Thread saie1 = new Thread(saikeen_tyo1);
        saie1.start();
        
        Thread saie2 = new Thread(saikeen_tyo2);
        saie2.start();
        
        Thread saie3 = new Thread(saikeen_tyo1);
        saie3.start();
        
        saikeen_tyo2.run();

    }
}
