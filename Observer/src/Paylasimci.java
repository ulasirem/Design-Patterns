
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public abstract class Paylasimci {
    private String isim;
    private ArrayList<Takipci> takipciList;
    
    public Paylasimci(String isim){
        setIsim(isim);
        takipciList = new ArrayList<Takipci>();
    }
    
     public abstract void paylas(Post post);

    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void takipciEkle(Takipci takipci){
        takipciList.add(takipci);
    }
    public void takipciCikar(Takipci takipci){
        takipciList.remove(takipci);
    }
    
    public void tumunuBilgilendir(Post post){
        for(Takipci takipci : takipciList){
            takipci.bilgilendir(post);
        }
    }
}
