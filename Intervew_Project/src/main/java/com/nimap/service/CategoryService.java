package com.nimap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.modal.Category;
import com.nimap.repository.CategoryRepository;
import com.nimap.repository.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;
	
	public List<Category> getAllCategory() {
		return (List<Category>) categoryRepo.findAll();
	}
	
	public Category addCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	public Optional<Category> getCategoryByID(int cid) {
		return categoryRepo.findById(cid);
	}
	
	public void deleteProductByID(int cid) {
		categoryRepo.deleteById(cid);
	}
}
