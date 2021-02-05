/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Yetiskin implements IHuman{
    private String isim;
    private int kapiNo;
    private int sigortaNo;

    public Yetiskin(String isim, int kapiNo, int sigortaNo) {
        setIsim(isim);
        setKapiNo(kapiNo);
        setSigortaNo(sigortaNo);
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

    public int getSigortaNo() {
        return sigortaNo;
    }

    public void setSigortaNo(int sigortaNo) {
        this.sigortaNo = sigortaNo;
    }

    
    @Override
    public void biligiler() {
        System.out.println("Ad : "+getIsim()+" Kapi No : "+getKapiNo()+" Sigorta No : "+getSigortaNo());
    }
    
    
    
}
