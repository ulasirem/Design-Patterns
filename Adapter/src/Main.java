/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Main {
    public static void main(String[] args){
        String kaynak = "C:\\YedeklenecekKlasor";
        
        IYedekleyici yedekleme;
        yedekleme = new DiskYedekleyici();
        yedekleme.Kaydet(kaynak, "D:\\HedefDiskKlasoru");
        
        yedekleme = new FlashYedekleyici();
        yedekleme.Kaydet(kaynak, "U:\\HedefFlashKonum");
        
        yedekleme = new UzakHedefKayitAdapter();
        yedekleme.Kaydet(kaynak, "www.hedef.com\\hedefWebKonumu");
    }
}
