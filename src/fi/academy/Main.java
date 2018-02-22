package fi.academy;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Kysymys.annaKysymys(Yhteys.luoYhteys(),Kyselija.randomHaku());
            Vaihtoehdot.vastaukset(Yhteys.luoYhteys(),Kyselija.getKysymysId());
            KayttajanSyote.kysyKayttajalta();
        }catch (ClassNotFoundException|SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
