/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Kullanici extends Paylasimci implements Takipci{
    
    private String mail;

    public Kullanici(String isim, String mail) {
        super(isim);
        setMail(mail);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void paylas(Post post) {
        System.out.println(getIsim()+" kullanicisi "+post.getBaslik()+" paylaştı.");
        tumunuBilgilendir(post);
    }

    
    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim()+" kullanıcısına "+post.getPaylasimci().getIsim()+" paylaşımcının yaptığı paylaşım mail olarak gönderildi.");
    }
    
    
}
