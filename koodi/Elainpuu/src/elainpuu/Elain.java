/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elainpuu;

/**
 *
 * @author anssi1401
 */
public abstract class Elain {

    private int ika;
    private int paino;

    Elain() {
    
    }

    Elain(int i, int p) {
        ika = i;
        paino = p;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        if (ika > 0 && paino < 150) {
            this.ika = ika;
        } else {
            System.out.println("väärä syöte");
        }
    }

    public int getPaino() {
        return paino;
    }

    public void setPaino(int paino) {
        if (paino > 0 && paino < 1000) {
            this.paino = paino;
        } else {
            System.out.println("väärä syöte");
        }
    }
    
    public abstract void syon();
    public abstract void liikun();
}
