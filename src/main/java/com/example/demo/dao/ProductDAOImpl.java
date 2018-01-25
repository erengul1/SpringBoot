package com.example.demo.dao;


import com.example.demo.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{

    @PersistenceContext
   public EntityManager entityManager;


    @Override
    public Product getProduct(long product_id) {
        String sql = "select pro from Product pro where pro.product_id = "+product_id;
        try{

            Product product= new Product();
            product=(Product) entityManager.createQuery(sql).getSingleResult();
            return product;
        }
        catch(Exception e){
        }

        return null;


    }
}
