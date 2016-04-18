/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package streamaus2;

import java.io.*;

public class Kirjoittaminen {

    public static void main(String[] args) {

        final String TIEDNIMI = "";
        final int N = 10;
        try {
            // Luodaan tiedosto-olio
            File tiedosto =
                    new File(TIEDNIMI);
            // Luodaan tulostusvirta ja
            // liitetään se tiedostoon
            FileOutputStream tulostusvirta =
                    new FileOutputStream(tiedosto);
            // Luodaan virtaan kirjoittaja
            PrintWriter kirjoittaja =
                    new PrintWriter(tulostusvirta, true);
            // Kirjoitetaan tiedostoon
            for (int i = 0; i < N; i++) {
                kirjoittaja.println("Heippa " + i);
            }
            // Suljetaan tiedosto
            kirjoittaja.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
