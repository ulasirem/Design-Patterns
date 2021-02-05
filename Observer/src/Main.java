
import java.awt.image.BufferedImage;

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
        Kullanici k1 = new Kullanici("Irem Ulaş","iremulas@gmail");
        Kullanici k2 = new Kullanici("Feride Irem","feride@gmail");
        Kullanici k3 = new Kullanici("Ulas Irem","ulas@gmail");
        Grup grup = new Grup("Yazılım");
        Sayfa sayfa = new Sayfa("Teknoloji");
        
        k1.takipciEkle(k2);
        k1.takipciEkle(k3);
        k1.takipciEkle(grup);
        sayfa.takipciEkle(k1);
        sayfa.takipciEkle(k2);
        sayfa.takipciEkle(k3);
        sayfa.takipciCikar(k2);
        sayfa.takipciEkle(grup);
        
        k1.paylas(new Post("Başlık","İçerik",k1));
        sayfa.paylas(new Post("Başlık2","içerik2,",sayfa));
        
    }
    
}
