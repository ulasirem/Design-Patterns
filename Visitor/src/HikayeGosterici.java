/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//Concrete Visitor
public class HikayeGosterici implements IVisitor{

    @Override
    public void visit(NormalKullanici normal) {
        System.out.println("Normal kullanıcı için hikaye gösteriliyor.");
    }

    @Override
    public void visit(GoldKullanici gold) {
        System.out.println("Gold kullanıcı için hikaye gösteriliyor.");
    }

    @Override
    public void visit(PremiumKullanici premium) {
        System.out.println("Premium kullanıcı için hikaye gösteriliyor.");
    }
    
}
