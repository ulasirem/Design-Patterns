/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class MacUI extends UI{
    IColor color;

    public MacUI(IColor c) {
        color = c;
    }

    @Override
    public void uiOlustur() {
        String colorParam;
        colorParam = color.renkOlustur();
        System.out.println("MacUI "+colorParam+" ile oluşturuldu.");
    }
    
}
