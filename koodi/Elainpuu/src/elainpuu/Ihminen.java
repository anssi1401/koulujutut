/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elainpuu;

/**
 *
 * @author anssi1401
 */
public class Ihminen extends Nisakas {

    @Override
    public void syon() {
        System.out.println("Syön kuin ihminen");
    }

    @Override
    public void liikun() {
        System.out.println("Liikun kuin ihminen");
    }

    @Override
    public void imetan() {
        System.out.println("Imetän kuin ihminen");
    }
}
