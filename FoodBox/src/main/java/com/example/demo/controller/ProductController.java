package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pService;
	 
	@Autowired
	private  ProductRepo  pRepo;
		
	
	
	@GetMapping("/products")
	@CrossOrigin(origins ="http://localhost:4200")
	public List<Products> listproducts(){
		return pService.listAll();
	}

	@GetMapping("/products/{id}")
	@CrossOrigin(origins ="http://localhost:4200")
	public Optional<Products> getById(@PathVariable int id) {
		return pService.getproductByid(id);
	}
	
	
	
	}
