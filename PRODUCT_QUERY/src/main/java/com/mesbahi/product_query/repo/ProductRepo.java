package com.mesbahi.product_query.repo;

import com.mesbahi.product_query.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
