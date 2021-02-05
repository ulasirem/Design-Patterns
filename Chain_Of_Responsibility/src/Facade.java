/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Facade {
    Yerel yerel;
    Intranet intranet;
    Internet internet;
    
    public Facade(){
        yerel = new Yerel();
        intranet = new Intranet();
        internet = new Internet();
    }
     
    public void yerelUygula(Istek istek){
        yerel.uygula(istek);
    }
    public void intranetUygula(Istek istek){
        intranet.uygula(istek);
    }
    public void internetUygula(Istek istek){
        internet.uygula(istek);
    }
    
    public void uygula(Istek istek){
        yerel.setSonraki(intranet);
        intranet.setSonraki(internet);
    }
}
