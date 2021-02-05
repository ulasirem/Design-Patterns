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
        IColor renk = new Dark();
        UI bilgisayar = new WinUI(renk);
        bilgisayar.uiOlustur();
        
        renk = new Light();
        bilgisayar = new LinuxUI(renk);
        bilgisayar.uiOlustur();
        
        renk = new Blue();
        bilgisayar = new MacUI(renk);
        bilgisayar.uiOlustur();
        
    }
}
