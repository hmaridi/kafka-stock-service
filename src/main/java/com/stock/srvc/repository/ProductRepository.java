package com.stock.srvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.stock.srvc.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
