/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elainpuu;

/**
 *
 * @author anssi1401
 */
public abstract class Nisakas extends Elain {
    
    private int jalkojen_maara;

    public int getJalkojen_maara() {
        return jalkojen_maara;
    }

    public void setJalkojen_maara(int jalkojen_maara) {
        if (jalkojen_maara < 10 && jalkojen_maara > 0)
        this.jalkojen_maara = jalkojen_maara;
    }
    
    public abstract void imetan();
}
