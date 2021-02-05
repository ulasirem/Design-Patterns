/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Yasli implements IHuman{
    private String isim;
    private int kapiNo;
    private int emeklilikNo;

    public Yasli(String isim, int kapiNo, int emeklilikNo) {
        setIsim(isim);
        setKapiNo(kapiNo);
        setEmeklilikNo(emeklilikNo);
    }
    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    public int getEmeklilikNo() {
        return emeklilikNo;
    }

    public void setEmeklilikNo(int emeklilikNo) {
        this.emeklilikNo = emeklilikNo;
    }

    
    @Override
    public void biligiler() {
    System.out.println("Ad : "+getIsim()+" Kapi No: "+getKapiNo()+" Emeklilik No : "+getEmeklilikNo());    
    }
    
}
