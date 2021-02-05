/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FİU
 */
public class Sayfa extends Paylasimci{

    public Sayfa(String isim) {
        super(isim);
    }
    
    
    @Override
    public void paylas(Post post) {
        System.out.println(getIsim()+" sayfasi "+post.getBaslik()+" paylaştı.");
        tumunuBilgilendir(post);

    }    

   
}
