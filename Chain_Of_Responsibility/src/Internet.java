/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Internet extends Servis{

    @Override
    public void uygula(Istek istek) {
        int ilkIp = IpCozumle.get(istek.getIp());
        
        if(ilkIp < 255 && ilkIp > 200){
        System.out.println("Internet ağındaki "+istek.getIp()+" adresine "+istek.getTip()+" isteği yapıldı.");    
        }
        else {
            if(getSonraki() != null){
                getSonraki().uygula(istek);
            }
    }
    } 
}
