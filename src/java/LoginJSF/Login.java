
package LoginJSF;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


@ManagedBean
@SessionScoped
public class Login implements Serializable {
    
    private static final long serialVersionUID = 1094801825228386363L;
    
    private String sifre;
    private String msg;
    private String kullaniciAdi;
    private int kullaniciTipi;

    public int getKullaniciTipi() {
        return kullaniciTipi;
    }

    public void setKullaniciTipi(int kullaniciTipi) {
        this.kullaniciTipi = kullaniciTipi;
    }

    public String getSifre() {
        return sifre;
    }

    public String getMsg() {
        return msg;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    
    // login
    public String dogrulama() {
        boolean valid = LoginDAO.validate(kullaniciAdi, sifre, kullaniciTipi);
        switch (kullaniciTipi) {
            case 1:
                if (valid) {
                    HttpSession session = SessionUtils.getSession();
                    session.setAttribute("username", kullaniciAdi);
                    return "admin";
                }
                else {
                    FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Yanlis kullanici adi, sifre veya tipi",
                        "Lutfen kullanici adinizi ve sifrenizi dogru girin"));
                    return "login";
                }
            case 2:
                if (valid) {
                    HttpSession session = SessionUtils.getSession();
                    session.setAttribute("username", kullaniciAdi);
                    return "kisi";
                }
                else {
                    FacesContext.getCurrentInstance().addMessage(
                        null,
                        new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Yanlis kullanici adi, sifre veya tipi",
                        "Lutfen kullanici adinizi ve sifrenizi dogru girin"));
                    return "login";
                }
            default:
                    return "login";
        }
    }
    
    // logout
    public String logout() {
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        return "login";
    }
    
    public Login() {
    }
}
