/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class YerdeDurumu implements IState{

    DroneIslem drone;
    
    public YerdeDurumu(DroneIslem drn){
        drone = drn;
    }
    
    @Override
    public void durdur() {
        System.out.println("Drone durduruldu.");
        //state değişimi yapılacak
        drone.durumSetle(drone.kapaliState);
    }

    @Override
    public void yerdeCalistir() {
        System.out.println("Drone zaten yerde çalışıyor.");
    }

    @Override
    public void yuksel() {
        System.out.println("Drone yükseliyor.");
        //state değişimi yapılacak
        drone.durumSetle(drone.havadaState);
    }
    
}
