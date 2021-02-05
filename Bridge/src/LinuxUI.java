/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class LinuxUI extends UI{
    IRenk renk;
    
    public LinuxUI(IRenk rnk){
        renk = rnk;
    }

    @Override
    public void uiOlustru() {
        String renkParametresi = renk.renkOlustur();
        System.out.println(renkParametresi+" ile LinuxUI oluşturuldu.");
    }
    
}
