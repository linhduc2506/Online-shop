/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Cart;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CartDAO {
    private List<Cart> cart;
    public CartDAO() {
        cart=new ArrayList<>();
    }
    public void setCarts(List<Cart> cart) {
        this.cart = cart;
    }
    public List<Cart> getCarts() {
        return cart;
    }
    public int getQuantityById(int id){
        return getCartById(id).getQuantity();
    }
    private Cart getCartById(int id){
        for(Cart i:cart){
            if(i.getProduct().getId()==id)
                return i;
        }
        return null;
    }
    public void addCart(Cart t){
        if(getCartById(t.getProduct().getId())!=null){
            Cart m=getCartById(t.getProduct().getId());
            m.setQuantity(m.getQuantity()+t.getQuantity());
        }else
            cart.add(t);
    }
    public void removeCart(int id){
        if(getCartById(id)!=null){
            cart.remove(getCartById(id));
        }
    }

}
