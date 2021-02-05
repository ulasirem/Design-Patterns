
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Kategori implements Kitap{
    private List<Kitap> kitaplar;
    
    public Kategori() {
        kitaplar = new ArrayList<Kitap>();
    }
    
    public void kitapEkle(Kitap k){
        kitaplar.add(k);
    }
     public void kitapCikar(Kitap k){
        kitaplar.remove(k);
    }

    @Override
    public void bilgiGoster() {
        for(Kitap kitap: kitaplar){
            kitap.bilgiGoster();
        }
    }
    
    
    
    
    
}
