/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareeni;

public class JavaReeni {

    public boolean stoppi = false;

    public static void main(String[] args) {

        JavaReeni apuri = new JavaReeni();
        SatunnaistajaSaie job1 = new SatunnaistajaSaie(apuri);
        AjastinSaie job2 = new AjastinSaie(apuri);

        Thread saie1 = new Thread(job1);
        Thread saie2 = new Thread(job2);

        saie1.start();
        saie2.start();
    }
}
