/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esitysharjoite;

import java.util.*;

public class Esitysharjoite {

    public static void main(String[] args) {
        //TÄYDENNÄ KOODI TOIMIVAKSI:
        //Luo nro niminen HashMap hajautustaulu ja sille muuttujat Nro(Integer) ja Nimi(String)
        //Luo put komennolla muutama alkio hajautustauluun.
        HashMap<Integer, String> nro = new HashMap<>();
        nro.put(1, "Nimi1");
        nro.put(2, "Nimi2");
        
        
        //Valmis Tulostukoodi joka tulostaa kaikki hajautustaulun alkiot:
        Set set = nro.entrySet(); //nro on HashMap hajautustaulun nimi.
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("Nro " + mentry.getKey() + "\n  Nimi on : ");
            System.out.println(mentry.getValue());
        }

    }
}