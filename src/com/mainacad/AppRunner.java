package com.mainacad;

import com.mainacad.model.Cart;
import com.mainacad.model.Item;
import com.mainacad.model.Order;
import com.mainacad.model.User;
import com.mainacad.service.CartService;

public class AppRunner {

  public static void main(String[] args) {
    Item phone = new Item(240, "Samsung Galaxy S10 SM-G973 DS 128GB Prism Green (SM-G973FZGD)",
        21399.99);
    User petya = new User("Petr", "Petrov", 123245.65);
    Order order = new Order(phone, 3);
    Cart cart = new Cart(petya, order);
    System.out.println(CartService.getTotalSum(cart));

  }
}
