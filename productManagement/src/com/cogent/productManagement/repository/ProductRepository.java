package com.cogent.productManagement.repository;

import com.cogent.productManagement.exception.InvalidProductIdException;
import com.cogent.productManagement.exception.InvalidProductNameException;
import com.cogent.productManagement.exception.InvalidProductPriceException;
import com.cogent.productManagement.model.Product;

public interface ProductRepository {
	public String addProduct(Product product) throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException;
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException;
	public Product getProductById(String id) throws InvalidProductIdException;
	public Product [] getProducts()throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException;
	public String deleteProductById(String Id) throws InvalidProductIdException;
	public void deleteAllProducts() throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException;

}
