/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//Calisanlar en teped e tasarimcilar,geliştiriciler ve yöneticiler bir altta olmak üzere hiyerarşik bir yapı oluşturuldu
public class Main {
    public static void main(String[] args){
        Tasarimci t = new Tasarimci(101,"Tasarimci Ornek1");
        Tasarimci t1 = new Tasarimci(102,"Tasarimci Ornek2");
        InsanKaynaklari tasarimcilar = new InsanKaynaklari();
        tasarimcilar.calisanEkle(t);
        tasarimcilar.calisanEkle(t1);
        
        Gelistirici g = new Gelistirici(201,"Gelistirici Ornek1");
        Gelistirici g1 = new Gelistirici(202,"Gelistirici Ornek2");
        InsanKaynaklari gelistiriciler = new InsanKaynaklari();
        gelistiriciler.calisanEkle(g);
        gelistiriciler.calisanEkle(g1);       
        
        Yonetici y = new Yonetici(301,"Yonetici Ornek1");
        Yonetici y1 = new Yonetici(302,"Yonetici Ornek2");
        InsanKaynaklari yoneticiler = new InsanKaynaklari();       
        yoneticiler.calisanEkle(y);
        yoneticiler.calisanEkle(y1);
        
        
        InsanKaynaklari calisanlar = new InsanKaynaklari();
        calisanlar.calisanEkle(tasarimcilar);
        calisanlar.calisanEkle(gelistiriciler);
        calisanlar.calisanEkle(yoneticiler);
        
        calisanlar.bilgiGoster();
        /*
        tasarimcilar.bilgiGoster();
        gelistiriciler.bilgiGoster();
        yoneticiler.bilgiGoster();
        */
    
    }
}
