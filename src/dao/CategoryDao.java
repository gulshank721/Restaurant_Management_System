/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author Lrnovo
 */
public class CategoryDao {
    public static void save(Category category){
        String query = "insert into category (name) values('"+category.getName()+"')";
    dbOperations.setDataorDelete(query,"Category added Succesfully");
    }
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arraylist = new ArrayList<>();
        try{
            String query ="select *from category";
            ResultSet rs = dbOperations.getData(query);
            while (rs.next())
            {Category category = new Category();
            category.setID(rs.getInt("ID"));
            category.setName(rs.getString("name"));
            arraylist.add(category);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
    return arraylist;}
    public static void delete(String ID) {
        String query = "delete from category WHERE ID ='"+ID+"'";
        dbOperations.setDataorDelete(query,"Category Deleted succesfully");
        
    }
}
