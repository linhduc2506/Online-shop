/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author LAPTOP D&N
 */
public class Customer {
    
    private int id;
    private String email;
    private String fullname;
    private String address;
    private String phone;
    private String Gender;
    private Date createdAt;
    private int creatorId;
    private boolean act;

    public Customer() {
    }    

    public Customer(int id, String email, String fullname, String address, String phone, String Gender, Date createdAt, int creatorId, boolean act) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.Gender = Gender;
        this.createdAt = createdAt;
        this.creatorId = creatorId;
        this.act = act;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public boolean isAct() {
        return act;
    }

    public void setAct(boolean act) {
        this.act = act;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", email=" + email + ", fullname=" + fullname + ", address=" + address + ", phone=" + phone + ", Gender=" + Gender + ", createdAt=" + createdAt + ", creatorId=" + creatorId + ", act=" + act + '}';
    }
    
    
    
}

//id int AUTO_INCREMENT not null primary key,
//	email varchar(100),
//	fullname varchar(100),
//	address varchar(100),
//	phone varchar(100),
//	gender varchar(100),
//    createdAt Date,
//    creatorId int not null, FOREIGN KEY(creatorId) REFERENCES Users(id)
