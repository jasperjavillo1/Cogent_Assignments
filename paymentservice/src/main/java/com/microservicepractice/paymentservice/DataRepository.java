package com.microservicepractice.paymentservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Order, Integer> {

}
