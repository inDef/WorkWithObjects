package com.mainacad.model;

public class Item {

  private int vendorCode;
  private String name;
  private double price;

  public int getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(int vendorCode) {
    this.vendorCode = vendorCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Item(int vendorCode, String name, double price) {
    this.vendorCode = vendorCode;
    this.name = name;
    this.price = price;
  }

  public Item() {
  }
}
