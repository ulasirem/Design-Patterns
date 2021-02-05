
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
//Composit
public class InsanKaynaklari implements Calisan{
    private List<Calisan> calisanListe;

    public InsanKaynaklari() {
        calisanListe = new ArrayList<>();
    }
    
    public void calisanEkle(Calisan calisan){
        calisanListe.add(calisan);
    }
    public void calisanCikar(Calisan calisan){
        calisanListe.remove(calisan);
    }
    
  
    @Override
    public void bilgiGoster() {
        for(Calisan calisan : calisanListe){
                calisan.bilgiGoster();
        }    
    }
    
}
