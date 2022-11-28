/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.users;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lrnovo
 */
public class UserDao {

    public static void save(users user) {
        String query = "insert into userTable(name,email,mobile_number,address,password,securityQUESTION,answer,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "', '" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        dbOperations.setDataorDelete(query, "regesterd succcesfully, Wait for amins approval");
    }

    public static users login(String email, String password) {
        users user = null;
        try {
            ResultSet rs = dbOperations.getData("select * from userTable WHERE email ='" + email + "' and Password = '" + password + "'");
            while (rs.next()) {
                user = new users();
                user.setStatus(rs.getString("status"));
            }
            return user;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public static ArrayList<users> getAllRecord() {
        ArrayList<users> arraylist = new ArrayList<>();
        String query = "select *from userTable";
        ResultSet rs = dbOperations.getData(query);
        try {
            while (rs.next()) {
                users userobj = new users();
                userobj.setId(rs.getString("ID"));
                userobj.setName(rs.getString("name"));
                userobj.setEmail(rs.getString("email"));
                userobj.setMobileNumber(rs.getString("mobile_number"));
                userobj.setAddress(rs.getString("address"));
                userobj.setSecurityQuestion(rs.getString("securityQuestion"));
                userobj.setStatus(rs.getString("status"));
                arraylist.add(userobj);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arraylist;
    }

    public static void delete(String id) {
        //int id = product.getId();
        String query = "delete from userTable WHERE ID ='" + id + "'";
        dbOperations.setDataorDelete(query, "User is deleted succesfully");
    }

    public static void changeStatus(String id, String status) {
        //int id = product.getId();
        if (status.equals("true")) {
            String query = "update userTable set status='false' WHERE ID ='" + id + "'";
            dbOperations.setDataorDelete(query, "Status changed succesfully");
        } else {
            String query = "update userTable set status='true' WHERE ID ='" + id + "'";
            dbOperations.setDataorDelete(query, "Status changed succesfully");
        }
    }

    public static users getSecurityQuestion(String email) {
        users user = null;
        try {
            ResultSet rs = dbOperations.getData("select * from userTable WHERE email ='" + email + "'");
            while (rs.next()) {
                user = new users();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
     public static users getPassword(String email) {
        users user = null;
        try {
            ResultSet rs = dbOperations.getData("select * from userTable WHERE email ='" + email + "'");
            while (rs.next()) {
                user = new users();
                user.setPassword(rs.getString("password"));
                //user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
      public static void changePassword(String email,String oldPassword ,String newpassword) {
          try{
              String query = "select *from userTable WHERE email ='"+email+"' AND password = '"+oldPassword+"'";
              ResultSet rs = dbOperations.getData(email);
              if(rs.next())
              {update(email, newpassword);
              }else{JOptionPane.showMessageDialog(null,"OlD password enterd worng");}
          }
          catch(Exception e){JOptionPane.showMessageDialog(null,e);}
    }

    public static void update(String email, String password) {
        String query = "update userTable SET password = '" + password + "' WHERE email ='" + email + "'";
        dbOperations.setDataorDelete(query, "password Updated succesfully");
    }
    public static void changeSecurityQuestion(String email,String password,String securityQuestion ,String answer ){
    try{
    ResultSet rs = dbOperations.getData("select *from userTable where email ='"+email+"' AND password = '"+password+"'");
    if(rs.next())
    {update(email, securityQuestion, answer);
    }
    else{JOptionPane.showMessageDialog(null, "Password is worng");}        
    }
    catch(Exception e){JOptionPane.showMessageDialog(null,e);}
    }
public static void update(String email, String securityQuestion,String answer) {
        String query = "update userTable SET securityQuestion = '" +securityQuestion+ "',answer ='"+answer+"' WHERE email ='" + email + "'";
        dbOperations.setDataorDelete(query, "SequrityQuestion Updated succesfully");
    }
}
