/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//Contex
public class DroneIslem {
    public IState kapaliState;
    public IState yerdeState;
    public IState havadaState;
    
    //durumları tutmak için
    IState simdiki;
    
    public DroneIslem(){
        kapaliState = new KapaliDurum(this);
        yerdeState = new YerdeDurumu(this);
        havadaState = new HavadaDurumu(this);
        simdiki = kapaliState;
    }
    
    public IState durumGetir(){
        return simdiki;
    }
    
    //durumları günceller
    public void durumSetle(IState s){
        simdiki = s;
    }
    
    public void durdurulsun(){
        simdiki.durdur();
    }
    public void yerdeCalissin(){
        simdiki.yerdeCalistir();
    }
    public void yukselsin(){
        simdiki.yuksel();
    }
    
}
