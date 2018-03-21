package com.dj.spring_mybatis.mapper;

import com.dj.spring_mybatis.domain.Product;

import java.util.List;
public interface ProductMapper {


    List<Product> selProduct();

    void delProduct(Integer id);

    void updateProduct(Product product);

    void addProduct(Product product);
}
