package com.zensar.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Rohini Ahirrao
 * @creation_date 4th oct 2019 10:25AM
 * @modification_date 11th oct 2019 10:11AM
 * @version 4.0
 * @copyright zensar Technologies.All rights reserved
 * @description It is daoIMPL class .
 */
@Repository

public class ProductDaoImpl implements ProductDao {
	@Autowired // automatically injected in class
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return (List<Product>) hibernateTemplate.find("from Product");
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}

}
