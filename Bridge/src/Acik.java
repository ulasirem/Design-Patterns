/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Acik implements IRenk{

    @Override
    public String renkOlustur() {
        System.out.println("Acik renk verileri gönderiliyor.");
        return "beyaz";
    }
    
}
