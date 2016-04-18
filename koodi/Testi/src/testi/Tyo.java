/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testi;


public class Tyo implements Runnable {
    private int luku = 10;

    public void vahenna() {
        if (luku > 0) {
            luku--;
        }
        System.out.print("luku=" + luku);
        System.out.println(" : " + Thread.currentThread().getName());

    }

    public void run() {
        System.out.println("**" + Thread.currentThread().getName());
        for (int i = 10; i >= 0; i--) {
            vahenna();
        }
    }
}
