/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Karikatur implements Kitap{
    private String yazar;
    private String cizer;
    private String karikaturAdi;
    private int sayfaSayisi;

    public Karikatur(String yazar, String cizer, String karikaturAdi, int sayfaSayisi) {
        setYazar(yazar);
        setCizer(cizer);
        setKarikaturAdi(karikaturAdi);
        setSayfaSayisi(sayfaSayisi);
    }
    
    

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getCizer() {
        return cizer;
    }

    public void setCizer(String cizer) {
        this.cizer = cizer;
    }

    public String getKarikaturAdi() {
        return karikaturAdi;
    }

    public void setKarikaturAdi(String karikaturAdi) {
        this.karikaturAdi = karikaturAdi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
    
    
    
    @Override
    public void bilgiGoster() {
        System.out.println(getKarikaturAdi()+" - "+getYazar()+" - "+getCizer()+" - "+getSayfaSayisi());
    }
    
    
}
