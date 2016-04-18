/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elainpuu;

/**
 *
 * @author anssi1401
 */
public final class Opettaja extends Ihminen {
    private int opettajanro;

    public int getOpettajanro() {
        return opettajanro;
    }

    public void setOpettajanro(int opettajanro) {
        this.opettajanro = opettajanro;
    }
    
    public void opetan(){
        System.out.println("Opetan asioita");
    }
}
