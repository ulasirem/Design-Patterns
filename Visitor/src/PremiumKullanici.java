/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class PremiumKullanici implements IMesajIslemleri{

    @Override
    public void kisiBul(String kisi) {
        System.out.println("Premium kullanıcı için "+ kisi+ " adli kisi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Premium kullanıcı için mesaj aliniyor...");
    }

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println("Premium kullanıcı için "+mesaj+" mesajı gönderiliyor...");
    }

    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
    
}
