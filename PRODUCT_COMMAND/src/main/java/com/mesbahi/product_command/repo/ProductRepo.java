package com.mesbahi.product_command.repo;

import com.mesbahi.product_command.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
