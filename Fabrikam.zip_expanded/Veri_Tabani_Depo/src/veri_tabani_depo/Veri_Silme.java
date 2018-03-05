/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author numan
 */
public class Veri_Silme {
    Connection conn;
     Statement stmt = null;
            public void baglantiAc() throws Exception{
    
    }
  
    public void islemler(String Sorgu,ArrayList<String> Dizi) throws SQLException, Exception{
       
          try {
            
             Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon","root", "1234");
            
          System.out.println("oldu");
            
        } catch (Exception ex) {
            System.out.println("olmadi");
            System.err.println(ex);
          
        }
           if (Dizi.isEmpty()) {
                    PreparedStatement  pst = conn.prepareStatement(Sorgu);
                        pst.executeUpdate();
                        pst.close();;
            } 
      
           
            else{
            PreparedStatement  pst = conn.prepareStatement(Sorgu);
            for (int i = 0; i <Dizi.size(); i++) {
              //  System.out.println(Dizi.get(i-1);
                pst.setString(1, Dizi.get(i));
                 pst.executeUpdate();
            }
            
           
            pst.close();
            }
          
     
        System.out.println("asdasd");
   conn.close();

    }
    
    
}
