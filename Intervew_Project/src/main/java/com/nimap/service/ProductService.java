package com.nimap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.modal.Product;
import com.nimap.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	public List<Product> getAllProduct() {
		return (List<Product>) productRepo.findAll();
	}
	
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	
	public Optional<Product> getProductByID(int id) {
		return productRepo.findById(id);
	}

	public void deleteProductByID(int id) {
		 productRepo.deleteById(id);
	}
	
}
