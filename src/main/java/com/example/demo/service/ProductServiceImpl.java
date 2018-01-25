package com.example.demo.service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;



    @Override
    public ProductDTO getProduct(long product_id) {


        Product product = productDAO.getProduct(product_id);

        ProductDTO productDTO=new ProductDTO();

        productDTO.setProduct_name(product.getProduct_name());
        productDTO.setProduct_price(product.getProduct_price());
        return productDTO;


    }
}


