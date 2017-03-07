/**
 * 
 */
package com.java.spring.drools;

/**
 * @author subbu
 *
 */
public class Product {
	
	private String productType;
	private Integer discount;
	
	public Product(){}

	/**
	 * @param productType
	 * @param discount
	 */
	public Product(String productType, Integer discount) {
		super();
		this.productType = productType;
		this.discount = discount;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
}
