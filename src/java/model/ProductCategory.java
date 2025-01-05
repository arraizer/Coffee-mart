/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author long
 */
public class ProductCategory {
    private int id;
    private String cagname;

    public ProductCategory() {
    }

    public ProductCategory(int id, String cagname) {
        this.id = id;
        this.cagname = cagname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCagname() {
        return cagname;
    }

    public void setCagname(String cagname) {
        this.cagname = cagname;
    }

    @Override
    public String toString() {
        return "ProductCategory{" + "id=" + id + ", cagname=" + cagname + '}';
    }

   
}
