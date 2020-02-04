package com.cos.springboot.repository;

import java.util.List;

import com.cos.springboot.model.Product;

public interface ProdRepository {
	
	List<Product> findAll();
	
	List<Product> findType(String type);
	
	List<Product> findPriceType(String type);
	List<Product> findPriceTotal();
	
	List<Product> findOrderType(String type);
	List<Product> findOrderTotal();


	
	
	
	
}
