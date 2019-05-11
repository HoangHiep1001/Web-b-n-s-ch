/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Cart {
    HashMap<Long, Item> cartItems;

    public Cart() {
        cartItems = new HashMap<>();
    }

    public HashMap<Long, Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(HashMap<Long, Item> cartItems) {
        this.cartItems = cartItems;
    }
    public void insertBook(Long key,Item item){
        boolean check = cartItems.containsKey(key);
        if(check){
            long old = item.getNumber();
            item.setNumber((int) (old + 1));
            cartItems.put(key, item);
        }
        else{
            cartItems.put(key, item);
        }
        
    }
    public void subtocart(Long key,Item item){
        boolean check = cartItems.containsKey(key);
        if(check){
            int old = item.getNumber();
            if(old<=1){
                cartItems.remove(key);
            }
            else{
                item.setNumber(old-1);
                cartItems.put(key, item);
            }
        }
    }
    public void removeBook(Long key){
        boolean check = cartItems.containsKey(key);
        if(check)
            cartItems.remove(key);
    }
    public int countItem(){
        return cartItems.size();
    }
    public double priceBook(){
        double price = 0;
        //Set<Map.Entry<Long,Item>> entrySet = cartItems.entrySet();
        for(Map.Entry<Long,Item>list:cartItems.entrySet()){
            price +=list.getValue().getBook().getBookPrice()*list.getValue().getNumber();
        }
        return price;
    }
}
