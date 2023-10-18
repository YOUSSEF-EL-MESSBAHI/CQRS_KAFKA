package com.mesbahi.product_command.controller;

import com.mesbahi.product_command.dto.ProductEvent;
import com.mesbahi.product_command.entity.Product;
import com.mesbahi.product_command.service.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductCommandService commandService;

    @PostMapping
    public Product createProduct(@RequestBody ProductEvent productEvent) {
        return commandService.createProduct(productEvent);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody ProductEvent productEvent) {
        return commandService.updateProduct(id, productEvent);
    }
}
