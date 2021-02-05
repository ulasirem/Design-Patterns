/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class SinemaSistemi {
    Televizyon tv;
    Hoparlor hoparlor;
    PatlamisMisir misir;
    Projeksiyon projeksiyon;
    SinemaPerdesi perde;

    public SinemaSistemi() {
        tv = new Televizyon();
        hoparlor = new Hoparlor();
        misir = new PatlamisMisir();
        projeksiyon = new Projeksiyon();
        perde = new SinemaPerdesi();
        
    }
    
    public void tvAc(){
        tv.televizyonAc();
    }
    public void tvKapat(){
        tv.televizyonKapat();
    }
    public void filmSec(String film){
        tv.filmSec(film);
    }  
    public void filmAc(){
        tv.filmAc();
    }
    public void filmKapat(){
        tv.filmKapat();
    }
     public void hoparlorAc(){
         hoparlor.hoparlorAc();
     }
    public void hoparlorKapat(){
        hoparlor.hoparlorKapat();
    }
    public void sesArttir(){
        hoparlor.sesArttir();
    }
    public void sesAzalt(){
        hoparlor.sesAzalt();
    }
    public void makinayiAc(){
        misir.makinayiAc();
    }
    public void makinayiKapat(){
        misir.makinayiKapat();
    }
     public void projeksiyonAc(){
         projeksiyon.projeksiyonAc();
     }
    public void projeksiyonKapat(){
        projeksiyon.projeksiyonKapat();
    }    
    public void perdeyiIndir(){
        perde.perdeyiIndir();
    }
    public void perdeyiKaldir(){
        perde.perdeyiKaldir();
    }
    
    public void FilmModu(String film){
        perde.perdeyiIndir();
        projeksiyon.projeksiyonAc();
        misir.makinayiAc();
        tv.televizyonAc();
        tv.filmSec(film);
        hoparlor.hoparlorAc();
        tv.filmAc();
        misir.makinayiKapat();
        hoparlor.sesArttir();
        hoparlor.sesArttir();
        hoparlor.sesArttir();

    }
}
