/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author numan
 */
public class Table_Veri {
    int EklenenVerimiz=0;
      Veri_Cekme cekme2 = new Veri_Cekme();
  
      
    public DefaultTableModel Table_Veri(String Sorgu,DefaultTableModel tableModel,int Sayac){
       
    try {

            ArrayList<String> numan = cekme2.Veri_Cekme(Sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Stoklar.class.getName()).log(Level.SEVERE, null, ex);
        }

        int a = cekme2.getColumnCount();
        Object[] aa = new Object[a];
        int j = 1;
        try {
            if (Sayac == 0) {
                for (int i = 1; i <= a; i++) {
                    tableModel.addColumn(cekme2.dizi[i - 1]);
                }

                for (int i = 1; i <= cekme2.getRow().size(); i++) {
                    if (i % a == 0) {

                        aa[j - 1] = cekme2.row.get(i - 1);
                        j = 1;
                        tableModel.addRow(aa);
                    } else {
                        aa[j - 1] = cekme2.row.get(i - 1);
                        j++;
                    }

                }
               
                Sayac++;
            return tableModel;
            } else {
                Sayac++;

                for (int i = 1; i <= cekme2.getRow().size(); i++) {
                    if (i % a == 0) {
                      
                        aa[j - 1] = cekme2.row.get(i - 1);
                        j = 1;
                          tableModel.addRow(aa);
                       
                    } else {
                        aa[j - 1] = cekme2.row.get(i - 1);
                        j++;
                    }

                }
             

            }
        } catch (Exception ex) {

        }
         return tableModel;
}
}