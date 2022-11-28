/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Lrnovo
 */
public class tables {
    public static void main(String[] args)
    {
        try{
        String userTable ="create table userTable(id number GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1) PRIMARY KEY,name varchar2(100),email varchar2(50) UNIQUE,mobile_number number(10),address varchar2(100),password varchar2(50),securityQuestion varchar2(200),answer varchar2(100),status varchar2(100) )";
        dbOperations.setDataorDelete(userTable,"table created succesfully");
        String adminDetails = " insert into userTable(name,email,mobile_number,address,password,securityQuestion,answer,status) values ('Admin','admin@gmail.com','1234567890','india','admin123','what is your nick name?','grover','true')";
        dbOperations.setDataorDelete(adminDetails,"Admin details added succesfully");
        String categoryTable = "create table category(ID number GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1) PRIMARY KEY, name varchar(200))";
        dbOperations.setDataorDelete(categoryTable,"Category added succesfully");
        String productTable ="create table product (id number GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1) PRIMARY KEY,name varchar2(200),category varchar2(200),price varchar2(20))";
        dbOperations.setDataorDelete(productTable,"product table created Succesfully");
         String BillTable ="create table Bills (id number PRIMARY KEY,name varchar2(100),mobileNumber varchar2(100),email varchar2(100),Bill_Date varchar2(100),total varchar2(100),createdBy varchar2(100))";
        dbOperations.setDataorDelete(BillTable,"Bill table created Succesfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
