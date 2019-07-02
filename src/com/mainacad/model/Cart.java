package com.mainacad.model;

public class Cart {

  private User user;
  private Order order;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Cart(User user, Order order) {
    this.user = user;
    this.order = order;
  }

  public Cart() {
  }
}
