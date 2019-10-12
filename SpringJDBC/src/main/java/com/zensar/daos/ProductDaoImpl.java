package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Rohini Ahirrao
 * @creation_date 4th oct 2019 10:25AM
 * @modification_date 10th oct 2019 4:02PM
 * @version 3.0
 * @copyright zensar Technologies.All rights reserved
 * @description It is dao class .
 */
@Repository

public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;// part of spring dao model //due to autowired obj is created and injected in
										// productImpl

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sql = "select * from product";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() { // inner annonymous class

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> products = new ArrayList<Product>();
				while (rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);
				}
				return products;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql = "select * from product where Id=?";

		return jdbcTemplate.query(sql, new Object[] { productId }, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if (rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					return product;
				} else {
					return null;
				}
			}
		});
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		String sql = "insert into product values(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(),product.getName(),
				product.getBrand(),product.getPrice());
		System.out.println("new product is inserted");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		String sql="update product set name=?,brand=?,price=? where id=?";
		jdbcTemplate.update(sql,product.getName(),
				product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Product updated");

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
String sql="delete from product where id=?";
jdbcTemplate.update(sql, product.getProductId());
System.out.println("product deleteed");
	}

}
