/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veri_tabani_depo;

import java.awt.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author numan
 */
public class Veri_Cekme {
     int columnCount;
       ResultSetMetaData md;
       ArrayList <String> row ;
   Connection baglanti;
         Connection conn;
         PreparedStatement psmt=null;
         ResultSet rs=null;
            Object[] veri;
            Object[] c;
             String dizi[];
int a;
 
    public ArrayList<String> Veri_Cekme(String Sorgu) throws SQLException{
     String driver = "com.mysql.jdbc.Driver";
    try {
              Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/otomasyon","root", "1234");
          System.out.println("oldu");
         } catch (Exception ex) {
            System.out.println("olmadi");
            System.err.println(ex);}
       psmt=conn.prepareStatement(Sorgu);
     rs= psmt.executeQuery();
         md = rs.getMetaData();
         setColumnCount(md.getColumnCount());
        row = new ArrayList<>(getColumnCount()); 
          veri=new Object[getColumnCount()];
          c=new Object[getColumnCount()];
         dizi=new String [getColumnCount()];
          a=getColumnCount();
          
          for(int i=1;i<=a;i++){
        
               
         dizi[i-1]=rs.getMetaData().getColumnName(i);
        
          }
          
          
          
     while (rs.next()) {            
       for (int i=1; i<= a; i++) {  
            row.add(rs.getString(i)); 
           veri[i-1]=rs.getObject(i);
     
        }
     
            
       
    }     
                       
        rs.close();
        psmt.close();
     
   
  return getRow ();
      
}
public void addString(String addString)
  {   
    this.row.add(addString);
  }


  public ArrayList<String> GetArrayList()
  {
    return row;
  }

    public ArrayList<String> getRow() {
        return row;
    }

    public void setRow(ArrayList<String> row) {
        this.row = row;
    }
    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount)  throws SQLException  {
     
          this.  columnCount = md.getColumnCount();
    }
   
 
}
