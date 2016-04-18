/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testi;

/**
 *
 * @author anssi1401
 */
public class Testi {

    public static void main(String[] args) {
        Tyo jobi = new Tyo();
        Thread saie1 = new Thread(jobi);
        Thread saie2 = new Thread(jobi);
        saie1.start();
        saie2.start();
    }
}


