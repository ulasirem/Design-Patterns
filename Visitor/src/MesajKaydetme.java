/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class MesajKaydetme implements IVisitor {

     @Override
    public void visit(NormalKullanici normal) {
        System.out.println("Normal kullanıcı için mesaj kaydedetme özelliği bulunmuyor.");
    }

    @Override
    public void visit(GoldKullanici gold) {
        System.out.println("Gold kullanıcı için mesaj kaydediliyor.");
    }

    @Override
    public void visit(PremiumKullanici premium) {
        System.out.println("Premium kullanıcı için mesaj kaydediliyor.");
    }
    
}
