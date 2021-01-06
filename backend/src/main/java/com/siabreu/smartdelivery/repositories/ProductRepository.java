package com.siabreu.smartdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siabreu.smartdelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findAllByOrderByNameAsc();
}
