/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class KahveMakinasi {
    private boolean durum;
    
    public void ac(){
        durum = true;
        System.out.println("Kahve makinasi açıldı");
    }
    public void kapat(){
        durum = false;
        System.out.println("Kahve makinası kapatıldı");
    }
    
    public void kahveYap(){
        if(durum == true){
            System.out.println("Kahve yapiliyor");
        }
        else{
            System.out.println("Kahve makinasını açın...");
        }
    }
}
