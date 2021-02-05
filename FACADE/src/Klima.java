/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Klima {
    private int sicaklik;
    
    public void guncelle(int sicaklik){
        this.sicaklik = sicaklik;
        System.out.println("Klima "+sicaklik+" derecede ayarlı");
    }
    public void ac(){
        System.out.println("Klima açıldı");
    }
    public void kapat(){
        System.out.println("Klima kapatıldı");
    }
}
