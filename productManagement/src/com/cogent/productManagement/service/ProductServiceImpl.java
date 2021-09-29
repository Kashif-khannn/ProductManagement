package com.cogent.productManagement.service;

import com.cogent.productManagement.exception.InvalidProductIdException;
import com.cogent.productManagement.exception.InvalidProductNameException;
import com.cogent.productManagement.exception.InvalidProductPriceException;
import com.cogent.productManagement.model.Product;
import com.cogent.productManagement.repository.ProductRepository;
import com.cogent.productManagement.repository.ProductRepositoryALImpl;
import com.cogent.productManagement.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	
    ProductRepository productRepository =  ProductRepositoryALImpl.getInstance();
    private static ProductServiceImpl productService;
    
    private ProductServiceImpl () {
		
    }
    public static ProductService getInstance() {
    	if(productService == null) {
    		productService = new ProductServiceImpl();
    		return productService;
    		
    	}
    	return productService;
    }
	@Override
	public String addProduct(Product product) throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		
		return productRepository.addProduct(product);
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(productId, product);
	}

	@Override
	public Product getProductById(String id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		return productRepository.getProductById(id);
	}

	@Override
	public Product[] getProducts() throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	@Override
	public String deleteProductById(String Id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		return productRepository.deleteProductById(Id);
	}

	@Override
	public void deleteAllProducts() throws InvalidProductIdException, InvalidProductNameException, InvalidProductPriceException {
		// TODO Auto-generated method stub
		productRepository.deleteAllProducts();

	}

}
