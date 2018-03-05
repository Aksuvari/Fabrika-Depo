/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author numan
 */
 class Veri_Tabani_Depo   {
PreparedStatement psmt=null;
Statement statement;
 ResultSet       result;

 DefaultTableModel table;
int Silinecek_id;
  JProgressBar pbar;



  public static void main(String args[]) throws Exception {
         Veri_Cekme cekme=new Veri_Cekme(); 
        
        try {
            ArrayList<String>numan=cekme.Veri_Cekme("SELECT  * FROM urunler1 u" );
            JTable target = new JTable();
            int row = 1;
            System.out.println(numan.get((5)));

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Stoklar.class.getName()).log(Level.SEVERE, null, ex);
        }

        }

   /* final Veri_Tabani_Depo it = new Veri_Tabani_Depo();

    JFrame frame = new JFrame("Progress Bar Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(it);
    frame.pack();
    frame.setVisible(true);

    for (int i = MY_MINIMUM; i <= MY_MAXIMUM; i++) {
      final int percent = i;
      try {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            it.updateBar(percent);
          }
        });
        java.lang.Thread.sleep(50);
      } catch (InterruptedException e) {
        ;
      }
    }
  }
*/
  }
