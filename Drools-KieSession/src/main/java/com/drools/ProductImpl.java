/**
 * 
 */
package com.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.rule.FactHandle;

/**
 * @author subbu
 *
 */
public class ProductImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KieServices kieServices = KieServices.Factory.get();
		KieContainer container = kieServices.getKieClasspathContainer();
		//Get the session named kseesion-rule that we defined in kmodule.xml above.
		//Also by default the session returned is always stateful.
		
		KieSession kieSession = container.newKieSession("ksession-rule");
		
		Product product = new Product("gold");
		
		FactHandle factHandle ;
		factHandle = kieSession.insert(product);
		kieSession.fireAllRules();
		System.out.println("The discount for the jewellery product "
				+ product.getType() + " is " + product.getDiscount());
	}

}
