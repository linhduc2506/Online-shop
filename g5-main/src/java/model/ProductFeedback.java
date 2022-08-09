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
public class ProductFeedback {

    int id;
    int userID;
    int productID;
    int rateStar;
    String cmt;
    boolean status;
    String avatar;
    String username;

    public ProductFeedback() {
    }

    public ProductFeedback(int id, int userID, int productID, int rateStar, String cmt, boolean status, String avatar, String username) {
        this.id = id;
        this.userID = userID;
        this.productID = productID;
        this.rateStar = rateStar;
        this.cmt = cmt;
        this.status = status;
        this.avatar = avatar;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getRateStar() {
        return rateStar;
    }

    public void setRateStar(int rateStar) {
        this.rateStar = rateStar;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ProductFeedback{" + "id=" + id + ", userID=" + userID + ", productID=" + productID + ", rateStar=" + rateStar + ", cmt=" + cmt + ", status=" + status + ", avatar=" + avatar + ", username=" + username + '}';
    }

    
    
}
