package com.microservices.payment.model;

import java.time.LocalDateTime;
import java.util.Date;

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
  private Date paymentTime;

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

  public Date getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(Date paymentTime) {
    this.paymentTime = paymentTime;
  }

}
