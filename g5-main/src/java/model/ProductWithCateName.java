/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dangd
 */
public class ProductWithCateName {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String productCateName;
    private String thumbnail;

    public ProductWithCateName() {
    }

    public ProductWithCateName(int id, String name, int quantity, double price, String productCateName, String thumbnail) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.productCateName = productCateName;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCateName() {
        return productCateName;
    }

    public void setProductCateName(String productCateName) {
        this.productCateName = productCateName;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "ProductWithCateName{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", productCateName=" + productCateName + ", thumbnail=" + thumbnail + '}';
    }
    
    

    
    
    
}
