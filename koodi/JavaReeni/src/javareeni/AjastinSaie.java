/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareeni;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anssi1401
 */
public class AjastinSaie implements Runnable {

    JavaReeni apuri;

    AjastinSaie(JavaReeni a) {
        apuri = a;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AjastinSaie.class.getName()).log(Level.SEVERE, null, ex);
        }
        apuri.stoppi = true;
    }
}
