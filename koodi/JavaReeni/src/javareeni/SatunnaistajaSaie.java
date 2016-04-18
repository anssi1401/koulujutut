/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareeni;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SatunnaistajaSaie implements Runnable  {

    JavaReeni apuri;
    Random rand = new Random();

    SatunnaistajaSaie(JavaReeni a) {
        apuri = a;
    }

    @Override
    public void run() {
        while (!apuri.stoppi) {
            System.out.println(rand.nextInt(10) + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SatunnaistajaSaie.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
