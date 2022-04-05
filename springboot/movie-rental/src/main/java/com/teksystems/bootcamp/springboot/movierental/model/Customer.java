package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

  @Column(name = "first_name", nullable = false)
    private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  public Customer() {
  }

  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

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
}

