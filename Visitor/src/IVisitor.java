/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public interface IVisitor {
    void visit(NormalKullanici normal);
    void visit(GoldKullanici gold);
    void visit(PremiumKullanici premium);
}
