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
       HikayeGosterici hikayeci = new HikayeGosterici();
       
       NormalKullanici nk = new NormalKullanici();
       nk.accept(hikayeci);
       
       MesajKaydetme kaydet = new MesajKaydetme();
       nk.accept(kaydet);
   }   
}
