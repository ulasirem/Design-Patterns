/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Roman implements Kitap{
    private String yazar;
    private String romanAdi;
    private int sayfaSayisi;

    public Roman(String yazar, String romanAdi, int sayfaSayisi) {
       setYazar(yazar);
       setRomanAdi(romanAdi);
       setSayfaSayisi(sayfaSayisi);
       
    }
    
    

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getRomanAdi() {
        return romanAdi;
    }

    public void setRomanAdi(String romanAdi) {
        this.romanAdi = romanAdi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    

    @Override
    public void bilgiGoster() {
        System.out.println(getRomanAdi()+" - "+getYazar()+" - "+getSayfaSayisi());
    }
    
}
