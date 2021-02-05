/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
//Bir mobil uygulama modellendiğini düşünelim
public class MainActivity implements Activity{
    private MediaPlayer mediaPlayer;
    
    @Override
    public void onCreate() {
        /*
        ---------singelton ilk yolu
        //mediaPlayer nesnesini sadece bir kere oluşturarak hem a hem de b kanalının aynı anda çalmasını önleriz. 
        //Bu yapı singelton yapısına uyar. Eğer bu yapıyı oluşturmaz isek a kanalı media playerin ilk nesnesinden 
        //çalışmaya devam eden kanl b ise ikinci oluşan media player nesnesinin üzerinden çalışır.
        if(mediaPlayer == null){
            mediaPlayer = new MediaPlayer();
        }
        */
        mediaPlayer = MediaPlayer.getMediaPlayer();
    }
    
    public void oynat(Kanal kanal){
        mediaPlayer.kanalSec(kanal);
        mediaPlayer.oynat();
    }
    
    public void durdur(Kanal kanal){
        mediaPlayer.durdur();
    }
}
