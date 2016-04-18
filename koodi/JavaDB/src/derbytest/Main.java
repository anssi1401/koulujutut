/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derbytest;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlahti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String DBpath = "Omatekema2";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver).newInstance();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "poo!!", ex);
        }

        try {
            con = DriverManager.getConnection("jdbc:derby:" + DBpath + ";username=anssi1401;password=aurinko12;create=false"); // Luodaan yhteys tietokantaan

            stmt = con.createStatement();

            // Luodaan tietokantaan taulu TUOTTEET

            String sql;

            sql = "DROP TABLE EKATAULU";

            try {
                stmt.executeUpdate(sql);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.WARNING, "Taulun DROPPAUS epäonnistui", ex);
                //System.exit(0);
            }

            sql = "CREATE TABLE EKATAULU ("
                    + "ID INTEGER GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY,"
                    + "ETUNIMI VARCHAR(40) NOT NULL,"
                    + "SUKUNIMI VARCHAR(40) NOT NULL)";

            try {
                stmt.executeUpdate(sql);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.WARNING, "Taulun lisäys epäonnistui", ex);
                //System.exit(0);
            }

            try {
                sql = "INSERT INTO EKATAULU(ETUNIMI, SUKUNIMI) VALUES('Mauno', 'Koivisto')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO EKATAULU(ETUNIMI, SUKUNIMI) VALUES('Tellervo', 'Koivisto')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO EKATAULU(ETUNIMI, SUKUNIMI) VALUES('Martti', 'Ahtisaari')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO EKATAULU(ETUNIMI, SUKUNIMI) VALUES('Urho', 'Kekkonen')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO EKATAULU(ETUNIMI, SUKUNIMI) VALUES('Tarja', 'Halonen')";
                stmt.executeUpdate(sql);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.WARNING, "Rivin lisäys epäonnistui", ex);
            }

            try {
                sql = "DELETE FROM EKATAULU WHERE ID = 2";
                stmt.executeUpdate(sql);
                System.out.println("Kävin täällä!");
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.WARNING, "Rivin poisto epäonnistui", ex);
                //System.exit(0);
            }

            // Luetaan Taulusta tietoa
            sql = "SELECT * FROM EKATAULU";
            rs = stmt.executeQuery(sql);  // Huomaa nyt on kyseessä query ei update

            // Yritetään lukea tietoja ennen rs.next():iä
            try {
                int i = rs.getInt("ID");  // tästä löytyisi toinenkin versio, joka ottaisi sarake indeksi parametrinaan
                System.out.println("i: " + i + "\n");
            } catch (Exception ex) {
                System.out.println("*** Ei onnistu noin vain!!! ***");
                //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }


            //Käydään tulokset läpi
            while (rs.next()) {
                int i = rs.getInt("ID");
                System.out.println("i: " + i);
            }

            // suljetaan ResultSet, Statement ja Connection

        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Koko prosessissa meni jotain pieleen", e);
        } finally {

            System.out.println("Suljetaan kaikki!");

            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Taisi onnistua!");
        }



    }
}
