package fi.academy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vaihtoehdot {

    public static void vastaukset(Connection yhteys) throws SQLException {
        String sql = "Select teksti from kysymysvaihtoehdot";
        PreparedStatement prstm = yhteys.prepareStatement(sql);
        ResultSet rs = prstm.executeQuery();
        while (rs.next()) {
            System.out.println("teksti");
        }
    }
}
