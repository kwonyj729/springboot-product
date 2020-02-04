package com.cos.springboot.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class Product {
	private int id;
	private String prodname;
	private int price;
	private int orderCount;
	private String type;
	
	@Builder
	public Product(int id, String prodname, int price, int orderCount, String type) {
	
		this.id = id;
		this.prodname = prodname;
		this.price = price;
		this.orderCount = orderCount;
		this.type = type;
	}
}
