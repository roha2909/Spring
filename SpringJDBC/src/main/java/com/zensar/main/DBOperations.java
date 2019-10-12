package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DBOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService = ctx.getBean("productServiceImpl", ProductService.class);
		/*
		 * List<Product> list = productService.findAllProducts(); for (Product product :
		 * list) { System.out.println(product); }
		 */
		/*
		 * Product product=productService.findProductById(1005);
		 * System.out.println(product);
		 */
		/*
		 * Product product = new Product(1012, "LipStick", "EllE18", 18);
		 * productService.addproduct(product);
		 */
		/*
		 * Product product=productService.findProductById(1012); if(product!=null) {
		 * product.setName("lipbam"); product.setBrand("nivea");
		 * product.setPrice(189.9f); productService.updateProduct(product); } else {
		 * System.out.println("Product not found"); }
		 */
Product product=productService.findProductById(1012);
if(product!=null) {
	
	productService.removeProduct(product);
}
else
{
	System.out.println("Product not found");
}

		
	
	}

}
