
package Controller;

import DAO.KisiDAO;
import Entity.Kisi;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class KisiBean implements Serializable {
    private KisiDAO dao;
    private Kisi entity;
    
    // CRUD
    public String kisiOlustur() {
        this.getDao().kisiOlustur(entity);
        this.entity = new Kisi();
        return "admin";
    }
    
    // void bulundugu sayfaya geri doner
    public void kisiSil(Kisi m) {
        this.getDao().kisiSil(m);
    }

    public String kisiUpdateForm(Kisi m) {
        this.entity = m;
        return "adminKisiGuncelle";
    }

    
    public String kisiGuncelle() {
        this.getDao().kisiGuncelle(entity);
        this.entity = new Kisi();
        return "admin";
    }
    
 
    public List<Kisi> getKisiRead() {
        return this.getDao().kisiRead();
    }
    
 
    public KisiDAO getDao() {
        if (this.dao == null)
            this.dao = new KisiDAO();
        return dao;
    }

    public void setDao(KisiDAO dao) {
        this.dao = dao;
    }

    public Kisi getEntity() {
        if (this.entity == null)
            this.entity = new Kisi();
        return entity;
    }

    public void setEntity(Kisi entity) {
        this.entity = entity;
    }

    public KisiBean() {
    }
}
