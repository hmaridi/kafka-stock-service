package com.stock.srvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;
import com.stock.srvc.entity.Product;
import com.stock.srvc.repository.ProductRepository;

import net.datafaker.Faker;

@Service
public class StockService {
	
	private final ProductRepository productRepository;

	public StockService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public List<Product> generateAndSave(int count) {
	    Random r = new Random();
	    Faker faker = new Faker();
	    List<Product> productList = new ArrayList<>();
	    for (int i = 0; i < count; i++) {
	        int x = r.nextInt(100, 1000);
	        Product p = new Product(null, faker.commerce().productName(),faker.commerce().department(),"$" + faker.commerce().price() , x, 0);
	        productList.add(p);
	    }
	    return productRepository.saveAll(productList);
	}

}
	
	