package com.nimap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.modal.Product;
import com.nimap.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(@RequestParam(name="page" , defaultValue = "2") String page) {
		return productService.getAllProduct();
	}
	
	@PostMapping("/product")
	public String addProducts(@RequestBody Product product) {
		productService.addProduct(product);
		return "product added successfully";
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productService.getProductByID(id);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteProductByID(@PathVariable int id) {
		productService.deleteProductByID(id);
		 return "Product Deleted Successfully";
	}

}
