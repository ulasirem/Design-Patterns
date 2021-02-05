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
      Contex c = new Contex();
      System.out.println("Araç normal hızlı ilerliyor");
      c.setDavranis(new Normal());
      c.calistir();
      System.out.println("Arac yüksek hıza çıktı");
      c.setDavranis(new YuksekHiz());
      c.calistir();
      System.out.println("Arac nitro hıza çıktı");
      c.setDavranis(new NitroHiz());
      c.calistir();
      
  }  
}
