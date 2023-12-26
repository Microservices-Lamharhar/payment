package com.microservices.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
  private final List<Payment> payments = new ArrayList<>();

  @PostMapping
  public ResponseEntity<String> processPayment(@RequestBody Payment payment) {
    // Validate payment, process transaction, etc.
    // interaction with notification service
    payments.add(payment);
    return ResponseEntity.ok("Payment processed successfully!");
  }

  @GetMapping("/{id}")
  public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
    Optional<Payment> payment = payments.stream().filter(p -> p.getId_payment().equals(id)).findFirst();
    return payment.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> updatePayment(@PathVariable Long id, @RequestBody Payment updatedPayment) {
    for (Payment payment : payments) {
      if (payment.getId_payment().equals(id)) {
        // here could be an interaction with booking service
        // also here
        payment.setBookingId(updatedPayment.getBookingId());
        payment.setAmount(updatedPayment.getAmount());
        payment.setPaymentTime(updatedPayment.getPaymentTime());
        return ResponseEntity.ok("Payment updated successfully!");
      }
    }
    return ResponseEntity.notFound().build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deletePayment(@PathVariable Long id) {
    payments.removeIf(payment -> payment.getId_payment().equals(id));
    return ResponseEntity.ok("Payment deleted successfully!");
  }
}
