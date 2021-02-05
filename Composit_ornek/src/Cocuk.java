/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Cocuk implements IHuman{  
    private String isim;
    private int okulNo;
    private int kapiNo;

    public Cocuk(String isim, int kapiNo, int okulNo) {
        setIsim(isim);
        setKapiNo(kapiNo);
        setOkulNo(okulNo);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public int getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }
    

    
    @Override
    public void biligiler() {
        System.out.println("Ad : "+getIsim()+" Kapi No : "+getKapiNo()+" Okul No : "+getOkulNo());
    }
    
}
