
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class ListActivity implements Activity{
    ArrayList<Kanal> kanalList;
    
    @Override
    public void onCreate() {
        kanalList = kanalList();
    }
    //kaçıncı listedeki kanala tıkladıysa onun geri dönmesini sağlarız.
    public Kanal kanalSec(int index){
        return kanalList.get(index);
    }
    
    //kanalları tanımlayıp ArraList e ekledik
    public ArrayList<Kanal> kanalList(){
        ArrayList<Kanal> kanalList = new ArrayList<Kanal>();
        Kanal kanalA = new Kanal("KanalA","www.KanalA.com");
        Kanal kanalB = new Kanal("KanalB","www.kanalB.com");
        kanalList.add(kanalA);
        kanalList.add(kanalB);
        return kanalList;
    }
    
}
