
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//Singelton ı bir sınıfta sadece bir adet nesne olusturmamız gerekirse kullanırız
public class Main {
    public static void main(String[] args){
        
        MainActivity mainActivity = new MainActivity();
        ListActivity listActivity = new ListActivity();
        
        mainActivity.onCreate();
        listActivity.onCreate();
        
        Kanal kanal = listActivity.kanalSec(0);
        mainActivity.onCreate();
        mainActivity.oynat(kanal);
        Main.sleep(5000);
        
        listActivity.onCreate();
        kanal = listActivity.kanalSec(1);
        mainActivity.onCreate();
        mainActivity.durdur(kanal);
        mainActivity.oynat(kanal);
        
    }
    
    public static void sleep(int sure){
        try {
            Thread.sleep(sure);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
