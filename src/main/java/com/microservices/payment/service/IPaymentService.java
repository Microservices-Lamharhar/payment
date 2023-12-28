package com.microservices.payment.service;



import com.microservices.payment.model.Payment;

import java.util.List;

public interface IPaymentService {
    List<Payment> findAll();
    Payment findById(Long paymentId);
    Payment save(Payment payment);
    Payment update(Payment payment);
    void deleteById(Long paymentId);
}
