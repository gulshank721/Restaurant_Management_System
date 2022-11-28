/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.itextpdf.text.pdf.languages.ArabicLigaturizer;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author Lrnovo
 */
public class BillDao {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = dbOperations.getData("select max(id) from Bills");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    public static void save(Bill bill){
    String queary ="insert into Bills values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobileNumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getGeneratedBy()+"')";
    dbOperations.setDataorDelete(queary,"bill saved succesfully");
    }
    public static ArrayList<Bill> getAllBills(String date){
    ArrayList<Bill> list = new ArrayList<>();
    try{
    ResultSet rs = dbOperations.getData("Select *from Bills Where Bill_Date like '%"+date+"%'");
    while(rs.next())
    {
    Bill bill = new Bill();
    bill.setId(rs.getInt("id"));
    bill.setName(rs.getString("name"));
    bill.setMobileNumber(rs.getString("mobileNumber"));
    bill.setEmail(rs.getString("email"));
    bill.setTotal(rs.getString("total"));
    bill.setDate(rs.getString("Bill_Date"));
        bill.setGeneratedBy(rs.getString("createdBy"));
        list.add(bill);
    }
    }
    
    catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    return  list;
    }
    public static ArrayList<Bill> getAllBillsDesc(String date){
    ArrayList<Bill> list = new ArrayList<>();
    try{
    ResultSet rs = dbOperations.getData("Select *from Bills Where Bill_Date like '%"+date+"%' ORDER BY ID ASC");
    while(rs.next())
    {
    Bill bill = new Bill();
    bill.setId(rs.getInt("id"));
    bill.setName(rs.getString("name"));
    bill.setMobileNumber(rs.getString("mobileNumber"));
    bill.setEmail(rs.getString("email"));
    bill.setTotal(rs.getString("total"));
    bill.setDate(rs.getString("Bill_Date"));
        bill.setGeneratedBy(rs.getString("createdBy"));
        list.add(bill);
    }
    }
    
    catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    return  list;
    }
}
