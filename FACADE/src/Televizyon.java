/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Televizyon {
    private int sesSeviye, kanalNumara;
    
    public Televizyon(){
        sesSeviye = 10;
        kanalNumara = 1;
    }
    
    public void ac(){
        System.out.println("Televiyon açıldı");
    }
    public void kapat(){
        System.out.println("Televizyon kapatıldı");
    }
    
    public void sesAzalt(){
        sesSeviye--;
        System.out.println("Televizyon ses seviyesi azaltıldı = "+sesSeviye);
    }
    public void sesArttir(){
        sesSeviye++;
        System.out.println("Televizyon ses seviyesi arttırıldı = "+sesSeviye);
    }
  
    public void kanalAzalt(){
        kanalNumara--;
        System.out.println("Kanal numarası azaltıldı = "+kanalNumara);
    }
    public void kanalArttir(){
        kanalNumara++;
        System.out.println("Kanal numarası arttırıldı = "+kanalNumara);
    }
}
