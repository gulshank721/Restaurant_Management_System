/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;
import model.Category;

/**
 *
 * @author Lrnovo
 */
public class ProductDao {

    public static void save(Product product) {
        String name = product.getName();
        String category = product.getCategory();
        String price = product.getPrice();
        String query = "insert into product(name,category,price) values('" + name + "','" + category + "','" + price + "')";
        dbOperations.setDataorDelete(query, "produt added Succesfully");
    }

    public static ArrayList<Product> getAllRecord() {
        ArrayList<Product> arraylist = new ArrayList<>();
        try {
            String query = "select *from product";
            ResultSet rs = dbOperations.getData(query);
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("ID"));
                product.setCategory(rs.getString("category"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getString("price"));
                arraylist.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

    public static ArrayList<Product> getAllProductByCategory(String category) {

        ArrayList<Product> arraylist = new ArrayList<>();
        try {
            String query = "select *from product WHERE category ='" + category + "'";
            ResultSet rs = dbOperations.getData(query);
            while (rs.next()) {
                Product product = new Product();
                // product.setId(rs.getInt("ID"));
                // product.setCategory(rs.getString("category"));
                product.setName(rs.getString("name"));
                // product.setPrice(rs.getString("price"));
                arraylist.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

    public static ArrayList<Product> filterProductByName(String name, String category) {

        ArrayList<Product> arraylist = new ArrayList<>();
        try {
            String query = "select *from product WHERE name like '%" + name + "%' AND category ='" + category + "'";
            ResultSet rs = dbOperations.getData(query);
            while (rs.next()) {
                Product product = new Product();
                // product.setId(rs.getInt("ID"));
                // product.setCategory(rs.getString("category"));
                product.setName(rs.getString("name"));
                // product.setPrice(rs.getString("price"));
                arraylist.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

    public static Product getProductByName(String name) {
        Product product = new Product();
        try {
            ResultSet rs = dbOperations.getData("select *from product WHERE name ='" + name + "'");
            while (rs.next()) {
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }

    public static void update(Product product) {
        int id = product.getId();
        String name = product.getName();
        String category = product.getCategory();
        String price = product.getPrice();
        String query = "update product SET name ='" + name + "',category ='" + category + "',price ='" + price + "' WHERE ID ='" + id + "'";
        dbOperations.setDataorDelete(query, "produt Updated Succesfully");
    }

    public static void delete(String id) {
        //int id = product.getId();
        String query = "delete from product WHERE ID ='" + id + "'";
        dbOperations.setDataorDelete(query, "Product deleted succesfully");
    }
}
