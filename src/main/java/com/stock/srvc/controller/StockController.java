package com.stock.srvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stock.srvc.entity.Product;
import com.stock.srvc.service.StockService;

@RestController
@RequestMapping("/product")
public class StockController {

	private final StockService stockService;
	
	public StockController(StockService stockService) {
		super();
		this.stockService = stockService;
	}

	@GetMapping("/generate/{count}")
    public List<Product> generateData(@PathVariable("count") int count) {
        return stockService.generateAndSave(count);
    }
}
