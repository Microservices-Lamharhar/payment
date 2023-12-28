

package com.microservices.payment.repository;
import com.microservices.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookingRepository
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
