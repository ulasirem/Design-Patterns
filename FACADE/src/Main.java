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
       /*
       System.out.println("Test - FACADE yapılmadan önce");
       
       Klima klima = new Klima();
       Kapi kapi = new Kapi();
       Isik isik = new Isik(5);
       Televizyon televizyon = new Televizyon();
       
       klima.guncelle(25);
       klima.ac();
       klima.kapat();
       kapi.kilitle();
       kapi.kilitAc();
       isik.ac(3);
       isik.kapat(3);
       televizyon.ac();
       televizyon.sesArttir();
       televizyon.kanalAzalt();
       televizyon.sesAzalt();
       televizyon.kanalArttir();
*/
       AkilliEvSistemi ev = new AkilliEvSistemi(5);
       ev.klimaGuncelle(30);
       ev.kapiKilitle();
       ev.isikAc(2);
       ev.televizyonAc();
       
       ev.kahveMakinasiAc();
       ev.KahveMakinasiKahveYap();
       
   } 
}
