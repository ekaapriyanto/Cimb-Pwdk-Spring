package com.merlind.merlindbatik.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.merlind.merlindbatik.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	public Product findByProductName(String productName);
	
	@Query(value = "SELECT * From Product WHERE price < ?1 and product_name = ?2", nativeQuery = true)
	public Product findProductByMinPrice(double minPrice, String productName);
	
//	@Query(value = "SELECT * FROM product WHERE price > :maxPrice and product_name like %:productName", nativeQuery)
//	public Iterable<Product> findProductByMaxPrice(@Param("maxPrice"))
}
