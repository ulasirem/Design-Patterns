/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Main {
    public static void main(String[] args){
       SinemaSistemi sistem = new SinemaSistemi();
       sistem.tvAc();
       sistem.filmSec("Çikolata Fabrikası");
       sistem.filmAc();
       sistem.tvKapat();
       sistem.FilmModu("Alice Harikalar Diyarında");
       
    }
}
