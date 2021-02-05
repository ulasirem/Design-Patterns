/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class LinuxUI extends UI {
   IColor color;
    public LinuxUI(IColor c) {
        color = c;
    } 
    @Override
    public void uiOlustur() {
        //IColor interface nin içindebulunan renkOlustur metodunu alırız
        String colorParametresi;
        colorParametresi = color.renkOlustur();
        System.out.println("LinuxUI "+colorParametresi+" ile oluşturuldu");
    }
    
    
}
