/**
 * 
 */
package com.java.spring.drools;

import org.drools.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author subbu
 *
 */
@Component("productImpl")
public class ProductImpl {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public void caliculateDiscount(Product product){
		StatelessKnowledgeSession knowledgeSession = (StatelessKnowledgeSession) 
				                                    applicationContext.getBean("productSession");
		knowledgeSession.execute(product);
	}

}
