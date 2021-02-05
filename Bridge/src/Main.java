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
        IRenk r = new Koyu();
        UI wUI = new WinUI(r);
        wUI.uiOlustru();
        
        r = new Acik();
        UI lUI = new LinuxUI(r);
        lUI.uiOlustru();
        
        r = new HighConstrast();
        wUI = new WinUI(r);
        wUI.uiOlustru();
    
    }
}
