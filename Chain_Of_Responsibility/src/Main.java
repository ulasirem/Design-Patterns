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
        Yerel yerel = new Yerel();
        Intranet intranet = new Intranet();
        Internet internet = new Internet();
        
        //yerel ağ bu işlemi çözemezse intranete gönderecek
        yerel.setSonraki(intranet);
        intranet.setSonraki(internet);
        //yerel.uygula("150.0.0.1", Istek.Tip.GET);
        yerel.uygula(new Istek("260.0.0.1",Istek.Tip.GET));
*/
       Facade f = new Facade();
       f.uygula(new Istek("50.0.0.1",Istek.Tip.GET));
    }
}
