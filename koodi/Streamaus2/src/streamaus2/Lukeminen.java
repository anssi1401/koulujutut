package streamaus2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package streamaus2;
import java.io.*;
/**
 *
 * @author anssi1401
 */
/*
public class Lukeminen {
   public static void main(String[] args) {
      String TIEDNIMI = "in.txt";
      try {
         FileInputStream syotevirta = 
         new FileInputStream(TIEDNIMI);
         InputStreamReader lukija = 
         new InputStreamReader(syotevirta);
         BufferedReader puskuroituLukija = 
         new BufferedReader(lukija);

        while (puskuroituLukija.ready()) {
            String rivi = puskuroituLukija.readLine();
            System.out.println(rivi);
         }
         puskuroituLukija.close();
      }
      catch (FileNotFoundException e) {
         System.out.print("Tiedosto hukassa!");
      }
      catch (IOException e) {
         System.out.print("Lukuvirhe!");
      }
   }
}

