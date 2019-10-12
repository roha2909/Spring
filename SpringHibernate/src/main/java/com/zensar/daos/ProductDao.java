package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author Rohini Ahirrao
 * @creation_date 4th oct 2019 10:07AM
 * @modification_date 10th oct 2019 4:02PM
 * @version 2.0
 * @copyright zensar Technologies.All rights reserved
 * @description It is dao interface.where we declare mehods(method declaration).
 */

public interface ProductDao {
	

	List<Product> getAll();

	Product getById(int productId);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);
}
