package com.microservices.payment.service.impl;

import com.microservices.payment.model.Payment;
import com.microservices.payment.repository.PaymentRepository;
import com.microservices.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements IPaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment findById(Long carId) {
        return paymentRepository.findById(carId).orElseThrow();
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void deleteById(Long paymentId) {
        paymentRepository.deleteById(paymentId);
    }
}
