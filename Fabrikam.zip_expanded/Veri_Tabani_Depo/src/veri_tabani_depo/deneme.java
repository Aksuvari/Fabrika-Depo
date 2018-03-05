/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

/**
 *
 * @author numan
 */
public class deneme {
    public static void main(String[] args) {
        java.util.ArrayList<String>bos  = new java.util.ArrayList<>();
  
Veri_Ekleme veri_Ekleme=new Veri_Ekleme();
        veri_Ekleme.kaydet(bos, "INSERT INTO satıs_taksit ( Taksit_Tutari, Kasa_id, Toplam_Taksit, Kacinci_Taksit, Pesinat) VALUES ( 10,15,10, 10, 10);");

    }
}
