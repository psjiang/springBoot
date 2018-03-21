package com.dj.spring_mybatis.service.impl;

import com.dj.spring_mybatis.domain.Product;
import com.dj.spring_mybatis.mapper.ProductMapper;
import com.dj.spring_mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;


    @Override
    public void delProduct(Integer id) {
        productMapper.delProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public List<Product> selProduct() {
        return productMapper.selProduct();
    }
}
