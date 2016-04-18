/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadharjoite;

/**
 *
 * @author anssi1401
 */
public class OmaProsessi implements Runnable {

    String nimi;   

    public OmaProsessi() {
    }

    public OmaProsessi(String s) {
        nimi = s;
    }

    public String getSisalto() {
        return nimi;
    }

    public void setSisalto(String sisalto) {
        this.nimi = sisalto;
    }

    @Override
    public void run() {
        go();
    }

    public void go() {
            Thread.currentThread().setName(nimi);
            System.out.println(Thread.currentThread().getName());
            System.out.println(OmaProsessi2.staattinen + 2); 
    }
}
