package com.microservices.payment.controller;




import com.microservices.payment.model.Payment;
import com.microservices.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
  @Autowired
  private IPaymentService paymentService;

  @GetMapping("")
  public ResponseEntity<?> getAllPayments() {
    return new ResponseEntity<>(paymentService.findAll(), HttpStatus.OK);
  }

  @PostMapping("/save")
  public ResponseEntity<?> addPayment(@RequestBody Payment payment) {
    // Assigning ID (for demo purposes)
    var savedPayment = paymentService.save(payment);

    return new ResponseEntity<>(savedPayment, HttpStatus.OK);
  }

  @GetMapping("/get/{id}")
  public ResponseEntity<?> getPaymentById(@PathVariable Long id) {
    return new ResponseEntity<>(paymentService.findById(id), HttpStatus.OK);
  }

  @PutMapping("/update")
  public ResponseEntity<?> updatePayment(@RequestBody Payment updatedPayment) {
    return new ResponseEntity<>(paymentService.update(updatedPayment), HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deletePayment(@PathVariable Long id) {
    // update car availability
    // interaction with car service
    paymentService.deleteById(id);
    return ResponseEntity.ok("User deleted successfully!");
  }
}
