/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author long
 */
public class Product {
    private int coffeeid,quantity;
    private String coffeename,coffeebrand, coffeeimg;
    private double price;

    public Product() {
    }

    public Product(int coffeeid, int quantity, String coffeename, String coffeebrand, String coffeeimg, double price) {
        this.coffeeid = coffeeid;
        this.quantity = quantity;
        this.coffeename = coffeename;
        this.coffeebrand = coffeebrand;
        this.coffeeimg = coffeeimg;
        this.price = price;
    }

    public int getCoffeeid() {
        return coffeeid;
    }

    public void setCoffeeid(int coffeeid) {
        this.coffeeid = coffeeid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCoffeename() {
        return coffeename;
    }

    public void setCoffeename(String coffeename) {
        this.coffeename = coffeename;
    }

    public String getCoffeebrand() {
        return coffeebrand;
    }

    public void setCoffeebrand(String coffeebrand) {
        this.coffeebrand = coffeebrand;
    }

    public String getCoffeeimg() {
        return coffeeimg;
    }

    public void setCoffeeimg(String coffeeimg) {
        this.coffeeimg = coffeeimg;
    }

 

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "coffeeid=" + coffeeid + ", quantity=" + quantity + ", coffeename=" + coffeename + ", coffeebrand=" + coffeebrand + ", coffeeimg=" + coffeeimg + ", price=" + price + '}';
    }

    

    
               
}
