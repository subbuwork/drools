/**
 * 
 */
package com.drools;

/**
 * @author subbu
 *
 */
public class Product {
	private String type;
	private Integer discount;
	
	public Product(){}
	
	public Product(String type){
		this.type= type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	

}
