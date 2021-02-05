
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
public class Yonetici implements IHuman{
    ArrayList<IHuman> human;
    public Yonetici(){
        human = new ArrayList<IHuman>();
    }   
    
    public void humanEkle(IHuman h){
        human.add(h);
    }
    public void humanCikar(IHuman h){
        human.remove(h);
    }
    
    @Override
    public void biligiler() {
        for(IHuman h : human){
            h.biligiler();
        }
    }
    
}
