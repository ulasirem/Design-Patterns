/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class MediaPlayer implements Runnable{
    private Kanal kanal;
    private boolean kontrol;
    
    //singelton ikinci yöntem
    private static MediaPlayer mediaPlayer;
    public static MediaPlayer getMediaPlayer(){
        if(mediaPlayer == null){
            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer;
    }
    private MediaPlayer(){}
    
    public void kanalSec(Kanal kanal){
        this.kanal = kanal;
    }
    
    public void oynat(){
        kontrol = true;
        new Thread(this).start();   //runnable sınıfının run methodunu çalıştırır.
    }
    
    public void durdur(){
        kontrol = false;
    }

    //Runnable, bir thread üzerinde programıın akışından bağımsız çalışabilmeyi sağlar. Müziğin sürekli çalabilmesi için
    @Override
    public void run() {
        while(kontrol){
            Main.sleep(2000);
            System.out.println(kanal.getIsim()+" kanalı "+kanal.getLink()+" linki");    
        }
    }
}
