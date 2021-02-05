/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//Farklı türlerde kumaş ve iskelet üretiminden bir ürün ailesi elde edeceğiz
public class Main {
    public static void main(String[] args){
        ISoyutFabrika soyut = new SomutFabrika1();
        AraIStemci ara = new AraIStemci(soyut);
        ara.calistir();
        
        soyut = new SomutFabrika2();
        ara = new AraIStemci(soyut);
        ara.calistir();
        
        soyut = new SomutFabrika3();
        ara = new AraIStemci(soyut);
        ara.calistir();
        
    }
}
