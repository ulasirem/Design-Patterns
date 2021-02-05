/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Televizyon {
    private String film;
   
    public void filmSec(String film){
        setFilm(film);
    }
    
    public void televizyonAc(){
        System.out.println("Televizyon açıldı.");
    }
    public void televizyonKapat(){
        filmKapat();
        System.out.println("Televizyon kapatıldı.");
    }
    
    public void filmAc(){
        System.out.println(getFilm()+" filmi açıldı.");
    }
    public void filmKapat(){
        System.out.println(getFilm()+" filmi kapatıldı.");
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
    
    
}
