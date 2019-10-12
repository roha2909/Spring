package com.zensar.services;
/**
 * @author Rohini Ahirrao
 * @creation_date 4th oct 2019 11:40AM
 * @modification_date 4th oct 2019 11:40AM
 * @version 1.0
 * @copyright zensar Technologies.All rights reserved
 * @description It is sevice class of product use in buisness layer.
 */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {

	List<Product> findAllProducts();
	Product findProductById(int productId);
	void addproduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	
	List<Product> findProductsByPriceRange(float min,float max);
	List<Product> findProductByName(String Name);
	List<Product> findProductByBrand(String brand);
	Long getProductCount();
 	
}
