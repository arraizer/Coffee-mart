/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author long
 */
public class ProductDAO extends MyDAO {

    public List<Product> getAllProducts() {
        List<Product> p = new ArrayList<>();
        xSql = "Select * from productcoffee";
        int coffeeid, quantity;
        String coffeename, coffeebrand, coffeeimg;
        double price;
        Product pc;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                coffeeid = rs.getInt("coffeeid");
                quantity = rs.getInt("quantity");
                coffeename = rs.getString("coffeename");
                coffeebrand = rs.getString("coffeebrand");
                coffeeimg = rs.getString("coffeeimg");
                price = rs.getDouble("price");
                pc = new Product(coffeeid, quantity, coffeename, coffeebrand, coffeeimg, price);
                p.add(pc);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (p);
    }

    public List<ProductCategory> getAllCategory() {
        List<ProductCategory> p = new ArrayList<>();
        xSql = "Select * from product_cag ";
        int id;
        String cagname;
        ProductCategory pc = new ProductCategory();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                cagname = rs.getString("cagname");
                pc = new ProductCategory(id, cagname);
                p.add(pc);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (p);
    }

    public List<Product> getAllProductsbyCID(String id) {
        List<Product> p = new ArrayList<>();
        xSql = "select * from productcoffee\n"
                            + "where cag_id =?";
        int coffeeid, quantity;
        String coffeename, coffeebrand, coffeeimg;
        double price;
        Product pc;
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                coffeeid = rs.getInt("coffeeid");
                quantity = rs.getInt("quantity");
                coffeename = rs.getString("coffeename");
                coffeebrand = rs.getString("coffeebrand");
                coffeeimg = rs.getString("coffeeimg");
                price = rs.getDouble("price");
                pc = new Product(coffeeid, quantity, coffeename, coffeebrand, coffeeimg, price);
                p.add(pc);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (p);
    }

    public static void main(String[] args) {
        ProductDAO pd = new ProductDAO();
       // ArrayList<Product> p = (ArrayList<Product>) pd.getAllProducts();
        // ArrayList<ProductCategory> pc = (ArrayList<ProductCategory>) pd.getAllCategory();
      ArrayList<Product> pcid =(ArrayList<Product>) pd.getAllProductsbyCID("1");
        for (Product product : pcid) {
            System.out.println(product);
        }
    }
}
