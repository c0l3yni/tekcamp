package com.teksystems.bootcamp.springboot.movierental.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_id", columnDefinition="SMALLINT(3) UNSIGNED", nullable = false)
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

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
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

