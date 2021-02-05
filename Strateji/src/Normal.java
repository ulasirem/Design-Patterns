/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Normal extends Davranis{

    @Override
    public void durumSet() {
        durum = 0;
        
    }

    @Override
    public void renkSet() {
        renk = "Sarı";
    }

    @Override
    public void hizKatSet() {
        hizlanmaSayisi = 1;
    }

    @Override
    public void maksHizSet() {
        maksHiz = 200;
    }

    @Override
    public void nitroSet() {
        nitro = false;
    }
    
}
