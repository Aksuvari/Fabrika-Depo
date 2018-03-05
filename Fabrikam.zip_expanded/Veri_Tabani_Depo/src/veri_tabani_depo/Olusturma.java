/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;
import java.io.File;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;
/**
 *
 * @author numan
 */
public class Olusturma {
  public  void asd(String a) throws BarcodeException, OutputException{
          Barcode barcode = BarcodeFactory.createCode128(a);
    barcode.setBarHeight(60);
    barcode.setBarWidth(2);

    File imgFile = new File("Barcode\\numan.png");

    //Write the bar code to PNG file
    BarcodeImageHandler.savePNG(barcode, imgFile);
    ciktialim ciktialim =new ciktialim();
  }
    public static void main(String[] args) throws BarcodeException, OutputException {
  
    }
}
