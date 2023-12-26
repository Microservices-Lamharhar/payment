package com.microservices.payment;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_payment;
  private Long bookingId;
  private double amount;
  private LocalDateTime paymentTime;

  public Long getId_payment() {
    return id_payment;
  }

  public void setId_payment(Long id_payment) {
    this.id_payment = id_payment;
  }

  public Long getBookingId() {
    return bookingId;
  }

  public void setBookingId(Long bookingId) {
    this.bookingId = bookingId;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public LocalDateTime getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(LocalDateTime paymentTime) {
    this.paymentTime = paymentTime;
  }

}
