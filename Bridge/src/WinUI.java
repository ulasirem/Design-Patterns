/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class WinUI extends UI{
    IRenk renk;
    
    public WinUI(IRenk rnk){
        renk = rnk;
    }
    
    @Override
    public void uiOlustru() {
        String renkParametresi = renk.renkOlustur();
        System.out.println(renkParametresi+" ile WinUI oluştturuldu.");
    }
    
}
