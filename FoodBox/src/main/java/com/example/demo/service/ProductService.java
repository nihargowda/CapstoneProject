package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductRepo;
@Service
public class ProductService {
	
	@Autowired
	private ProductRepo pRepo;
	
	
	public List<Products> listAll(){
		return pRepo.findAll();
		
		
	}
	
	
	 
	public Optional<Products> getproductByid(int id) {
		return pRepo.findById(id);
	}

	
	}

