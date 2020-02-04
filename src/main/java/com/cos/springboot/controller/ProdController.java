package com.cos.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.springboot.model.Product;
import com.cos.springboot.repository.ProdRepository;

@Controller
public class ProdController {

	@Autowired // DI
	private ProdRepository prodRepository;

	@GetMapping({"", "/", "/product"})	
	public String home(Model model) {
		List<Product> products = prodRepository.findAll();
		model.addAttribute("products", products);
		return "prodList";
	}
	
	@GetMapping("/product/total")	
	public @ResponseBody List<Product> productList() {
		List<Product> products=prodRepository.findAll();
		return products;
	}
	
	@GetMapping("/product/{type}")
	public @ResponseBody List<Product> productType(@PathVariable String type) {
		List<Product> products=prodRepository.findType(type);
		return products;
	}
	
	@GetMapping("/product/price/{type}")
	public @ResponseBody List<Product> productPrice(@PathVariable String type) {
		List<Product> products=prodRepository.findPriceType(type);
		return products;
	}
	
	@GetMapping("/product/price")
	public @ResponseBody List<Product> productPriceTotal() {
		List<Product> products=prodRepository.findPriceTotal();
		return products;
	}
	
	@GetMapping("/product/orderCount/{type}")
	public @ResponseBody List<Product> productOrder(@PathVariable String type) {
		List<Product> products=prodRepository.findOrderType(type);
		return products;
	}
	
	@GetMapping("/product/orderCount")
	public @ResponseBody List<Product> productOrder() {
		List<Product> products=prodRepository.findOrderTotal();
		return products;
	}
	
///////////////////////////////////////////////
//	
//	@GetMapping("/product")	
//	public String prodList() {
//		List<Product> products = prodRepository.findAll();
//
//		model.addAttribute("products", products);
//
//		return "prodList";
//	}

}
