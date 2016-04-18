/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elainpuu;

/**
 *
 * @author anssi1401
 */
public final class Kissa extends Nisakas {

    boolean porroisyys;

    public boolean isPorroisyys() {
        System.out.println("Kissa on pörröinen");
        return porroisyys;
    }

    public void setPorroisyys(boolean porroisyys) {
        this.porroisyys = porroisyys;
    }
    
    @Override
    public void syon() {
        System.out.println("Syön kuin kissa");
    }

    @Override
    public void liikun() {
        System.out.println("Liikun kuin kissa");
    }

    @Override
    public void imetan() {
        System.out.println("Imetän kuin kissa");
    }
    
}
