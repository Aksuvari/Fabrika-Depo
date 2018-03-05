/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.beans.Statement;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author numan
 */
public class Veri_Ekleme {
     String driver = "com.mysql.jdbc.Driver";
         static Connection baglanti;
         Connection conn;
         
         
                    
         private Statement st;
            public void baglantiAc() throws Exception{
      try {
            
             Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon","root", "1234");
            
          System.out.println("oldu");
            
        } catch (Exception ex) {
            System.out.println("olmadi");
            System.err.println(ex);
          
        }
    }
    public void baglantiKapat(){
    try {
            conn.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    public String kaydet(ArrayList<String> Dizi,String Sorgu)
    { try {
            baglantiAc();
        } catch (Exception e) {
            System.err.println(e);
        }

        
        
        try {
            if (Dizi.isEmpty() ) {
                    PreparedStatement  pst = conn.prepareStatement(Sorgu);
                        pst.executeUpdate();
                        pst.close();;
            } 
      
           
            else{
            PreparedStatement  pst = conn.prepareStatement(Sorgu);
            for (int i = 1; i <= Dizi.size(); i++) {
              //  System.out.println(Dizi.get(i-1);
                pst.setString(i, Dizi.get(i-1));
                
            }
            
            pst.executeUpdate();
            pst.close();
            }
          
        
       
            
            baglantiKapat();
            System.out.println("YES");
        } catch (SQLException e) {
            System.out.println("No");
            System.err.println(e);
        
        } 
         return null;
    }
}
  
  