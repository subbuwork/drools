/**
 * 
 */
package com.java.spring.drools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author subbu
 *
 */
public class DroolsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new 
				                    ClassPathXmlApplicationContext("ApplicationContext.xml");
	    ProductImpl impl = (ProductImpl)context.getBean("productImpl");
	
	     Product product = new Product();
	     product.setProductType("diamond");
	     impl.caliculateDiscount(product);
	     showDiscount(product);
	}
 public static void showDiscount(Product product){
	 System.out.println("Discount::"+product.getDiscount());
 }
}
