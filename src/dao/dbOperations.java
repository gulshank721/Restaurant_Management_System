/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lrnovo
 */
public class dbOperations {
    public static void setDataorDelete(String query,String msg){
    try{
        Connection con = databaseConnection.getconn();
        Statement st = con.createStatement();
        st.executeUpdate(query);
        if(!msg.equals(""))
        JOptionPane.showMessageDialog(null,msg);
        
    }
    catch(Exception e){JOptionPane.showMessageDialog(null,e,"massege",JOptionPane.ERROR_MESSAGE);}
    }
    public static ResultSet getData(String query)
    { try
         {Connection con = databaseConnection.getconn();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
          }
        catch(Exception e){JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
             return null;}
        
    }
}
