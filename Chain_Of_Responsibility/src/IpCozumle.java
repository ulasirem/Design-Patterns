/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class IpCozumle {
    public static int get(String ip){
        String[] parcalar = ip.split("\\.");
        if(parcalar.length > 0){
            return Integer.parseInt(parcalar[0]);
        }
        return 300;
    }
}
