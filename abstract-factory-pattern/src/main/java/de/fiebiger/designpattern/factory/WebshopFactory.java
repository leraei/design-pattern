package de.fiebiger.designpattern.factory;

import de.fiebiger.designpattern.model.Product;
import de.fiebiger.designpattern.model.Customer;


/**
 * Created by tfiebige on 15.03.16.
 */
public abstract class WebshopFactory {
	public abstract Customer createCustomer(String email);
	public abstract Product createProduct(String name);
}
