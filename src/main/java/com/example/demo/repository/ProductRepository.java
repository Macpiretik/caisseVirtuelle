package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "SELECT * FROM t_product p WHERE p.product_name = :productName", nativeQuery = true)
    String findByName(@Param("productName") String productName);
}
