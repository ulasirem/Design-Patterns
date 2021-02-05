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
        Yonetici h1 = new Yonetici();
        IHuman h2 = new Cocuk("Ahmet",1,522);
        IHuman h3 = new Yetiskin("Mehmet",2,400000);
        IHuman h4 = new Yasli("Ayşe",3,3000);
        h1.humanEkle(h2);
        h1.humanEkle(h3);
        h1.humanEkle(h4);
        h1.biligiler();
    }
}
