package com.cogent.productManagement.repository;

import java.util.ArrayList;

import com.cogent.productManagement.exception.InvalidProductIdException;
import com.cogent.productManagement.exception.InvalidProductNameException;
import com.cogent.productManagement.exception.InvalidProductPriceException;
import com.cogent.productManagement.model.Product;

public class ProductRepositoryALImpl implements ProductRepository {
	
	private ArrayList<Product> products = new ArrayList<>();
	
	private static ProductRepository productRepository;
	
	private ProductRepositoryALImpl() {
		// TODO Auto-generated constructor stub
	}
	public static ProductRepository getInstance() {
		if(productRepository ==null) {
			productRepository = new ProductRepositoryALImpl();
			return productRepository;
		}
		return productRepository;
	}

	@Override
	public String addProduct(Product product)
			throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		boolean status = products.add(product);
		if(status)
			
			return "success";
		else
			return "fail";
		
	}

	@Override
	public String updateProduct(String productId, Product product)
			throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(String id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] getProducts()
			throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductById(String Id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllProducts()
			throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub

	}

}
