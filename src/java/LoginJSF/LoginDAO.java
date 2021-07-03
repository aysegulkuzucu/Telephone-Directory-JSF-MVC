
package LoginJSF;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public static boolean validate(String user, String password, int tip) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
                con = DataConnect.getConnection();
                if (tip == 1) {
                    ps = con.prepareStatement("Select admin_adi, admin_sifre from admin where admin_adi = ? and admin_sifre = ?");
                }
                else if (tip == 2) {
                    ps = con.prepareStatement("Select kisi_ad, kisi_sifre from kisiler where kisi_ad = ? and kisi_sifre = ?");
                }
                
                ps.setString(1, user);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                        return true;
                }
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                return false;
        } finally {
                DataConnect.close(con);
        }
        return false;
    }
}
