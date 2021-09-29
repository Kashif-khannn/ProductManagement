package com.cogent.productManagement.repository;

import com.cogent.productManagement.exception.InvalidProductIdException;
import com.cogent.productManagement.exception.InvalidProductNameException;
import com.cogent.productManagement.exception.InvalidProductPriceException;
import com.cogent.productManagement.model.Product;

public class ProductRepositoryImpl implements ProductRepository {
	private Product products [] = new Product[10];
	
	private static  int counter = 0;
	private static ProductRepository productRepository; // singelton dp
	
	private ProductRepositoryImpl() {
		
	}
	
	public static ProductRepository getInstance() {
		if(productRepository == null) {
			productRepository = new ProductRepositoryImpl();
			return productRepository;
		}
		return productRepository;
	}
	@Override
	public String addProduct(Product product) {
	
		if(counter>=products.length) {
			System.out.println("Array full");
			
		} else {
			products[counter++] = product;
		}
		
		return "Success";
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		this.getProductById(productId);
		int index = this.getIndex(product);
		products[index] = product;
		
		
	
		return "success";
		
	}

	@Override
	public Product getProductById(String id) throws InvalidProductIdException {
		for(Product product: products) {
			if(product != null && id.equals(product.getProductId())) {
				return product;
			}
			
		}
		throw new InvalidProductIdException("Invalid Id");
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public String deleteProductById(String Id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		Product product = this.getProductById(Id);
		
		if(product != null) {
			int index = this.getIndex(product);
			
			if(index != -1) {
				 products[index] = null;
				   return "Success";
			}
			
			
		} else {
			return "not found";
		}
		throw new InvalidProductIdException("Invalid Id");
	}
	
	private int getIndex(Product product) {
		for(int j = 0; j<=products.length; j++) {
			if(products[j].equals(product)){
				return j;
				
			}
		}
		
		return -1;
		
		
	}

	@Override
	public void deleteAllProducts() throws InvalidProductIdException, InvalidProductNameException {
		// TODO Auto-generated method stub
		products = null;

	}

}
