
package DAO;

import Entity.Kisi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KisiDAO extends Util.DBConnection {
    // CRUD islemleri
    
    public void kisiOlustur(Kisi m) {       
        try {      
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into kisiler (kisi_ad, kisi_soyad, kisi_sifre, kisi_sirket, kisi_unvan, kisi_telefon, kisi_telefontip, kisi_eposta, kisi_adres, kisi_adrestip) values ('" + m.getKullaniciAdi() + "','" + m.getKisiSoyadi() + "','" + m.getKisiSifre() + "','" + m.getKisiSirket() + "','" + m.getKisiUnvan() + "','" + m.getKisiTelefon() + "','" + m.getKisiTelTip() + "','" + m.getKisiEposta() + "','" + m.getKisiAdres() + "','" + m.getKisiAdresTip() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void kisiSil(Kisi m) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from kisiler where kisi_id=" + m.getKisiID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void kisiGuncelle(Kisi m) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update kisiler set kisi_ad='" + m.getKullaniciAdi() + "' , kisi_soyad='" + m.getKisiSoyadi() + "',kisi_sifre='" + m.getKisiSifre() + "', kisi_sirket='" + m.getKisiSirket() + "', kisi_unvan='" + m.getKisiUnvan() + "', kisi_telefon='" + m.getKisiTelefon() + "', kisi_telefontip='" + m.getKisiTelTip() + "', kisi_eposta='" + m.getKisiEposta() + "', kisi_adres='" + m.getKisiAdres() + "', kisi_adrestip='" + m.getKisiAdresTip() + "' where kisi_id=" + m.getKisiID());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 
    public List<Kisi> kisiRead() {
        List<Kisi> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from kisiler order by kisi_id asc");
            while (rs.next()) {
                Kisi temp = new Kisi(rs.getInt("kisi_id"), rs.getString("kisi_ad"), rs.getString("kisi_soyad"), rs.getString("kisi_sifre"), rs.getString("kisi_sirket"), rs.getString("kisi_unvan"), rs.getString("kisi_telefon"), rs.getString("kisi_telefontip"), rs.getString("kisi_eposta"), rs.getString("kisi_adres"), rs.getString("kisi_adrestip")  );
                list.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    } 
}




