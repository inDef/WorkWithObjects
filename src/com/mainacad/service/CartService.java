package com.mainacad.service;

import com.mainacad.model.Cart;

public class CartService {
    public static double getTotalSum (Cart cart){

      return cart.getOrder().getItem().getPrice() * cart.getOrder().getQuantity();
    }
}
