/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Isik {
    private boolean[] durum;
    
    public Isik(int adet){
        durum = new boolean[adet];
    }
    public void ac(int numara){
        durum[numara] = true;
        System.out.println(numara+" numaralı ışık açıldı");
    }
    
    public void kapat(int numara){
        durum[numara] = false;
        System.out.println(numara+" numaralı ışık kapatıldı");
    }
}
