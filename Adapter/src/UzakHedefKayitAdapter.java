/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class UzakHedefKayitAdapter implements IYedekleyici{
    private UzakHedefeKayit uzakKayit;
    
    @Override
    public void Kaydet(String kaynakKlasor, String hedefKlasor) {
        uzakKayit = new UzakHedefeKayit();
        uzakKayit.UzakHedefeKaydet(kaynakKlasor, hedefKlasor);
    }
    
}
