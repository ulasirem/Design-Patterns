/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public abstract class Servis {
    
    private Servis sonraki;
    public abstract void uygula(Istek istek);
    
    
       /*
        int ilkIp = IpCozumle.get(istek.getIp());
        
        
        //Chain of Respınsibility kullanılmamış hali
        if(ilkIp < 180){
            System.out.println("Yerel Ağda çalışma şekli.");
        }
        else if(ilkIp <200){
            System.out.println("Intranet Ağında çalışma şekli.");
        }
        else if(ilkIp < 255){
             System.out.println("Internet ağında çalışma şekli.");
        }
        else{
            System.out.println("Hata");
        }
        */

    public Servis getSonraki() {
        return sonraki;
    }

    public void setSonraki(Servis sonraki) {
        this.sonraki = sonraki;
    }
    
    
}
