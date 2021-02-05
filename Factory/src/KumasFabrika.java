/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class KumasFabrika implements IFabrika{

    @Override
    public IKumas fabrkaMethodu(String urun) {
        switch(urun){
            case "keten" : return new KetenKumas(); 
            case "kadife" : return new KadifeKumas();
            default: return new KadifeKumas();
            
        }
    }
    
}
