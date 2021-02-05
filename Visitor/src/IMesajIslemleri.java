/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 *///Visitable
public interface IMesajIslemleri {
    void kisiBul(String kisi);
    void mesajAl();
    void mesajGonder(String mesaj);
    void accept(IVisitor visit);
}
