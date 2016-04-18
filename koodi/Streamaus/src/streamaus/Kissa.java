/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package streamaus;

/**
 *
 * @author anssi1401
 */
import java.io.*;

public class Kissa implements Serializable {

    private String hanta;
    private String luonne;

    public Kissa() {
        hanta = "kippura";
        luonne = null;
    }

    public String getLuonne() {
        return luonne;
    }

    public void setLuonne(String luonne) {
        this.luonne = luonne;
    }

    public String getHanta() {
        return hanta;
    }

    public void setHanta(String hanta) {
        this.hanta = hanta;
    }
}
