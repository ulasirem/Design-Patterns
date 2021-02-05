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
        String uretilenKumas;
        IFabrika kumasf = new KumasFabrika();
        IKumas kumas = kumasf.fabrkaMethodu("keten");
        uretilenKumas = kumas.kumasUret();
        System.out.println(uretilenKumas+" üretildi");
    
        kumas = kumasf.fabrkaMethodu("kadife");
        uretilenKumas = kumas.kumasUret();
        System.out.println(uretilenKumas+" üretildi");
    }
}
