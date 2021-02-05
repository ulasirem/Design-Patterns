/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//leaf
public class Tasarimci implements Calisan{
    private int kurumId;
    private String isim;
    private String tasarimciBilgi;

    public Tasarimci(int kurumId, String isim) {
        setKurumId(kurumId);
        setIsim(isim);
    }

    public int getKurumId() {
        return kurumId;
    }

    public void setKurumId(int kurumId) {
        this.kurumId = kurumId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTasarimciBilgi() {
        return tasarimciBilgi;
    }

    public void setTasarimciBilgi(String tasarimciBilgi) {
        this.tasarimciBilgi = tasarimciBilgi;
    }
    
    public void tasarimYap(){
        System.out.println(getIsim()+" "+getTasarimciBilgi());
    }
    
    @Override
    public void bilgiGoster() {
        System.out.println(getKurumId()+ "-"+getIsim());
    }
    
    
}
