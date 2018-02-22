package fi.academy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Kysymys {

    public static void annaKysymys (Connection yhteys, int haku) throws SQLException {
        String sql = "select teksti as Kysymys from kysymykset where id = ?";
        PreparedStatement prstm = yhteys.prepareStatement(sql);
        prstm.setInt(1, haku);
        ResultSet rs = prstm.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("Kysymys"));
        }
    }
}
