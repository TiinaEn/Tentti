package fi.academy;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Yhteys.luoYhteys();
        }catch (ClassNotFoundException|SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
