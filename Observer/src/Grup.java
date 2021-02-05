/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Grup implements Takipci{
    private String isim;
    public Grup(String isim){
        setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim()+" grup üyelerine "+post.getPaylasimci().getIsim()+"'ın yaptığı paylaşım mail olarak gönderildi.");    
    }
    
}
