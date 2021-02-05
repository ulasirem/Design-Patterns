/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//uzak hedefe kaydet sınıfını disk yedekleme ve flash yedeklme ye eklmek istiyoruz.
public class UzakHedefeKayit {
    public void UzakHedefeKaydet(String kaynakDosya, String hedefKonum){
     baglantiKur(hedefKonum);
     dosyalariGonder(kaynakDosya);
     baglantiyiKapat();
    }
    private void baglantiKur(String hedef){
        System.out.println(hedef+" adres ile baglanti kuruldu");
    }
    public void dosyalariGonder(String kaynak){
        System.out.println(kaynak+" klasoründeki dosyalar hedef konuma gönderiliyor...");
    }
    
    private void baglantiyiKapat(){
        System.out.println("Bağlantı sonlandırıldı...");
    }
}

