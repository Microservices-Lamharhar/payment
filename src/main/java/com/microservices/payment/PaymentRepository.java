

package com.microservices.payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookingRepository
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
