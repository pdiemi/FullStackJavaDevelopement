package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int productId;
	private String productName;
	private String productManufacturer;
	private int productQuantity;
	private Date productDateAdded;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, String productManufacturer, int productQuantity,
			Date productDateAdded) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productManufacturer = productManufacturer;
		this.productQuantity = productQuantity;
		this.productDateAdded = productDateAdded;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Date getProductDateAdded() {
		return productDateAdded;
	}

	public void setProductDateAdded(Date productDateAdded) {
		this.productDateAdded = productDateAdded;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productManufacturer="
				+ productManufacturer + ", productQuantity=" + productQuantity + ", productDateAdded="
				+ productDateAdded + "]";
	}
	
	
}
