/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class SomutFabrika1 implements ISoyutFabrika{

    @Override
    public ISoyutKumas kumasGetir() {
        return new KetenKumas();
    }

    @Override
    public ISoyutIskelet iskeletGetir() {
        return new AhsapIskelet();
    }

    @Override
    public ISoyutUrun urunGetir() {
        return new Koltuk();
    }
    
}
