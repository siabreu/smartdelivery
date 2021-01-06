package com.siabreu.smartdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siabreu.smartdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
