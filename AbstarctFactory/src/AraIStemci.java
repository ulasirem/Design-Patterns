/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//main içinde de yapabilirdik
public class AraIStemci {
    private ISoyutIskelet iskelet;
    private ISoyutKumas kumas;
    private ISoyutUrun urun;
    
    public AraIStemci(ISoyutFabrika sf){
        kumas = sf.kumasGetir();
        iskelet = sf.iskeletGetir();
        urun = sf.urunGetir();
    }
    
    public void calistir(){
        String i  = iskelet.iskeletUret();
        String k = kumas.kumasUret();
        String u = urun.urunUret();
        
        System.out.println(u+" ürünü "+i+" ve "+k+" ile üretilmistir.");
    }
}
