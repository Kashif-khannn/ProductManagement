package com.cogent.productManagementsystem;

import java.util.Date;

import com.cogent.productManagement.exception.InvalidProductIdException;
import com.cogent.productManagement.exception.InvalidProductNameException;
import com.cogent.productManagement.exception.InvalidProductPriceException;
import com.cogent.productManagement.model.Product;
import com.cogent.productManagement.service.ProductService;
import com.cogent.productManagement.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args)  {
		ProductService productService = ProductServiceImpl.getInstance();
		Product product = new Product("UU100", "001", 123.0f, 3,new Date(), "1" );
		
		String result;
		try {
			result = productService.addProduct(product);
			System.out.println(result);
			
//			Product [] products = productService.getProducts();
//			for(Product product2: products) {
//				System.out.println(product2);
//			}
//			productService.updateProduct("Apple", product);
//			productService.getProductById("UU100");
		} catch (InvalidProductIdException | InvalidProductNameException | InvalidProductPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
