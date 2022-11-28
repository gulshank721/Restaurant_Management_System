/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author Lrnovo
 */
public class databaseConnection {
    public static Connection getconn(){
   // public static void main(String[] args){
        String url = "jdbc:oracle:thin:@//Localhost:1521/XEPDB1";
         String user= "RMS";
         String password ="RMS123";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =DriverManager.getConnection(url, user, password);
            System.out.println("connected to RMS database");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
        return null;
        //System.out.println("databae not connected");}
        }
    }
    }
