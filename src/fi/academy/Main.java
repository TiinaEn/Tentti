package fi.academy;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{

            Vaihtoehdot.vastaukset(Yhteys.luoYhteys());

            Yhteys.luoYhteys();
        }catch (ClassNotFoundException|SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
