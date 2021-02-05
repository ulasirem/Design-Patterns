
import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//gönderi oluşturma
public class Post{
    private String baslik, icerik;
    private Image resim;
    private Paylasimci paylasimci;
   
    
    public Post(String baslik, String icerik, Paylasimci paylasimci){
        setBaslik(baslik);
        setIcerik(icerik);
        setPaylasimci(paylasimci);
    }
    
    public Post(String baslik, Image resim, Paylasimci paylasimci){
        setBaslik(baslik);
        setResim(resim);
        setPaylasimci(paylasimci);
    }
    
   
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public Image getResim() {
        return resim;
    }

    public void setResim(Image resim) {
        this.resim = resim;
    }

    public Paylasimci getPaylasimci() {
        return paylasimci;
    }

    public void setPaylasimci(Paylasimci paylasimci) {
        this.paylasimci = paylasimci;
    }
    
    
}
