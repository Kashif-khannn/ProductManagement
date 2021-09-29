package com.cogent.productManagement.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
@Data
public class Product {
	private String productId;
	private String productName;
	private float productPrice;
	private long qty;
	private Date expiryDate;
	private String batchNo;
	public Product(String productId, String productName, float productPrice, long qty, Date expiryDate,
			String batchNo) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.qty = qty;
		this.expiryDate = expiryDate;
		this.batchNo = batchNo;
		
		
	}
	
	
	
	
	

}
