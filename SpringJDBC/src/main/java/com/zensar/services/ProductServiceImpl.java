package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	ProductService productService;



	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub

		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getById(productId);
	}

	@Override
	public void addproduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);

	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float min, float max) {
		// TODO Auto-generated method stub
		List<Product> productList = productDao.getAll();
		List<Product> filterList = new ArrayList<Product>();
		for (Product product : productList) {
			if (product.getPrice() <= max && product.getPrice() >= min) {
				filterList.add(product);

			} else {
				System.out.println("No Products");
			}
		}

		return filterList;
	}

	@Override
	public List<Product> findProductByName(String Name) {
		// TODO Auto-generated method stub
		List<Product> productList = productDao.getAll();
		List<Product> filterList = new ArrayList<Product>();
		for (Product product : productList) {
			if (product.getName() == Name)
				filterList.add(product);
		}

		return filterList;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> productList = productDao.getAll();
		List<Product> filterList = new ArrayList<Product>();
		for (Product product : productList) {
			if (product.getBrand() == brand)
				filterList.add(product);
		}

		return filterList;
	}

	@Override
	public Long getProductCount() {
		// TODO Auto-generated method stub
		long count=0;
		List<Product> productList = productDao.getAll();
		for (Product product : productList) {
			count++;
		}
		return count;
	}

}
