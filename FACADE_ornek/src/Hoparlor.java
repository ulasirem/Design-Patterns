/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Hoparlor {
    private int sesSeviyesi=5;
    public void hoparlorAc(){
        System.out.println("Hoparlor açıldı.");
    }
    public void hoparlorKapat(){
        System.out.println("Hoparlor kapatıldı");
    }
    public void sesArttir(){
        sesSeviyesi++;
        System.out.println("Ses seviyesi : "+sesSeviyesi);
    }
    public void sesAzalt(){
        sesSeviyesi--;
        System.out.println("Ses seviyesi : "+sesSeviyesi);
    }
}
