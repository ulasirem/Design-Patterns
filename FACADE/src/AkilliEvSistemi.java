/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */

//FACADE kullanırız
public class AkilliEvSistemi {    
    Klima klima;
    Kapi kapi;
    Isik isik;
    Televizyon televizyon;
    KahveMakinasi kahveMakinasi;

    public AkilliEvSistemi(int adet) {
        klima = new Klima();
        kapi = new Kapi();
        isik = new Isik(adet);
        televizyon = new Televizyon();
        kahveMakinasi = new KahveMakinasi();
    }
    
    public void klimaGuncelle(int sicaklik){
        klima.guncelle(sicaklik);
    }
    public void klimaAc(){
        klima.ac();
    }
    public void klimaKapat(){
        klima.kapat();
    }
    
    public void kapiKilitle(){
        kapi.kilitle();
    }
    public void kapiKilitAc(){
        kapi.kilitAc();
    }
    
    public void isikAc(int numara){
        isik.ac(numara);
    }
    
    public void isikKapat(int numara){
        isik.kapat(numara);
    }
    
     public void televizyonAc(){
         televizyon.ac();
     }
    public void televizyonKapat(){
        televizyon.kapat();
    }
    
    public void televizyonSesAzalt(){
        televizyon.sesAzalt();
    }
    public void televizyonSesArttir(){
        televizyon.sesArttir();
    }
  
    public void televizyonKanalAzalt(){
        televizyon.kanalAzalt();
    }
    public void televizyonKanalArttir(){
        televizyon.kanalArttir();
    }
    
    public void butunIsiklariKapat(){
        for(int i=0;i <5; i++ ){
            isik.kapat(i);
        }
    }
    
    public void sinemaModu(){
        televizyon.ac();
        televizyon.sesArttir();
        butunIsiklariKapat();
        klima.kapat();
        televizyonAc();
        televizyonSesArttir();
    }
    
    public void uykuModu(){
        klimaKapat();
    }
    
    public void kahveMakinasiAc(){
        kahveMakinasi.ac();
    }
    public void kahveMakinasiKapat(){
        kahveMakinasi.kapat();
    }
    
    public void KahveMakinasiKahveYap(){
        kahveMakinasi.kahveYap();
    }
}
