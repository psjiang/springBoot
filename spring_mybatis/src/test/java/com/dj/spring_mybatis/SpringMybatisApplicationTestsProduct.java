package com.dj.spring_mybatis;

import com.dj.spring_mybatis.domain.Product;
import com.dj.spring_mybatis.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTestsProduct {

	@Autowired
	private ProductService productService;



	@Test
	public void readProduct(){
		List<Product> list = productService.selProduct();
		for (Product product: list) {
			System.out.println(product.getName());
		}
	}


	@Test
	public void addProduct(){
		Product product = new Product();
		product.setName("wadawda");
		productService.addProduct(product);
	}


	@Test
	public void updateProduct(){
		Product product = new Product();
		product.setId(1);
		product.setName("www");
		productService.updateProduct(product);
	}

	@Test
	public void delProduct(){
		productService.delProduct(1);
	}

}
