

package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

public class Kisi /*extends Util.DBConnection*/ {
    private int kisiID;
    private String kullaniciAdi;
    private String kisiSoyadi;
    private String kisiSifre;
    private String kisiSirket;
    private String kisiUnvan;
    private String kisiTelefon;
    private String kisiTelTip;
    private String kisiEposta;
    private String kisiAdres;
    private String kisiAdresTip;
    

    public Kisi() {
    }

    public Kisi(int kisiID, String kullaniciAdi, String kisiSoyadi, String kisiSifre, String kisiSirket, String kisiUnvan, String kisiTelefon, String kisiTelTip, String kisiEposta, String kisiAdres, String kisiAdresTip ) {
        this.kisiID = kisiID;
        this.kullaniciAdi = kullaniciAdi;
        this.kisiSoyadi = kisiSoyadi;
        this.kisiSifre = kisiSifre;
        this.kisiSirket = kisiSirket;
        this.kisiUnvan = kisiUnvan;
        this.kisiTelefon = kisiTelefon;
        this.kisiTelTip = kisiTelTip;
        this.kisiEposta = kisiEposta;
        this.kisiAdres = kisiAdres;
        this.kisiAdresTip = kisiAdresTip;
        
    }

    public int getKisiID() {
        return kisiID;
    }

    public void setKisiID(int kisiID) {
        this.kisiID = kisiID;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getKisiSoyadi() {
        return kisiSoyadi;
    }

    public void setKisiSoyadi(String kisiSoyadi) {
        this.kisiSoyadi = kisiSoyadi;
    }   
    
    public String getKisiSifre() {
        return kisiSifre;
    }

    public void setKisiSifre(String kisiSifre) {
        this.kisiSifre = kisiSifre;
    }
    
    public String getKisiSirket() {
        return kisiSirket;
    }

    public void setKisiSirket(String kisiSirket) {
        this.kisiSirket = kisiSirket;
    }    
    
    public String getKisiUnvan() {
        return kisiUnvan;
    }

    public void setKisiUnvan(String kisiUnvan) {
        this.kisiUnvan = kisiUnvan;
    }    
    
    public String getKisiTelefon() {
        return kisiTelefon;
    }

    public void setKisiTelefon(String kisiTelefon) {
        this.kisiTelefon = kisiTelefon;
    }    
    
    public String getKisiTelTip() {
        return kisiTelTip;
    }

    public void setKisiTelTip(String kisiTelTip) {
        this.kisiTelTip = kisiTelTip;
    }    
    
    public String getKisiEposta() {
        return kisiEposta;
    }

    public void setKisiEposta(String kisiEposta) {
        this.kisiEposta = kisiEposta;
    }    
    
    public String getKisiAdres() {
        return kisiAdres;
    }

    public void setKisiAdres(String kisiAdres) {
        this.kisiAdres = kisiAdres;
    }    
    
    public String getKisiAdresTip() {
        return kisiAdresTip;
    }

    public void setKisiAdresTip(String kisiAdresTip) {
        this.kisiAdresTip = kisiAdresTip;
    }    
}
