package com.example.demo.controller;



import com.example.demo.dto.ProductDTO;

import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value="/{product_id}",produces={MediaType.APPLICATION_JSON_VALUE})
    public ProductDTO getProduct(@PathVariable("product_id") long product_id){

        return productService.getProduct(product_id);
    }
}


