package fi.academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Yhteys {
    public static void lataaAjuri() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Ajuri ladattu");
    }
    public static Connection luoYhteys() throws ClassNotFoundException, SQLException {
        lataaAjuri();
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/tentti?useSSL=false", "lumiukko", "salasana");
    }
}
