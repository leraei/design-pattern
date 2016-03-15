package de.fiebiger.factory;

import de.fiebiger.model.Customer;
import de.fiebiger.model.Product;



/**
 * Created by tfiebige on 15.03.16.
 */
public abstract class WebshopFactory {
	public abstract Customer createCustomer(String email);
	public abstract Product createProduct(String name);
}
