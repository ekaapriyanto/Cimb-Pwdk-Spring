package com.merlind.merlindbatik.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merlind.merlindbatik.dao.ProductRepo;
import com.merlind.merlindbatik.entity.Product;
import com.merlind.merlindbatik.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	@Transactional
	public Iterable<Product> getProducts(){
		return productRepo.findAll();
	}
	
	@Override
	@Transactional
	public Optional<Product> getProductById(int id){
		return productRepo.findById(id)
;	}

	@Override
	@Transactional
	public Product addProduct(Product product) {
		product.setId(0);
		return productRepo.save(product);
	}

	@Override
	@Transactional
	public Product updateProduct(Product product) {
		Optional<Product> findProduct = productRepo.findById(product.getId());
		
		if (findProduct.toString() == "Optional.empty")
			throw new RuntimeException("Product with id " + product.getId() + " does not exist");
		
		return productRepo.save(product);
	}
	
	@Override
	@Transactional
	public void deleteProductById(int id) {
		Optional<Product> findProduct = productRepo.findById(id);
		
		if (findProduct.toString() == "Optional.empty")
			throw new RuntimeException("Product with id " + id + " does not exist");

		productRepo.deleteById(id);
	}
}
