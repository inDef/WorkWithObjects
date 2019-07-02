package com.mainacad.model;

public class User {

  private String firstName;
  private String lastName;
  private double cashAmount;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public double getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(double cashAmount) {
    this.cashAmount = cashAmount;
  }

  public User(String firstName, String lastName, double cashAmount) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.cashAmount = cashAmount;
  }

  public User() {
  }
}
