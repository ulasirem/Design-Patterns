/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class DiskYedekleyici implements IYedekleyici{

    @Override
    public void Kaydet(String kaynakKlasor, String hedefKlasor) {
        System.out.println(kaynakKlasor+" konumundaki dosyalar disk yedekleyici de "+hedefKlasor+" konumuna kayıt edildi");
    }
    
}
