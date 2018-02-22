package fi.academy;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            int i = 0;
            while (i<= 3) {
                Kysymys.annaKysymys(Yhteys.luoYhteys(), Kyselija.randomHaku());
                Vaihtoehdot.vastaukset(Yhteys.luoYhteys(), Kyselija.getKysymysId());
                KayttajanSyote.kysyKayttajalta();
                Vaihtoehdot.onkoOikein(Yhteys.luoYhteys(), Kyselija.getKysymysId());
                i++;
            } }catch (ClassNotFoundException|SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
