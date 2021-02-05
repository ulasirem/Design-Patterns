/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class HavadaDurumu implements IState{

    DroneIslem drone;
    
    public HavadaDurumu(DroneIslem drn){
        drone = drn;
    }
    
    @Override
    public void durdur() {
        System.out.println("Drone 'u durdurmak için önce yere indirmelisiniz.");
    }

    @Override
    public void yerdeCalistir() {
        System.out.println("Dron yere iniyor.");
        //state değişimi yapılacak
        drone.durumSetle(drone.yerdeState);
    }

    @Override
    public void yuksel() {
        System.out.println("Drone zaten havada.");
    }
    
}
