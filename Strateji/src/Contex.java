/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Contex {
    Davranis d;
    public void setDavranis(Davranis davranis){
        d = davranis ;
    }
    public void calistir(){
        d.durumSet();
        d.renkSet();
        d.hizKatSet();
        d.maksHizSet();
        d.nitroSet();
        d.Yazdir();
    }
}
