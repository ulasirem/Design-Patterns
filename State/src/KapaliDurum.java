/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class KapaliDurum implements IState{
    DroneIslem drone;
    
    public KapaliDurum(DroneIslem drn){
        drone = drn;
    }

    @Override
    public void durdur() {
        System.out.println("Drone zaten kapalı.");
    }

    @Override
    public void yerdeCalistir() {
        System.out.println("Yerde çalışmaya başladı.");
        //state değişimi yapılacak
        drone.durumSetle(drone.yerdeState);
    }

    @Override
    public void yuksel() {
        System.out.println("Drone'un öncelikle yerde çalışması gerek.");
    }
    
}
