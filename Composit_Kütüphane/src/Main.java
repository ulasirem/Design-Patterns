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
    
        Kitap roman = new Roman("Canan Tan","Piraye",432);
        Kategori romanlar = new Kategori();
        romanlar.kitapEkle(roman);
        
        Kitap karikatur = new Karikatur(" M.Kutlukhan Perker"," M.Kutlukhan Perker","Çevrimiçi",20);
        Kategori karikaturler = new Kategori();
        karikaturler.kitapEkle(karikatur);
        
        Kategori kitaplar = new Kategori();
        kitaplar.kitapEkle(romanlar);
        kitaplar.kitapEkle(karikaturler);
        
        kitaplar.bilgiGoster();
    }
}
