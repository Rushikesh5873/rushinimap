package com.nimap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nimap.modal.Category;
import com.nimap.modal.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
