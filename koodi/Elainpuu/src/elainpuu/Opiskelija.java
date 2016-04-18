/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elainpuu;

/**
 *
 * @author anssi1401
 */
public final class Opiskelija extends Ihminen {
    private int opiskelijanro;

    public int getOpiskelijanro() {
        return opiskelijanro;
    }

    public void setOpiskelijanro(int opiskelijanro) {
        this.opiskelijanro = opiskelijanro;
    }
    
    public void opiskelen(){
        System.out.println("Opiskelen");
    }
}
