/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author anssi1401
 */
public class Tuntitehtava {

    public static void main(String args[]) {

        List lista = new ArrayList();
        Luokka l = new Luokka();
                
        lista.add(l);


        System.out.println(((Luokka)lista.get(0)).numero);
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(5);

        System.out.println(lista1.get(0));
    }
}
